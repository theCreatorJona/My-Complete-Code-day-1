package com.jonaaagiz.miApp;

class Player{
				  static int id = 0;
				  
				  // attribute stadistic
				  int idPlayer;
				  String namePlayer;
				  float speedPlayer;
    
    int goldPlayer = 0;
				  
    // attribute in game
    
    int xPlayer = 0;
    int yPlayer = 0;
    
    int energyPlayer = 100;
    float runSpeedPlayer = 400;
    boolean isRunningPlayer =  false;
    
				  Player(String name, float speed){
				  				  id++;
				  				  this.idPlayer = id;
				  				  this.namePlayer = name;
				  				  this.speedPlayer = speed;
				  }
				  
				  void informationPlayer(){
				      System.out.println("id: " + this.idPlayer);
				  				  System.out.println("Name: " + this.namePlayer);
				      System.out.println("Speed: " + this.speedPlayer);
				      System.out.println("Is Running: " + this.isRunningPlayer);
				      System.out.println("X: " + this.xPlayer); 
				      System.out.println("Y: " + this.yPlayer);
				  }
    
    // method in game
    void runningPlayer(){
        if (isRunningPlayer == true){
            this.speedPlayer = this.runSpeedPlayer;
        }
        
    }
    
    
				
}


public class Main{
    public static void main(String[] args){
        
        
        Player p1 = new Player("Jonathan", 300.0f);
        p1.informationPlayer();
        
        
        
        
        
    }
    
}
