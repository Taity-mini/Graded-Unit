package gradedunit;

import java.util.ArrayList;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class GradedUnit 
{

    public static void main(String[] args)
      {
        //Create arraylist for all member groups
           ArrayList <Player> Player = new ArrayList();
           ArrayList <Junior> Junior =  new ArrayList(); 
           ArrayList <Non_Player> Non_players = new ArrayList();
           
           Registration.addPlayer(Player);
           Registration.addJunior(Junior);
           Registration.addNonPlayer(Non_players);
          
          
          
      }
    
}
