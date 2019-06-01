class Arg{
	public static void main(String[] args){
	double pop_60,pop_17;
	
		pop_60=Double.parseDouble(args[0]); 	//Integer.parseInt fonctionnne aussi //elle permet de transformer un string en double
		pop_17=Double.parseDouble(args[1]);


	double res=((pop_17/pop_60)-1)*100;

	  System.out.printf("L'accroissement est: %.2f %%",res);	//%% pour afficher le % sinon il ne comprend pas //prinf fonctionne aussi en java
	}

}

