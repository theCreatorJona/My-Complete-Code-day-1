
import java.util.Scanner;



public class Main{
            
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Player player = new Player("Jonathan");
        
        Portal PortalEIC = new Portal("EIC", 1, 0, 0, 100, 100, 1);
        
        while (!player.quitPlayer){
            // logica global
            player.playerIsQuit(player.actionPlayer);
            
            
            if (player.roomPlayer.equals(Room.MENU)){
                System.out.println("At the menu!");
                System.out.print("Chose the mode: ");
                player.actionPlayer = input.nextLine();
                player.changeModePlayer(player.actionPlayer);
                
            }
            else if (player.roomPlayer.equals(Room.GAME)){
                
                player.informationPlayer();
                PortalEIC.portalIsActivate(player);
                player.actionPlayer = input.nextLine();
                player.movementPlayer(player.actionPlayer);
                
                player.changeModePlayer(player.actionPlayer);
            }
            
            else if (player.roomPlayer.equals(Room.SHOP)){
                System.out.println("The shop not ready disponible");
                System.out.print("Chose your mode: ");
                player.actionPlayer = input.nextLine();
            }
            
        }
        
        
    }
    
}




