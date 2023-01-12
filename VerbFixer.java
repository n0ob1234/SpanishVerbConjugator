package SpanishPackage;

public class VerbFixer  {

	boolean which;
	String word;
	String[] ar;
	String[] erir;
	int situation;
	
	
	public VerbFixer(boolean which, String[] ar, String[] erir, int situation,String word) {
		super();
		this.which = which;
		this.ar = ar;
		this.erir = erir;
		this.situation = situation;
		this.word = word;
	}


	


	public String fixVerb() {
		if(which) {
			return word.substring(0,word.length()-2)+ar[situation];
		}
		return word.substring(0,word.length()-2)+erir[situation];
		
	}
	public String fixStemException(String[][] exp, int wordNum) {
		if(which) {
			return exp[wordNum][1]+ar[situation];
		}
		return exp[wordNum][1]+erir[situation];
		
	}
	public String findOdd( String[][] exp2, int wordNum ) {
		return exp2[wordNum][situation];
	}
	
}
