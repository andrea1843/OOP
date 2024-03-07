
package banko;

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
    interestRate = 0.02;
  }

  public int getBalance(){
    System.out.println("Su saldo es: " + balance);
    return balance;
    
  }
  
  public void setBalance(int newBalance){
    balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  
  public void consignar(int valorDepositado){
      balance = balance + valorDepositado;
  }
  
  public void retirar(int valorRetirado){
      balance = balance - valorRetirado;
  }
}