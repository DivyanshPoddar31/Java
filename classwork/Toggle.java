package classwork;

import java.util.Arrays;

public class Toggle {
	public static void main(String[] args) {
		int[] a=new int[10];
		Arrays.fill(a,0);
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(j%i==0) {
					if(a[j]==0) {
						a[j]=1;
					}
					else {
						a[j]=0;
					}
				}
			}
		}
		for(int i=1;i<=10;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
