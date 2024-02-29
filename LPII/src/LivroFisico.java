public class LivroFisico extends Livro {
    private int qtdPaginas;

    LivroFisico(String titulo, int ano, String isbn, float preco, String autor, int qtdPaginas){
        super(titulo, ano, isbn, preco, autor);
        this.qtdPaginas=qtdPaginas;
    }

    // métodos modificadores

    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas=qtdPaginas;
    }

    // métodos acessadores

    public int getQtdPaginas(){
        return qtdPaginas;
    }

    public void exibirLivro(){
     
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Ano: "+getAno());
        System.out.println("ISBN: "+getIsbn());
        System.out.println("Preço: "+getPreco());
        System.out.println("Autor: "+getAutor());
        System.out.println("Quantidade de Páginas: "+getQtdPaginas());
    }
}
