import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        float temperatura = leitor.nextFloat();
        int opc = menu();

        switch (opc){
            case 1: System.out.println("A temperatura em Fahrenheit é " + celsiusParaF(temperatura)); break;
            case 2: System.out.println("A temperatura em Celsius é " + fahParaC(temperatura)); break;
            default: System.out.println("Opção inválida");
        }
    }

    public static int menu(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha entre Celsisus e Fahrenheit");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsisus");

        int opc = leitor.nextInt();
        return opc;

    }

    public static float celsiusParaF(float celsius){
        return (9*celsius/5) + 32;
    }

    public static float fahParaC(float fah){
        return 5*(fah-32)/9;
    }

}















