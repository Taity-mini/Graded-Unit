package gradedunit;

import java.io.Serializable;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class Category implements Serializable
{
    private String Category;
    private String Comments;

    public Category(String Category)
      {
        this.Category = Category;
      }
    
     public Category(String Category, String Comments)
      {
        this.Category = Category;
        this.Comments = Comments;
      }

    public String getCategory()
      {
        return Category;
      }

    public String getComments()
      {
        return Comments;
      }

    public void setCategory(String Category)
      {
        this.Category = Category;
      }

    public void setComments(String Comments)
      {
        this.Comments = Comments;
      }
 
}
