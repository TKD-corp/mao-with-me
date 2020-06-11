package Game1_0_3;

import java.io.IOException;

public class Hotel extends Chara_yusya{

	public static void hotel() throws IOException {

		System.out.println("1ターン消費して宿に泊まります。\nはい⇒1 いいえ⇒2");

		int c = Tool.choice();

		if(c == '1') {
			/*
			 if(主人公Lv = '0'){
			 	hp0 = 1000					←ステータス値のLv情報を読み取り回復量を変える
			 }else if(主人公Lv = '1'){
			 	hp0 = 1500
			 }else if(主人公Lv = '2'){
			 	hp0 = 2000
			 }

			 */
            Chara_yusya.hp = 1000;
            Chara_yusya.mp = 500;
            //Chara_yusha.countturn -= 1;

            System.out.println("勇者は体力が" + Chara_yusya.hp + "に\n"
            		+ "MPが" + Chara_yusya.mp + "になりました");
            System.out.println("町に戻ります");
            Town.townevent();

		}else if(c == '2'){
			System.out.println("宿泊するのをやめて町に戻ります");
			Town.townevent();
			//↑町に戻る
		}else
			System.out.println("半角数字で1か2を入力してください");
			hotel();
		}
}
