package gradedunit;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class GradedUnit 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
          Player p1 = new Player();
          p1.setName("John");
          p1.setAddress("lol");
          System.out.println(p1.getName());
          p1.getDetails();
          Non_Player np1 = new Non_Player();
          
          System.out.println("");
          
          np1.setName("David");
          System.out.println(np1.getName());
          np1.getDetails();
          
      }
    
}
