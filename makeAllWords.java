import java.util.*;
public class makeAllWords{
    public static List<String> makeAllWords(int k, int maxLetter) {
	List<String> output = new List<String>();
        for(int i = 97; i < maxLetter;i++) {
	    helper(k, (char)i, maxLetter, output);
	}
	return output;
    }
    public static void helper(int k, char currentLetter, int maxLetter, List<String> l) {
	String word = currentLetter + "";
	for(int j = 0; j < k; j++) {
	    for(int i = 97; i < maxLetter; i++) {
		word += ((char)i);
	    }
	}
    }
}
