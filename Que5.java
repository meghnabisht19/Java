import java.util.Scanner;
public class Que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to be converted :-");
        int num=sc.nextInt();
        int bin[]=new int[1000];
        int i=0;
        while(num!=0){
            bin[i]=num%2;
            num=num/2;
            i++;
        }
        System.out.print("Binary form of the given number is:-");
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
        sc.close();

    }
    
}
