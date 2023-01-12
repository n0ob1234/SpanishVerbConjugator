package SpanishPackage;

public class Subjective {

	boolean which;
	int situation;
	String word;

	public Subjective(boolean which, int situation, String word) {
		super();
		this.which = which;
		this.situation = situation;
		this.word = word;
	}
	String[] ar = { "e", "es", "e", "emos", "éis", "en" };
	String[] erir = { "a", "as", "a", "amos", "áis", "an" };

	String getFinalVerb() {
		VerbFixer fixedVerb = new VerbFixer(which, ar, erir, situation, word);
		return fixedVerb.fixVerb();
	}

}
