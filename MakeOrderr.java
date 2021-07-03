
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MakeOrderr 
{
    public void safeOrderInfo(String orderInvoice, String Time, String Location, String Day, String Quantity, String p, int status, String atId, String Price)
    {
        switch (status) {
            case 0:
                if("Credit card".equals(p))
                {
                if(orderInvoice == null || orderInvoice.isEmpty() || Time == null || Time.isEmpty() || Location == null || Location.isEmpty() || Day == null || Day.isEmpty() || Quantity == null || Quantity.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Must Enter values in all fields !!!");
                }
                else
                {                
                try{     
                        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
                        Statement st = conn.createStatement();

                        st.execute("insert into ORDER_DETAILS values ('"+orderInvoice+"','"+Time + "," + Location + "," + Day + "," + Quantity +"')");
                    }catch(SQLException ex)
                        {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
                        }
                    new Receipt(orderInvoice,Quantity,atId,Price).setVisible(true);
                    }
                }
                else 
                {
                if(orderInvoice == null || orderInvoice.isEmpty() || Time == null || Time.isEmpty() || Location == null || Location.isEmpty() || Day == null || Day.isEmpty() || Quantity == null || Quantity.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Must Enter values in all fields !!!");
                }
                else
                {
                new MakeOrder().setVisible(true);
                JOptionPane.showMessageDialog(null, "Must select a payment method"); 
                }
                }
                break;
            case 1:
                 if(orderInvoice == null || orderInvoice.isEmpty() || Time == null || Time.isEmpty() || Location == null || Location.isEmpty() || Day == null || Day.isEmpty() || Quantity == null || Quantity.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Must Enter values in all fields !!!");
                }
                else
                {
                    try{     
                        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
                        Statement st = conn.createStatement();

                        st.execute("insert into ORDER_DETAILS values ('"+orderInvoice+"','"+Time + "," + Location + "," + Day + "," + Quantity +"')");
                    }catch(SQLException ex)
                        {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
                        }
                JOptionPane.showMessageDialog(null, "Done");
                new Receipt(orderInvoice,Quantity,atId,Price).setVisible(true);
                }
                break;
            default:
                break;
        } 
    }
    
   public static void main(String[] args) 
     {
         new MakeOrder().setVisible(true);  
     }
    
}
