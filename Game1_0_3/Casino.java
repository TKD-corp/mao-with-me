package Game1_0_3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Casino {

	public static final Scanner scan = new Scanner(System.in);

    public static void casino() throws IOException {

    	System.out.println("1ターン消費してカジノに行きます。\nはい⇒1 いいえ⇒2");

		int c = Tool.choice();

		if(c == '1') {

			//Chara_yusha.countturn -= 1;

				Random r = new Random();
		    int daice = r.nextInt(100);

		    System.out.println("どれにする？(1～3の中から数字を選んでください)");
		    System.out.println("1：Aのダイスを振る");
		    System.out.println("　　大当たり30％、当たり30％、バズレ40％");
		    System.out.println("2：Bのダイスを振る");
		    System.out.println("　　大当たり10％、当たり50％、バズレ40％");
		    System.out.println("3：Cのダイスを振る");
		    System.out.println("　　大当たり40％、当たり0％、バズレ60％");

		    String abc = Casino.scan.next();

		    if (abc.equals("1")) {
		        System.out.println("Aのダイスを選択した。");
		        System.out.println("Enterキーを押してダイスを振ってください");

		        try {
		            System.in.read();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        System.out.println(daice);

		        int d = daice;

		        if(d <= 30 ) {
		        	System.out.println("大当たり");
		        	//大当たりアイテムプレゼント
		        }else if(d>30 && d<=60) {
		        	System.out.println("当たり");
		        	//当たりアイテムプレゼント
		        }else
		        	System.out.println("はずれ");
		        	//なにもなし


		    } else if (abc.equals("2")) {
		        System.out.println("Bのダイスを選択した。");
		        System.out.println("Enterキーを押してダイスを振ってください");

		        try {
		            System.in.read();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        System.out.println(daice);

		        int d = daice;

		        if(d <= 10 ) {
		        	System.out.println("大当たり");
		        	//大当たりアイテムプレゼント
		        }else if(d>10 && d<=60) {
		        	System.out.println("当たり");
		        	//当たりアイテムプレゼント
		        }else
		        	System.out.println("はずれ");
		        	//なにもなし



		    } else if (abc.equals("3")) {
		        System.out.println("Cのダイスを選択した。");
		        System.out.println("Enterキーを押してダイスを振ってください");

		        try {
		            System.in.read();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        System.out.println(daice);

		        int d = daice;

		        if(d <= 40 ) {
		        	System.out.println("大当たり");
		        	//大当たりアイテムプレゼント
		        }else
		        	System.out.println("はずれ");
		        	//なにもなし
		    }

		}else if(c == '2'){
			System.out.println("カジノに行くのをやめ、町に戻ります");
			Town.townevent();
			//↑町に戻る

		}else
			System.out.println("半角数字で1か2を入力してください");
			casino();
		}
    }