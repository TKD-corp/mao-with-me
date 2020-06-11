package Game_ver2;

import java.io.IOException;

public class Training extends Chara_yusya{

	public static void training() throws IOException {

		System.out.println("1ターン消費して修行に励みます。\nはい⇒1 いいえ⇒2");

		int c = Tool.choice();

		if(c == '1') {
			Chara_yusya.power += 500;	//←増加量＆減少量はぜんぶ適当なので後ほど調整
            Chara_yusya.hp -= 300;
            //Chara_yusha.countturn -= 1;

            System.out.println("\n勇者は攻撃力が" + Chara_yusya.power
            		+ "\n体力が" + Chara_yusya.hp + "になりました");

		}else if(c == '2'){
			System.out.println("修行するのをやめます");
			Town.townevent();
			//↑町に戻る

		}else
			System.out.println("半角数字で1か2を入力してください");
			training();
	}
}
