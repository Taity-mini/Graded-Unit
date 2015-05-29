package gradedunit;

import java.io.Serializable;

/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: Category class
 * Description:
 * "The category class is used to create categories(objects) to be used in the player profile class
 *  These categories are used along side the skill set class in player profile
 *  Example:
 *  Category: Passing
 *      SkillSet Standard
 *      SkillSet Spin
 *      etc.."
 * 
 * 
 **/   
public class Category implements Serializable
{
    //Instance Variables
    private String Category;
    private String Comments;

    //Constructor Basic
    public Category(String Category)
      {
        this.Category = Category;
      }

    /**
     * Constructor  for both category and comment fields
     * @param Category
     * @param Comments
     */
    public Category(String Category, String Comments)
      {
        this.Category = Category;
        this.Comments = Comments;
      }
//Getters START
    /**
     *
     * @return
     */
    public String getCategory()
      {
        return Category;
      }

    /**
     *
     * @return
     */
    public String getComments()
      {
        return Comments;
      }
//Getters END
    
//Setters START    
    /**
     *
     * @param Category
     */
    public void setCategory(String Category)
      {
        this.Category = Category;
      }

    /**
     *
     * @param Comments
     */
    public void setComments(String Comments)
      {
        this.Comments = Comments;
      }
 //Setters END
}
