//WRITE A JAVA PROGRAM HAVING TWO INTERFACES EACH HAVING AT LEAST TWO ABSTRACT METHODS,THEN ONE CLASS IMOPLEMENTING THOSE TWO INTERFACES.

interface SavingsAccount{

       public void accountDataInfo1();

}
interface CurrentAccount{

      public void  accountDataInfo2();

}

class Bank implements SavingsAccount,CurrentAccount{

	public void accountDataInfo1(){

		System.out.println("Savings Account Data\n");
	}
public void accountDataInfo2(){

                System.out.println("Current Account Data");
        }


	public static void main(String[] args){
	
            CurrentAccount ca= new Bank();
               	ca.accountDataInfo2();
	 SavingsAccount sa= new Bank();
		sa.accountDataInfo1();

	}
}
