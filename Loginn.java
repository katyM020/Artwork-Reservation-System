import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Loginn 
{
    
    public String un;
    public void check_UserName_password(String username, String password)
    {
        try{
        int flag = 0;
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ACCOUNT");
        
        while(rs.next())
        {
            if(rs.getString(1).equals(username) && rs.getString(2).equals(password))
            {
                flag = 1;
                break;
            }    
        
            else if(!rs.getString(1).equals(username) && !rs.getString(2).equals(password))
            {
             JOptionPane.showMessageDialog(null, "Invalid username or password !!!");   
             break;
            }
        }
        if(flag == 1)
        {
            JOptionPane.showMessageDialog(null, "Login successful");
            new Search().setVisible(true);
        }
       if(username == null || username.isEmpty() || password == null || password.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Empty username or password !!!");
        }
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    } 
     public static void main(String[] args) 
     {
         Login L = new Login();
         L.setVisible(true);
         L.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    
}
