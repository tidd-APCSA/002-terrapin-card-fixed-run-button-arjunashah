public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance){
    this.balance=balance;
  }
  
  public void payEconomical() {
    if (balance>=2.50){
      balance-=2.50;
    }
    // This was put here to make sense in my mind
    else{
      balance+=0;
    }
    
  }

  public void payGourmet() {
    if (balance>=4.00){
      balance-=4.00;
    }
    // This was put here to make sense in my mind
    else{
      balance+=0;
    }
    
  }

  public void loadMoney(double amount) {
    if (balance+amount>150){
      balance=150;
    }
    else if (amount>0){
      balance+=amount;
    }
    else{
      balance+=0;
    }
  }

  public void getBalance(){
    System.out.println(balance);
  }


  public String toString(){
    return "The card has "+balance+" dollars";
  }
}
