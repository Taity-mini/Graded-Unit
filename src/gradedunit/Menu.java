/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradedunit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class Menu
{

    //Member Management Menus
    public static void MemberManagement(ArrayList<Player> Player, ArrayList<Junior> Junior, ArrayList<Non_Player> Non_Player, ArrayList<ProfileTemplate> Profiles)
      {

        Scanner management = new Scanner(System.in);

        int choice = 0;
        Boolean check;
        String temp;

        try
          {
            do
              {
                do
                  {
                    System.out.println("Simply Rugby | Member Management");
                    System.out.println("OPTION 1 - Rugby Players");
                    System.out.println("OPTION 2 - Junior Rugby Players");
                    System.out.println("OPTION 3 - Non Playing Members");
                    System.out.println("OPTION 4 - Exit to Main Menu");
                    temp = (management.nextLine());
                    check = InputValidation.menuValid(temp, 1, 4);

                  } while (check.equals(false)); 
                    choice = Integer.parseInt(temp);

                switch (choice)
                  {
                    case 1:
                        System.out.println("OPTION 1 SELECTED");
                        break;

                    case 2:
                        System.out.println("OPTION 2 SELECTED");
                        break;

                    case 3:
                        System.out.println("OPTION 3 SELECTED");
                        break;

                    case 4:
                        System.out.println("Exit to Main Menu");

                        break;
                    default:
                        System.out.println("Invalid option selected");
                        break;

                  }

              } while (choice != 4);

          } catch (NumberFormatException ex)
          {
            System.out.println("ERROR: This is not a valid value, please try again!");
          }

      }
    
    
    
    
    
    

}


