import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        String[] students = {"철수","영희","민수","수진"};

        //배열의 마지막 학생 출력
        //힌트: 배열의 길이
        System.out.println("배열의 길이:"+students.length);
        System.out.println("마지막 학생:"+students[students.length-1]);

        //배열 거꾸로 출력
        for(int i=students.length-1; i>=0; i--){
            System.out.println(students[i]);
        }
        //학생 이름 입력받기
        Scanner sc = new Scanner(System.in);
        String[] stu = new String[5];

        for(int i=0; i<stu.length; i++){
            System.out.println((i+1)+"번째 학생: ");
            stu[i] = sc.nextLine();
        }
        
        
        //학생 명단
        System.out.println("===학생 명단===");
        for(int i=0; i<stu.length; i++){
            System.out.println((i+1)+"."+stu[i]);
        }
    }
}