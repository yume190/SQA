package Contest;

import java.util.ArrayList;

public class Test {
	public static void main (String[] args)  {
		
		ArrayList<Question> questionList = new ArrayList<Question>();;
		
		for(int count = 0; count < 5; count++){
			questionList.add(new Question("Question " + (count+1) + " : ",1,20));
		}
		try {
			Scroll scroll = new Scroll(questionList);
			scroll.startExam();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}  
}