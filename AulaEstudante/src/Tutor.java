public class Tutor extends Estudante{
    private float bolsa;
    private String disciplina;


    Tutor(String nome, int idade, String matricula, String cpf, float bolsa, String disciplina){
        super(nome, idade, matricula, cpf);
        this.bolsa = bolsa;
        this.disciplina = disciplina;
    }
    // metodos acessadores
    public float getBolsa() {
        return bolsa;
    }

    public String getDisciplina() {
        return disciplina;
    }
    // metodos modificadores
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirEstudante(){
        super.exibirEstudante();
        System.out.println("Bolsa: "+ bolsa);
        System.out.println("Disciplina: " + disciplina);

        }
    }

