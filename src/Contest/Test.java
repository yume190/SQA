package Contest;

public class Test {
	public static void main (String[] args)  {
		Question questions[] = new Question[10];
		
		for(int count = 0; count < questions.length; count++){
			questions[count] = new Question("Question " + (count+1) + " : ",1,10);
		}
		Scroll scroll = new Scroll(questions);
		ContestUI contestUI = new ContestUI(scroll);
	}  
}
