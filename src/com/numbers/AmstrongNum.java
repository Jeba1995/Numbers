package com.numbers;

public class AmstrongNum {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int ams=0;
	while(num>0) {
		int n=num%10;
		ams=ams+(n*n*n);
		num=num/10;
	}
	if(ams==temp) {
		System.out.println("ams");
	}else {
		System.out.println("not an ams");
	}System.out.println("=====ams no between 1 to 1000=====");
		int c=0;
	for (int n = 1; n <=100 ; n++) {
		
	int a,i,j=0;
	 a=n;
	while(a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}	if (n==j) {
		System.out.println(j);
		c++;
	}
	
	}	System.out.println(c);
}
}
