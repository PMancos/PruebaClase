package pruebaclasefile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaClaseFile {

    public static void main(String[] args) {

        //crear un obj File
        File f1 = new File("J:\\Almacen");

        System.out.println("Existe?: " + f1.exists());
        System.out.println("GetAbsoluteFile: " + f1.getAbsoluteFile());
        System.out.println("GetName: " + f1.getName());
        try {
            System.out.println("GetCanonicalPath: " + f1.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(PruebaClaseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("GetParent: " + f1.getParent());
        System.out.println("GetPath: " + f1.getPath());

        //Guarda en un array de File para despues mostrar el listado
        File[] contenido = f1.listFiles();

        System.out.println("");

        for (int i = 0; i < contenido.length; i++) {
            if (contenido[i].isDirectory()) {
                System.out.println(contenido[i].getName() + " --> Es un directorio");
            } else if (contenido[i].isFile()) {
                System.out.println(contenido[i].getName() + " --> Es un archivo");
            }
        }

        System.out.println("");

        ArrayList<String> nombre = new ArrayList<>();

        for (int i = 0; i < contenido.length; i++) {
            nombre.add(contenido[i].getName());
        }
        //Ordenacion alfabeticamente
        Collections.sort(nombre);

        for (int i = 0; i < nombre.size(); i++) {
            System.out.println(nombre.get(i));
        }

        System.out.println("");

        //Crear un objeto comparator de Strings
        Comparator<String> comparador = Collections.reverseOrder();

        //Ordenar descendente
        Collections.sort(nombre, comparador);

        for (int i = 0; i < nombre.size(); i++) {
            System.out.println(nombre.get(i));
        }

    }
}
