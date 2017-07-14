package DAL;

import Model.Movie;
import Model.Presentation;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class SerializerHelper {
    private final static String FILEPATH = "./tmp/movies.ser";
    public void Serialize(ArrayList<Movie> movies){
        try {
            FileOutputStream fileOut = new FileOutputStream(FILEPATH);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Movie movie : movies) {
                out.writeObject(movie);
            }
            out.close();
            fileOut.close();
        }catch(IOException i) {
            i.printStackTrace();
        }
    }

    public ArrayList<Movie> Deserialize(){
        ArrayList<Movie> m = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(FILEPATH);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            for(int i = 0; i < 3; i++) {
               m.add((Movie) in.readObject());
            }
            in.close();
            fileIn.close();
            return m;
        }catch(IOException i) {
            i.printStackTrace();
            return null;
        }catch(ClassNotFoundException c) {
            c.printStackTrace();
            return null;
        }
    }
}