/**
 * This program takes Tee shirt orders for a Tee shirt company and 
 * creates an order number and displays the requested order information 
 * of size, color, custom slogan, and price dependent on size
 * @author De' Vante Valmont
 * @version 1.1.1
 * @since 2023-02-11
 */
public class Valmont_Lab04 {

    //This is the the driver of the program which begins with the main method
    public static void main(String[] args) {    
      //These initialize TeeShirt objects for use   
      TeeShirt tee1 = new TeeShirt();
      TeeShirt tee2 = new TeeShirt();
      //These initialize CustomTee objects for use  
      CustomTee tee3 = new CustomTee();;
      CustomTee tee4 = new CustomTee();
      //These methods call each mutator method for the tee1 object to set attributes
      tee1.setOrderNumber(100);
      tee1.setSize("XXL");
      tee1.setColor("blue");
      //These methods call each mutator method for the tee2 object to set attributes  
      tee2.setOrderNumber(101);
      tee2.setSize("S");
      tee2.setColor("gray");
      //These methods call each mutator method for the tee3 object to set attributes
      tee3.setOrderNumber(102);
      tee3.setSize("L");
      tee3.setColor("red");
      tee3.setSlogan("Born to have fun");
      //These methods call each mutator method for the tee4 object to set attributes
      tee4.setOrderNumber(104);
      tee4.setSize("XXXL");
      tee4.setColor("black");
      tee4.setSlogan("Wilson for Mayor");
      //This method call displays the order, description, and price of the tee1 object
      display(tee1);
      //This method call displays the order, description, and price of the tee2 object
      display(tee2);
      //This method call displays the order, description, custom slogan and price of the tee3 object
      displayCustomData(tee3);
      //This method call displays the order, description, custom slogan and price of the tee4 object
      displayCustomData(tee4);
   }
   /**
    * *function name: display()
    * @param tee this is the variable name for TeeShirt objects
    * this method displays ordernumber, description, and price of TeeShirt to user
    */
   public static void display(TeeShirt tee)
   {
      System.out.println("Order #" + tee.getOrderNumber());
      System.out.println("     Description: " + tee.getSize() +
         " " + tee.getColor());
      System.out.println("     Price: $" + tee.getPrice());
   }
   /**
    * *function name: displayCustomData()
    * @param tee this is the variable name for CustomTee objects
    * this method displays ordernumber, description, and price of TeeShirt to user
    * by calling display() with the current CustomTee object
    * then displays the slogan to the user. 
    */
   public static void displayCustomData(CustomTee tee)
   {
      display(tee);
      System.out.println("     Slogan: " + tee.getSlogan());
   }
}
/**
 * this TeeShirt class is the parent class of the CustomTee class. 
 * there are 4 attributes to this class to set and get for Teeshirt objects.
 * @param (int) represents the ordernumber assigned of a Teeshirt object
 * @param (String) size represnets the size of a TeeShirt object
 * @param (String) color represents the color of a TeeShirt object
 * @param (double) price represents the price associated with a TeeShirt object
  */
class TeeShirt
{
   //the following are attributes intialized for Teeshirt objects
   private int orderNumber;
   private String size;
   private String color;
   private double price;

   /**
    * *function name: setOrderNumber()
    * this method is the mutator method for the orderNumber attribute
    * @param num this is the variable name for the order number being assigned to TeeShirt objects
    */
   public void setOrderNumber(int num)
   {
       orderNumber = num; 
   }
   /**
    * *function name: setSize()
    * this is the mutuator method for the size attribute
    * @param sz this is the variable name for the size being asssigned to TeeShirt objects
    */
   public void setSize(String sz)
   {
       size = sz; 
       //this if else block checks the assigned size of the object then assigns the price as neccessary. 
       if (size.equals("XXL") || size.equals("XXXL")){
            price = 22.99;
       }
       else{
            price = 19.99;
       }
   }
   /**
    * *function name: setColor()
    * this is the mutator method for the color attribute
    * @param color this is the variable name for the color being assgined to TeeShirt objects.
    */
   public void setColor(String color)
   {
       this.color = color; 
   }
   /**
    * *function name: getOrderNumber()
    * this is the accessor method for orderNumber object attribute
    * @return (int) the orderNumber assigned
    */
   public int getOrderNumber()
   {
       return orderNumber; 
   }
   /**
    * *function name: getSize()
    * this is the accessor method for the size attritube.
    * @return (String) the size assigned
    */
   public String getSize()
   {
        return size; 
   }
   /**
    * *function name: getColor()
    * this is the accessor method for the color attribute
    * @return (string) the color assigned
    */
   public String getColor()
   {
       return color; 
   }
   /**
    * *function name: getPrice()
    * this is the accessor method for the price attribute. 
    * @return (double) the price assigned
    */
   public double getPrice()
   {
       return price; 
   }
}   
/**
 * The CustomTee class is a subclass of the TeeShirt class.
 * It has the set and get methods for the slogan attribute. 
 * @see Teeshirt
 */
class CustomTee extends TeeShirt
{
   //this is a private attribute to hold the slogan variable assigned to a CustomTee object.
    private String slogan;
   /**
    * *function name: setSlogan()
    *this is the mutator method for the slogan attribute.
    * @param slgn
    * 
   */ 
   public void setSlogan(String slgn)
   {
       slogan = slgn; 
   }
   /**
    * this is the accessor method for the slogan attribute. 
    * @return (string) the custom slogan
    */
   public String getSlogan()
   {
       return slogan; 
   }
}