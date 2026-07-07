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
        //함수 정의: 함수를 만든다
        //함수명() {
            
        //}
        //함수 사용: 함수명(); (여러개 사용하려면 줄 바꿈해서 쓰기)
        run(int i, String s){
              i++;
           s += "정보고";
        }
        //run(5,"성일"); = 6,성일정보고
		//반복문과 배열
		//Java
		int[] arr = {10,20,30};
		for(int i=0; i<arr.length; i++) {
		    System.out.println(arr[i]);
		}
		//리스트란?
		//배열처럼 여러 값을 저장할 수 있는 자료 구조
		
		ArrayList 값 생성 = ArrayList<String> names = new ArrayList<>();
        ArrayList 정수 리스트 만들기 ArrayList<Integer> nums = new ArrayList<>();	
        
        값 넣기 ArrayList<Integer> nums = new ArrayList<>(); 
        nums.add(1);
        값 빼기 System.out.println(nums.get(index);
        값 수정 nums.set (index,값)
        값 제거 nums.remove(index) or nums.remove("값")
        리스트 크기 구하기 System.out.println(nums.size());
        
        //반복문과 리스트
        ArrayList<String> names = new ArrayList<>();
        names.add("민수");
        names.add("지우");
        names.add("시연");
        
        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(1));
        }
        //배열과 리스트 차이점 1.같은 자료형 2.크기 변경 
        //기억 할 내용 1.배열은 같은 자료형의 값을 여러 개 저장하는 공간
        //2.배열의 인덱스는 0부터 시작
        //3.배열의 길이는 length
        //4.리스트는 크기를 자유롭게 늘리거나 줄일 수 있음
        //5.값 추가 add()
        //6.값 꺼내기 get()
        //7.값 수정 set()
        //8. 크기 size()
	}
}
