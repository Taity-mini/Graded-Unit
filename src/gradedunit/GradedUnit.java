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
        //Variables used throughtout the program
         String dir = Consts.FILE_DIRECTORY;
        
        //ArrayLists
           ArrayList <Player> Player = new ArrayList();
           ArrayList <Junior> Junior =  new ArrayList(); 
           ArrayList <Non_Player> Non_player = new ArrayList();
           ArrayList <ProfileTemplate> Profiles = new ArrayList();
           ArrayList <Game> Games = new ArrayList();
           ArrayList <Training> Training = new ArrayList();
          
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
           //ProfileTemplate.setALL(Catagory, Skills);
           //Games = (ArrayList<Game>) FileOperations.ReadObjects(Games, "Games", dir);
           //Player = (ArrayList<Player>) FileOperations.ReadObjects(Player, "Player", dir);
           Training = (ArrayList<Training>) FileOperations.ReadObjects(Training, "Training", dir);
           //ProfileTemplate s1 = new ProfileTemplate(Player.get(0).Name, "Test",Catagory, Skills);
//           s1.setALL(s1.getCatagory(), s1.getSkills());
//           s1.getALL(s1.getCatagory(), s1.getSkills());
           //Records.addGame(Games, "Test", "A" );
           //Records.addTraining(Training, "Test", "", Player);
         // FileOperations.WriteObjects(Training,"Training", dir);
           Training.get(0).getAllDetails();
           //Games.get(0).getAllDetails();
           //Player.get(0).getDetails();
           //s1.getALL();
           System.out.println("");
          //s1.setALL(Catagory, Skills);
           
           //Registration.addPlayer(Player);
           
         // FileOperations.WriteObjects(Player,"Player", dir); 
          //Registration.addJunior(Junior);
           //Registration.addNonPlayer(Non_players);
            
         
          
          
          
      }
    
}
