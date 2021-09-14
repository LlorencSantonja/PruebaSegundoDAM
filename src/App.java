import java.io.File;

public class App {
    public static void main(String[] args) {
            File archivo = new File("hola.txt");
            if (archivo.exists()) {
                System.out.println("Existe");
            } else {
                System.out.print("No existe");
            }
    }
}

