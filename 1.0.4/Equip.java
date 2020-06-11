package Game_ver2;

public class Equip {

	// それぞれの変数を初期化しないとChara_yusyaクラスでエラーが出ていたので初期化をする
	// 入手できるアイテムの名称
	String name = "";
	// 入手できるアイテムの固有の数値
	int itempoint = 0;
	// アイテムの種類のための変数
	String itemtype = "";
	// 消耗アイテムの用途のための変数(hp,mp,attack)
	String itemrole = "";

	// 武器・防具を生成するときのコンストラクタ
	public Equip(String name, int point, String type) {
		this.name = name;
		this.itempoint = point;
		this.itemtype = type;
	}

	// 消耗アイテムを生成する時のコンストラクタ
	public Equip(String name, int point, String type, String role) {
		this.name = name;
		this.itempoint = point;
		this.itemtype = type;
		this.itemrole = role;
	}

}
