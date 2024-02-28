public class Quadrado implements Forma
{
    private float lado;

    Quadrado(float lado){
        this.lado = lado;
    }

    public float area(){
        return lado*lado;
    }

}
