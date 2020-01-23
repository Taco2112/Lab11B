// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment.

//SIMPLE JIST : Display all 52 cards and keep card info has to be in the deck class
public class Lab11bvst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      System.out.println(deck);



			/* ACTIVATE WHEN READY or not //helpful
			System.out.println(deck.size());
			System.out.println(deck.isEmpty());
			*/
	}
}


class Deck
{
	//private: cannot be accesed outside class
	private Card[] cards;
	private int size;
	private String[] suits={"Clubs","Diamonds","Hearts","Spades"};



	public Deck()
   {
	//OBJECTIVE:re-define the toString method for the Deck class so that it can be used to display the attribute values in a convenient manner
      size = 52;
		cards = new Card[size];
		//okay this works Now I have to make it so its like random dued and make it super cool 
System.out.println(suits[1] + " ");


	}
 }
