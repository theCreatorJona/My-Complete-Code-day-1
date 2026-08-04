class Portal{
    String namePortal;
    int idPortal;
    
    int xPortal;
    int yPortal;
    
    int width;
    int height;
    
    int map;
    
    boolean isActivate = false;
    
    Portal(String name, int id, int x, int y, int w, int h, int map){
        this.namePortal = name;
        this.idPortal = id;
        this.xPortal = x;
        this.yPortal = y;
        this.width = w;
        this.height = h;
        this.map = map;
    }
    /*
    boolean portalIsActivate(Player player){
        if ( player.xPlayer <= this.xPortal && player.yPlayer <= this.yPortal && player.xPlayer >= ){
            System.out.println("TEST: estas dentro del portal!");
            return isActivate = true;
        }
    return false;
    }*/
}