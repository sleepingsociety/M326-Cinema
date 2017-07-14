package DAL;

import Model.Presentation;

import java.io.*;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class SerializerHelper {

    public void Serialize(Presentation presentation){
        try {
            FileOutputStream fileOut = new FileOutputStream("presentation.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(presentation);
            out.close();
            fileOut.close();
        }catch(IOException i) {
            i.printStackTrace();
        }
    }

    public Presentation Deserialize(){
        Presentation p = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            p = (Presentation) in.readObject();
            in.close();
            fileIn.close();
            return p;
        }catch(IOException i) {
            i.printStackTrace();
            return null;
        }catch(ClassNotFoundException c) {
            c.printStackTrace();
            return null;
        }}
}
