
public class Main {
    public static void main(String[] args) {

        ContaAbstrata conta = new ContaCorrente();
        conta.depositar(100);
        conta.sacar(20);
        System.out.println(conta.getSaldo());

        }
    }
