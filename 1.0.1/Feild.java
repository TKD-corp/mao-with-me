<<<<<<< HEAD
package Game_ver2;

import java.util.Random;
import java.util.Scanner;

public class Feild {
	static // キーボード入力の受付
		Scanner scan = new Scanner(System.in);
		// イベント分岐用変数
		static int event;
		//イベントループ回数
		static int eventcount = 5;

		public static void feildevent() {
			// 入力用変数
			System.out.println("魔王との戦闘に負けたので、町へ飛ばされた。");


			// イベント分岐用のループ処理
			for(int i = 0;i < eventcount; i++) {
				System.out.println("");

			System.out.println("町で何を行いますか?\n１：宿へ行く、２：修行、３：バトル、４：ボーナスアイテムゲット >>");

			event = scan.nextInt();

				if(event == 1) {
					System.out.println("宿イベント選択");

				}else if(event == 2) {
					System.out.println("修行イベント選択");
				}else if(event == 3) {
					System.out.println("バトルイベント選択");
					 	Random r = new Random();
				        int boss = r.nextInt(2);
				        int b = boss;
				        System.out.println(b);
				        Buttle.Buttle(Main.name, b);
				        //レベルあっぷ？
				}else if(event == 4) {
					System.out.println("ボーナスアイテムゲット選択");
					Event.Event();
				}else {

				}
			}



		}
}
=======
package Game_ver2;

import java.util.Random;
import java.util.Scanner;

public class Feild {
	static // キーボード入力の受付
		Scanner scan = new Scanner(System.in);
		// イベント分岐用変数
		static int event;
		//イベントループ回数
		static int eventcount = 5;

		public static void feildevent() {
			// 入力用変数
			System.out.println("魔王との戦闘に負けたので、町へ飛ばされた。");


			// イベント分岐用のループ処理
			for(int i = 0;i < eventcount; i++) {
				System.out.println("");

			System.out.println("町で何を行いますか?\n１：宿へ行く、２：修行、３：バトル、４：ボーナスアイテムゲット >>");

			event = scan.nextInt();

				if(event == 1) {
					System.out.println("宿イベント選択");

				}else if(event == 2) {
					System.out.println("修行イベント選択");
				}else if(event == 3) {
					System.out.println("バトルイベント選択");
					 	Random r = new Random();
				        int boss = r.nextInt(2);
				        int b = boss;
				        System.out.println(b);
				        Buttle.Buttle(Main.name, b);
				        //レベルあっぷ？
				}else if(event == 4) {
					System.out.println("ボーナスアイテムゲット選択");
					Event.Event();
				}else {

				}
			}



		}
}
>>>>>>> 86eab50e52f00ed33cc1af0735214bf8be54b10c
