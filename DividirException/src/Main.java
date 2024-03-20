//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       try{
           System.out.println(dividir(2, 6));
       }catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
    }

    public static float dividir(float  a, float b) throws IllegalArgumentException{
        if(b == 0) {
            throw new IllegalArgumentException("B não pode ser 0");
        }
            return a/b;


    }


    }

