package Poker;


public class Card {
	String type;
	int number;
	Card(String t, int n){
		type = t;
		number = n;
	}

	public String toString(){
		return type + String.valueOf(number);
	}
}