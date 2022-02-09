public class Main 
{

    public static void main(String[] args) 
    {
	double itemPrice = 12.99;
    double shipCost = itemPrice * 0.02;
    double totalPrice = itemPrice + shipCost;
    if (itemPrice >= 100)
    {
        System.out.println("The price of your item is $" + itemPrice + " and the shipping is free!");
    }
    else
    {
        System.out.println("The price of your item is $" + itemPrice + " and the shipping is $" + shipCost + " so your total is $" + totalPrice);
    }
    }
}
