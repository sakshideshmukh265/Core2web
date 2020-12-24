//WRITE A JAVA PROGRAM INTERFACE HEALTHMINISTRYNORMS THEN INTERFCAE ICMRGUIDLINES EXTENDING THE PREVIOUS ONE AND THEN CLASS STATE IMPLEMENTING ICMRGUIDELINES

interface HealthMinistryNorms{

void fundingSource();
void EvaluateHealthService();

}

interface ICMRGuidlines extends HealthMinistryNorms{

void vaccineToPass();

}

class State implements ICMRGuidlines{

    public void fundingSource(){
	
	  System.out.println("Source Funding through GOG,Health Insurance,International Community\n");
	
	
	
	}
public void EvaluateHealthService(){

         System.out.println("Evaluate Health Service by Ghana Health Service,Teaching Hospitals,Private Sector\n");

}
public void vaccineToPass(){

          System.out.println("Vaccine to pass: COVID-19");

}

public static void main(String[] args){

       ICMRGuidlines i=new State();
       i.EvaluateHealthService();
      i.fundingSource();
      i.vaccineToPass();

}
}
