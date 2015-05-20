package gradedunit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class Registration
{

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
        int TelNum;
        int MobNum;
        String Email;

        //Additonal fields
        String nextOfKin;
        int nextOfKin_Tel;
        String doctor_Name;
        int doctor_Tel;
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

        do
          {
            System.out.print("Telephone Number: ");
            temp = (players.nextLine());
            check = InputValidation.isIntValid(temp);
          } while (check.equals(false));
        TelNum = Integer.parseInt(temp);

        do
          {

            System.out.print("Mobile Number: ");
            temp = (players.nextLine());
            check = InputValidation.isIntValid(temp);

          } while (check.equals(false));

        MobNum = Integer.parseInt(temp);;
        System.out.print("Email Address: ");
        Email = players.nextLine();

        System.out.println("Additional Fields below: ");
        System.out.print("Next of Kin - Name: ");
        nextOfKin = players.nextLine();
        do
          {

            System.out.print("Next of Kin - Telephone Number: ");
            temp = (players.nextLine());
            check = InputValidation.isIntValid(temp);

          } while (check.equals(false));

        nextOfKin_Tel = Integer.parseInt(temp);
        System.out.print("Doctor Name: ");
        doctor_Name = players.nextLine();
        do
          {

            System.out.print("Doctor Telephone: ");
            temp = (players.nextLine());
            check = InputValidation.isIntValid(temp);

          } while (check.equals(false));

        doctor_Tel = Integer.parseInt(temp);
        System.out.print("Known Health Issues: ");
        healthInfo = players.nextLine();
        System.out.print("Player position: ");
        player_Position = players.nextLine();

        //Add new registered player to player arraylist
        Player.add(new Player(Name, Address, PostCode, SRU, DOB, TelNum, MobNum, Email, nextOfKin, nextOfKin_Tel, doctor_Name, doctor_Tel, healthInfo, player_Position));
        System.out.println("Rugby player: " + Name + " ,Sucessfully added to list.");
        System.out.println("******************************************************");
      }

    public static void editPlayer(ArrayList<Player> Player, int ID)
      {
        //create scanner to accept user input
        Scanner players = new Scanner(System.in);

        //Input Validation variables
        Boolean check;
        String temp;
        String input;
        //Local variables used to store information of
        String Name;
        String Address;
        String PostCode;
        int SRU;
        String DOB;
        int TelNum;
        int MobNum;
        String Email;

        //Additonal fields
        String nextOfKin;
        int nextOfKin_Tel;
        String doctor_Name;
        int doctor_Tel;
        String healthInfo;
        String player_Position;

        //Player Member form
        System.out.println("Edit Rugby Players form, ID: " + ID);
        System.out.println("Input new value to edit or leave blank");
        System.out.println("******************************************************");
        System.out.print("Name (Current: " + Player.get(ID).getName() + ") ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {

            Player.get(ID).setName(input);
          }

        System.out.print("Address(Current :" + Player.get(ID).getAddress() + ") ");

        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setAddress(input);
          }

        System.out.print("PostCode(Current :" + Player.get(ID).getPostCode() + ") ");
        
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setPostCode(input);
          }

        do
          {

            System.out.print("SRU Number (Current :" + Player.get(ID).getSRU_Number() + ")  ");
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

        System.out.print("Date of Birth (DD/MM/YYYY)(Current :" + Player.get(ID).getDateOfBirth() + ") ");
       if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setDateOfBirth(temp);
          }

        do
          {
            System.out.print("Telephone Number (Current ");
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
            Player.get(ID).setTelNum(Integer.parseInt(temp));
          }

        do
          {

            System.out.print("Mobile Number: " + Player.get(ID).getMobNum() + " ");
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
            Player.get(ID).setMobNum(Integer.parseInt(temp));
          }

        System.out.print("Email Address: " + Player.get(ID).getEmail() + " ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setEmail(input);
          }
        System.out.println("Additional Fields below: ");
        System.out.print("Next of Kin - Name: " + Player.get(ID).getNextOfKin() + " ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setNextOfKin(input);
          }

        do
          {

            System.out.print("Next of Kin - Telephone Number: " + Player.get(ID).getNextOfKin_Tel() + " ");
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
            Player.get(ID).setNextOfKin_Tel(Integer.parseInt(temp));
          }

        System.out.print("Doctor Name: " + Player.get(ID).getDoctor_Name() + " ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setDoctor_Name(input);
          }

        do
          {

            System.out.print("Doctor Telephone: " + Player.get(ID).getDoctor_Tel() + " ");
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
            Player.get(ID).setDoctor_Tel(Integer.parseInt(temp));
          }

        System.out.print("Known Health Issues: " + Player.get(ID).getHealthInfo() + " ");
       if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setHealthInfo(input);
          }

        System.out.print("Player position: " + Player.get(ID).getPlayer_position() + " ");
        if (players.hasNextLine() && !(input = players.nextLine()).isEmpty())
          {
            Player.get(ID).setPlayer_position(input);
          }

        //Add new registered player to player arraylist
        //System.out.println("Rugby player: " + Name + " ,Sucessfully added to list.");
        System.out.println("******************************************************");
      }

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
        int TelNum;
        int MobNum;
        String Email;

        //Additional Fields
        String Guardian_Name;
        String Guardian_Relationship;
        String Guardian_Address;
        int Guardian_Tel;
        String Doc_Name;
        String Doc_Address;
        int Doc_Tel_Num;
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
        TelNum = Integer.parseInt(juniors.nextLine());
        System.out.print("Mobile Number: ");
        MobNum = Integer.parseInt(juniors.nextLine());
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
        Guardian_Tel = juniors.nextInt();
        System.out.print("Doctor Name: ");
        Doc_Name = juniors.nextLine();
        System.out.print("Doctor Telephone: ");
        Doc_Tel_Num = juniors.nextInt();
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
        int TelNum;
        int MobNum;
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
        TelNum = NonPlayers.nextInt();
        System.out.print("Mobile Number: ");
        MobNum = NonPlayers.nextInt();
        System.out.print("Email Address: ");
        Email = NonPlayers.nextLine();

        Non_Player.add(new Non_Player(Name, Address, PostCode, SRU, DOB, TelNum, MobNum, Email));
        System.out.println("Non player: " + Name + "Sucessfully added to list.");
        System.out.println("******************************************************");
      }

    private static void addMember(ArrayList<Member> Member)
      {
        //may use later on..

      }

}
