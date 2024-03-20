import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        metodo1();
        System.out.println("Programa encerrado!");

    }

    public static void metodo1(){
        System.out.println("MÉTODO 1 ->>>");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um nome");
            String[] nomes = sc.nextLine().split(" ");
            System.out.println("Digite um índice: ");
            int i = sc.nextInt();
            System.out.println(nomes[i]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println("UM VALOR INTEIRO POR FAVOR QUERIDAO");
            e.printStackTrace();
        }
        System.out.println("Encerrando o método 1");
        sc.close();
    }
}
