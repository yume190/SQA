package Contest;

public class Question {
	private String q = "";
	private int a;
	private int score;
	
	Question(String qq, int aa, int ss){
		q = qq;
		a = aa;
		score = ss;
	}
	
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
