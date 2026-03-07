package practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
    	System.out.println("배열의 크기를 정해주십시오 : ");
    	int size = sc.nextInt();
    	int[] arr = new int[size];
    	System.out.println("배열의 크기는 :"+size+"입니다.");
    	for(int i = 0; i<arr.length ; i++)
    	{
    		arr[i] = sc.nextInt();
    	}
    	for(int i = 0;i<arr.length;i++)
    	{
        	System.out.println("배열의 "+i+"칸의 값은 "+arr[i]+"입니다.");
    	}
    sc.close();
    }
}
