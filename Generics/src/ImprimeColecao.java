import java.util.ArrayList;

public class ImprimeColecao <T> {
    ArrayList<T> lista = new ArrayList<>();

    public void addValor(T valor){
        lista.add(valor);
    }

    public T primeiro(){
        return lista.get(0);
    }


    public void imprimir(){
        for(T i: lista){
            System.out.println(i);
        }
    }

}
