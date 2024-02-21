import java.util.Scanner;
public class TakingInputs {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int total = 500;
        int sumTotal = sub1 + sub2 +sub3 +sub4 + sub5;
        double percentage = (sumTotal * 100)/total;
        System.out.println(percentage);

    }
}
