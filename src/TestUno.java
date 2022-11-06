import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUno {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un valor entero:");
        num = teclado.nextInt();
        int cuadrado = num * num;
        System.out.print("El cuadrado de " + num + " es " + cuadrado);*/

        try{
            Scanner teclado = new Scanner(System.in);
            int num;
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        }catch (InputMismatchException ex){
            System.out.println("El dato a ingresar debe ser un número");
        }
    }

}


/*
La excepción InputMismatchException es lanzada por
la clase Scanner cuando el elemento recibido no corresponde al tipo de dato esperado
* */
