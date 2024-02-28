//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Joao", 12, "123123123", "123.456.891-91");
        Estudante e2 = new Estudante("Calabreso", 19, "14956452a", "903.234.234-23");
        Estudante e3 = new Estagiario("Clebin", 23, "149563453453", "145.274.234-73", 2000f, "WIlson Aquarismos");
        Estudante e4 = new Tutor("Pedro", 25, "23423453453", "945.125.123-12", 200f, "Cálculo II");

        e4.exibirEstudante();

    }
    }
