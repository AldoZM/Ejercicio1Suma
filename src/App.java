import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float val1, val2, val3, suma;
        // Guardar las 3 notas 
        System.out.print("Dijite 3 calificaciones: ");
        val1 = entrada.nextFloat();
        val2 = entrada.nextFloat();
        val3 = entrada.nextFloat();

        suma = val1 + val2 + val3;

        System.out.println("\n La suma es: " + suma);



    }
}
