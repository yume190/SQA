package Contest;

import java.util.ArrayList;
import java.util.Scanner;

public class Scroll {
	ArrayList<Question> questionList;
	private int sum = 0;
	
	/**
	 * 初始化時， 會先檢查總分是否為100
	 * 是：正常執行
	 * 否：拋出例外
	 */
	Scroll(ArrayList<Question> qList)throws Exception {
		this.questionList = qList;
		for(int count = 0;count < qList.size();count++){
			sum += qList.get(count).getScore();
		}
		check();
	}
	
	private void check()throws Exception{
		if(sum == 100);
		else
			throw new Exception("考卷總和不為100分");
			//assert (sum == 100):"考卷總和不為100分";
	}
	
	/**
	 * 此處皆為選擇題
	 * 作答範圍在1~4之間(且輸入時只能輸入整數)
	 * 如果輸入其他數字(1~4以外)，此題將會要重新輸入一次
	 */
	public void startExam(){
		Scanner scanner = new Scanner(System.in);
		int input;
		int score = 0;
        
		for(int count = 0;count < questionList.size();count++){
			System.out.println(questionList.get(count).getQ());
			boolean flag = true;
			while(flag){
				input = scanner.nextInt();
	     		switch(input){
					case 1:
					case 2:
					case 3:
					case 4:
						score += questionList.get(count).check(input);
						flag = false;
						break;
					default:
						System.out.println("輸入錯誤");
						flag = true;
						break;
				}
			}
			
		}
        System.out.println("Your score : " + score);
        scanner.close();
	}
}