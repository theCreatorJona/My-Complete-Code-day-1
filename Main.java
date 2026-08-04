
import java.util.Scanner;


public class Main{
            
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Player p1 = new Player("Jonathan", 300.0f);
        
        while (true){
            
            if (p1.roomPlayer.equals(Room.MENU)){
                System.out.println("At the menu!");
                System.out.print("Chose the mode: ");
                p1.actionPlayer = input.nextLine();
                p1.changeModePlayer(p1.actionPlayer);
                
            }
            if (p1.roomPlayer.equals(Room.GAME)){
                
                p1.informationPlayer();
                p1.movementPlayer(p1.actionPlayer);
                p1.actionPlayer = input.nextLine();
                p1.changeModePlayer(p1.actionPlayer);
            }
            
            
            
        }
        
        
    }
    
}




