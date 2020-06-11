package Game1_0_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main extends Chara {

	public static final Scanner scan = new Scanner(System.in);
	static String name;



	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        System.out.println("～魔王と一緒～");

        System.out.println("");
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

                String name = str;

                System.out.println(name + "で宜しいですか。");
                System.out.println("yes　or　no");
                System.out.println("");

                String yes = scaner.next();

                if (yes.equals("yes")) {
                    System.out.println(name + "は魔王を倒しに行った。");



                    Buttle.Buttle(name,4);

                    System.out.println("");
                    Feild.feildevent();



                }else {
                    System.out.println("もう一度入力し直してください。");
                }





	}

}
}