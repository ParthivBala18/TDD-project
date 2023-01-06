package com.capgemini.app;
public class Calculator {
	int x,y,mod;
	public Calculator(){
		x = y = mod = 0;
	}

	public int modulus(int i,int j)throws ArithmeticException{
		if(j!=0){mod = i%j;return mod;}
		else
			System.out.println("Division modulus is not possible");
		return mod;
	}
	public int sum(int i,int j){
		return i+j;
	}
	public int product(int i, int j){
		return i*j;
	}
	public int difference(int i , int j){
		int diff=0;
		if(i>j){
			diff = i-j;
			return diff;
		}
		else if(i<j){
			diff = j-i;
			return diff;
		}
		return diff;


	}
	public int divison(int i,int j){
		return i/j;
	}
}

