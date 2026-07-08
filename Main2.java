/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		
		//int[] arr = new int[3];
	    //arr[0] = 5;
		//arr[1] = 10;
		//arr[2] = 15;
		
		//문제1 배열의 두번 째 갑 출력
		//System.out.println(arr[1]);
		
		int[] arr2 = {3,6,9};
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		
		//크기가 4인 정수형 배열 nums를 선언하세요
		int[] nums = new int[4];
		
	    //다음 배열의 첫 번째 값을 100으로 바꾸는 코드를 쓰세요
	    int[] arr = {5,10,15};
	    arr[0] = 100;
	    
	    //배열의 모든 값을 한 줄씩 출력하도록 빈칸을 채우세요
	    String[] arr3 = {"성","일","인"};
	    
	    for (int i=0; i<arr3.length; i++){
	        System.out.println(arr3[i]);
	    }
	    //문자열을 저장하는 리스트 foods를 선언하세요
	    ArrayList<String> foods = new ArrayList<>();
	    
	    //딸기,바나나 저장
	    foods.add("딸기");
	    foods.add("바나나");
	    
	    ArrayList<String> list = new ArrayList<>();
	    list.add("김밥");
	    list.add("떡복이");
	    System.out.println(list.get(1)); //떡볶이
	    
	    list.set(1, "떡볶이");
	    
	    System.out.println(list.size()); //2
	    
	    
	}
}
