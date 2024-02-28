public class Fisico extends Jogo {
    private String lote;

    Fisico(String titulo, double preco, String lote){
        super(titulo, preco);
        this.lote = lote;
    }

    public String getLote() {
        return lote;
    }
    public void setLote(String lote) {
        this.lote = lote;
    }
    public void exibirJogo(){
        super.exibirJogo();
        System.out.println("Lote: "+lote);
    }
}

