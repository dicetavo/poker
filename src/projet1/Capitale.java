package projet1;

class Capitale extends Ville {
	  private String monument;
	  
	  //Constructeur par défaut
	  public Capitale(){
	    //Ce mot clé appelle le constructeur de la classe mère  
	    super();
	    monument = "aucun";
	  }
	  
	  public String decrisToi(){
		    String str =  super.decrisToi() + "\n \t ==>>" + this.monument+ " en est un monument";
		    System.out.println("Invocation de super.decrisToi()");
		    
		    return str;
		   }
}
