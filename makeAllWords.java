import java.util.*;
public class makeAllWords{
    public static List<String> makeAllWords(int k, int maxLetter) {
	List<String> output = new ArrayList<String>(10);
        for(int i = 97; i <= maxLetter;i++) {
	    helper(k-1, (char)i, 97,  maxLetter, output);
	}
	return output;
    }
    public static void helper(int k, char constant,  int start, int  maxLetter, List<String> output) {
	String word = constant + "";
	if ((maxLetter - start) + 1 == k) {
	    for (int i = start; i < k + start; i++) {
		word = word + (char)i;
	    }
	    output.add(word);
	} else {
	    for(int i = start; i < start + k; i++) {
		word = word + (char)i;
	    }
	    output.add(word);
	    helper(k, constant, start+1, maxLetter, output);
	}
    }
    public static void main(String[] args) {
	List<String> output = new ArrayList<String>(10);
	System.out.println(makeAllWords(2,99));
    }
}
