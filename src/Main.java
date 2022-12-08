import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   value_output();
    }
    public static int SCCANER(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    public static int first_na(){
        int first_namber = SCCANER() / 100;
        return first_namber;
    }
    public static int second_na(){
        int second_namber = SCCANER() / 10 %10;
        return second_namber;
    }
    public static int third_na(){
        int third_namber = SCCANER() % 10;
        return third_namber;
    }
    public static  void value_output(){
        System.out.println(first_na());
        System.out.println(second_na());
        System.out.println(third_na());
    }
}