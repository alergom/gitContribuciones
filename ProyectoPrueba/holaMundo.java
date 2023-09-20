import java.util.Scanner;


public class holaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        
        /*Funcionalidad de sumar números que de por el teclado el usuario*/

        int num1;
        int num2;
        int suma;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Mete el primer número");
        num1 = entrada.nextInt();
        System.out.println("Mete el segundo número");
        num2 = entrada.nextInt();
        
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}
