import java.util.*;
public class partition {
    public static int partition(int[] data, int start, int end) {
	Random rand = new Random();
	int a = Math.abs(rand.nextInt()%data.length);
	System.out.println(data[a] + " Random Index:" + a);
	int old = data[0];
	data[0] = data[a];
	data[a] = old;
	while(start < end) {
	    if (data[start] <= data[0]) {
		start++;
	    } else {
		old = data[start];
		data[start] = data[end];
		data[end] = old;
		end--;
	    }
	}
	old = data[start];
	data[start] = data[0];
	data[0] = old;
	return start;
    }
    public static String toString(int[] data) {
	String output = "";
	for(int i = 0; i < data.length; i++) {
	    output += data[i] + " ";
	}
	return output;
    }
    public static void main(String[] args) {
	int[] data = new int[] {999,999,999,4,1,0,3,2,999,999,999};
	System.out.println(partition(data, 0, data.length-1));
	System.out.println(toString(data));
    }
}
