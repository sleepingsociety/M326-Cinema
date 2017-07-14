package DAL;

import Model.Movie;
import Model.Presentation;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Oriol Gut on 16.06.2017.
 *
 * This class is responsible for saving and loading the data with the help of serialisation.
 *
 */
public class SerializerHelper {
    private final static String FILEPATH = "./tmp/movies.ser";

    /**
     * This method will be used for saving the data in the serialised file
     * @param movies will contain all the different movies with all there informations
     */

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

    /**
     * This method is used to load the data from the file
     * @return is a list of Movies which was loaded from the file
     */

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