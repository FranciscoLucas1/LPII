public class ContaCorrente extends ContaAbstrata {

    public void depositar(float valor){
        super.setSaldo(super.getSaldo() + valor);
    }

    public void sacar(float valor){
        super.setSaldo(getSaldo() - valor);
    }


}
