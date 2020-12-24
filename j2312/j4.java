interface Papa{

	void kharcha();
	void career();

}

interface Mummy extends Papa{ 

        void jevan();
}

class Me implements Mummy{

	public void kharcha(){

		System.out.println("Majya kharacha sati:5000\n");
	}

	public void career(){
	
	        System.out.println("Carrer-Software Enggineering\n");
	}

	public void jevan(){
	
	       System.out.println("2 chapati,bhaaji n bhaat\n");
	}

public static void main(String[] args){

        Mummy m=new Me();
	m.kharcha();
	m.career();
	m.jevan();




}


}
