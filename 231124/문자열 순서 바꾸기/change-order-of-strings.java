import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String t = sc.next();
        String s = sc.next();
        String tmp;
        tmp = t;
        t = s;
        s = tmp;
        System.out.printf("%s\n%s", t, s);
    }
}