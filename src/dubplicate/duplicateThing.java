package dubplicate;

public class duplicateThing {

	public static void main(String abc[]) {

		readDplWords newObj1 = new readDplWords();

		newObj1.findDuplicate("hello shafeeq shafeeq lives lives in manchesterUK");
	}

}

class readDplWords {
	String mostDuplicate, mostDuplicate2 = "";
    
	public void findDuplicate(String msg) {

		int i = 0;
		int count = 0;
		String current = "";
		String duplicate = "";
		int newPosition = 0;
		String newWord = "";
		String newMsg = "";
		for (; i <= msg.length(); i++) {

			if (i == msg.length() || msg.substring(i, i + 1).equals(" ")) {

				current = msg.substring(newPosition, i);
				newWord = current;

				// System.out.println(newWord +"..."+ newWord.length() + " " + current +
				// current.length());
				
				
				if (newWord.equals(current)) {
					if (newWord.equals(mostDuplicate) | newWord.equals(mostDuplicate2)) {
						newPosition = i;
						continue;	
					}
					find(msg, newWord);
					newMsg += newWord;
				}
				
				
				
				newPosition = i;
				
			}

		}

		// System.out.println(mostDuplicate);
		System.out.println(newMsg);

	}

	public void find(String msg, String lookfor) {
		int i, found;

		i = found = 0;

		for (; i < msg.length(); i++) {

			if (msg.substring(i, i + 1).equals(lookfor.substring(0, 1))) {

				if (msg.length() - i >= lookfor.length()) {

					if (msg.substring(i, i + lookfor.length()).equals(lookfor)) {
						found++;
						i = i + lookfor.length() - 1;
					}
					if (found > 1) {
						mostDuplicate = lookfor;
						mostDuplicate2 = mostDuplicate;
						
					}

				}
			}

		}

		// System.out.println("found " + lookfor + " "+ found + " times" );

	}
	
	public void replaceWord(String msg) {
		
	}

}
