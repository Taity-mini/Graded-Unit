package gradedunit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
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
                        System.out.println(myFile + "Sucessfully loaded");
                        break;
                    case "Junior":
                        Member = (ArrayList<Junior>) ois.readObject();
                        break;
                    case "Non_Player":
                        Member = (ArrayList<Non_Player>) ois.readObject();
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
          } catch (FileNotFoundException e)
          {
            e.printStackTrace();
          } catch (IOException e)
          {
            e.printStackTrace();
          } catch (ClassNotFoundException e)
          {
            e.printStackTrace();
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
            os.writeObject(Member); // write MenuArray to ObjectOutputStream
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
    
 

}
