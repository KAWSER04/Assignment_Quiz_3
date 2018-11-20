package begginers;

import java.util.Scanner;

public class Array_Simple {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] number=new int[10];
		number[0]=input.nextInt();
		number[1]=input.nextInt();
		number[2]=input.nextInt();
		number[3]=input.nextInt();
		number[4]=input.nextInt();
		number[5]=input.nextInt();
		number[6]=input.nextInt();
		number[7]=input.nextInt();
	
		int sum=0;
		sum=number[0]+number[1]+number[2]+number[3]+number[4]+number[5]+number[6]+number[7];
		int len=number.length;
		System.out.println("sum= "+sum);
		
	}

}
