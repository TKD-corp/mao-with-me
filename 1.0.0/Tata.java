package Game;

import java.util.Random;

public class Tata extends CharaStatus改1{

	int dameji;
	//int kougekiryoku;
	int bugu;



	public int kougekiH() {
		Random rand = new Random();
		return dameji = rand.nextInt(10) * (kougeki0);

	}
	public int kougekiM() {
			Random rand = new Random();
			return dameji = rand.nextInt(10) * (kougeki1);

	}
	public int kougekiT() {
		Random rand = new Random();
		return dameji = rand.nextInt(10) * (kougeki2);

    }
	public int kougekiS() {
		Random rand = new Random();
		return dameji = rand.nextInt(10) * (kougeki3);

}
	public int kougekiM1() {
		Random rand = new Random();
		return dameji = rand.nextInt(10) * (kougeki4);

}
	
	

}
