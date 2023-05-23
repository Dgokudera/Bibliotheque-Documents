package projet;

public class ClDate {
	private  int  annee;
	private  int  mois;
	private  int  jour;
	

	public ClDate  (  ) {
		annee=0;
		mois=1;
		jour=1;
	}

	public ClDate ( int  _annee,  int  _mois,  int  _jour )
	{	annee     =  _annee;
		 setMois(_mois, _jour) ;
		setJour(_jour,_mois) ;
	}

	public  void  setMois ( int  _mois,int _jour ) {
		if (mois>=1 && mois<=12) {
		       mois  =  _mois;
	}
		else
		       mois  =  1;
	}

	public void  setJour ( int  _jour ,int _mois) 
	{   
	     if  ( validerDateComplete ( _jour )  ) {
	    	 
	           jour  =  _jour;
	     }
	     else
	           jour  =    1;
	    
	}
	public void setClDate(int a,int m, int j) {
		annee=a;
		mois=m;
		jour=j;
		
	}
	private  boolean validerDateComplete ( int _jour){  

		if ((mois>=1) && (mois<=12)) {
			if(mois == 1 || mois==3 || mois == 5 || mois==7 || mois == 8 || mois == 10 || mois==12){
				if((_jour>=1)&& (_jour<=31)) {
				 return true;
			}
				else return false;
		}
			else if( mois==4 || mois == 6 || mois==9 || mois == 11) {
				if((_jour>=1)&& (_jour<=30)) {
					return true;
			}
				else return false;
		}
			else if( mois==2) {
				if(verifierAnnee()) {
					if((_jour>=1 && (_jour<=29))) {
						return true;
					}
					else return false;
				}
				else if((_jour>=1 && (_jour<=28))) {
					return true;
				}
				else return false;

			}
		}
		return false;
	}
		 private boolean verifierAnnee(){
			 if(annee%4==0 || annee%400 ==0 && !(annee%100==0)) {
				 return true;
			}
			 else return false;
		 }
			    



	public int getAnnee() {
		return annee;
	}
	public int getMois() {
		return mois;
	}
	public int getJour() {
		return jour;
	}

	public void setAnnee(int _annee) {
		this.annee = _annee;
	}


	public String getDate() {
		String date=annee + "/"+ mois + "/" + jour;
		return date;
	}
	public   boolean  equals   (  ClDate  obj  )
    {
   return   ( this.annee  ==  obj.getAnnee  ( )
                   &&
                  this.mois    ==  obj.getMois ( ) 
                   &&
                  this.jour     ==  obj.getJour ( ) ) ;
    }

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + jour;
		result = prime * result + mois;
		return result;
	}
	public String toStrings() {
		return "annee " + annee + " mois" + mois + "  jour" + jour ;
	}

	

	
}
