import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class TestDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*int num1, num2;
        System.out.print("Ingrese primer valor entero (dividendo):");
        num1 = teclado.nextInt();
        System.out.print("Ingrese segundo valor entero (divisor):");
        num2 = teclado.nextInt();
        int resu = num1 / num2;
        System.out.print("La división de " + num1 + " / " + num2 + " es " + resu);
       */
        try {
            int num1, num2;
            System.out.print("Ingrese primer valor entero (dividendo):");
            num1 = teclado.nextInt();
            System.out.print("Ingrese segundo valor entero (divisor):");
            num2 = teclado.nextInt();
            int resu = num1 / num2;
            System.out.print("La división de " + num1 + " / " + num2 + " es " + resu);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente números enteros"+ ex);
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir entre cero" + ex);
        }
    }

    /*
    Crear un programa visual con java Swing  que contenga dos controles JTextField y un Button
    Campo nombre y campo edad.
    .Al presionar el botón  este debe mostrar la información en un JTextField.
    Si los datos ingresados son incorrectos debe notificar.
     */


}
