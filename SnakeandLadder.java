import java.util.Scanner;
public class SnakeandLadder
{
    static int Rand()
    {
        int d;
        while (true) {
            d=(int)(Math.random()*10);
            if(d>=1 && d<=6)
            return d;   
        }
    }
    public static void main(String[] args) 
    {
       int p1=1,p2=2,s1=0,s2=0;
       Scanner sc=new Scanner(System.in);
       while(true)
       {
        System.out.println("Enter player number:");
        int p=sc.nextInt();
        if(p==p1)
        {
            int dice=Rand();
            System.out.println("Dice score=" +dice);
            s1+=dice;
            if (s1==9)
            s1=s1+20;
            else if(s1==23)
            s1=s1+20;
            else if(s1==45)
            s1=s1+30;
            else if(s1==52)
            s1=s1+30;
            else if(s1==66) 
            s1=s1+30;
            else if(s1==98)
            s1=s1-90;
            else if (s1==84)
            s1=s1-60;
            else if(s1==78)
            s1=s1-50;
            else if(s1==42)
            s1=s1-21;   
            else if(s1==30)     
            s1=s1-25; 
            else if(s1==100)                    
            System.out.println("player 1 win"+s1);
            else if(s1>100)
            s1=s1-dice;
            System.out.println("Player 1 score: " +s1);
        }
        else if(p==p2)
        {
            int dice=Rand();
            System.out.println("Dice score=" +dice);
            s2+=dice;
            if (s2==9)
            s2=s2+20;
            else if(s2==23)
            s2=s2+20;
            else if(s2==45)
            s2=s2+30;
            else if(s2==52)
            s2=s2+30;
            else if(s2==66) 
            s2=s2+30;
            else if(s2==98)
            s2=s2-90;
            else if (s2==84)
            s2=s2-60;
            else if(s2==78)
            s2=s2-50;
            else if(s2==42)
            s2=s2-21;   
            else if(s2==30)     
            s2=s2-25; 
            else if(s2==100)                    
            System.out.println("player 2 win"+s2);
            else if(s2>100)
            s2=s2-dice;
            System.out.println("Player 2 score: " +s2);
        }
       } 
    }
}