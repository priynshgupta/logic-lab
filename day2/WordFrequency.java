package day2;


public class WordFrequency {

	public static void main(String[] args) {
		String str = "Java is fun and Java is powerful";
		
		String[] words = str.split(" ");
		
		String[] uniWords = new String[words.length];
		int[] count = new int[words.length];
		
		int uniCounts = 0;
		
		for (int i=0; i < words.length; i++) {
			
			boolean found = false;
			
			for (int j=0; j < uniCounts; j++) {
				if (uniWords[j].equals(words[i])) {
					count[j]++;
					found = true;
					break;
				}
			}
			
			if(!found) {
				uniWords[uniCounts] = words[i];
				count[uniCounts] = 1;
				uniCounts++;
			}
		}
		
		
		for (int i = 0; i < uniCounts; i++) {
            System.out.println(uniWords[i] + ": " + count[i]);
        }
		

	}

}
