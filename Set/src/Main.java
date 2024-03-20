import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Set<String> coresPrimarias = new LinkedHashSet<>();
        //Set<String> cores = new LinkedHashSet<>();
        //coresPrimarias.add("vermelho");
        //coresPrimarias.add("amarelo");
        //coresPrimarias.add("azul");

        //cores.add("branco");
        //cores.add("azul");
        //cores.add("rosa");


        //cores.removeAll(coresPrimarias);

        //cores.removeIf(x-> x.startsWith("a"));
        //System.out.println(cores.contains("preto"));


        //for(String c: cores){
            //System.out.println(c);
       // }

        Set<Integer> a = new LinkedHashSet<>();
        Set<Integer> b = new LinkedHashSet<>();
        Set<Integer> c = new LinkedHashSet<>();
        Set<Integer> Alex = new LinkedHashSet<>();

        a.add(4);
        a.add(5);
        a.add(7);

        b.add(7);
        b.add(1);
        b.add(9);

        c.add(7);
        c.add(12);
        c.add(3);

        Alex.addAll(a);
        Alex.addAll(b);
        Alex.addAll(c);


        System.out.println("O Alex tem " +  Alex.size() + " alunos");

    }
}