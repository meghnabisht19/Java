package Multiple;
import java.util.Scanner;
public class MultiFilePackage {
    public String str1;
    public void readString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str1 = sc.nextLine();
        sc.close();
    }
}