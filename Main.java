
import java.util.Scanner;



public class Main{
            
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Player player = new Player("Jonathan", 300.0f);
        
        while (!player.quitPlayer){
            
            if (player.roomPlayer.equals(Room.MENU)){
                System.out.println("At the menu!");
                System.out.print("Chose the mode: ");
                player.actionPlayer = input.nextLine();
                player.changeModePlayer(player.actionPlayer);
                
            }
            else if (player.roomPlayer.equals(Room.GAME)){
                
                player.informationPlayer();
                player.movementPlayer(player.actionPlayer);
                player.actionPlayer = input.nextLine();
                player.changeModePlayer(player.actionPlayer);
            }
            
            else if (player.roomPlayer.equals(Room.SHOP)){
                System.out.println("The shop not ready disponible");
                System.out.print("Chose your mode: ");
                player.actionPlayer = input.nextLine();
            }
            else { player.roomPlayer = Room.MENU; }
            
        }
        
        
    }
    
}




