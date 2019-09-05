package Code;

public class WordWrap {

	public static String wrap(final String wordLine, final int wrapLength) {
		StringBuilder accumulation = new StringBuilder();
		int stringLength = wordLine.length();
		
		accumulation.append(wordLine, 0, Math.min(stringLength, wrapLength));
		
		int split = wrapLength;
		
		if(stringLength > split){
			accumulation.append('\n');
			accumulation.append(wordLine, split, split + wrapLength);
		}
		
		split += wrapLength;
		
		if(stringLength > split){
			accumulation.append('\n');
			accumulation.append(wordLine, split, stringLength);
		}
		
		return accumulation.toString();
	}

	
}
