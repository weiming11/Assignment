import java.io.*;
import java.util.*;

public class Game {
  boolean gameContinue = true;
  public static void main(String args[]){
      Game game = new Game();
        Novice player = new Novice();
        Scanner input1 = new Scanner(System.in); 
        System.out.println("******************************");
        System.out.println("Hello " + player.name +"!");
        System.out.println("==============================");
        System.out.println("Status");    
        player.status(); 
        while(game.gameContinue){
        System.out.println("==============================");
        System.out.println("Do you want to do");
        System.out.println("==============================");
        System.out.println("Fight is 1");
        System.out.println("Show status is 2");
        System.out.println("Open your bag is 3");
        System.out.println("Quit is 4");
        System.out.println("==============================");
        System.out.print("Answer ::  ");
        int todo = input1.nextInt();
        System.out.println("==============================");
        
        if(todo != 4){
          player.check(todo);
        }
        else if(todo == 4)
          game.gameContinue = false;
        
      }

    }
}