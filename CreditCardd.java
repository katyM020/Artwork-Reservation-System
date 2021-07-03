import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CreditCardd 
{
    
    public void setCreditCardInfo(String Credit_Card_Number, String pin, String Expire_Date)
    {
        try
        {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();

       if(Credit_Card_Number == null || Credit_Card_Number.isEmpty() || pin == null || pin.isEmpty() || Expire_Date == null || Expire_Date.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Please enter in all fields !!!");
       }
       else
       {
           st.execute("insert into CREDITCARD values ('"+Credit_Card_Number+"','"+pin + "','" + Expire_Date+"')");
           JOptionPane.showMessageDialog(null, "Successfully Done");
           new Receipt().setVisible(true);
       }
            
        }catch(SQLException ex)
        {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        } 
    }
    
     public static void main(String[] args) 
     {
         new CreditCard().setVisible(true);  
     }

    
    
}
