// package kazuate;

import java.util.Scanner;

public class kazuate{
    public static void main(String[] args){
        // 答え
        final int ANS = 10;

        // 標準入力
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while(true){
            if(count >= 5) break;
            System.out.print("2桁の正の整数を入力してください(残り"+(5-count)+"回): ");
            String input = scan.nextLine();
            try{
                int n = Integer.parseInt(input);
                if(n < 10 || n >= 100){
                    System.out.println("2桁の正の整数を入力してください");
                    continue;
                }
                if(n == ANS){
                    System.out.println("当たり");
                    break;
                }else if(n < ANS){
                    if(Math.abs(n - ANS) >= 20){
                        System.out.println("設定より20以上小さいです");
                    }else{
                        System.out.println("設定より小さいです");
                    }
                }else if(n > ANS){
                    if(Math.abs(n - ANS) >= 20){
                        System.out.println("設定より20以上大きいです");
                    }else{
                        System.out.println("設定より大きいです");
                    }
                }
                count++;
            }catch(NumberFormatException e){
                System.out.println("数値ではありません");
            }
        }

        if(count >= 5){
            System.out.println("失敗");
        }

        scan.close();
    }
}