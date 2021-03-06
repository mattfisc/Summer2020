
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    public Cell[][] map;
    public Cell food;
    
    public Cell closest_cell;
    public double closest_distance;
    
    public int time_worked;

    public Mining(){
        map  = new Cell[20][20];
        
        food = new Cell(map.length/2,map[0].length/2);
        
        // FIRST CLOSEST CELL
        //closest_cell = new Cell(1,1);
        
        // INITAILIZE MAP
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                map[i][j] = new Cell(i,j);
            }
        }
        
        // ELEVATOR SET TO ROCK MINED
        map[food.getX()][food.getY()].setRock(false);
        
        
    }

    public Cell[][] getMap() {
        return map;
    }

    public void setMap(Cell[][] map) {
        this.map = map;
    }

    public Cell getElevator() {
        return food;
    }

    public void setElevator(Cell elevator) {
        this.food = elevator;
    }

    public Cell getClosest_cell() {
        return closest_cell;
    }

    public void setClosest_cell() {
        
        // WORST CASE DIAGONAL DISTANCE FROM ELEVATOR
        closest_distance = Math.sqrt( Math.pow(20-food.getX(), 2) + Math.pow(20-food.getY(),2) );
        
        // FIND CLOSER CELL
        for(int y = 0; y < map.length; y++){// row or y
            for(int x = 0; x < map[0].length; x++){// col or x
                
                // CLOSEST DISTANCE FROM ELEVATOR
                double temp = Math.sqrt( Math.pow(y-food.getY(), 2) + Math.pow(x-food.getX(),2) );
                
                if(closest_distance >= temp && map[x][y].getRock() == true){
                    
                    closest_distance = temp;
                    closest_cell = map[x][y];
                    
                    time_worked = (closest_cell.getX()-food.getX() ) + closest_cell.getY()-food.getY();
                }
            }
        }
    }

    public double getClosest_distance() {
        return closest_distance;
    }

    public void setClosest_distance(int closest_distance) {
        this.closest_distance = closest_distance;
    }
    
    
    


    
}
