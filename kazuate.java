import java.util.Scanner;

public class kazuate{
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 99) + 1; // 1から99までのランダムな数を生成
        int attempts = 0; // 予想回数を初期化

        System.out.println("1から99までの数を予想してください。");
        System.out.println("予想回数は最大5回までです。");

        Scanner scanner = new Scanner(System.in);

        while (attempts < 5) {
            System.out.print("予想する数を入力してください: ");
            int guess = scanner.nextInt();

            if (guess < 10 || guess > 99) {
                System.out.println("2桁の正の整数を入力してください。");
                continue;
            }

            attempts++;

            if (guess == secretNumber) {
                System.out.println("当たり！おめでとうございます！");
                break;
            } else {
                System.out.println("外れ！");

                if (guess > secretNumber) {
                    System.out.println("設定された数より小さいです。");
                } else {
                    System.out.println("設定された数より大きいです。");
                }

                int difference = Math.abs(guess - secretNumber);
                if (difference >= 20) {
                    System.out.println("差が20以上あります！");
                }
            }
        }

        if (attempts >= 5) {
            System.out.println("5回の予想機会を使い果たしました。正解は " + secretNumber + " でした。");
        }

        scanner.close();
    }
}