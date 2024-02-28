public class Digital extends Jogo
{
    private int codigo;


    Digital(String titulo, double preco, int codigo){
        super(titulo, preco);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void exibirJogo(){
        super.exibirJogo();
        System.out.println("Codigo: "+codigo);
    }
}
