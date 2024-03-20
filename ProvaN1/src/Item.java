public abstract class Item implements ItemDeBiblioteca{

    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean disponivel = true;

    Item(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;

    }

    // set
    public void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    }
    // get
    public int getAnoDePublicacao(){
        return this.anoDePublicacao;
    }

    public boolean getDiposnivel(){
        return this.disponivel;
    }

    public void emprestar()
    {
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }

    public abstract boolean itemDisponivel();


}
