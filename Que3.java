import java.util.Scanner;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print
        ("Enter the size of the array:-");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();


        }
        System.out.println("---------------------------");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.print("Enter the number to be searched:-");
        int m=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==m){
                System.out.println(m+" is present at index "+i );
            }
        }
        sc.close();
    }
    
}
