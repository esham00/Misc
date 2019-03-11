import java.util.*;
public class makeAllWords{
    public static List<String> makeAllWords(int k, int maxLetter) {
	ArrayList<String> output = new ArrayList<String>(10);
	helper(k,maxLetter, "", output);
	return output;
    }
    public static void helper(int k, int maxLetter, String s, ArrayList<String> L) {
	if (k == 0) {
	    L.add(s);
	}
	else {
	    for (int i = 0; i < maxLetter; i++){
		helper(k-1, maxLetter, s+(char)(97+i), L);
	    }
	}
    }
    public static void main(String[] args) {
	List<String> output = new ArrayList<String>(10);
	System.out.println(makeAllWords(2,3));
	System.out.println(makeAllWords(3,3));
    }
}
