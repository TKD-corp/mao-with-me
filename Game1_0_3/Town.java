package Game1_0_3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Town {
	// キーボード入力の受付
	static Scanner scan = new Scanner(System.in);
	// イベント分岐用変数
	static int event;
	//イベントループ回数
	static int eventcount = 5;

	public static void townevent() throws IOException {

		System.out.println("\n町にきました。");

		System.out.println("町で何を行いますか？\n"
				+ "1:宿へ行く 2:修行 3:バトルをする\n"
				+ "4:カジノへ行く 5:ステータス・持ち物の確認\n"
				+ "6;魔王に挑む");

		event = scan.nextInt();

			if(event == 1) {
				//宿メソッド
				Hotel.hotel();

			}else if(event == 2) {
				//修行メソッド
				Training.training();

			}else if(event == 3) {
				//野良バトルメソッド
				System.out.println("バトルイベント選択");
				 	Random r = new Random();
			        int boss = r.nextInt(2);
			        int b = boss;
			        System.out.println(b);
			        Buttle.Buttle(Main.name, b);

			}else if(event == 4) {
				//カジノ菊池メソッド
				Casino.casino();

			}else if(event == 5){
				//ステ・持ち物確認メソッド

			}else if(event == 6){
				//ラスボスバトルメソッド
				System.out.println("魔王に挑みます");

			}else {
				System.out.println("半角数字で1から6の値を入力してください");
				Town.townevent();
			}
		System.out.println("魔王が町に襲い掛かってきた");
		//勇者のターンが0になったら発動


	}
}