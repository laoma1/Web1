package com.mawei.web;
//
import java.util.Map;
import java.util.HashMap;
import java.math.BigInteger;
 

public class Main {

public static void main(String args[]){

     System.out.println(Fibonacci.of(200));
}

public static class Fibonacci{
private static Map<Integer,BigInteger> map=new HashMap<>();
 
public static BigInteger of(int i){
	
	if(i==1||i==2){
		printResult(i,BigInteger.ONE);
	return BigInteger.ONE;
	}
	
	if(map.containsKey(i)){
		return map.get(i)  ;
	}
	
	BigInteger result=of(i -1).add(of(i -2));
	printResult(i,result);
	map.put(i, result);
     return result;
}
		public static void printResult(int i,BigInteger result){
			System.out.println("Fibonacci.of("+i+")"+" "+"="+result);
		}
}
}




