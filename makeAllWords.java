import java.util.*;
public class makeAllWords{
    public static List<String> makeAllWords(int k, int maxLetter) {
	List<String> output = new ArrayList<String>(10);
        for(int i = 97; i <= maxLetter;i++) {
	    helper(k-1, (char)i + "", 97,  maxLetter, output, k-1, (char)i + "");
	}
	return output;
    }
    public static void helper(int k, String constant,  int start, int  maxLetter, List<String> output, int originalK, String originalC) {
	String word = constant;
	if ((maxLetter - start) + 1 == originalk) {
	    for (int i = start; i < k + start; i++) {
		word = word + (char)i;
	    }
	    output.add(word);
	} else {
	    for(int i = start; i < start + originalk; i++) {
		word = word + (char)i;
	    }
	    output.add(word);
	    if (k > 0) {
		helper(k-1, constant, start, maxLetter, output, originalK);
	    } else {
		helper(originalK, originalC, start+1, maxLetter, output, originalk, originalC);
	    }
	}
    }
    public static void main(String[] args) {
	List<String> output = new ArrayList<String>(10);
	System.out.println(makeAllWords(2,99));
	System.out.println(makeAllWords(3,99));
    }
}
