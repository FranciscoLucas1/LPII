import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] num = {1,5,2,4,67,4,2,1};
        int soma = 0;
        for(int n: num){
            soma+=n;
        }
        System.out.println(soma);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Rafael");

        for(String n: nomes){
            System.out.println(n);
        }



        }
    }
