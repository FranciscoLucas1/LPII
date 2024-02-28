public abstract class ContaAbstrata
{
  private float saldo;


  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public float getSaldo() {
    return saldo;
  }
  public abstract void depositar(float valor);

  public abstract void sacar(float valor);




}


