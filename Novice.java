import java.io.*;
import java.util.*;

public class Novice {
    
    int hp;
    int hpmax;
    int exp;
    int money;
    int level;
    String name;
    Bag bag ;

    public Novice(){
        hp = 1000 ;
        hpmax = 1000 ;
        exp = 0 ;
        money = 0 ;
        level = 1 ;
        name="Donut" ;
        bag = new Bag();
    }
    
    public void status()
    {
       System.out.println("=============================="); 
       System.out.println("you have money is "+ money );
       System.out.println("you have exp is "+ exp);
       System.out.println("you have level is "+level);
       System.out.println("you have hp is "+hp+"/"+hpmax);
       System.out.println("==============================");
    }

    public void monster(int num)
    {

        if(num == 1){

         hp = hp-100;
         exp = exp+100;
         System.out.println("==============================");
         System.out.println("Archer dead");
         System.out.println("-----You get-----");
         bag.dropitem();
         
         }

        else if(num == 2){
         hp = hp-200;
         exp = exp+250;
         System.out.println("==============================");
         System.out.println("Barbarian dead");
         System.out.println("-----You get-----");
         bag.dropitem();
         
        }
        System.out.println("********"+bag.items.get(bag.slot - 1).nameitem+"********");
        hp();
        while(exp >= 100){
             exp = exp-100;
             level = level+1;
             hpmax = hpmax+100;
        }
    }

    public void potion(int numpo){
         hp = hp  +(numpo*200);
         if(hp>hpmax)
         {
             hp = hpmax;
         }
    }
    public void check(int todo){
        if(todo == 1){
            fight();
        }
        else if (todo == 2){
            status();
        }
        else if (todo == 3) {
            bag.openbag();
        }
    }

    public void fight(){
        int j=1;
        Scanner input2 = new Scanner(System.in); 
        System.out.println("==============================");
        System.out.println("**Let's go**"); 
        System.out.println("This area have monster");
        System.out.println("Archer is 1");
        System.out.println("Barbarian is 2");
        System.out.println("==============================");
        System.out.println("Which monster do you want to fight with?(1 or 2)"+"#"+j);
        System.out.println("==============================");
        int number = input2.nextInt();
        monster(number);
        System.out.println("==============================");
        j++;
        
    }
   public void hp(){
       if(hp <= 0){
        hp = 0 ;
        System.out.println("You died");
        
       }
       else if(hp  < 200) {
        System.out.println("You should use potion");   
       }
   }
}