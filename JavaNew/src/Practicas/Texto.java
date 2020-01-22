
package Practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Texto {
    public void leer(String nombre)
    {
        try {
          FileReader f = new FileReader(nombre);  
          BufferedReader buffer = new BufferedReader(f);
          String temp = "";
          while(true){
              temp = buffer.readLine();
              if(temp == null)
                  break;
              System.out.println(temp);
          } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    public void escribir(String nombre)
    {
        File f = new File(nombre);
        try {
            String temp = ""; 
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter pw = new PrintWriter(bw);
            pw.write("Esto es una linea!\n");
            pw.append("Este es un archivo para leer\n" +
                       "Nota: Practicantes de archivos\n" +
                       "Lenguaje Java");
            bw.close();
            pw.close();
//            while (true) {                
//               
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
