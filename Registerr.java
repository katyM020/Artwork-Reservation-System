import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Registerr 
{
    
     public void addUserInfo(String username, String password, String id, String name, String Address, String Phoneno, String Account_id) 
    {
         
        try{     
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        
        if(username == null || username.isEmpty() || password == null || password.isEmpty() || id == null || id.isEmpty() || name == null || name.isEmpty() || Address == null || Address.isEmpty() || Phoneno == null || Phoneno.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Empty username or password !!!");
        }
        else
        {
                st.execute("insert into ACCOUNT values ('"+username+"','"+password+"')");
                
                st.execute("insert into PERSONDETAILS values ('"+id+"','"+name+"','"+Address+"','"+Phoneno+"','"+Account_id+"')");          
                
                st.close();
                
            
            
            JOptionPane.showMessageDialog(null, "Successfully added");
        
        new Login().setVisible(true);
           
        }
        
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }   
    }
         
    public void remove()
    {
        try{
         
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        
        String sql = "DELETE FROM ACCOUNT";
        st.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "successfully deleted");
        
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
   
    public static void main(String[] args) 
     {
         new Register().setVisible(true);  
     }

   
}