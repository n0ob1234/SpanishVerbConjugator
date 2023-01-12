package SpanishPackage;

public class EndingChecker {

	String word;
	boolean ending;
	public EndingChecker(String word) {
		super();
		this.word = word;
	}

	//Only returns boolean that represent the last two letters of the word (false = er/ir, true = ar).
	 boolean getEnding() {
		word = word.toLowerCase();
		if(word.substring(word.length()-2,word.length()) == "ar") {
			ending = true;
			return true;
		}
		ending = false;
		return false;
	 }
		//returns a boolean on whether the ending is ar er or ir
		boolean checkEnd() {
			word = word.toLowerCase();

			String ending = word.substring(word.length()-2,word.length());
			if(ending.equals("ar")  ||ending.equals("er")  || ending.equals("ir")  ) {
				System.out.println("has famliar endings");
				
				return true;
			}
			return false;
	}
		// returns the stem of the word
		String getEverythingButend() {
			return word.substring(0,word.length());
			}
}
