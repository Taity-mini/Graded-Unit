package gradedunit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since 21/5/2015 Name: Registration Class
 * Description: "
 *              "
 *
 *
 */
public class Registration
{

    /**
     *
     * @param Player
     */
    public static void addPlayer(ArrayList<Player> Player)
      {
        //create scanner to accept user input
        Scanner players = new Scanner(System.in);

        //Input Validation variables
        Boolean check;
        String temp;

        //Local variables used to store information of
        String Name;
        String Address;
        String PostCode;
        int SRU;
        String DOB;
        String TelNum;
        String MobNum;
        String Email;

        //Additonal fields
        String nextOfKin;
        String nextOfKin_Tel;
        String doctor_Name;
        String doctor_Tel;
        String healthInfo;
        String player_Position;

        //Player Member form
        System.out.println("Rugby Players Registration Form");
        System.out.println("******************************************************");
        System.out.print("Name: ");
        Name = players.nextLine();
        System.out.print("Address: ");
        Address = players.nextLine();
        System.out.print("PostCode: ");
        PostCode = players.nextLine();

        do
          {

            System.out.print("SRU Number: ");
            temp = (players.nextLine());
            check = InputValidation.isIntValid(temp);

          } while (check.equals(false));
        SRU = Integer.parseInt(temp);

        System.out.print("Date of Birth (DD/MM/YYYY): ");
        DOB = players.nextLine();

        System.out.print("Telephone Number: ");
        TelNum = players.nextLine();

        System.out.print("Mobile Number: ");
        MobNum = players.nextLine();
        System.out.print("Email Address: ");
        Email = players.nextLine();

        System.out.println("Additional Fields below: ");
        System.out.print("Next of Kin - Name: ");
        nextOfKin = players.nextLine();
        System.out.print("Next of Kin - Telephone Number: ");
        nextOfKin_Tel = players.nextLine();
        System.out.print("Doctor Name: ");
        doctor_Name = players.nextLine();
        System.out.print("Doctor Telephone: ");
        doctor_Tel = (players.nextLine());
        System.out.print("Known Health Issues: ");
        healthInfo = players.nextLine();
        System.out.print("Player position: ");
        player_Position = players.nextLine();

        //Add new registered player to player arraylist
        Player.add(new Player(Name, Address, PostCode, SRU, DOB, TelNum, MobNum, Email, nextOfKin, nextOfKin_Tel, doctor_Name, doctor_Tel, healthInfo, player_Position));
        System.out.println("Rugby player: " + Name + " ,Sucessfully added to list.");
        System.out.println("******************************************************");
      }

    /**
     *
     * @param Player
     * @param ID
     */
    public static void editPlayer(ArrayList<Player> Player, int ID)
      {
        //create scanner to accept user input
        Scanner players = new Scanner(System.in);

        //Input Validation variables
        Boolean check;
        String temp;
        String input;

        //Player Member form
        System.out.println("Edit Rugby Players form, ID: " + ID);
        System.out.println("Input new value to edit or leave blank");
        System.out.println("******************************************************");
        System.out.println("Name (Current: " + Player.get(ID).getName() + ")");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setName(input);
          }

        System.out.println("Address(Current :" + Player.get(ID).getAddress() + ")");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setAddress(input);
          }

        System.out.println("PostCode(Current :" + Player.get(ID).getPostCode() + ")");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setPostCode(input);
          }

        do
          {
            System.out.println("SRU Number (Current :" + Player.get(ID).getSRU_Number() + ")");
            System.out.print("New Value: ");
            temp = (players.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));
        if (!temp.equals(""))
          {
            Player.get(ID).setSRU_Number(Integer.parseInt(temp));
          }

        System.out.println("Date of Birth (DD/MM/YYYY)(Current :" + Player.get(ID).getDateOfBirth() + ")");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setDateOfBirth(input);
          }

        System.out.println("Telephone Number (Current:" + Player.get(ID).getTelNum() + ")");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setTelNum(input);
          }
        System.out.println("Mobile Number: " + Player.get(ID).getMobNum() + " ");
       System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            
            Player.get(ID).setMobNum(input);
          }

        System.out.println("Email Address: " + Player.get(ID).getEmail() + " ");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setEmail(input);
          }
        System.out.println("Additional Fields below: ");
        System.out.println("Next of Kin - Name: " + Player.get(ID).getNextOfKin() + " ");
        System.out.print("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setNextOfKin(input);
          }

        System.out.println("Next of Kin - Telephone Number: " + Player.get(ID).getNextOfKin_Tel() + " ");
        System.out.print("New Value: ");
         if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setNextOfKin_Tel(input);
          }

        System.out.print("Doctor Name: " + Player.get(ID).getDoctor_Name() + " ");
        System.out.println("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setDoctor_Name(input);
          }


       System.out.print("Doctor Telephone: " + Player.get(ID).getDoctor_Tel() + " ");
       System.out.println("New Value: ");
       if (players.hasNextLine() && !(input = players.nextLine()).isEmpty()) 
         {
            Player.get(ID).setDoctor_Tel(input);
          }

        System.out.print("Known Health Issues: " + Player.get(ID).getHealthInfo() + " ");
        System.out.println("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setHealthInfo(input);
          }

        System.out.print("Player position: " + Player.get(ID).getPlayer_position() + " ");
        System.out.println("New Value: ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setPlayer_position(input);
          }

        //Add new registered player to player arraylist
        //System.out.println("Rugby player: " + Name + " ,Sucessfully added to list.");
        System.out.println("******************************************************");
      }

    /**
     *
     * @param Junior
     */
    public static void addJunior(ArrayList<Junior> Junior)
      {
        //create scanner to accept user input
        Scanner juniors = new Scanner(System.in);

        //Local variables used to store information of junior player
        String Name;
        String Address;
        String PostCode;
        int SRU;
        String DOB;
        String TelNum;
        String MobNum;
        String Email;

        //Additional Fields
        String Guardian_Name;
        String Guardian_Relationship;
        String Guardian_Address;
        String Guardian_Tel;
        String Doc_Name;
        String Doc_Address;
        String Doc_Tel_Num;
        String healthInfo;
        String Player_position;

        //Junior Player Member form
        System.out.println("******************************************************");
        System.out.println("Junior Player's Registration Form");
        System.out.print("Name: ");
        Name = juniors.nextLine();
        System.out.print("Address: ");
        Address = juniors.nextLine();
        System.out.print("PostCode: ");
        PostCode = juniors.nextLine();

        System.out.print("SRU Number: ");
        SRU = Integer.parseInt(juniors.nextLine());
        System.out.print("Date of Birth: ");
        DOB = juniors.nextLine();
        System.out.print("Telephone Number: ");
        TelNum = juniors.nextLine();
        System.out.print("Mobile Number: ");
        MobNum = juniors.nextLine();
        System.out.print("Email Address: ");
        Email = juniors.nextLine();

        System.out.print("Additional Fields below: ");
        System.out.println("");
        System.out.print("Guardian 1 - Name: ");
        Guardian_Name = juniors.nextLine();
        System.out.print("Guardian 1 - Relationship: ");
        Guardian_Relationship = juniors.nextLine();
        System.out.print("Guardian 1 - Address: ");
        Guardian_Address = juniors.nextLine();
        System.out.print("Guardian 1 - Telephone Number: ");
        Guardian_Tel = juniors.nextLine();
        System.out.print("Doctor Name: ");
        Doc_Name = juniors.nextLine();
        System.out.print("Doctor Telephone: ");
        Doc_Tel_Num = juniors.nextLine();
        System.out.print("Doctor - Address: ");
        Doc_Address = juniors.nextLine();
        System.out.print("Known Health Issues: ");
        healthInfo = juniors.nextLine();

        System.out.print("Player position: ");
        Player_position = juniors.nextLine();
        Junior.add(new Junior(Name, Address, PostCode, SRU, DOB, TelNum, MobNum, Email, Guardian_Name, Guardian_Relationship, Guardian_Address, Guardian_Tel, Doc_Name, Doc_Address, Doc_Tel_Num, healthInfo, Player_position));
        System.out.println("Junior player: " + Name + "Sucessfully added to list.");
        System.out.println("*********************************");

      }

    /**
     *
     * @param Non_Player
     */
    public static void addNonPlayer(ArrayList<Non_Player> Non_Player)
      {
        //create scanner to accept user input
        Scanner NonPlayers = new Scanner(System.in);

        //Local variables used to store information of new Non player member
        String Name;
        String Address;
        String PostCode;
        int SRU;
        String DOB;
        String TelNum;
        String MobNum;
        String Email;

        //Player Member form
        System.out.println("Non Player's Registration Form");
        System.out.println("******************************************************");
        System.out.print("Name: ");
        Name = NonPlayers.nextLine();
        System.out.print("Address: ");
        Address = NonPlayers.nextLine();
        System.out.print("PostCode: ");
        PostCode = NonPlayers.nextLine();

        System.out.print("SRU Number: ");
        SRU = NonPlayers.nextInt();
        System.out.print("Date of Birth: ");
        DOB = NonPlayers.nextLine();
        System.out.print("Telephone Number: ");
        TelNum = NonPlayers.nextLine();
        System.out.print("Mobile Number: ");
        MobNum = NonPlayers.nextLine();
        System.out.print("Email Address: ");
        Email = NonPlayers.nextLine();

        Non_Player.add(new Non_Player(Name, Address, PostCode, SRU, DOB, TelNum, MobNum, Email));
        System.out.println("Non player: " + Name + "Sucessfully added to list.");
        System.out.println("******************************************************");
      }

    /**
     *
     * @param Non_Player
     * @param ID
     */
    public static void editNonPlayer(ArrayList<Non_Player> Non_Player, int ID)
      {
        //create scanner to accept user input
        Scanner NonPlayers = new Scanner(System.in);

        //Input Validation variables
        Boolean check;
        String temp;
        String input;

        //Non Player Member form
        System.out.println("Edit Non Player Member, ID: " + ID);
        System.out.println("Input new value to edit or leave blank");
        System.out.println("******************************************************");
        System.out.print("Name (Current: " + Non_Player.get(ID).getName() + ") ");
        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setName(input);
          }

        System.out.print("Address(Current :" + Non_Player.get(ID).getAddress() + ") ");

        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setAddress(input);
          }

        System.out.print("PostCode(Current :" + Non_Player.get(ID).getPostCode() + ") ");

        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setPostCode(input);
          }

        do
          {

            System.out.print("SRU Number (Current :" + Non_Player.get(ID).getSRU_Number() + ")  ");
            temp = (NonPlayers.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));
        if (!temp.equals(""))
          {
            Non_Player.get(ID).setSRU_Number(Integer.parseInt(temp));
          }

        System.out.print("Date of Birth (DD/MM/YYYY)(Current :" + Non_Player.get(ID).getDateOfBirth() + ") ");
        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setDateOfBirth(temp);
          }

        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setTelNum(input);
          }

        do
          {

            System.out.print("Mobile Number: " + Non_Player.get(ID).getMobNum() + " ");
            temp = (NonPlayers.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));

        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setMobNum(input);
          }

        System.out.print("Email Address: " + Non_Player.get(ID).getEmail() + " ");
        if (NonPlayers.hasNextLine() && !(input = NonPlayers.nextLine()).isEmpty())
          {
            Non_Player.get(ID).setEmail(input);
          }

        //Non_Non_Non_Player.add(new Non_Player(Name, Address, PostCode, SRU, DOB, TelNum, MobNum, Email));
        System.out.println("Non player: " + Non_Player.get(ID).getName() + "Sucessfully Updated!");
        System.out.println("******************************************************");
      }

    /**
     *
     * @param Member
     * @param MemberClass
     * @param ID
     */
    public static void DeleteMember(ArrayList<?> Member, String MemberClass, int ID)
      {
        try
          {
            if (!Member.isEmpty())
              {
                switch (MemberClass)
                  {
                    case "Player":
                        ArrayList<Player> Players = new ArrayList();
                        Players = (ArrayList<Player>) Member;
                        Players.remove(ID);
                        System.out.println("Sucessefully Removed " + MemberClass + " ID: " + ID);
                        break;

                    case "Junior":
                        ArrayList<Junior> Junior = new ArrayList();
                        Junior = (ArrayList<Junior>) Member;
                        Junior.remove(ID);
                        System.out.println("Sucessefully Removed " + MemberClass + " ID: " + ID);
                        break;

                    case "Non_Player":
                        ArrayList<Non_Player> Non_Player = new ArrayList();
                        Non_Player = (ArrayList<Non_Player>) Member;
                        Non_Player.remove(ID);
                        System.out.println("Sucessefully Removed " + MemberClass + " ID: " + ID);
                        break;

                    default:
                        System.out.println("Only Member classes allowed!");
                        break;

                  }
              } else if (Member.isEmpty())
              {
                System.out.println("Item doesn't exist, Please select another ID");
              }
          } catch (IndexOutOfBoundsException e)
          {
            System.out.println("Item doesn't exist, Please select another ID");
          }

      }
}
