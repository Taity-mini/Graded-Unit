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
                        System.out.println("Not yet Implemented");
                        break;

                    case 3:
                        System.out.println("Not yet Implemented");
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

        int arrSize = Player.size() - 1;

        Scanner players = new Scanner(System.in);

        int choice = 0;
        Boolean check;
        String temp;

        try
          {
            outerloop:
            do
              {
                if (!Player.isEmpty())
                  {
                    innerloop:
                    do
                      {

                        System.out.println("Simply Rugby - Rugby Player Menu");
                        System.out.println("OPTION 1 - Add Player");
                        System.out.println("OPTION 2 - View/Edit/Delete Player(S)");
                        System.out.println("OPTION 3 - Add Player Performance Profiles");
                        System.out.println("OPTION 4 - View Player Performance Profiles");
                        System.out.println("OPTION 5 - Exit");
                        temp = (players.nextLine());
                        check = InputValidation.menuValid(temp, 1, 5);

                      } while (check.equals(false));
                    choice = Integer.parseInt(temp);

                    switch (choice)
                      {
                        case 1:
                            Registration.addPlayer(Player);
                            break;

                        case 2:

                            Menu.ModifyMembers(Player, "Player");
                            break;

                        case 3:
                            //Local Varibles

                            int playerID;

                            Scanner profile = new Scanner(System.in);
                            Records.getSummary(Player, "Player");

                            do
                              {
                                System.out.println("Enter ID of player you wish create a profile for");
                                temp = (profile.nextLine());
                                check = InputValidation.menuValid(temp, 0, arrSize);

                              } while (check.equals(false));
                            playerID = Integer.parseInt(temp);

                            Records.addProfile(Profiles, Category, Skill, Player, playerID, "Player");
                            //Profiles.get(0).getALL();
                            break;

                        case 4:
                          {
                            if (!Profiles.isEmpty())
                              {
                                int profileID;
                                int profileArrSize;
                                boolean profileCheck;
                                profileCheck = Records.viewProfile(Profiles, "Player");
                                if (profileCheck == true)
                                  {

                                    profileArrSize = Profiles.size() - 1;
                                    Scanner viewProfile = new Scanner(System.in);

                                    Records.viewProfile(Profiles, "Player");

                                    do
                                      {
                                        System.out.println("Enter ID of player you wish view profile of");
                                        temp = (viewProfile.nextLine());
                                        check = InputValidation.menuValid(temp, 0, profileArrSize);

                                      } while (check.equals(false));
                                    profileID = Integer.parseInt(temp);

                                    Profiles.get(profileID).getALL();
                                  } else if (profileCheck == false)
                                  {
                                    System.out.println("No profiles were found");
                                    break;
                                  }
                              } else if (Profiles.isEmpty())
                              {
                                System.out.println("Profile list is empty");
                                break;
                              }
                          }
                        break;

                        case 5:
                            System.out.println("System exited succesfully");
                            //call to write arraylists here

                            break;
                        default:
                            System.out.println("Invalid option selected");
                            break;

                      }
                  } else if (Player.isEmpty())
                  {
                    System.out.println("Player List is currently empty, please at least one player to continue.");
                    System.out.println("Redirecting user to player Registration...");
                    Registration.addPlayer(Player);
                    break outerloop;
                  }

              } while (choice != 5);

          } catch (NumberFormatException ex)
          {
            System.out.println("ERROR: This is not a valid value, please try again!");
          }

      }

    public static void ModifyMembers(ArrayList<?> Member, String MemberClass)
      {
        Scanner Modify = new Scanner(System.in);
        int ID;
        int arrSize;
        arrSize = Member.size() - 1;

        int choice = 0;
        Boolean check;
        String temp;

        try
          {
            do
              {
                if (!Member.isEmpty())
                  {
                    Records.getSummary(Member, MemberClass);
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
                            arrSize = Member.size() - 1;
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
                                    Player = (ArrayList<Player>) Member;
                                    Player.get(ID).getDetails();
                                    break;

                                case "Junior":
                                    ArrayList<Junior> Junior = new ArrayList();
                                    Junior = (ArrayList<Junior>) Member;
                                    Junior.get(ID).getDetails();
                                    break;

                              }

                            break;

                        case 2:
                            Scanner edit = new Scanner(System.in);
                            do
                              {
                                System.out.println("Enter Player ID you wish to view");
                                temp = (edit.nextLine());
                                check = InputValidation.menuValid(temp, 0, arrSize);

                              } while (check.equals(false));
                            ID = Integer.parseInt(temp);
                            switch (MemberClass)
                              {
                                case "Player":
                                    ArrayList<Player> Player = new ArrayList();
                                    Player = (ArrayList<Player>) Member;
                                    Registration.editPlayer(Player, ID);
                                    break;

                                case "Junior":
                                    ArrayList<Junior> Junior = new ArrayList();
                                    Junior = (ArrayList<Junior>) Member;
                                    //Registration.editPlayer(Junior, ID);
                                    break;

                                case "Non_Player":

                                    ArrayList<Non_Player> Non_Player = new ArrayList();
                                    Non_Player = (ArrayList<Non_Player>) Member;
                                    //Registration.editPlayer(Junior, ID);
                                    break;

                                default:
                                    System.out.println("Invalid Class - Only Player, Junior and Non Player Allowed");
                                    break;

                              }

                            break;

                        case 3:
                            Scanner delete = new Scanner(System.in);
                            do
                              {
                                System.out.println("Enter Player ID you wish to delete");
                                temp = (delete.nextLine());
                                check = InputValidation.menuValid(temp, 0, arrSize);

                              } while (check.equals(false));
                            ID = Integer.parseInt(temp);
                            switch (MemberClass)
                              {
                                case "Player":
                                    ArrayList<Player> Player = new ArrayList();
                                    Player = (ArrayList<Player>) Member;
                                    Registration.DeleteMember(Player, MemberClass, ID);
                                    break;

                                case "Junior":
                                    ArrayList<Junior> Junior = new ArrayList();
                                    Player = (ArrayList<Player>) Member;
                                    Registration.DeleteMember(Junior, MemberClass, ID);
                                    break;

                                case "Non_Player":
                                    ArrayList<Non_Player> Non_Player = new ArrayList();
                                    Non_Player = (ArrayList<Non_Player>) Member;
                                    Registration.DeleteMember(Non_Player, MemberClass, ID);
                                    break;

                                default:
                                    System.out.println("Invalid Class - Only Player, Junior and Non Player Allowed");
                                    break;

                              }

                            break;

                        case 4:
                            System.out.println("Exit to Main Menu");
                            break;
                        default:
                            System.out.println("Invalid option selected");
                            break;

                      }
                  } else if (Member.isEmpty())
                  {
                    return;
                  }

              } while (choice != 4);

          } catch (NumberFormatException ex)
          {
            System.out.println("ERROR: This is not a valid value, please try again!");
          } catch (IndexOutOfBoundsException ex)
          {
            System.out.println("Player/Member list is empty, please add at least one player.");
          }

      }

    public static void GameMenu(ArrayList<Game> Game, String MemberClass)
      {

        Scanner Games = new Scanner(System.in);
        int arrSize;

        int choice = 0;
        Boolean check;
        String temp;
        String coach;

        try
          {
            outerloop:
            do
              {

                if (!Game.isEmpty())
                  {

                    do
                      {
                        System.out.println("Simply Rugby Main Menu");
                        System.out.println("OPTION 1 - Add Game");
                        System.out.println("OPTION 2 - View Games");

                        System.out.println("OPTION 3 - Exit");
                        temp = (Games.nextLine());
                        check = InputValidation.menuValid(temp, 1, 3);

                      } while (check.equals(false));
                    choice = Integer.parseInt(temp);

                    switch (choice)
                      {
                        case 1:
                            Scanner add = new Scanner(System.in);

                            System.out.print("Enter Coach Name:");
                            coach = add.nextLine();
                            Records.addGame(Game, coach, "Player");
                            break;

                        case 2:
                            arrSize = Game.size() - 1;
                            Records.getSummary(Game, MemberClass);
                            Scanner viewProfile = new Scanner(System.in);

                            int GameID;

                            do
                              {
                                System.out.println("Please Game ID to view additional details");
                                temp = (viewProfile.nextLine());
                                check = InputValidation.menuValid(temp, 0, arrSize);

                              } while (check.equals(false));
                            GameID = Integer.parseInt(temp);
                            Game.get(GameID).getAllDetails();

                            break;

                        case 3:
                            System.out.println("Exit to Main Menu");

                            break;
                        default:
                            System.out.println("Invalid option selected");

                            break;

                      }

                  } else if (Game.isEmpty())
                  {
                    System.out.println("Game list is empty, please add at least one game");
                    Scanner add = new Scanner(System.in);
                    System.out.print("Enter Coach Name:");
                    coach = add.nextLine();
                    Records.addGame(Game, coach, "Player");

                  }

              } while (choice != 3);

          } catch (Exception ex)
          {
            System.out.println("ERROR: This is not a valid value, please try again!");
          }

      }

}
