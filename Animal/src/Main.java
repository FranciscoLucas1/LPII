//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal c1 = new Cachorro("Cleber");
        c1.exibirAnimal();
        c1.falar();

        Animal g1 = new Gato("Denis");
        g1.exibirAnimal();
        g1.falar();

        Animal g2 = new Galinha("Jurema");
        g2.exibirAnimal();
        g2.falar();

    }
}