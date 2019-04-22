package dubplicate;

public class duplicateThing {
	
	public static void main (String abc[]) {
		
		readDplWords newObj1 = new readDplWords();
		
		newObj1.findDuplicate("hello shafeeq shafeeq shafeeq lives in manchesterUK"); 
	}

}

class readDplWords{
	
	public void findDuplicate(String msg) {
		
		int i = 0; 
		int count = 0;
		String current = "";
		String duplicate = "";
		int newPosition=0; 
		String newWord = "";
		for(; i <= msg.length(); i++) {
			
			if ( i == msg.length() || msg.substring(i, i + 1 ).equals(" ")) {
				
				current = msg.substring(newPosition,i);
				newWord = current;
				//System.out.println(newWord);
				//System.out.println(current);
				if ( newWord.equals(current) & newWord.length() == current.length()) {
				  
					//System.out.println(newWord);
		
					//newWord = newWord + current; 
					
					//System.out.print(newWord + count);
					 
					//System.out.println(duplicate+count);
					
					count++;
					
				}
				//else{
					
					//duplicate = duplicate + current; 
					
				//}
				
				newPosition = i;
				
			}
			
			
			
		}
		
		//System.out.println(duplicate);
		
		System.out.println(count);
		
		
	}
	
}
