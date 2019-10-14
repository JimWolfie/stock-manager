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
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
    }
    
    /**
     * Find Product 
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
     * numberInStock 
     * @param int id specified by the calling object
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
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for (Product s : stock )
        {
            System.out.println(s.toString());
        }
    }

}
