package ReadScroll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadQuestion {
	
	private File file;
	private ArrayList<Question> questionList = new ArrayList<Question>();
	
	ReadQuestion(String path)throws FormException{
		
		file = new File(path);
	    BufferedReader reader = null;

	    try {
	        reader = new BufferedReader(new FileReader(file));
	        String text = null;
	        
	        //讀取TXT第一行(考卷的題目)
	        text = reader.readLine();
	        
	        // repeat until all lines is read
	        while ((text = reader.readLine()) != null) {
	            this.splitQuestion(text);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (reader != null) {
	                reader.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	private void splitQuestion(String s)throws FormException{
		String line[] = s.split("--next");
		if(line.length != 3)
			throw new FormException("txt格式錯誤");
		else{
	        String q = line[0];
	        int a = Integer.valueOf(line[1]);
	        int score = Integer.valueOf(line[2]);
	        questionList.add(new Question(q,a,score));
        }
	}
	
	public ArrayList<Question> getQuestionList(){
		return questionList;
	}
}
