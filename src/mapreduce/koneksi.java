package mapreduce;
import com.mongodb.client.MongoClient; 
import com.mongodb.client.MongoClients; 
import com.mongodb.client.MongoDatabase; 
/**
 *
 * @author zaerina eriyadi
 */
public class koneksi { 
             
    public static MongoDatabase sambungDB(){         
        try {             
            MongoClient client = MongoClients.create();             
            MongoDatabase database = client.getDatabase("bigdata");             
            return database;         
        } catch (Exception e) {             
            System.out.println("Koneksi Gagal: "+ e.getMessage());         
        }                 
        return null;     
    }    
}
    

