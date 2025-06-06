package DSA;

import java.util.Arrays;

public class d2task1 {

	public static void main(String[] args) {
		int[] num= {3,4,9,4,5};
		Arrays.sort(num);
		int start=0;
		int end=num.length-1;
		System.out.println("before swapping:"+Arrays.toString(num));
		
		while(start<end) {
			int temp=num[end];
			num[end]=num[start];
			num[start]=temp;
			
		start++;
		end--;
		}
		System.out.println("after swapping:"+Arrays.toString(num));
	}
}
