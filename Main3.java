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
       ArrayList<String> list = new ArrayList<>();
       
       /*
       for문의 자료 구조
       
       for(초기식; 조건식; 증강식){
           실행문
       }
       
       
       
       while문의 자료구조
       
       while(조건식){
           실행문
           증감식                
       }
       
       증감식은 때에 따라 실행문 위에 있을수도 있다
       */
       
       for(int i=0; i<5; i++){         //for문 예시
           System.out.println(i);
       }
       
       
       int i = 0;
       while(i<5){
           System.out.println(i);      //while문 예시
           i++;
       }
       
       
       
       /*
       for문과 while문의 차이
              
               for                              while 
       
       반복 횟수를 알고있을때             반복 횟수를 모를 때
       
       프로젝트에서 많이 사용         로그인,메뉴 등에서 자주 사용
       
       가장많이 사용         
        */
     
      
      
      //for문 활용
      
      int size = 20;                       //1부터 20까지 출력하기          
      for(int o = 1; o<= size; o++){
          System.out.println(o);
      }
       
      
      int size1 = 50;                      //50부터 1까지 출력하기
      for(int p = size1; p > 0; p--){     
          System.out.println(p);
      }
      
      
      for(int u = 1; u <= 20; u++){       //1부터 20까지 짝수만 출력하기
          if(u % 2 == 0){
          System.out.println(u);
          }
              
      }
      
      
      int sum = 0;                         //100합계 출력하기
      for(int i = 1; i <= 100; i++){
           sum += i;
      }
      System.out.println(sum);
      
      
      String[] students = {"성일A", "성일B", "성일C", "성일D"};
      for(int i = 0; i < students.length; i++){
          System.out.println(students[i]);
      }
      
      
      
      
      
   }
}