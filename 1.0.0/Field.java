package Game;

import java.util.Scanner;

public class Field {
	// キーボード入力の受付
	static Scanner scan = new Scanner(System.in);
	static // イベント分岐用変数
	int event;
	//イベントループ回数
	static int eventcount = 5;

	public static void fieldevent() {

		for(int i = 0;i < eventcount; i++) {

		// イベント分岐用のループ処理
		System.out.println("町で何を行いますか?\n１：宿へ行く、２：修行、３：バトル、４：ボーナスアイテムゲット >>");

		// 入力用変数
		event = scan.nextInt();


			if(event == 1) {
				System.out.println("宿イベント選択");
			}else if(event == 2) {
				System.out.println("修行イベント選択");
			}else if(event == 3) {
				System.out.println("バトルイベント選択");
			}else if(event == 4) {
				System.out.println("ボーナスアイテムゲット選択");
				Event.Event();
			}else {

			}
		}



	}

}
