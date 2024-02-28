public class Estagiario extends Estudante{
    private float salario;
    private String empresa;

    Estagiario(String nome, int idade, String matricula, String cpf, float salario, String empresa){
        super(nome, idade, matricula, cpf);
        this.salario = salario;
        this.empresa = empresa;

    }
    // metodos acessadores
    public float getSalario() {
        return salario;
    }

    public String getEmpresa() {
        return empresa;
    }
    // metodos modificadores
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void exibirEstudante(){
        super.exibirEstudante();
        System.out.println("Salario: "+ salario);
        System.out.println("Empresa: " + empresa);

    }
}


