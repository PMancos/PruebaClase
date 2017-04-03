
package pruebaclasefile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PruebaClaseFile2 {

   
    public static void main(String[] args) {
        
        File f1=new File("J:/nuevo");
        
        if(!f1.exists())
            System.out.println("Lo has creado "+f1.mkdir()); //Crea directorio
        else
            System.out.println("Ya existica nuevo");
        
        File f2=new File(f1, "miFichero.txt");
        
        try {
        if(!f2.exists())
                System.out.println("Has creado F2 "+f2.createNewFile());
        else
                System.out.println("Ya existe F2");
        } catch (IOException ex) {
            Logger.getLogger(PruebaClaseFile2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Renombrar
        File f3=new File(f1, "tuFichero.txt");
        
        if(f2.exists())
                System.out.println("Fichero renombrado "+f2.renameTo(f3));
        else
                System.out.println("Fichero f2 ya existe");
        
        
        if(f3.exists())
                System.out.println("Borrarados F2 y F3 "+f2.delete()+f3.delete());
        else
                System.out.println("Ya estan borrado");
        
    }
    
    
}
