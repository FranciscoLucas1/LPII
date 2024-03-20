
import java.util.Date;
import java.text.SimpleDateFormat;
public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public Conta(int numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }


    public void depositar(double valor) throws ContaException{
        Date hoje = new Date();


        if(hoje.getHours() > 22){
            throw new ContaException("Você não pode depositar depois das 22 horas");
        }


        this.saldo += valor;
    }
    public void sacar(double valor) throws ContaException{
        Date hoje = new Date();

        if(valor >  this.saldo){
          throw new ContaException("Você não tem saldo suficiente");
        }
        if (valor > this.limiteSaque ){
            throw new ContaException("Valor do seu saque é superior ao seu limite");
        }
        if(hoje.getHours() > 22){
            throw new ContaException("Você não pode sacar depois das 22:00 horas");
        }
        if(hoje.getHours() < 6){
            throw new ContaException("Você não pode sacar antes das 6:00 horas");
        }

        this.saldo -= valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limiteSaque=" + limiteSaque +
                '}';
    }
}
