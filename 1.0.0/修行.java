package Game;

import java.io.IOException;

public class 修行 extends CharaStatus改1{

	public static void main(String[] args) throws IOException {

		System.out.println("1ターン消費して修行に励みます。\nはい⇒1 いいえ⇒2");

		int c = Tool.choice();

		if(c == 1) {
			kougeki0 += 5;	//←増加量＆減少量はぜんぶ適当なので後ほど調整
            hp0 -= 3;
            life0 -= 1;		//←寿命(ターン数)を1消費

            System.out.println("勇者は攻撃力が" + kougeki0 + "\n体力が" + hp0 + "になりました");
		}else if(c == 2){
			System.out.println("きたえるのをやめます");
		}else
			System.out.println("半角数字で1か2を入力してください");
	}
}
