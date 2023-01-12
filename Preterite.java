package SpanishPackage;





public class Preterite {


	boolean which;
	int situation;
	String word;

	public Preterite(boolean which, int situation, String word) {
		super();
		this.which = which;
		this.situation = situation;
		this.word = word;
	}
	String [][] exp = {{"andar","anduv"}, {"venir","vin"}, {"estar","estuv"}, {"poder","pud"},{"poner","pus"}, {"saber","sup"}, {"tener","tuv"}, {"hacer","hic"},{"venir","vin"}, {"querer","quis"}, {"decir","dij"}, {"traer","traj"},{"conducir","conduj"}, {"producir","produj"}, {"traducir","traduj"}, 
			{"detener","detuv"},{"retener","retuv"}, {"contener","contuv"}, {"convenir","convin"}, {"prevenir","previn"},{"componer","compus"}, {"descomponer","descompus"}, {"proponer","propus"}, {"disponer","dispus"}, {"predecir","predij"}, {"contradecir","contradij"}, {"deshacer","deshic"}, {"rehacer","rehic"}};
	
	String [][] exp2 = {{"ser","fui","fuiste","fue","fuimos","fuisteis","fueron"}, {"ir","fui","fuiste","fue","fuimos","fuisteis","fueron"},{"dar","di","diste","dio","dimos","disteis","dieron"},{"ver","vi","viste","vio","vimos","visteis","vieron"}};
	//the arrays that store the endings
	String[] ar = { "é", "aste", "ó", "amos", "asteis", "aron" };
	String[] erir = { "í", "iste", "ió", "imos", "isteis", "ieron" };
	

	String getFinalVerb() {
		VerbFixer fixedVerb = new VerbFixer(which, ar, erir, situation, word);
		//checking for exceptions that include changing the stem of the verb.
		for (int i= 0; i< exp.length;i++) {
			if(word.toLowerCase().equals(exp[i][0])) {
				return fixedVerb.fixStemException(exp, i);
			}
		}
		// Checking for complete exceptions
		for(int i =0; i<exp2.length; i++ ) {
			if(exp2[i][0].equals(word)) {
				return fixedVerb.findOdd(exp2, i);
			}
		}
		// sends the verb to verbfixer
		return fixedVerb.fixVerb();
	}
}
