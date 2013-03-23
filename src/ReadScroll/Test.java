package ReadScroll;

public class Test {
	public static void main (String[] args)  {
		try {
			ReadQuestion rQ1 = new ReadQuestion("text1.txt");
			Scroll scroll1 = new Scroll(rQ1.getQuestionList());
			scroll1.startExam();
		} catch (FormException e){
			e.printStackTrace();
		} catch (ScoreException e) {
			e.printStackTrace();
		}
		
		try {
			ReadQuestion rQ2 = new ReadQuestion("text2.txt");
			Scroll scroll2 = new Scroll(rQ2.getQuestionList());
			scroll2.startExam();
		} catch (FormException e){
			e.printStackTrace();
		} catch (ScoreException e) {
			e.printStackTrace();
		}
		
		try {
			ReadQuestion rQ3 = new ReadQuestion("text3.txt");
			Scroll scroll3 = new Scroll(rQ3.getQuestionList());
			scroll3.startExam();
		} catch (FormException e){
			e.printStackTrace();
		} catch (ScoreException e) {
			e.printStackTrace();
		}
	}  
}