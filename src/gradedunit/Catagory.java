/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradedunit;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class Catagory
{
    private String Catagory;
    private String Comments;

    public Catagory(String Catagory)
      {
        this.Catagory = Catagory;
      }
    
     public Catagory(String Catagory, String Comments)
      {
        this.Catagory = Catagory;
        this.Comments = Comments;
      }

    public String getCatagory()
      {
        return Catagory;
      }

    public String getComments()
      {
        return Comments;
      }

    public void setCatagory(String Catagory)
      {
        this.Catagory = Catagory;
      }

    public void setComments(String Comments)
      {
        this.Comments = Comments;
      }

    
    
}
