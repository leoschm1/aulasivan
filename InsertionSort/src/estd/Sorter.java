package estd;

import java.util.Arrays;

public class Sorter {

	public void sort(int[] a){
		System.out.println(Arrays.toString(a));
		int n = a.length;
		for (int i = 1; 1< n; i++){
			int cur = a[i];
			int j = i -1;
			while((j >= 0) && (a[j] > cur)){
				a[j + 1] = a[j--];
				System.out.println(Arrays.toString(a));
			}
			a[j + 1] = cur;
			System.out.println(Arrays.toString(a));
		}
	}
	
}
