class Player{
	static int id = 0;
	
    // room 
    Room roomPlayer = Room.MENU;
    			  
	// attribute stadistic
    int idPlayer;
	String namePlayer;
	float speedPlayer;
    
    int goldPlayer = 0;
    
    String actionPlayer = "";
    boolean quitPlayer = false;
    
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
        System.out.println("Room: " + this.roomPlayer);
	}
    
    
    
    // method in game
    
    // movement
    void movementPlayer(String key){
        
        if (key.equalsIgnoreCase("w")){
            this.yPlayer += this.speedPlayer;
        }
        
        else if (key.equalsIgnoreCase("s")){
            this.yPlayer -= this.speedPlayer;
        }
       
        else if (key.equalsIgnoreCase("d")){
            this.xPlayer += this.speedPlayer;
        }
       
        else if (key.equalsIgnoreCase("a")){
            this.xPlayer -= this.speedPlayer;
        }
        
    }
    
    
    void runningPlayer(){
        if (isRunningPlayer == true){
            this.speedPlayer = this.runSpeedPlayer;
        }
        
    }
    
    
    
    
    // change mode
    void changeModePlayer(String mode){
        if (this.actionPlayer.equalsIgnoreCase("MENU")) { roomPlayer = Room.MENU; }
        else if (this.actionPlayer.equalsIgnoreCase("PLAY")) { roomPlayer = Room.GAME; }
        else if (this.actionPlayer.equalsIgnoreCase("SHOP")) { roomPlayer = Room.SHOP; }
    }
    
    
				
}