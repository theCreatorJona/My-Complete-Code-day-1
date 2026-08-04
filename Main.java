
import java.util.Scanner;


public class Main{
            
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Player player = new Player("Jonathan", 300.0f);
        
        while (true){
            
            if (player.roomPlayer.equals(Room.MENU)){
                System.out.println("At the menu!");
                System.out.print("Chose the mode: ");
                player.actionPlayer = input.nextLine();
                player.changeModePlayer(player.actionPlayer);
                
            }
            if (player.roomPlayer.equals(Room.GAME)){
                
                player.informationPlayer();
                player.movementPlayer(player.actionPlayer);
                player.actionPlayer = input.nextLine();
                player.changeModePlayer(player.actionPlayer);
            }
            
            
            
        }
        
        
    }
    
}




