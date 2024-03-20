import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static Scanner leitor = new Scanner(System.in);
    static Scanner leitor2 = new Scanner(System.in);


    public static void main(String[] args) {
    System.out.println("Digite um número N");
    int n = leitor.nextInt();

    for (int i = 0; i < n; i++){

        int id;
        String nome;
        float salario;

        System.out.println("ID");
        id = leitor.nextInt();
        System.out.println("Nome");
        nome = leitor.nextLine();
        System.out.println("Salário");
        salario = leitor.nextFloat();

        Funcionario f = new Funcionario(id, nome, salario);
        funcionarios.add(f);
    }


    System.out.println("Digite um ID");
    int id = leitor.nextInt();


    boolean achou = false;

    // aumento
    for(Funcionario f: funcionarios){
        if(id==f.getId()){
            achou = true;
            System.out.println("Funcionario Encontrado. Digite a porcentagem do aumento");
            float porcent = leitor.nextFloat();
            f.aumentarSalario(porcent);
            break;
        }
    }
    if(!achou)
        System.out.println("Funcionario não encontrado.");

    // exibindo todos as informacoes dos funcionarios
    for(Funcionario f: funcionarios){
        System.out.println(f.toString());
    }

    }
}