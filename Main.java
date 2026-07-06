/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print("Hello ");
		System.out.println("World");
		 
		// 자료형 변수명;
		// 변수명 = (초기)값;
		
		// 자료형 변수명 = (초기)값;
		// int a = 4;
		// a = 10;
		//자료형은 만들때 변수 만들때 한번만 쓴다 다음에 변수 값을 바꿀때에는 값만 바꾼다
		//int a = 4;
		//int a = 10; //XXXX 이렇게 하면 안된다
		int a = 0;
		String s = "";
		
		//객체 선언
		//객체 객체명 = new 객체();     (대문자 소문자 다 가린다 똑같이 써야 오류가 안난다)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		a = sc.nextInt();
		
		System.out.print("이름을 입력하세요: ");
		s = sc.nextLine();
		
		
	}
}
