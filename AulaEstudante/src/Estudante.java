public class Estudante {
    private String nome;
    private int idade;
    private String matricula;
    private String cpf;

    Estudante(String nome, int idade, String matricula, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public void exibirEstudante(){
        System.out.println("Informações do estudante: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Matricula: "+ matricula);
        System.out.println("CPF: "+ cpf);
    }

    public String toString(){
        return "Informações do estudante: "+ nome + "\nIdade: "+ idade + "\nMatricula: "+ matricula + "\nCPF " + cpf;
    }



    // metodos acessadores
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCpf() {
        return cpf;
    }

    // metodos modificadores


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

