import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Nicholas Lindgren 
 * @version 10/13/19
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * addProduct
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        
        if (findProduct(item.getID())==null ) //product isn't there
        {
            stock.add(item);
        }else {
            System.out.println("The item is already on the list");
        }    
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param int id - id specified by teh calling object
     * @param int amount - increasing quanity of found object by amount.
     */
  public void delivery(int id, int amount)
    {
      Product q = findProduct(id);
      if (q!= null)
      {
          q.increaseQuantity(amount);
      }
    }

    
    /**
     * findProduct  
     * @param int id - id specified by calling object
     * @return Returns Product object or null
     */
    public Product findProduct(int id)
    {
        
        for( Product p : stock )
        { 
            if (p.getID() == id)
            {
                return p;
            }
        }
        return null; 
    }
    /**
     * findProduct 
     * @param String name - name specified by calling object
     * @returns product with matching name or null
     */
    public Product findProduct(String name)
    {  
        for( Product p : stock )
        { 
            if (name.equals(p.getName()))
            {
                return p;
            }
        }
        return null;
    }


    
    /**
     * numberInStock 
     * @param int id -id specified by the calling object
     * @return int = quantity held by found product or 0 
     * if no product is found
     */
    
    public int numberInStock(int id)
    {
        Product q = findProduct(id);
        if (q!= null)
        {
            return q.getQuantity();
        }
        return 0;
    }

    /**
     * printProductDetails
     */
    public void printProductDetails()
    {
        for (Product s : stock )
        {
            System.out.println(s.toString());
        }
    }
    /**
     * printProductDetails
     * @param int culVal
     */
    public void printProductDetails(int culVal)
    {
        for (Product s : stock )
        {
            if (s.getQuantity() < culVal){
            System.out.println(s.toString());
        }
        }
    }


}
