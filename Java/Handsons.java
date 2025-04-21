package com.javaAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Handsons {
	
	
	public static void main(String args[]) {
		/* System.out.println(generateFibonacci(9)); */
		/* System.out.println(checkPrimeNumber(9)); */
		/*
		 * System.out.println(factorial(5)); sumofArray();
		 */
		//arrayevenOdd();
		/* missingNumber(); */
		//removeDuplicate();
		/* SortingArray(); */
		/* count(); */
		//arrangeNegativePostiveArray();
		
		System.out.println(combineLargeNummber());
	}
	
	public static String combineLargeNummber() {
		int[] nums = {3, 30, 34, 5, 9};
		
		String[] StringNum=Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
		
		System.out.println(Arrays.toString(StringNum));
		
		Arrays.sort(StringNum, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String order1=o1+o2;
				String order2=o2+o1;
				return order2.compareTo(order1);
			}
		});
		
		System.out.println(Arrays.toString(StringNum));
		
		if(StringNum[0].equals("0")) {
			return "0";
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(String num:StringNum) {
			sb.append(num);
		}
		return sb.toString();
		
		
	}
	
	public static void arrangeNegativePostiveArray() {
		int[] arr = {1, -3, 5, -7, -2, 6, 8, -4};
		
		List<Integer> positive=new ArrayList<>();
		List<Integer> negative=new ArrayList<>();
		
		for(int num:arr) {
			
			if(num>0) {
				positive.add(num);
			}else {
				negative.add(num);
			}
		}
		
		int index=0;
		
		for(int i:negative) {
			arr[index++]=i;
		}
		for(int i:positive) {
			arr[index++]=i;
		}
	
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void count() {
		
		String s="Yesu Raja Developer";
		/*
		 * int total=s.length();
		 * 
		 * int a=s.replace("e", "").length(); System.out.println((total-a));
		 */
//		String rev="";
//		for(int i=s.length()-1; i>=0; i--) {
//			rev+=s.charAt(i);
//		}
//		System.out.println(rev);
		
		String[] s1=s.split(" ");
		
		String reverseFinal="";
		
		for(String s2:s1) {
			
			String reverse="";
		//	for(int i=s2.length()-1; i>=0;i--) {
				
			//	reverse+=s2.charAt(i);
			//}
			StringBuilder sb = new StringBuilder(s2);
			sb.reverse();
			reverseFinal+=sb.toString()+" ";
		}
		System.out.println(reverseFinal);
		
		
	}
	
	public static void SortingArray() {
		int a[]= {3,1,2,7,8,9,34,6};
		System.out.println("Before Sort"+Arrays.toString(a));
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1; j++) {
				
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("After Sort"+Arrays.toString(a));
	}
	
	
	public static void removeDuplicate() {
		
		List<String> inputData=new ArrayList<String>();
		
		inputData.add("java");
		inputData.add("C++");
		inputData.add("Java");
		inputData.add("C++");
		inputData.add("Java");
		inputData.add("Java");
		
		
		List<String> filtered=inputData.stream().distinct().toList();
		String search="C++";
		List<String>SortList=inputData.stream().sorted().toList();
		List<String> SearchList=inputData.stream().filter(p->p.equals(search)).collect(Collectors.toList());
		for(int i=0; i<inputData.size(); i++) {
			for(int j=0; j<inputData.size(); j++) {
				
				if(inputData.get(i).equals(inputData.get(j))) {
					inputData.remove(i);
				}
			}
		}
		System.out.println(SortList);
		
	}
	
	public static void missingNumber() {
		
		int a[]= {91,93,94,95};
		
		int sum1=0;
		int sum2=0;
		for(int i=0; i<a.length;i++) {
			sum1+=a[i];
		}
		for(int i=1;i<=a.length+1;i++) {
			sum2+=i;
		}
		
		System.out.println("Missing Number is : "+(sum1-sum2));
	}

	public static void arrayevenOdd() {
		
		int a[]= {2,3,4,5,6,7,8,20};
		
		List<Integer>even = new ArrayList<Integer>();
		List<Integer>odd = new ArrayList<Integer>();
		
		
		for(int i=0; i<a.length-1;i++) {
			
			if(a[i]%2==0) {
				even.add(a[i]);
			}else {
				odd.add(a[i]);
			}
		}
		System.out.println("odd"+odd+"even"+even);
	}
	
	public static List<Integer> generateFibonacci(int count) {
		int n=0; int n1=1;
		int sum=0;
		List<Integer> fibonaci=new ArrayList<Integer>();
		for(int i=0; i<=count; i++) {
			sum=n+n1;
			fibonaci.add(n);
			n=n1;
			n1=sum;
			
		}
		return fibonaci;
		
	}
	
	public static boolean checkPrimeNumber(int input) {
		int count=0;
		if(input>1) {
			
			for(int i=1; i<=input;i++) {
				
				if(input%i==0) {
					count++;
				}
			}
		}
		return count==2?true:false;
	}
	
	public static int factorial(int num) {
		
		int sum=1;
		int dummy=0;
		for(int i=1; i<=num;i++) {
			sum*=i;
		}
		return sum;
	}
	
	public static void sumofArray() {
	int a[]= {1,2,3,4,5,6,7,89,5,5};
	int sum1=0;
	int sum2=0;
	
	for(int i=0; i<=a.length-1;i++) {
		sum1+=a[i];
	}
	
	for(int value:a) {
		sum2+=value;
	}
	
	System.out.println(sum1+""+sum2);
	}
}
