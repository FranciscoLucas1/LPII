public abstract class Animal
{
    private String nome;

    Animal(String nome){
        this.nome = nome;
    }
    public void exibirAnimal(){
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void falar();
}
