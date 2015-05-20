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
    public static void MemberManagement(ArrayList<Player> Player, ArrayList<Junior> Junior, ArrayList<Non_Player> Non_Player, ArrayList<ProfileTemplate> Profiles, ArrayList<Category> Category, ArrayList<SkillSet> Skill)
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
                        Menu.PlayersMenu(Player, Profiles, Category, Skill);
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

    public static void PlayersMenu(ArrayList<Player> Player, ArrayList<ProfileTemplate> Profiles, ArrayList<Category> Category, ArrayList<SkillSet> Skill)
      {

        int arrSize = Player.size();

        Scanner players = new Scanner(System.in);

        int choice = 0;
        Boolean check;
        String temp;
        if (arrSize > 0)
          {
            try
              {
                do
                  {
                    do
                      {
                        System.out.println("Simply Rugby - Rugby Player Menu");
                        System.out.println("OPTION 1 - Add Player");
                        System.out.println("OPTION 2 - View All Player(S)");
                        System.out.println("OPTION 3 - Edit Player Information");
                        System.out.println("OPTION 4 - Player Performance Profiles");
                        System.out.println("OPTION 5 - Delete Player");
                        System.out.println("OPTION 6 - Exit");
                        temp = (players.nextLine());
                        check = InputValidation.menuValid(temp, 1, 6);

                      } while (check.equals(false));
                    choice = Integer.parseInt(temp);

                    switch (choice)
                      {
                        case 1:
                            Registration.addPlayer(Player);
                            break;

                        case 2:
                            Records.getSummary(Player, "Player");
                            Menu.ModifyMembers(Player, "Player");
                            break;

                        case 3:
                            Registration.editPlayer(Player, 0);
                            break;

                        case 4:
                            //Local Varibles

                            int playerID;

                            Scanner profile = new Scanner(System.in);
                            Records.getSummary(Player, "Player");
//                              do
//                              {
//                                System.out.println("Enter ID of player you wish create a profile for");
//       
//                                temp = (profile.nextLine());
//                                check = InputValidation.isIntValid(temp);
//
//                              } while (check.equals(false));
//                             playerID = Integer.parseInt(temp);
                            //Records.addProfile(Profiles, Category, Skill, Player, 0, "Player");
                            Profiles.get(0).getALL();
                            break;

                        case 5:
                            System.out.println("OPTION 4 SELECTED");
                            break;
                        case 6:
                            System.out.println("System exited succesfully");
                            //call to write arraylists here

                            break;
                        default:
                            System.out.println("Invalid option selected");
                            break;

                      }

                  } while (choice != 6);

              } catch (NumberFormatException ex)
              {
                System.out.println("ERROR: This is not a valid value, please try again!");
              }
          } else
          {
            System.out.println("Player List is currently empty, please at least one player to continue.");
            System.out.println("Redirecting user to player Registration...");
            Registration.addPlayer(Player);
          }

      }

    public static void ModifyMembers(ArrayList<?> Member, String MemberClass)
      {
        Scanner Modify = new Scanner(System.in);
        int ID;
        int arrSize;
        arrSize = Member.size();
        int choice = 0;
        Boolean check;
        String temp;
        
 
        
        try
          {
            do
              {
                do
                  {
                    System.out.println("OPTION 1 - View Additonal Player Details");
                    System.out.println("OPTION 2 - Edit Player Details");
                    System.out.println("OPTION 3 - Delete Player");
                    System.out.println("OPTION 4 - Exit to Main Menu");
                    temp = (Modify.nextLine());
                    check = InputValidation.menuValid(temp, 1, 4);

                  } while (check.equals(false));
                choice = Integer.parseInt(temp);

                switch (choice)
                  {
                    case 1:

                        Scanner view = new Scanner(System.in);
                        do
                          {
                            System.out.println("Enter Player ID you wish to view");
                            temp = (view.nextLine());
                            check = InputValidation.menuValid(temp, 0, arrSize);

                          } while (check.equals(false));
                          ID = Integer.parseInt(temp);
                          switch (MemberClass)
                            {
                              case "Player":
                              ArrayList<Player> Player = new ArrayList();
                              Player= (ArrayList<Player>) Member;
                              Player.get(ID).getDetails();
                              break;
                                  
                              case "Junior":
                              ArrayList<Junior> Junior = new ArrayList();
                              Junior= (ArrayList<Junior>) Member;
                              Junior.get(ID).getDetails();
                              break;
                                  
                                  
                                  
                                  
                            }
                         
                        

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
