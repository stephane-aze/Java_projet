import java.util.Locale;

class NoteFinale{
	public static void main(String[] args){
	double pop_60,pop_17;
	int i=0;
	double note=0;
	if(args.length>0){
		for (String arg : args){
			note=note+Double.parseDouble(arg);	
			
			i++;
		}
		  System.out.printf(Locale.US,"La moyenne :%.1f",note/args.length);	//%% pour afficher le % sinon il ne comprend pas //prinf fonctionne aussi en java
	}else {
		  System.out.printf("Pas de note");	//%% pour afficher le % sinon il ne comprend pas //prinf fonctionne aussi en java
		}

	}

}

