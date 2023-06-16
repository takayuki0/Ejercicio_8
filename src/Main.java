import java.io.*;

public class Main {
    public static void main(String[] args) {

        File archivo = new File("documento.txt");

        try {
            BufferedReader lectorDeDocumento = new BufferedReader(new FileReader(archivo));
            String linea = lectorDeDocumento.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lectorDeDocumento.readLine();
            }
            lectorDeDocumento.close();
        } catch (Exception e) {
            System.out.println("El archivo no se ha encontrado. \nMensaje de Error: " + e.getMessage());
        }
        finally {
            System.out.println("Ejecutamos la cláusula finally demostrando que pasamos por aquí.");
        }
    }
}