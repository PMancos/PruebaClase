
package pruebaclasefile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LeerObjetosPersona {

    
    public static void main(String[] args) {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        
        try {
            fis=new FileInputStream("personas.dat");
            ois=new ObjectInputStream(fis);
            
            Persona p;
            
            while(true){
                p=(Persona) ois.readObject();
                System.out.println(p.toString());
            }
        } catch(EOFException ex){
            System.out.println("--------------------");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerObjetosPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerObjetosPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeerObjetosPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
            if(ois!=null) ois.close();
            if(fis!=null) fis.close();
        }catch(IOException ex){
                System.out.println("Excepcion de entrada/salida");
        }
            
    }
    }}

