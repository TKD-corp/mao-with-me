package Game;

import java.io.IOException;

public class Tool {

	public static void retry() throws IOException {
	    //リトライメソッド
	        int attack = 30;
	        int hitpoint = 30;
	        //初期値の再設定

	        System.out.println("リスタートしますか？");
	        System.out.println("はい⇒1 いいえ⇒2");

	        int c = choice();
	                //↑入力を受け付けて戻り値cとして返すメソッド

	        if(c=='1'){
	        //リスタートする
	            Gamemain.main(new String[] {});
	            }else if(c=='2'){
	                System.out.println("ゲームを終了します");
	            }else {
	                System.out.println("半角数字の1か2を入力してください");
	                retry();
	            }
	        }

		public static int choice() throws IOException
		//エンターキーを排除した文字入力メソッド
		{
			int c = System.in.read();
			//intの文字を受け付ける

			if(c == 10 || c==13){
				//c==10,13はエンターキーによる誤作動の改善
        return(choice());
			}
			return(c);
			//入力された文字を戻り値cとして返す
		}
}
