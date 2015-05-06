package gradedunit;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class GradedUnit 
{

    public static void main(String[] args) throws IOException
      {
        //Create arraylist for all member groups
        
        
           ArrayList <Player> Player = new ArrayList();
           ArrayList <Junior> Junior =  new ArrayList(); 
           ArrayList <Non_Player> Non_player = new ArrayList();
           String dir = Consts.FILE_DIRECTORY;
           
           
           
           
          
           Player = (ArrayList<Player>) FileOperations.ReadObjects(Player, "Player", dir);
         
           //Registration.addPlayer(Player);
           Player.get(0).getDetails();
           //FileOperations.WriteObjects(Player,"Player", dir); 
//           Registration.addJunior(Junior);
//           //Registration.addNonPlayer(Non_players);
           
          
          
          
          
      }
    
}
