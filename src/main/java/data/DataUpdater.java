package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataUpdater {
    public static void guardarUsuario(String usuario, String pass, String filepath, int id){
        BufferedWriter bw = null;
        FileWriter fichero = null;

        try {
            File file = new File(filepath);
            fichero = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fichero);
            if(id == 1){
                bw.write(usuario+","+pass);
            }
            else {
                bw.write("\n" + usuario + "," + pass);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fichero != null)
                    fichero.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void actualizarUsuario(String usuario, String pass, int coordenada, String filepath, int id){
        ArrayList<String> registro = FileReader.leerArchivo(filepath);
        BufferedWriter bw = null;
        FileWriter fichero = null;
        registro.set(id,usuario+","+pass+","
                +coordenada+","+id);
        try {
            File file = new File(filepath);
            fichero = new FileWriter(file.getAbsoluteFile(), false);
            bw = new BufferedWriter(fichero);
            int i=0;
            while(i<registro.size()){
                if (i == registro.size()-1){
                    bw.write(registro.get(i));
                    i++;
                }
                else{
                    bw.write(registro.get(i)+"\n");}
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fichero != null)
                    fichero.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
