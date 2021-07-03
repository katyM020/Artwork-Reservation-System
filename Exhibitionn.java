
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Exhibitionn 
{
    private String Artwork_ID,Exhibition_ID,Exhibition_Start_Date,Exhibition_End_Date,Exhibition_Location,Exhibition_Time;
  
    public void setInfo(String artId, String artId1) 
    {
        try{
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtGallerDB","ArtGallery","123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select ARTWORKID, EXHIBITION.* FROM ARTWORK_EXHIBITION JOIN EXHIBITION ON ARTWORK_EXHIBITION.EXHIBITIONID = EXHIBITION.EXHIBITION_ID");

                while(rs.next())
                {
                    if(rs.getString(1).equals(artId)) 
                    {
                        Artwork_ID = artId;
                        Exhibition_ID = rs.getString(2);
                        Exhibition_Start_Date = rs.getString(3);
                        Exhibition_End_Date = rs.getString(4);
                        Exhibition_Location = rs.getString(5);
                        Exhibition_Time = rs.getString(6);
                    }
                    rs.next();
                    if(rs.getString(1).equals(artId1))
                    {    
                        Artwork_ID = artId1;
                        Exhibition_ID = rs.getString(2);
                        Exhibition_Start_Date = rs.getString(3);
                        Exhibition_End_Date = rs.getString(4);
                        Exhibition_Location = rs.getString(5);
                        Exhibition_Time = rs.getString(6);  
                    }
                    
                }
        }catch(SQLException ex)
        {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
     public String getArtwork_ID() {
        return Artwork_ID;
    }

    public String getExhibition_ID() {
        return Exhibition_ID;
    }

    public String getExhibition_Start_Date() {
        return Exhibition_Start_Date;
    }

    public String getExhibition_End_Date() {
        return Exhibition_End_Date;
    }

    public String getExhibition_Location() {
        return Exhibition_Location;
    }

    public String getExhibition_Time() {
        return Exhibition_Time;
    }
    
    public static void main(String[] args) 
     {
         new Exhibition().setVisible(true);  
     }


    
}
