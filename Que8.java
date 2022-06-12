public class Que8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hey there");
        StringBuilder stbr = new StringBuilder("Hello World");
        System.out.println("Original String : " + stbr);
        stbr.setCharAt(5, '-'); // change the char
        System.out.println("After using setCharAt(5,'-') : " + stbr);
        stbr.append(true); // ret
        System.out.println("After using append():" + stbr);
        System.out.println("Original length : " + sb.length() + " string :" + sb);
        sb.setLength(6);
        System.out.println("After using setLength(6) length : " + sb.length() + " string :" + sb);
        sb.insert(1,'e');
        System.out.println("After using insert(1,'r') " + sb);
        String str1 = "No", test = "No";
        String str2 = "Yes";
        System.out.println(str1.equals(test)); // returns true
        System.out.println(str1.equals(str2)); // returns false
        System.out.println(str1.concat(str2));

    }
    
}
