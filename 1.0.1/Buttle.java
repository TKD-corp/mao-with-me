<<<<<<< HEAD
package Game_ver2;

import java.io.IOException;

import Game.Escape;
import Game.Gamemain;
import Game.Re;

public class Buttle extends Main{

	public static void Buttle(String str,int num) {
		String boss = new String();
		int bhp = 0;
		int bk = 0;
		int bd = 0;

		String yusya = new String();
		int hhp = 0;
		int hk = 0;
		int hd = 0;

		yusya = Chara_yusya.charaName;
		hhp = Chara_yusya.hp;
		hk =  Attack.attack(Chara_yusya.power);
		hd = Chara_yusya.defense;


		if(num == 4) {
			boss = Chara_mao.charaName1;
			bhp = Chara_mao.hp1;
			bk =  Attack.attack(Chara_mao.power1);
			bd = Chara_mao.defense1;
		}else if(num == 0) {
			boss = Chara_mao.charaName2;
			bhp = Chara_mao.hp2;
			bk = Attack.attack(Chara_mao.power2);
			bd = Chara_mao.defense2;
		}else if(num == 1) {
			boss = Chara_mao.charaName3;
			bhp = Chara_mao.hp3;
			bk =  Attack.attack(Chara_mao.power3);
			bd = Chara_mao.defense3;
		}else if(num == 2) {
			boss = Chara_mao.charaName4;
			bhp = Chara_mao.hp4;
			bk = Attack.attack(Chara_mao.power4);
			bd = Chara_mao.defense4;
		}else if(num == 3) {
			boss = Chara_mao.charaName5;
			bhp = Chara_mao.hp5;
			bk = Attack.attack(Chara_mao.power5);
			bd = Chara_mao.defense5;
		}



		System.out.println(boss + "が現れた。");

		System.out.println("");
	for(;;) {
		int H_attack_P = 0 ;
			H_attack_P = (hk - bd);
		int M_attack_P = 0 ;
			M_attack_P = (bk - hd);
		int Hnokorimhp =0;
		int Mnokorimhp =0;

		System.out.println(boss + "HP" + bhp);

		System.out.println("");
		System.out.println("どうする?");
		System.out.println("k：攻撃、b：防御、n：にげる、m：まほう");

		String sentaku1 = Gamemain.scan.next();

		if(sentaku1.equals("k")) {

			System.out.println("");
			System.out.println(yusya + str + "の攻撃");
				if(H_attack_P < 0) {
					System.out.println(boss + "に" + 0 + "のダメージをあたえた");
					H_attack_P = 0;
				}else
					System.out.println(boss + "に" + H_attack_P + "のダメージをあたえた");

			Mnokorimhp = (bhp - H_attack_P);
				if(Mnokorimhp<0) {
					System.out.println("");
					System.out.println(boss + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(boss + "のHPは残りは" +Mnokorimhp+ "です。");
				}
			bhp = Mnokorimhp;
				if(bhp <= 0) {
					System.out.println("");
					System.out.println(boss + "を倒した。");

						break;
				}


			System.out.println("");
			System.out.println(boss + "の攻撃");
				if(M_attack_P < 0) {
				System.out.println(yusya + str + "に" + 0 + "のダメージをあたえた");
				M_attack_P = 0;
				}else
					System.out.println(yusya + str + "に" +  M_attack_P+ "のダメージをあたえた");
			Hnokorimhp = (hhp -  M_attack_P);
				if(Hnokorimhp<0) {
					System.out.println("");
					System.out.println(yusya + str + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(yusya + str + "のHPは残りは" +Hnokorimhp+ "です。");
				}
			hhp = Hnokorimhp;
				if(hhp <= 0) {
					System.out.println("");
					System.out.println(yusya + str + "が死んだ。");
					if(num != 4) {
						try {
							Re.retry();
						} catch (IOException e) {

							e.printStackTrace();
						}
					}else
						break;
				}


		}else if(sentaku1.equals("b")) {
			System.out.println("");
			System.out.println(yusya + str + "は防御した。");

			int bm = (M_attack_P/2);
			Hnokorimhp = (hhp - bm);
			System.out.println("");

			System.out.println("");
			if(bm < 0)
				System.out.println(yusya + str + "に" + 0 + "のダメージをあたえた");
				else
			System.out.println(boss + "は" + yusya + str + "に" + bm + "のダメージをあたえた");
			System.out.println("");

			if(Hnokorimhp<0) {
				System.out.println("");
				System.out.println(yusya + str + "のHPは残りは0です。");
			}else {
				System.out.println("");
				System.out.println(yusya + str + "のHPは残りは" +Hnokorimhp+ "です。");
			}
		hhp = Hnokorimhp;
			if(hhp <= 0) {
				System.out.println("");
				System.out.println(yusya + str + "が死んだ。");
				try {
					Re.retry();
				} catch (IOException e) {

					e.printStackTrace();
				}
			break;
			}


		}else if(sentaku1.equals("n")) {

			Escape.escape();

		}else if(sentaku1.equals("m")) {

		}

	}
	}

}
=======
package Game_ver2;

import java.io.IOException;

import Game.Escape;
import Game.Gamemain;
import Game.Re;

public class Buttle extends Main{

	public static void Buttle(String str,int num) {
		String boss = new String();
		int bhp = 0;
		int bk = 0;
		int bd = 0;

		String yusya = new String();
		int hhp = 0;
		int hk = 0;
		int hd = 0;

		yusya = Chara_yusya.charaName;
		hhp = Chara_yusya.hp;
		hk =  Attack.attack(Chara_yusya.power);
		hd = Chara_yusya.defense;


		if(num == 4) {
			boss = Chara_mao.charaName1;
			bhp = Chara_mao.hp1;
			bk =  Attack.attack(Chara_mao.power1);
			bd = Chara_mao.defense1;
		}else if(num == 0) {
			boss = Chara_mao.charaName2;
			bhp = Chara_mao.hp2;
			bk = Attack.attack(Chara_mao.power2);
			bd = Chara_mao.defense2;
		}else if(num == 1) {
			boss = Chara_mao.charaName3;
			bhp = Chara_mao.hp3;
			bk =  Attack.attack(Chara_mao.power3);
			bd = Chara_mao.defense3;
		}else if(num == 2) {
			boss = Chara_mao.charaName4;
			bhp = Chara_mao.hp4;
			bk = Attack.attack(Chara_mao.power4);
			bd = Chara_mao.defense4;
		}else if(num == 3) {
			boss = Chara_mao.charaName5;
			bhp = Chara_mao.hp5;
			bk = Attack.attack(Chara_mao.power5);
			bd = Chara_mao.defense5;
		}



		System.out.println(boss + "が現れた。");

		System.out.println("");
	for(;;) {
		int H_attack_P = 0 ;
			H_attack_P = (hk - bd);
		int M_attack_P = 0 ;
			M_attack_P = (bk - hd);
		int Hnokorimhp =0;
		int Mnokorimhp =0;

		System.out.println(boss + "HP" + bhp);

		System.out.println("");
		System.out.println("どうする?");
		System.out.println("k：攻撃、b：防御、n：にげる、m：まほう");

		String sentaku1 = Gamemain.scan.next();

		if(sentaku1.equals("k")) {

			System.out.println("");
			System.out.println(yusya + str + "の攻撃");
				if(H_attack_P < 0) {
					System.out.println(boss + "に" + 0 + "のダメージをあたえた");
					H_attack_P = 0;
				}else
					System.out.println(boss + "に" + H_attack_P + "のダメージをあたえた");

			Mnokorimhp = (bhp - H_attack_P);
				if(Mnokorimhp<0) {
					System.out.println("");
					System.out.println(boss + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(boss + "のHPは残りは" +Mnokorimhp+ "です。");
				}
			bhp = Mnokorimhp;
				if(bhp <= 0) {
					System.out.println("");
					System.out.println(boss + "を倒した。");

						break;
				}


			System.out.println("");
			System.out.println(boss + "の攻撃");
				if(M_attack_P < 0) {
				System.out.println(yusya + str + "に" + 0 + "のダメージをあたえた");
				M_attack_P = 0;
				}else
					System.out.println(yusya + str + "に" +  M_attack_P+ "のダメージをあたえた");
			Hnokorimhp = (hhp -  M_attack_P);
				if(Hnokorimhp<0) {
					System.out.println("");
					System.out.println(yusya + str + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(yusya + str + "のHPは残りは" +Hnokorimhp+ "です。");
				}
			hhp = Hnokorimhp;
				if(hhp <= 0) {
					System.out.println("");
					System.out.println(yusya + str + "が死んだ。");
					if(num != 4) {
						try {
							Re.retry();
						} catch (IOException e) {

							e.printStackTrace();
						}
					}else
						break;
				}


		}else if(sentaku1.equals("b")) {
			System.out.println("");
			System.out.println(yusya + str + "は防御した。");

			int bm = (M_attack_P/2);
			Hnokorimhp = (hhp - bm);
			System.out.println("");

			System.out.println("");
			if(bm < 0)
				System.out.println(yusya + str + "に" + 0 + "のダメージをあたえた");
				else
			System.out.println(boss + "は" + yusya + str + "に" + bm + "のダメージをあたえた");
			System.out.println("");

			if(Hnokorimhp<0) {
				System.out.println("");
				System.out.println(yusya + str + "のHPは残りは0です。");
			}else {
				System.out.println("");
				System.out.println(yusya + str + "のHPは残りは" +Hnokorimhp+ "です。");
			}
		hhp = Hnokorimhp;
			if(hhp <= 0) {
				System.out.println("");
				System.out.println(yusya + str + "が死んだ。");
				try {
					Re.retry();
				} catch (IOException e) {

					e.printStackTrace();
				}
			break;
			}


		}else if(sentaku1.equals("n")) {

			Escape.escape();

		}else if(sentaku1.equals("m")) {

		}

	}
	}

}
>>>>>>> 86eab50e52f00ed33cc1af0735214bf8be54b10c
