//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Revista r1 = new Revista("Revist X", "José", 2023, "Editora Z");
        r1.emprestar();
        r1.devolver();
        r1.itemDisponivel();
    }
}