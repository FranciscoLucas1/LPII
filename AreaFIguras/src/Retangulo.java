public class Retangulo implements Forma
{
    private float base;
    private float altura;


    Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float area(){
        return base*altura;
    }
}
