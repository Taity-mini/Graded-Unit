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
 * ""
 * 
 **/  
public class FileOperations
{
    //Reading 

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
                switch (FileName)
                  {
                    case "Player":
                        Member = (ArrayList<Player>) ois.readObject();
                        System.out.println(myFile + " ,Sucessfully loaded");
                        break;
                    case "Junior":
                        Member = (ArrayList<Junior>) ois.readObject();
                        System.out.println(myFile + " ,Sucessfully loaded");
                        break;
                    case "Non_Player":
                        Member = (ArrayList<Non_Player>) ois.readObject();
                        System.out.println(myFile + " ,Sucessfully loaded");
                        break;
                    case "Games":
                        Member = (ArrayList<Game>) ois.readObject();
                        System.out.println(myFile + " ,Sucessfully loaded");
                        break;
                    case "Profiles":
                        Member = (ArrayList<ProfileTemplate>) ois.readObject();
                        System.out.println(myFile + " ,Sucessfully loaded");
                        break;
                        
                     case "Training":
                        Member = (ArrayList <Training>) ois.readObject();
                        System.out.println(myFile + " ,Sucessfully loaded");
                        break;
                 
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
          

        return Member;
      }

    public static void ReadCSV(ArrayList<?> Member, String FileName, String folder)
      {
          
      }

    //Writing to file Operations
    public static void WriteObjects(ArrayList<?> Member, String FileName, String folder)
      {
        try
          {
            //check 
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

            FileOutputStream fs = new FileOutputStream(dir + "//" + FileName + ".dat");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(Member); // write Member to ObjectOutputStream
            os.close();

            System.out.println("Objects sent to disk");

          } catch (FileNotFoundException e)
          {
            e.printStackTrace();
          } catch (IOException e)
          {
            e.printStackTrace();
          }

      }
    
    public static boolean fileExists(String file,String folder)
      {
       File myFile = new File(folder + "//" + file + ".dat");
       boolean check = myFile.exists();
       return check;
      }
    
 

}
