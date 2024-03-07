package banko;

public class Banko{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Banko(){
    accountOne = new CheckingAccount("Zeus", 0, "1");
    accountTwo = new CheckingAccount("Hades", 0, "2");
  }

  public static void main(String[] args){
    Banko bankOfGods = new Banko();
    //System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(100);
    System.out.println(bankOfGods.accountOne.getBalance());
     bankOfGods.accountTwo.setBalance(10);
    System.out.println(bankOfGods.accountTwo.getBalance());
   // System.out.println(bankOfGods.accountOne.getMonthlyInterest());

   
   //consignaciones-AccountOne
    bankOfGods.accountOne.consignar(100);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     bankOfGods.accountOne.consignar(200);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     bankOfGods.accountOne.consignar(300);
     System.out.println(bankOfGods.accountOne.getBalance());
     
      bankOfGods.accountOne.consignar(400);
     System.out.println(bankOfGods.accountOne.getBalance());
     
      bankOfGods.accountOne.consignar(500);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     
     //retirosAccountOne
     bankOfGods.accountOne.retirar(10);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     bankOfGods.accountOne.retirar(20);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     bankOfGods.accountOne.retirar(50);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     bankOfGods.accountOne.retirar(40);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     bankOfGods.accountOne.retirar(10);
     System.out.println(bankOfGods.accountOne.getBalance());
     
     
     //Consignaciones-accountTwo
    bankOfGods.accountTwo.consignar(3000);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
     bankOfGods.accountTwo.consignar(1000);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
     bankOfGods.accountTwo.consignar(2000);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
      bankOfGods.accountTwo.consignar(3000);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
      bankOfGods.accountTwo.consignar(5000);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
     
     
     //RetirosAccountTwo
     bankOfGods.accountTwo.retirar(200);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
     bankOfGods.accountTwo.retirar(250);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
     bankOfGods.accountTwo.retirar(400);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
      bankOfGods.accountTwo.retirar(150);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
      bankOfGods.accountTwo.retirar(10);
     System.out.println(bankOfGods.accountTwo.getBalance());
     
     
     
    
    
    

  }
}