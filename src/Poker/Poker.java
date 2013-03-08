package Poker;


public class Poker {
	public Card cards[];
	
	/**
	 * 呼叫建構子後，產生一副牌，放於cards變數中 
	 */
	Poker(){
		cards = new Card[52];
		for(int type = 0; type <= 3; type++){
			for(int number = 1; number <= 13;number++){
				String flower = "";
				switch(type){
					case 0:
						flower = "黑桃";
						break;
					case 1:
						flower = "愛心";
						break;
					case 2:
						flower = "方塊";
						break;
					case 3:
						flower = "梅花";
						break;
					default:
						break;
				}
				cards[type*13+number-1] = new Card(flower,number);
			}
		}
	}

	public static void main (String[] args)  {
		Poker poker = new Poker();
		poker.cards = poker.shuffle();
		poker.printCard();
	}  



	//shuffle(): Card[]。傳回一個 card 的陣列，每一個 card 表示一張撲克牌（應該有52張）
	public Card[] shuffle(){
		for(int count = 0; count < cards.length;count++){
			int n = (int)(Math.random() * cards.length - 1);
			if (count == n)
				continue;
			else{
				swap(count,n);
			}
		}
		return cards;
	}
	private void swap(int cardA,int cardB){
		Card temp;
		temp = cards[cardA];
		cards[cardA] = cards[cardB];
		cards[cardB] = temp;
	}
	
	//getCard(int): Card。傳回一張撲克牌
	public Card getCard(int x){
		return cards[x];
	}
	
	//printCard():
	public void printCard(){
		for(int type = 0; type <= 3; type++){
			for(int number = 1; number <= 13;number++){
				System.out.print(cards[type*13+number-1]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}