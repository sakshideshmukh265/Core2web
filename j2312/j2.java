//WRITE A AJVA PROGRAM HAVING INTERFace VACCINEREGULATORYAUTHORITY AND CLASS PFIZER,CLASS MODERNA AND CLASS BIONTECH IMPLEMENTING
//THIS INTERFACE

interface VaccineRegulatoryAuthority{

              void CountriesToProvide();
	      void PurposeOfVaccine();
}

 class pFizer implements VaccineRegulatoryAuthority{
	 
	 public void CountriesToProvide(){

		 System.out.println("COUNTRIES WHICH APPROVED pFizer:US,CANADA,SAUDI ARABIA,MEXICO");

	 }

	 public void PurposeOfVaccine(){

		 System.out.println("PURPOSE OF PFIZER VACINE IS TO TREAT COVID-19");

	 }
}

 class Moderna implements VaccineRegulatoryAuthority{

         public void CountriesToProvide(){

                 System.out.println("COUNTRIES WHICH APPROVED Moderna:US,CANADA,SAUDI ARABIA,MEXICO");

         }

         public void PurposeOfVaccine(){

                 System.out.println("PURPOSE OF Moderna VACINE IS TO TREAT COVID-19");

         }
}

 class BioNTech implements VaccineRegulatoryAuthority{

         public void CountriesToProvide(){

                 System.out.println("COUNTRIES WHICH APPROVED BioNTech:US,CANADA,SAUDI ARABIA,MEXICO");

         }

         public void PurposeOfVaccine(){

                 System.out.println("PURPOSE OF BioNTech VACINE IS TO TREAT COVID-19");

         }
}

class Vaccine{

	public static void main(String[] args){

		VaccineRegulatoryAuthority v=new pFizer();
		       v.CountriesToProvide();
		       v.PurposeOfVaccine();

                VaccineRegulatoryAuthority v1=new Moderna();
                       v1.CountriesToProvide();
                       v1.PurposeOfVaccine();

                 VaccineRegulatoryAuthority v2=new BioNTech();
                       v2.CountriesToProvide();
                       v2.PurposeOfVaccine();
	}
}


