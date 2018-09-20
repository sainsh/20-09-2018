import java.util.Scanner;

public class Logic {

    Dice dice = new Dice();
    int player1 = 0;
    int player2 = 0;
    Scanner scan = new Scanner(System.in);



    public void run(){

        System.out.println("game begins");

        player1=0;
        player2=0;

        while(true){

            System.out.println("rolling dice");
            player1=dice.rollDice();
            System.out.println(player1);
            player2=dice.rollDice();
            System.out.println(player2);

            if(player1 > player2){
                System.out.println("player 1 wins");
            }
            else if(player2>player1){
                System.out.println("player 2 wins");
            }
            else{
                System.out.println("game is tied");
            }
            System.out.println("continue press any key + enter");

            scan.next();
        }


    }


}
