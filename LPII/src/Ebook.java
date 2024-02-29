public class Ebook extends Livro{
    private float tamanho;

    Ebook(String titulo, int ano, String isbn, float preco, String autor, float tamanho){
        super(titulo, ano, isbn, preco, autor);
        this.tamanho = tamanho;
    }

    // modificador

    public void setTamanho(float tamanho){
        this.tamanho=tamanho;
    }

    // acessadores

    public float getTamanho(){
        return tamanho;
    }
    public void exibirLivro(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Ano: "+getAno());
        System.out.println("ISBN: "+getIsbn());
        System.out.println("Preço: "+getPreco());
        System.out.println("Autor: "+getAutor());
        System.out.println("Tamanho: "+getTamanho());
    }

}
