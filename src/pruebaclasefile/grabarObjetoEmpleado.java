/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclasefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin1
 */
public class grabarObjetoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("empleado.dat", true);
            oos = new ObjectOutputStream(fos);

            empleado e = new empleado(1000, "12345678", "Jaime", 40);

            oos.writeObject(e);

            e = new empleado(1500, "98765432", "Pepe", 20);

            oos.writeObject(e);

            e = new empleado(800, "55566644", "javi", 18);

            oos.writeObject(e);

            e = new empleado(1700, "69696969", "Loren", 34);

            oos.writeObject(e);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(grabarObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(grabarObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(grabarObjetoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
