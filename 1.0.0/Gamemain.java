package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Gamemain extends CharaStatus改1{

	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        System.out.println("～魔王と一緒～");

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        {

            Scanner scan = new Scanner(System.in);
            Scanner scaner = new Scanner(System.in);

            //while (true) {

                System.out.println("勇者の名前を入力してください。");
                String str = scan.next();

                System.out.println(str + "で宜しいですか。");
                System.out.println("yes　or　no");
                System.out.println("");

                String yes = scaner.next();

                if (yes.equals("yes")) {
                    System.out.println(str + "は魔王を倒しに行った。");
                }else{
                    System.out.println("もう一度入力し直してください。");
                }

                Batoru.Batoru(str,4);  //強敵魔王メソッド

                System.out.println("魔王との戦闘に負けたので、"+ str + "は町に飛ばされ4た。");


        		//町メソッド発動
                Field.fieldevent();

        }
}
	}




