package com.numbers;

public class EvenNum {
public static void main(String[] args) {
	int a=20;
	int count=0,sum=0;
	if (a%2==0) {
		System.out.println(a+" is an Even Number");
	}else {
		System.out.println(a+" is not an even number");
	}for (int i = 0; i <=100; i++) {
		if (i%2==0) {
			System.out.println(i);
			count++;
			sum=sum+i;
}}	System.out.println("count of even numbers "+count);
	System.out.println("Sum of even numbers "+sum);
	System.out.println("count and sum");
}
}
