//task 1 code
import java.lang.Math;
import java.util.Scanner;
class Game
{
    int random_number, user_input;
    static int noOfGuesses=0;
    Game()
    {
        random_number = (int)(Math.random()*(100-0+1) + 0);
    }
    public void takeUserInput(int n)
    {
        user_input = n;
    }
    public int isCorrectNumber()
    {
        if(user_input == random_number)
        {
            return noOfGuesses++;
        }
        else if(user_input > random_number)
        {
            noOfGuesses++;
            System.out.print("\nThe enetered number is greater than the random number generated.\n");
            return 1;
        }
        else
        {
            noOfGuesses++;
            System.out.print("\nThe entered number is less than the random number generated.\n");
            return 1;
        }
    }
}


public class numbergame {
    public static void main(String[] args)
    {
        Scanner var = new Scanner(System.in);
        int u;
        System.out.print("\nEnter a number: ");
        u=var.nextInt();
        Game obj = new Game();
        obj.takeUserInput(u);
        int i = obj.isCorrectNumber();
        while(i == 1)
        {
            u=var.nextInt();
            obj.takeUserInput(u);
            i = obj.isCorrectNumber();
        }
        System.out.print("\nNo of Guesses: " + (i+1));
    }
}
