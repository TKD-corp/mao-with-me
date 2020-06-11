package Game;

import java.io.IOException;

public class Batoru extends CharaStatus改1{

	static int Hnokorimhp ;
	static int Mnokorimhp ;
	static Tata kougeki = new Tata();
	static int m = kougeki.kougekiM();
	static int h = kougeki.kougekiH();
	static int t = kougeki.kougekiT();
	static int s = kougeki.kougekiS();
	static int m1 = kougeki.kougekiM1();



	public static void Batoru(String name , int num) {


	if(num == 1) {

		System.out.println(charaName1 + "が現れた。");

		System.out.println("");
	for(;;) {

		m = kougeki.kougekiM();
		h = kougeki.kougekiH();
		System.out.println("");

		System.out.println(charaName1 + "HP" + hp1);

		System.out.println("");
		System.out.println("どうする?");
		System.out.println("k：攻撃、b：防御、n：にげる、m：まほう");

		String sentaku1 = Gamemain.scan.next();

		if(sentaku1.equals("k")) {

			System.out.println("");
			System.out.println(charaName0+ name + "の攻撃");
			System.out.println(charaName1 + "に" + h + "のダメージをあたえた");
			Mnokorimhp = (hp1 - h);
				if(Mnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName1 + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName1 + "のHPは残りは" +Mnokorimhp+ "です。");
				}
			hp1 = Mnokorimhp;
				if(hp1 <= 0) {
					System.out.println("");
					System.out.println(charaName1 + "を倒した。");

						break;
				}


			System.out.println("");
			System.out.println(charaName1 + "の攻撃");
			System.out.println(charaName0+ name + "に" + m + "のダメージをあたえた");
			Hnokorimhp = (hp0 - m);
				if(Hnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
				}
			hp0 = Hnokorimhp;
				if(hp0 <= 0) {
					System.out.println("");
					System.out.println(charaName0+ name + "が死んだ。");
					try {
						Tool.retry();
					} catch (IOException e) {

						e.printStackTrace();
					}
				break;
				}
		}else if(sentaku1.equals("b")) {
			System.out.println("");
			System.out.println(charaName0+ name + "は防御した。");
			System.out.println(m);
			int bm = (m/2);
			Hnokorimhp = (hp0 - bm);
			System.out.println("");

			System.out.println("");
			System.out.println(charaName1 + "は" + charaName0+ name + "に" + bm + "のダメージをあたえた");
			System.out.println("");

			if(Hnokorimhp<0) {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは0です。");
			}else {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
			}
		hp0 = Hnokorimhp;
			if(hp0 <= 0) {
				System.out.println("");
				System.out.println(charaName0+ name + "が死んだ。");
				try {
					Tool.retry();
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





	else if(num == 2) {
		System.out.println("");


		System.out.println(charaName2 + "が現れた。");

		System.out.println("");
	for(;;) {
		h = kougeki.kougekiH();
		t = kougeki.kougekiT();
		System.out.println("");

		System.out.println(charaName2 + "HP" + hp1);

		System.out.println("");
		System.out.println("どうする?");
		System.out.println("k：攻撃、b：防御、n：にげる、m：まほう");

		String sentaku1 = Gamemain.scan.next();

		if(sentaku1.equals("k")) {

			System.out.println("");
			System.out.println(charaName0+ name + "の攻撃");
			System.out.println(charaName2 + "に" + h + "のダメージをあたえた");
			Mnokorimhp = (hp2 - h);
				if(Mnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName2 + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName2 + "のHPは残りは" +Mnokorimhp+ "です。");
				}
			hp2 = Mnokorimhp;
				if(hp2 <= 0) {
					System.out.println("");
					System.out.println(charaName2 + "を倒した。");

						break;
				}


			System.out.println("");
			System.out.println(charaName2 + "の攻撃");
			System.out.println(charaName0+ name + "に" + t + "のダメージをあたえた");
			Hnokorimhp = (hp0 - t);
				if(Hnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
				}
			hp0 = Hnokorimhp;
				if(hp0 <= 0) {
					System.out.println("");
					System.out.println(charaName0+ name + "が死んだ。");
					try {
						Tool.retry();
					} catch (IOException e) {

						e.printStackTrace();
					}
				break;
				}
		}else if(sentaku1.equals("b")) {
			System.out.println("");
			System.out.println(charaName0+ name + "は防御した。");
			System.out.println(t);
			int bm = (t/2);
			Hnokorimhp = (hp0 - bm);
			System.out.println("");

			System.out.println("");
			System.out.println(charaName2 + "は" + charaName0+ name + "に" + bm + "のダメージをあたえた");
			System.out.println("");
			if(Hnokorimhp<0) {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは0です。");
			}else {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
			}
		hp0 = Hnokorimhp;
			if(hp0 <= 0) {
				System.out.println("");
				System.out.println(charaName0+ name + "が死んだ。");
				try {
					Tool.retry();
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



	else if(num == 3) {
		System.out.println("");

		System.out.println(charaName3 + "が現れた。");

		System.out.println("");
	for(;;) {
		h = kougeki.kougekiH();
		s = kougeki.kougekiS();
		System.out.println("");

		System.out.println(charaName3 + "HP" + hp3);

		System.out.println("");
		System.out.println("どうする?");
		System.out.println("k：攻撃、b：防御、n：にげる、m：まほう");

		String sentaku1 = Gamemain.scan.next();

		if(sentaku1.equals("k")) {

			System.out.println("");
			System.out.println(charaName0+ name + "の攻撃");
			System.out.println(charaName3 + "に" + h + "のダメージをあたえた");
			Mnokorimhp = (hp3 - h);
				if(Mnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName3 + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName3 + "のHPは残りは" +Mnokorimhp+ "です。");
				}
			hp3 = Mnokorimhp;
				if(hp3 <= 0) {
					System.out.println("");
					System.out.println(charaName3 + "を倒した。");

						break;
				}


			System.out.println("");
			System.out.println(charaName3 + "の攻撃");
			System.out.println(charaName0+ name + "に" + s + "のダメージをあたえた");
			Hnokorimhp = (hp0 - s);
				if(Hnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
				}
			hp0 = Hnokorimhp;
				if(hp0 <= 0) {
					System.out.println("");
					System.out.println(charaName0+ name + "が死んだ。");
					try {
						Tool.retry();
					} catch (IOException e) {

						e.printStackTrace();
					}
				break;
				}
		}else if(sentaku1.equals("b")) {
			System.out.println("");
			System.out.println(charaName0+ name + "は防御した。");
			System.out.println(s);
			int bm = (s/2);
			Hnokorimhp = (hp0 - bm);
			System.out.println("");

			System.out.println("");
			System.out.println(charaName3 + "は" + charaName0+ name + "に" + bm + "のダメージをあたえた");
			System.out.println("");
			if(Hnokorimhp<0) {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは0です。");
			}else {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
			}
		hp0 = Hnokorimhp;
			if(hp0 <= 0) {
				System.out.println("");
				System.out.println(charaName0+ name + "が死んだ。");
				try {
					Tool.retry();
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







	else if(num == 4) {
		System.out.println("");

		System.out.println(charaName4 + "が現れた。");

		System.out.println("");
	for(;;) {
		h = kougeki.kougekiH();
		m1 = kougeki.kougekiM1();
		System.out.println("");

		//System.out.println(charaName4 + "HP" + hp4);

		System.out.println("");
		System.out.println("どうする?");
		System.out.println("k：攻撃、b：防御、n：にげる、m：まほう");

		String sentaku1 = Gamemain.scan.next();

		if(sentaku1.equals("k")) {

			System.out.println("");
			System.out.println(charaName0+ name + "の攻撃");
			System.out.println(charaName4 + "に" + h + "のダメージをあたえた");
			Mnokorimhp = (hp4 - h);
				if(Mnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName4 + "のHPは残りは0です。");
				}else {
					System.out.println("");
					//System.out.println(charaName4 + "のHPは残りは" +Mnokorimhp+ "です。");
				}
			hp4 = Mnokorimhp;
				if(hp1 <= 0) {
					System.out.println("");
					System.out.println(charaName4 + "を倒した。");

						break;
				}


			System.out.println("");
			System.out.println(charaName4 + "の攻撃");
			System.out.println(charaName0+ name + "に" + m1 + "のダメージをあたえた");
			Hnokorimhp = (hp0 - m1);
				if(Hnokorimhp<0) {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは0です。");
				}else {
					System.out.println("");
					System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
				}
			hp0 = Hnokorimhp;
				if(hp0 <= 0) {
					System.out.println("");
					System.out.println(charaName0+ name + "が死んだ。");
					
				break;
				}
		}else if(sentaku1.equals("b")) {
			System.out.println("");
			System.out.println(charaName0+ name + "は防御した。");
			System.out.println(m1);
			int bm = (m1/2);
			Hnokorimhp = (hp0 - bm);
			System.out.println("");

			System.out.println("");
			System.out.println(charaName4 + "は" + charaName0+ name + "に" + bm + "のダメージをあたえた");
			System.out.println("");

			if(Hnokorimhp<0) {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは0です。");
			}else {
				System.out.println("");
				System.out.println(charaName0+ name + "のHPは残りは" +Hnokorimhp+ "です。");
			}
		hp0 = Hnokorimhp;
			if(hp0 <= 0) {
				System.out.println("");
				
			break;
			}


		}else if(sentaku1.equals("n")) {
			Escape.escape();

		}else if(sentaku1.equals("m")) {

		}

	}
	}




}

	}


