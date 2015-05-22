package gradedunit;

/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: InputValidation
 * Description:
 * ""
 * 
 **/  


public class InputValidation
{

    
    /*This methods check if an input is a valid integer or not
    * Used with scanner class
    *
    */
    public static boolean isIntValid(String input)
      {
        try
          {
            int i = Integer.parseInt(input);
            
            if(i < 0)
              {
                  System.out.println("Error: Negative number detected, postive numbers only please");
              }
            else
              {
                return true;
              }
            
           
          } catch (NumberFormatException e)
          {
            System.out.println("Invalid input, Positive Numbers only");
            return false;
          }
        return false;

      }

    /**
     *
     * @param input
     * @param start
     * @param end
     * @return
     */
    public static boolean menuValid(String input, int start, int end)
      {
         boolean check;
         
         check = isIntValid(input);   
         
         while(check == true)
           {
             int choice = Integer.parseInt(input);
             if(start <= choice && choice <= end )
               {
                 return true;
               }
             else
               {
                 System.out.println("ERROR: Invalid option, please try again");
                 return false;
               }
           }
        return false;
        
      }

}
