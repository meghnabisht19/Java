import java.util.Scanner;
public class Que20 extends Exception {
    public Que20(String s) {
        super(s);
    }

}

class Demo {
    static void find(int arr[], int item) throws Que20 {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i])
                flag = true;
        }
        if (!flag) {
            throw new Que20("Item Not Found"); // calling constructor of user-defined exception class
        } else {
            System.out.println("Item Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to find :");
        int a = sc.nextInt();
        sc.close();
        try {
            find(new int[] { 12, 25, 45,67,34,45,6,7,98,23 }, a);
        } catch (Que20 i) {
            System.out.println(i);
        }
    }
}
