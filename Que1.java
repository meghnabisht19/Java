import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the first number:-");
            n1=sc.nextInt();
            System.out.println("enter the second number:-");
            n2=sc.nextInt();
            int sum=n1+n2;
        System.out.println("the sum of given numbers is:"+sum);
        sc.close();
    }
    
}
