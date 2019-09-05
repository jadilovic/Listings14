package Code;

public class WordWrap {

	public static String wrap(final String wordLine, final int wrapLength) {
		StringBuilder accumulation = new StringBuilder();
		int stringLength = wordLine.length();
		
		accumulation.append(wordLine, 0, Math.min(stringLength, wrapLength));
		
		int split = wrapLength;
		
		while(stringLength > split){
			accumulation.append('\n');
			accumulation.append(wordLine, split, Math.min(stringLength, split + wrapLength));
			split += wrapLength;
		}	
		return accumulation.toString();
	}
}
