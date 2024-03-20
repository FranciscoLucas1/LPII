public class Revista extends Item
{
    private String editora;

    Revista(String titulo, String autor, int anoDePublicacao, String editora){
        super(titulo, autor, anoDePublicacao);
        this.editora = editora;
    }

    public boolean itemDisponivel(){
        return super.getDiposnivel();
    }

}
