package Contest;

import java.util.Scanner;

public class ContestUI {
	//Scroll scroll;
	ContestUI(Scroll s){
		//scroll = s;
		Scanner scanner = new Scanner(System.in);
		int input;
		int score = 0;
        
		for(int count = 0;count < s.questions.length;count++){
			System.out.println(s.questions[count].getQ());
			boolean flag = true;
			while(flag){
				input = scanner.nextInt();
	     		switch(input){
					case 1:
					case 2:
					case 3:
					case 4:
						score += s.questions[count].check(input);
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
