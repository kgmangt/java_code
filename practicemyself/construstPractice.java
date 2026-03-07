package practice;

import java.util.Scanner;

class Myfriend {
	String Name;
	int age;
	
	void hello() {
		System.out.println("내 이름은 "+Name+"이고 나이는 "+age+"다");
	}
}

public class practice1 {
    public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
     	Myfriend p1 = new Myfriend();
     	System.out.println("너 이름이 뭐야?");
     	p1.Name = sc.next();
     	System.out.println("나이는?");

     	p1.age = sc.nextInt();
     	System.out.println("다시 니이름좀 쳐줄래?");
     	String Namechecker = sc.next();
     	if(p1.Name.equals(Namechecker))p1.hello();
     	else {
     		System.out.println("달라");
     		for(;;)
     		{
     			System.out.println("다시 니이름좀 쳐줄래?");
     			Namechecker = sc.next();
     			if(p1.Name.equals(Namechecker))
     			{ㄱ
     				p1.hello();
     				break;
     			}
     			else
     				System.out.println("또 달라");
     		}
     	}
     	sc.close();
    }
}
