package Contest;

public class Scroll {
	Question questions[];
	Scroll(Question q[]){
		int sum = 0;
		for(int count = 0;count < q.length;count++){
			sum += q[count].getScore();
		}
		if(sum == 100)
			questions = q;
		else
			assert (sum == 100):"考卷總和不為100分";
	}
}