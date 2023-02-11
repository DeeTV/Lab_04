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
   public static void display(TeeShirt tee)
   {
      System.out.println("Order #" + tee.getOrderNumber());
      System.out.println("     Description: " + tee.getSize() +
         " " + tee.getColor());
      System.out.println("     Price: $" + tee.getPrice());
   }
   public static void displayCustomData(CustomTee tee)
   {
      display(tee);
      System.out.println("     Slogan: " + tee.getSlogan());
   }
}
class CustomTee extends TeeShirt
{
   private String slogan;
   public void setSlogan(String slgn)
   {
       slogan = slgn; 
   }
   public String getSlogan()
   {
       return slogan; 
   }
}
class TeeShirt
{
   private int orderNumber;
   private String size;
   private String color;
   private double price;

   public void setOrderNumber(int num)
   {
       orderNumber = num; 
   }
   public void setSize(String sz)
   {
       size = sz; 
       if (size.equals("XXL") || size.equals("XXXL")){
            price = 22.99;
       }
       else{
            price = 19.99;
       }
   }
   public void setColor(String color)
   {
       this.color = color; 
   }
   /**
    * *function name: getOrderNumber()
    * @return (int) orderNumber
    * accesor method for orderNumber object attribute
    */
   public int getOrderNumber()
   {
       return orderNumber; 
   }
   public String getSize()
   {
        return size; 
   }
   public String getColor()
   {
       return color; 
   }
   public double getPrice()
   {
       return price; 
   }
}