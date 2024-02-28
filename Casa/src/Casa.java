public class Casa {
    private String endereco;
    private int numPortas;
    private int numJanelas;


    Casa(String endereco, int numJanelas, int numPortas){
        this.endereco = endereco;
        this.numJanelas = numJanelas;
        this.numPortas = numPortas;
    }

    Casa(String endereco){
        this.endereco = endereco;
    }

    // métodos modificadores
    public void setNumPortas(int quant){
        this.numPortas = quant;
    }
    public void setNumJanelas(int quant){
        this.numJanelas = quant;
    }
    public void setEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }

    // métodos acessadores
    public int getNumPortas(){
        return this.numPortas;
    }
    public int getNumJanelas(){
        return this.numJanelas;
    }
    public String getEndereco(){
       return this.endereco;
    }
}

