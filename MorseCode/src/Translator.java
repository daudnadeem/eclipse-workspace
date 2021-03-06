import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Translator {
	
	public static void main(String[] args) {
		
		String toEnglish = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		decode(toEnglish);
		
	}
	
	public static void decode(String toTranslate) {
		Map<String,String> mymap = new HashMap<String, String>(); 
		ArrayList <String> listFinal = new ArrayList<String>();
		String finalString = "";
		
		mymap.put(".-", "A");
		mymap.put("-...", "B");
		mymap.put("-.-.", "C");
		mymap.put("-..", "D" );
		mymap.put(".", "E" );
		mymap.put("..-.", "F");
		mymap.put("--.", "G" );
		mymap.put("....", "H" );
		mymap.put("..", "I" );
		mymap.put(".---", "J");
		mymap.put("-.-", "K" );
		mymap.put(".-..", "L" );
		mymap.put("--", "M" );
		mymap.put("-.", "N" );
		mymap.put("---", "O" );
		mymap.put(".--.", "P" );
		mymap.put("--.-", "Q" );
		mymap.put(".-.", "R" );
		mymap.put("...", "S" );
		mymap.put("-", "T" );
		mymap.put("..-", "U" );
		mymap.put("...-", "V");
		mymap.put(".--", "W" );
		mymap.put("-..-", "X" );
		mymap.put("-.--", "Y" );
		mymap.put("--..", "Z" );
		mymap.put("/", " ");
		
		List<String> items = Arrays.asList(toTranslate.split("\\s+"));
		for(String word: items) {
			listFinal.add(mymap.get(word));
		}
		

		for (String s : listFinal)
		{
			finalString += s;
		}
		
		for (int index = 0; index < finalString.length(); index++) {
		    System.out.print(finalString.charAt(index));
		    try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
