package SpanishPackage;

public class Future {

	boolean which;
	int situation;
	String word;

	public Future(boolean which, int situation, String word) {
		super();
		this.which = which;
		this.situation = situation;
		this.word = word;
	}

	String getFinalVerb() {
		return "voy a "+ word;
	}
}
