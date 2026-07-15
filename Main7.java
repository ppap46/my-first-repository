
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        // 2. 두 번째 입력 안내 메시지 출력
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

    if (num1 > num2){
        System.out.println("더 큰 숫자는"+num1+"입니다");
    }else if (num2>num1){
        System.out.println("더 큰 숫자는"+num2+"입니다");
    }

    System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        // 3의 배수 판별 조건문
        if (num % 3 == 0) {
            System.out.println("3의 배수");
        } else {
            System.out.println("3의 배수 아님");
        }


        int[] numbers = {12, 7, 25, 9, 14};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("배열의 모든 값의 합: " + sum);
  
        
        System.out.print("반지름을 입력하세요: ");
        double radius = sc.nextDouble();
        double area = radius * radius * 3.14;
        System.out.printf("원의 넓이: %.2f\n", area);
    
    // 숫자 입력받기
        System.out.print("숫자를 입력하세요: ");
        int num3 = sc.nextInt();

        // 2로 나눈 나머지가 0이면 짝수, 아니면 홀수
        if (num3 % 2 == 0) {
            System.out.println(num3 + "은/는 짝수입니다");
        } else {
            System.out.println(num3 + "은/는 홀수입니다");
        }

        sc.close();
    
    
    
    
    }

    }

