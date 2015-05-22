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
 **/   
public class Category implements Serializable
{
    private String Category;
    private String Comments;

    public Category(String Category)
      {
        this.Category = Category;
      }

    /**
     *
     * @param Category
     * @param Comments
     */
    public Category(String Category, String Comments)
      {
        this.Category = Category;
        this.Comments = Comments;
      }

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
 
}
