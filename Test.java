
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //答えの出力
        int ans = 0;

        //計算式の判定
        boolean hantei = true;

        //タイトル
        System.out.println("電動卓上計算機");

        //数字の入力を要求
        System.out.println("入力して下さい");
        int num1 = new Scanner(System.in).nextInt();

        //計算記号の要求
        System.out.println("記号を入力して下さい + - * /");
        String s = new Scanner(System.in).nextLine();

        //数字の入力を要求
        System.out.println("入力して下さい");
        int num2 = new Scanner(System.in).nextInt();

        //計算記号の選別　及び　判定
        switch(s) {
        case "+":
            ans = num1 + num2;
            break;
        case "-":
            ans = num1 - num2;
            break;
        case "*":
            ans = num1 * num2;
            break;
        case "/":
            ans = num1 / num2;
            break;
        default:
            System.out.println("そんな式はありませーん");
            hantei = false;
        }

        //条件分岐
        if(hantei) {
        System.out.println("答えは。。。");
        System.out.println(ans);
        }
    }
}