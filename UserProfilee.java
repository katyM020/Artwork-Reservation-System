import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class UserProfilee 
{

    private String userid,Fname,Address,phoneNo,Accountid;
    
    public void setInfo(String username)
    {
        try{     
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        ResultSet rrs= st.executeQuery("SELECT * FROM PERSONDETAILS");
        
            while(rrs.next())
            {
                if(username.equals(rrs.getString(5)))
                {
                userid = rrs.getString(1);
                Fname = rrs.getString(2);
                Address = rrs.getString(3);
                phoneNo = rrs.getString(4);
                Accountid = rrs.getString(5);
                }   
            }
            
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }   
        
    }

    public String getUserID() {
        return userid;
    }

    public String getFname() {
        return Fname;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAccountid() {
        return Accountid;
    }
    public static void main(String[] args) 
     {
         UserProfile up = new UserProfile();
         up.setVisible(true);
         up.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         
     }
     
    
}
