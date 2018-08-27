package com.java.quyhoachdong;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void generate(int a[], int s) {
		int[] temp = new int[s];
		
		for(int i=1;i<=s;i++) {
			temp[i-1]=0;
			int t=0;
			for(int j=0;j<3;j++) {
				int d=0;
				int ret = 0;
				if(a[j]+t<=i) {
					d++;
					if(a[j]+t==i) {
						temp[i-1]+=d;
						break;
					}
					while(ret<i) {
						ret = a[j]*d;
						d++;
					}
					
				}
				if(ret==i) {
					temp[i-1]+=d;
					break;
				}
				if(ret>i) {
					d--;
					t=a[j]*d;
				}

			}
			
		}
		System.out.println("\nVới ["+a[0]+", "+a[1]+", "+a[2]+"]");
		for(int i=1;i<=s;i++) {
			System.out.print(i);
			if(i!=s)
				System.out.print(", ");
		}
		System.out.println("\n");
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]);
			if(i!=temp.length-1)
				System.out.print(", ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập cân nặng: ");
		int c = scan.nextInt();
		scan.nextLine();
		auto(a, c);

	}
	private static void auto(int a[], int c) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		//for(int i=0;i<3;i++) {
			//a[i] = rand.nextInt(10)+1;
			
		//}
		a[0]=1;
		a[1]=3;
		a[2]=5;
		for(int i=0;i<2;i++) {
			for(int j=i+1;j<3;j++) {
				if(a[j]>a[i]) {
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		generate(a, c);
	}
	private static void type(int a[]) {
		// TODO Auto-generated method stub
		
	}

}
