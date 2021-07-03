import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Searchh 
{

    private String ID, artwork_n,artwork_p,artwork_g,artwork_d,artist_id;
    private String ID1, artwork_n1,artwork_p1,artwork_g1,artwork_d1,artist_id1;

    public void showOrder(String search)
    {
        try{
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ARTWORK");
             
        while(rs.next())
        {
            if(rs.getString(4).equals(search))
            { 
                ID = rs.getString(1);
                artwork_n = rs.getString(2);
                artwork_p = rs.getString(3);
                artwork_g = rs.getString(4);
                artwork_d = rs.getString(5);
                artist_id = rs.getString(6);
            }
            
            rs.next();
            
            if(rs.getString(4).equals(search))
            {
                ID1 = rs.getString(1);
                artwork_n1 = rs.getString(2);
                artwork_p1 = rs.getString(3);
                artwork_g1 = rs.getString(4);
                artwork_d1 = rs.getString(5);
                artist_id1 = rs.getString(6);
            }  
        }
        }catch(SQLException ex)
        {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public void storeFavourite(String id)
    {
        try{
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ARTWORK");
         
            String sql = " update ARTWORK set FAVOURITE='TRUE' WHERE ARTWORK_ID='"+ id + "'";
            st.executeUpdate(sql);
            
        
        }catch(SQLException ex)
        {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
        
    public String setID()
    {
        return ID;
    }
    public String setName()
    {
        return artwork_n;
    }
    public String setPrice()
    {
        return artwork_p;
    }
    public String setGenre()
    {
        return artwork_g;
    }
    public String setDesc()
    {
        return artwork_d;
    }
    public String setArtistID()
    {
        return artist_id;
    }
    
    //Second one
    
    public String setID1()
    {
        return ID1;
    }
    public String setName1()
    {
        return artwork_n1;
    }
    public String setPrice1()
    {
        return artwork_p1;
    }
    public String setGenre1()
    {
        return artwork_g1;
    }
    public String setDesc1()
    {
        return artwork_d1;
    }
    public String setArtistID1()
    {
        return artist_id1;
    }
     public static void main(String[] args) 
     {
         new Search().setVisible(true);
     }
    
}
