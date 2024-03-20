//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(12,"Cleber", 1200, 1200);
        Conta c2 = new Conta(13,"Joao", 1, 1);


        try{
            c1.sacar(1200);
        }
        catch(ContaException e){
            System.out.println(e.getMessage());
        }
        }
    }
