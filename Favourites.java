import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Favourites 
{
     private String IDF, namef,Artwork_price,Artwork_genre,Artwork_Description,Artisit_ID;
     private String IDF2, namef2,Artwork_price2,Artwork_genre2,Artwork_Description2,Artisit_ID2;
        
    public void setDetails()
    {
        
       
                
        
        try{
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        //Missing
        ResultSet rs = st.executeQuery("select * from ARTWORK where "); 
             
        while(rs.next())
        {
            if(rs.next())
            {
                 IDF = rs.getString(1);
                 namef = rs.getString(2);
                 Artwork_price = rs.getString(3);
                 Artwork_genre = rs.getString(4);
                 Artwork_Description = rs.getString(5);
                 Artisit_ID = rs.getString(6);
            }
            
            rs.next();
            
            if(rs.next())
            {
                 IDF2 = rs.getString(1);
                 namef2 = rs.getString(2);
                 Artwork_price2 = rs.getString(3);
                 Artwork_genre2 = rs.getString(4);
                 Artwork_Description2 = rs.getString(5);
                 Artisit_ID2 = rs.getString(6);
            }
        }
            
        }catch(SQLException ex)
        {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    public String getIDF() {
        return IDF;
    }

    public String getNamef() {
        return namef;
    }

    public String getArtwork_price() {
        return Artwork_price;
    }

    public String getArtwork_genre() {
        return Artwork_genre;
    }

    public String getArtwork_Description() {
        return Artwork_Description;
    }

    public String getArtisit_ID() {
        return Artisit_ID;
    }

    public String getIDF2() {
        return IDF2;
    }

    public String getNamef2() {
        return namef2;
    }

    public String getArtwork_price2() {
        return Artwork_price2;
    }

    public String getArtwork_genre2() {
        return Artwork_genre2;
    }

    public String getArtwork_Description2() {
        return Artwork_Description2;
    }

    public String getArtisit_ID2() {
        return Artisit_ID2;
    }

    public static void main(String[] args) 
     {
         Favourite F = new Favourite();
         F.setVisible(true);
         F.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }

}
