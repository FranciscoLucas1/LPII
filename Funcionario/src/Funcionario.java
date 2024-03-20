public class Funcionario {
    private int id;
    private String nome;
    private float salario;

    Funcionario(int id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void aumentarSalario(float porcentagem){
        this.salario = this.salario + (porcentagem/100)*this.salario;
    }
}

