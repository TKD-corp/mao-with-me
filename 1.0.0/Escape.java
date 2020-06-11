package Game;

import java.util.Random;
import java.util.Scanner;

public class Escape {

	int inputCommand = 0;
	Scanner scan = new Scanner(System.in);
	static Random random = new Random();

	public static void escape() {

		System.out.println("選んだコマンド：にげる" + "\n");
		boolean escapeluck = random.nextBoolean();
		if (escapeluck == true) {
			System.out.println("パーティはー逃げれた。");
			//どこかにいく。


		} else {
			System.out.println("パーティーは逃げれなかった。");
		}
		// この後に逃げた後逃げれなかった後の処理を入れていく
	}

}

