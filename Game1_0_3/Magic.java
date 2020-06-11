package Game1_0_3;

public class Magic extends Magictype{

	  // 魔法クラス

    // どんな魔法があるか→攻撃、防御、回復
    // とりあえず敵が一匹と仮定して攻撃魔法は1種類、その後話し合いで属性のバリエーションを加えるか検討してく



	static String MN = new String();
	static String a;
	static String b;
	static String c;

	static int attackmagic;
	static int defencemagic;
	static int healmagic;

	static int A ;
	static int AMP ;




    public static void useAttackmg(String m) {  //攻撃魔法


    	if(m.equals("a")) {
			MN = Magictype.MagicName1;
			A =  Magictype.attack1;
			AMP =  Magictype.UseMp1;
		}else if(m.equals("b")) {
			MN =  Magictype.MagicName2;
			A =  Magictype.attack2;
			AMP =  Magictype.UseMp2;
		}else if(m.equals("c")) {
			MN =  Magictype.MagicName3;
			A =  Magictype.attack3;
			AMP =  Magictype.UseMp3;
		}

    	System.out.println("攻撃魔法");

    	System.out.println(MN);


    }
    public static void useDefencemg(String m) {
    	if(m.equals("a")) {
			MN = Magictype.MagicName4;
			A =  Magictype.attack4;
			AMP =  Magictype.UseMp4;
		}else if(m.equals("b")) {
			MN =  Magictype.MagicName5;
			A =  Magictype.attack5;
			AMP =  Magictype.UseMp5;

			System.out.println("攻撃魔法");

	    	System.out.println(MN);

		}
    }
    public static void useHealmg(String m) {
    	if(m.equals("a")) {
			MN = Magictype.MagicName6;
			A =  Magictype.attack6;
			AMP =  Magictype.UseMp6;
		}else if(m.equals("b")) {
			MN =  Magictype.MagicName7;
			A =  Magictype.attack7;
			AMP =  Magictype.UseMp7;
		}else if(m.equals("c")) {
			MN =  Magictype.MagicName8;
			A =  Magictype.attack8;
			AMP =  Magictype.UseMp8;
		}

    	System.out.println("回復魔法");

    	System.out.println(MN);
    }



/*
 * public void timestop(){
 * }
 */

}

