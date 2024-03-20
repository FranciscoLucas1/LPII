import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ImprimeColecao c = new ImprimeColecao();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma quantidade: ");
        int n = leitor.nextInt();
        int x = 0;
        for (int i=0; i < n; i++){
            System.out.println("Digite um número " + i);
            x = leitor.nextInt();
            c.addValor(x);

        }
        System.out.println("O primeiro número é " + c.primeiro());
        System.out.println("Lista completa é");
        c.imprimir();




    }
}
