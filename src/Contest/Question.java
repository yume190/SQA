package Contest;

public class Question {
	private String q = "";
	private int a;
	private int score;
	/**
	 * 初始化 Question
	 * @param qq 題目
	 * @param aa 答案
	 * @param ss 分數
	 */
	Question(String qq, int aa, int ss){
		q = qq;
		a = aa;
		score = ss;
	}
	/**
	 * 
	 * @param aa 作答的答案
	 * @return 作答之後，所得到的成績
	 */
	public int check(int aa){
		if(a == aa)
			return score;
		else
			return 0;
	}

	public String getQ() {
		return q;
	}

	public int getScore() {
		return score;
	}

}
