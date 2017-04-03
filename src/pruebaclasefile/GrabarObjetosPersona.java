
package pruebaclasefile;

import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GrabarObjetosPersona {

    
    public static void main(String[] args) {
        
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream("personas.dat"); //Abrir fichero en escritura
            oos=new ObjectOutputStream(fos);
            
            Persona p=new Persona("11111111A", "Arrate", 19);
            
            oos.writeObject(p);
            
            p=new Persona("22222222A", "Iker", 22);
            
            oos.writeObject(p);
            
            p=new Persona("33333333B", "Xabier", 25);
            
            oos.writeObject(p);
            
            p=new Persona("44444444C", "Gillermo", 18);
            
            oos.writeObject(p);
            
            //El close mejor ponerlo despues de las excepciones
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GrabarObjetosPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GrabarObjetosPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            try {
            if(oos!=null) 
                oos.close();
            if(fos!=null) 
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(GrabarObjetosPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
}
