package Game;

import java.io.IOException;

public class 宿泊 extends CharaStatus改1{

	public static void main(String[] args) throws IOException {

		System.out.println("1ターン消費して宿に泊まります。\nはい⇒1 いいえ⇒2");

		int c = Tool.choice();

		if(c == 1) {
            hp0 += max;		//←宿に入った時点でのHPに戻したい(願望)
            life0 -= 1;		//←ターン数1消費

            System.out.println("勇者は体力が" + hp0 + "になりました");
		}else if(c == 2){
			System.out.println("宿泊するのをやめます");
			Town();
			//↑町に戻る
		}else
			System.out.println("半角数字で1か2を入力してください");
	}
}
