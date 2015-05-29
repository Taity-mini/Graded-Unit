package gradedunit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: FileOperations
 * Description:
 * " The file operations class handles all the reading and writing of object Array-list data within the program"
 *   All the Member(Player,Junior,Non-Player) , games and training classes 
 *   are written(saved) to files and read from files within this class.
 *   These classes are all serialisable so file handling is a lot easier since there are lot information deal with
 *   compared to the .CSV format.
 *  
 *   The read and write methods both have try-catch blocks implemented along-side
 *   additional error checking to prevent any bugs/error from crashing whole program.
 * 
 * "
 **/  
public class FileOperations
{

    /**
     *
     * @param Member
     * @param FileName
     * @param Folder
     * @return
     * @throws IOException
     * Reading in Files
     * Works by passing in ArrayList, followed by filename and folder
     * Returns Array-list from file based on parameters
     */
    
    public static ArrayList<?> ReadObjects(ArrayList<?> Member, String FileName, String Folder) throws IOException
      {
        System.out.println("Reading Objects from file..");

        File dir = new File(Folder);

        File myFile = new File(dir + "//" + FileName + ".dat");
        try
          {
            if (myFile.exists())
              {
                FileInputStream fis = new FileInputStream(myFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                //Based on filename, switch to correct arraylist to return
                switch (FileName)
                  {
                    case "Player":
                        Member = (ArrayList<Player>) ois.readObject();
                        System.out.println(myFile + " ,Successfully loaded");
                        break;
                    case "Junior":
                        Member = (ArrayList<Junior>) ois.readObject();
                        System.out.println(myFile + " ,Successfully loaded");
                        break;
                    case "Non_Player":
                        Member = (ArrayList<Non_Player>) ois.readObject();
                        System.out.println(myFile + " ,Successfully loaded");
                        break;
                    case "Games":
                        Member = (ArrayList<Game>) ois.readObject();
                        System.out.println(myFile + " ,Successfully loaded");
                        break;
                    case "Profiles":
                        Member = (ArrayList<ProfileTemplate>) ois.readObject();
                        System.out.println(myFile + " ,Successfully loaded");
                        break;
                        
                     case "Training":
                        Member = (ArrayList <Training>) ois.readObject();
                        System.out.println(myFile + " ,Successfully loaded");
                        break;
                 //if file exisits but not used by program then display this message:
                    default:
                        System.out.println("Incorrect Filename, try again");
                        break;
                  }

                ois.close();
                fis.close();
              } else
              {
                System.out.println("File doesn't exist");
              }
           //Catch blocks 
          }
            catch(ObjectStreamException ex) {
                System.err.println("An ObjectStreamException was caught!");
       
		}
          catch (FileNotFoundException | ClassNotFoundException e)
          {
            System.out.println("File/Class Not found");
          } catch (IOException e)
          {
              System.out.println("Reading File failed, File maybe corrupt.");
          }
          
        //If all succesfull then return Arraylist values to used in program
        return Member;
      }

  
    //

    /**
     *
     * @param Member
     * @param FileName
     * @param folder
     * Writing to file Operations
     * Works by passing in Arraylist (Parameter is generic), filename and folder
     * Filename and directory are passed to the FileOutputStream
     * FileOutputStream is then passed Object output stream
     * Arraylist is passed to the object output stream to be written
     * 
     * 
     */
        public static void WriteObjects(ArrayList<?> Member, String FileName, String folder)
      {
        try
          {
            //check if directory exists, if not then create it!
            File dir = new File(folder);
            if (!dir.exists())
              {
                if (dir.mkdir())
                  {
                    System.out.println("Directory is created");
                  } else
                  {
                    System.out.println("Failed to create directory");
                  }
              }
            //Pass in file name and directory to create file path
            FileOutputStream fs = new FileOutputStream(dir + "//" + FileName + ".dat");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(Member); // write Member to ObjectOutputStream
            os.close();
            //Success! Object written to file.
            System.out.println("/"+ dir + "/" + FileName + ".dat Successfully Saved"  );

          } catch (FileNotFoundException e)
          {
            e.printStackTrace();
          } catch (IOException e)
          {
            e.printStackTrace();
          }

      }
   
    /**
     *
     * @param file
     * @param folder
     * @return
     * This method checks if an file Exists in the /files folder then returns a boolean value

     */
        public static boolean fileExists(String file,String folder)
      {
       File myFile = new File(folder + "//" + file + ".dat");
       boolean check = myFile.exists();
       return check;
      }
    
 

}
