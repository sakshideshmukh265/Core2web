//WRITE A JAVA PROGRAM HAVING REPORATE() METHOD AND THEN A CLASS SBI IMPLEMENTING THIS INTERFACE.
     

 interface RBI{
 
    void repoRate();
 }
 
 class SBI implements RBI{
   
	 public void repoRate(){

		 System.out.println("RepoRate is 15.5%");
	 }

public static void main(String args[]){

          RBI r=new SBI();
            
	   r.repoRate();

         } 
 
 }
