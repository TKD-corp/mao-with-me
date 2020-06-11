
package Game_ver2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public  class Chara_yusya {
	 static String charaName = "勇者";
	 static String yusyaName = "";
	 static int hp = 1000;
	 static int mp = 500;
	 static int power = 100;
	 static int defense = 50;
	 static int countturn = 5;

	 static String equipWeapon = "";
	 static String equipArmor = "";

    // 道具袋用の配列
    static Map<String,Equip> itemlist = new HashMap<String,Equip>();
    // 魔法装備用の配列(仮)
    static Map<String, Magic> magiclist = new HashMap<String, Magic>();


    // 文字入力受付用
	static Scanner scan = new Scanner(System.in);
	static String input;
	static String input2;



	public static void showStatus() {
		System.out.println("勇者" + yusyaName + "のHPは  " + hp);
		System.out.println("勇者" + yusyaName + "のMPは  " + mp);
		System.out.println("勇者" + yusyaName + "の攻撃力は  " + power);
		System.out.println("勇者" + yusyaName + "の防御力は  " + defense);
		System.out.println("現在装備している武器は" + equipWeapon);
		System.out.println("現在装備している防具は" + equipArmor);

	}

    // Chara_yushaインスタンス.で呼び出せるアイテム追加メソッド→アイテム発生イベントとともに追加するようにしたい。
    public static void getEquip(Equip item) {
		itemlist.put(item.name, item);
		System.out.println(item.name + "を手に入れた。");
	}
    // アイテム名の入力でアイテムを捨てることができるメソッド
    public static void removeEquip() {
    	System.out.println("道具袋から削除したいアイテム名を入力してください。");
    	input = scan.nextLine();
		itemlist.remove(input);
		System.out.println(input + "を道具袋から捨てた。");
	}

    // 装備品の装備(ステータスを勇者に付与)
    public static void equipment() {
    	System.out.println("装備したいアイテム名を入力してください。");
    	input = scan.nextLine();
    	if("武器".equals(itemlist.get(input).itemtype)) {
    		power += itemlist.get(input).itempoint;
    		equipWeapon = itemlist.get(input).name;
    		System.out.print(equipWeapon + "を装備した。\n" + itemlist.get(input).itempoint + "の攻撃力を追加");
    		System.out.println("勇者" + yusyaName + "の攻撃力は" + power);
    	}else if("防具".equals(itemlist.get(input).itemtype)) {
    		defense += itemlist.get(input).itempoint;
    		equipArmor = itemlist.get(input).name;
    		System.out.print(equipArmor + "を装備した。\n" + itemlist.get(input).itempoint + "の防御力を追加");
    		System.out.println("勇者" + yusyaName + "の防御力は" +defense);
    	}
    }
	 // 装備品を外す(ステータスを削除)
    public static void equipRem() {
    	System.out.println("装備を外したいアイテム名を入力してください。");
    	input = scan.nextLine();
    	if("武器".equals(itemlist.get(input).itemtype)) {
    		power -= itemlist.get(input).itempoint;
    		equipWeapon = null;
    		System.out.print(itemlist.get(input).name + "を装備から外した。");
    		System.out.println("勇者" + yusyaName + "の攻撃力は" +power);
    	}else if("防具".equals(itemlist.get(input).itemtype)) {
    		defense -= itemlist.get(input).itempoint;
    		equipArmor = null;
    		System.out.print(itemlist.get(input).name + "を装備から外した。");
    		System.out.println("勇者" + yusyaName + "の防御力は" + defense);
    	}
    	System.out.println("外した装備を捨てますか？\nはい or いいえ　を入力してEnter");
    	input2 = scan.nextLine();
    	if(input2.equals("はい")){
    		itemlist.remove(input);
    		System.out.println(input + "を道具袋から捨てた。");
    	}
    }

    // 所持しているアイテム名一覧
    public static void itemDispall() {
    	System.out.println("\n<<所持アイテム名一覧>>");
    	for (String sakubuki: itemlist.keySet()){
			Equip bukiname = itemlist.get(sakubuki);
			System.out.println(bukiname.name);
			}
    }

    // 所持している武器名一覧
    public static void itemDispWeap() {
    	System.out.println("\n<<武器名一覧>>");
    	for (String buki: itemlist.keySet()){
    		Equip bukiname = itemlist.get(buki);
    		if("武器".equals(bukiname.itemtype)) {
    			System.out.println(bukiname.name);
    		}
    	}
    }

    // 所持している防具名一覧
    public static void itemDispArm() {
    	System.out.println("\n<<防具名一覧>>");
    	for (String buki: itemlist.keySet()){
    		Equip bukiname = itemlist.get(buki);
    		if("防具".equals(bukiname.itemtype)) {
    			System.out.println(bukiname.name);
    		}
    	}
    }

    // 所持しているアイテム名一覧
    public static void itemDispUse() {
    	System.out.println("\n<<アイテム名一覧>>");
    	for (String buki: itemlist.keySet()){
    		Equip bukiname = itemlist.get(buki);
    		if("アイテム".equals(bukiname.itemtype)) {
    			System.out.println(bukiname.name);
    		}
    	}
    }

    // アイテム名を入力してアイテムのステータスを表示する
    public static void itemStatus() {
    	System.out.println("ステータスを確認したいアイテム名を入力してください。");
    	input = scan.nextLine();
    	Equip bukist = itemlist.get(input);
    	if(input.equals(bukist.name)) {
    		System.out.println(bukist.itempoint);
    		if(itemlist.get(input).itemrole != null) {
    			System.out.println(itemlist.get(input).itemrole);
    		}
    	}else {
    		System.out.println("入力したアイテムは存在しません");
    	}
    }



    /*	まだ考えている途中
     * 	public void putMagic(Magic name, Equip bougu) {
    	itemlist.put(name.magicname,bougu);
    	System.out.println(name.magicname + "を手に入れた");
    	}
    */


    public static void main(String[] args) {

    	// とりあえず適当にアイテムを生成。
		Equip buki1 = new Equip("短剣",10,"武器");
		Equip buki2 = new Equip("レイピア",15,"武器");
		Equip buki3 = new Equip("革の盾",20,"防具");
		Equip buki4 = new Equip("鉄の盾",50,"防具");
		Equip buki5 = new Equip("ポーション",20,"アイテム","HP");
		Equip buki6 = new Equip("エーテル",15,"アイテム","MP");
		Equip buki7 = new Equip("ボムのかけら",30,"アイテム","ATTACK");


		// buki1～6を道具袋にセットする
		getEquip(buki1);
		getEquip(buki2);
		getEquip(buki3);
		getEquip(buki4);
		getEquip(buki5);
		getEquip(buki6);
		getEquip(buki7);

		// アイテム一覧
		itemDispall();

		// 武器一覧
		itemDispWeap();

		// 防具一覧
		itemDispArm();

		// アイテム一覧
		itemDispUse();

		// 固有アイテムのステータス確認
		itemStatus();
		itemStatus();

		// 装備する
		equipment();
		System.out.println();

		// 装備を外す
		equipRem();
		System.out.println();

		// 道具袋からアイテムを削除する
		removeEquip();
		System.out.println();

		// アイテム一覧
		itemDispall();

/*
		System.out.println("\n削除後一覧ここから");
		for (String sakubuki: itemlist.keySet()){
			Equip bukiname = itemlist.get(sakubuki);
			System.out.println(bukiname.name);
			System.out.println(bukiname.itempoint);
			System.out.println(bukiname.itemtype);
			}
		System.out.println("削除後一覧ここまで\n");
*/


	}
}
