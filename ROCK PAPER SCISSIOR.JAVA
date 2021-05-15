import java.util.Random;
import java.util.Scanner;
 public class Main{
public static void main(String[] args){
String [] rps ={"r","p","s"};
String ComputerMove= rps[new Random().nextInt(rps.length)];
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the game");
String PlayerMove;
while(true)
{
System.out.println(" ENTER THE MOVE YOU WANT(r,p or s)");
PlayerMove=sc.nextLine();
if(PlayerMove.equals("r")|| PlayerMove.equals("p")|| PlayerMove.equals("s"))
break;

System.out.println(PlayerMove+"is  not a valid move");
}

System.out.println("Computer Played:"+ComputerMove);
if(PlayerMove.equals(ComputerMove))
{
System.out.println("The game ties!");
}
else if(PlayerMove.equals("r"))
{
if(ComputerMove.equals("p"))
    System.out.println("You Lose");
else if(ComputerMove.equals("s"))
{System.out.println("YOu WIn");
}
}
else if(PlayerMove.equals("p"))
{
if(ComputerMove.equals("r"))
    System.out.println("You WIN");
else if(ComputerMove.equals("s"))
{System.out.println("YOu LOse");
}
}
else if(PlayerMove.equals("s"))
{
if(ComputerMove.equals("p"))
    System.out.println("You Win");
else if(ComputerMove.equals("r"))
{System.out.println("YOu Loose");
}
}
}


}