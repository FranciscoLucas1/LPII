//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogo j1 = new Jogo("Elden Ring", 244.90);
        j1.exibirJogo();

        Jogo j2 = new Fisico("God of War", 450.00, "0000");
        j2.exibirJogo();

        Jogo j3 = new Digital("Doki Doki", 0, 12);

    }
}
