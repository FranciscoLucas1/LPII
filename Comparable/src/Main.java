import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        //Aluno a1 = new Aluno("Maria", "12");
        //Aluno a2 = new Aluno("Pedro", "13");

        //lista.add(a1);
        //lista.add(a2);


        String a1 = new String("Maria");
        String a2 = new String("Maria");



        System.out.println(a1 == a2);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());


        }





    }
