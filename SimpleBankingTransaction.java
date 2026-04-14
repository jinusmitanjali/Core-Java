class SimpleBankingTransaction{
     String accountholder = "Riya Sharma";
     double balance = 5000.0;
     double depositAmount = 2000.0;
     double withdrawAmount = 1500.0;
     double finalBalance;

     void deposit(double depositAmount){
	balance = balance + depositAmount;
     	System.out.println("Deposited: "+depositAmount);
      }
     void withdraw(withdrawAmount){
	if(balance >= withdrawAmount){
		balance = balance - WithdrawnAmount;
		System.out.println("Withdrawn: "+WithdrawnAmount);
	}
	else {
		balance = balance;
		System.out.println("Withdrawn: 0");
	}
     }
     void displayBalance(finalBalance){
	balance = (balance+depositAmount)-withdrawAmount;
	System.out.println("Final Balance: "+finalBalance)
     }
}