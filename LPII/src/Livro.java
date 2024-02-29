public abstract class Livro {
    private String titulo;
    private int ano;
    private String isbn;
    private float preco;
    private String autor;

    Livro(String titulo, int ano, String isbn, float preco, String autor){
        this.titulo=titulo;
        this.ano=ano;
        this.isbn=isbn;
        this.preco=preco;
        this.autor=autor;
    }

    // métodos modificadores

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAno(int ano){
        this.ano=ano;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public void setPreco(float preco){
        this.preco=preco;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }


    // métodos acessadores

    public String getTitulo() {
        return titulo;
    }
    public int getAno(){
        return ano;
    }

    public String getIsbn(){
        return isbn;
    }

    public float getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    public abstract void exibirLivro();
}
