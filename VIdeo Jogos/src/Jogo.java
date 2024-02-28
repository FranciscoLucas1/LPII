public class Jogo
{
    private String titulo;
    private double preco;

    // construtor
    Jogo(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;

    }

    // métodos acessadores
    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }
    // métodos modificadores
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirJogo(){
        System.out.println("Título: "+titulo);
        System.out.println("Preço: "+preco);
    }
}

