/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclasefile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author admin1
 */
public class leerObjetoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        
        try {
            fis=new FileInputStream("empleado.dat");
            ois=new ObjectInputStream(fis);
            
            empleado e;
            
            while(true){
                e=(empleado) ois.readObject();
                System.out.println(e.toString());
            }
            
        } catch (EOFException ex){
            System.out.println("----------");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(leerObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(leerObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(leerObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
                try {
                    if(ois!=null)
                        ois.close();
                    if(fis!=null)
                        fis.close();
            } catch (IOException ex) {
                Logger.getLogger(leerObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
