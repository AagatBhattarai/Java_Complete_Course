package Real_World_Projects;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.println("Rock Paper Scissor Game");
        System.out.println("Enter the Rock as 1");
        System.out.println("Enter the Paper as 2");
        System.out.println("Enter the Scissor as 3");
        x = sc.nextInt();

       Random rand = new Random();
       int rand_int1 = rand.nextInt(1,3);

      if(x== 1 && rand_int1 == 2){
          System.out.println("You lose : Rock loses to Paper");
      }
      else if (x==1 && rand_int1 == 3){
          System.out.println("You win: Rock win to Scissor");
        }

       if(x == 2 && rand_int1 == 3){
          System.out.println("You lose : Paper loses to Scissor");
      }
      else if(x ==2 && rand_int1 == 1){
          System.out.println("You win : Paper win to Rock");
       }

      if (x == 3 && rand_int1 == 1){
          System.out.println("You lose : Scissor loses to Rock");
      }
      else if (x == 3 && rand_int1 == 2){
          System.out.println("You win: Scissor win to Paper");
      }

        if (rand_int1 == 1 && x == 1){
            System.out.println("Tie");
        }
        else if (rand_int1 == 2 && x == 2){
            System.out.println("Tie");
        } else if (rand_int1 == 3 && x ==3) {
            System.out.println("Tie");
        }


        if(rand_int1 == 1){
         System.out.println("The CPU is Rock");
     }
     else if (rand_int1 == 2){
         System.out.println("The CPU is Paper");
     }
     else {
         System.out.println("The CPU is Scissor");
     }


    }
}
