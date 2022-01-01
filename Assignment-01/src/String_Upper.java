import java.util.Scanner;
public class String_Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Before "+str);
        str = str.toUpperCase();
        System.out.println("After "+str);
    }
}