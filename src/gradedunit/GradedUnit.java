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
           ArrayList <Catagory> Catagory = new ArrayList();
           Catagory.add(new Catagory("Passing"));
           Catagory.add(new Catagory("Tackling"));
           Catagory.add(new Catagory("Kicking"));
           ArrayList <SkillSet> Skills = new ArrayList();
           Skills.add(new SkillSet("Standard", "Passing"));
           Skills.add(new SkillSet("Spin", "Passing"));
           Skills.add(new SkillSet("Pop", "Passing"));
           Skills.add(new SkillSet("Front", "Tackling"));
           Skills.add(new SkillSet("Rear", "Tackling"));
           Skills.add(new SkillSet("Side", "Tackling"));
           Skills.add(new SkillSet("Scrabble", "Tackling"));
           Skills.add(new SkillSet("Drop", "Kicking"));
           Skills.add(new SkillSet("Punt", "Kicking"));
           Skills.add(new SkillSet("Grubber", "Kicking"));
           Skills.add(new SkillSet("Goal", "Kicking"));
           
           
           ProfileTemplate.setALL(Catagory, Skills);
           
           Player = (ArrayList<Player>) FileOperations.ReadObjects(Player, "Player", dir);
         
           //Registration.addPlayer(Player);
           Player.get(0).getDetails();
          //FileOperations.WriteObjects(Player,"Player", dir); 
//           Registration.addJunior(Junior);
//           //Registration.addNonPlayer(Non_players);
            
         
          
          
          
      }
    
}
