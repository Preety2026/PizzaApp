import java.util.Scanner;

public class PizzaFactory
{
public static void main(String[]args)
{
	String PizzaName=null;
	int price=0;
	String user;
	Scanner sc=new Scanner(System.in);
	System.out.println("---------Please select one(Press the serial number)------");
	System.out.println("1.VEG");
	System.out.println("2.NON-VEG");
	int pizzatype=sc.nextInt();
	switch(pizzatype)
	{
	case 1:
	{
		System.out.println("---------Please select Pizza(Press the serial number)------");	
		
		System.out.println("1.DeluxeVeggie");
		System.out.println("2.Cheese and corn");
		System.out.println("3.Paneer Tikka");
		int pizzaname=sc.nextInt();
		
		System.out.println("--------Please select Crust(Press the serial number)------");
		System.out.println("1.New hand Tossed");
		System.out.println("2.Wheat thin crust");
		System.out.println("3.cheese Brust");
		System.out.println("4.Fresh pan pizza");
		int pizzacrust=sc.nextInt();
		
		System.out.println("-------Please Size of Pizza(Press the serial number)------");
		System.out.println("1.Regular");
		System.out.println("2.Medium");
		System.out.println("3.Large");
		int pizzasize=sc.nextInt();
		
		switch(pizzaname)
		{
		case 1:
		{
			PizzaName="Deluxe Veggie";
			switch(pizzasize)
			{
			case 1:price=150;
			break;
			case 2:price=200;
			break;
			case 3:price=325;
			break;
			}
		}
		break;
		case 2:
		{
			PizzaName="Cheese and corn";
			switch(pizzasize)
			{
			case 1:price=175;
			break;
			case 2:price=375;
			break;
			case 3:price=475;
			break;
			}
		}
		break;
		case 3:
		{
			PizzaName="Panner Tikka";
			switch(pizzasize)
			{
			case 1:price=160;
			break;
			case 2:price=290;
			break;
			case 3:price=340;
			}
		}
		break;
		}
		System.out.println("-------Please select topping(Press the serial number)-------");
		System.out.println("1.Black olive");
		System.out.println("2.Capsicum");
		System.out.println("3.Panner");
		System.out.println("4.Mushroom");
		System.out.println("5.Fresh tomato");
		System.out.println("6.No I Don't want to add topping");
		int pizzatopping=sc.nextInt();
		switch(pizzatopping)
		{
		case 1:price=price+20;
		break;
		case 2:price=price+25;
		break;
		case 3:price=price+35;
		break;
		case 4:price=price+30;
		break;
		case 5:price=price+10;
		break;
		}
	}break;
	case 2:
	{
		System.out.println("1.Non-Veg Supreme");
		System.out.println("2.Chicken Tikka");
		System.out.println("3.Pepper Barbecue Chicken");
		int pizzaname=sc.nextInt();
		
		System.out.println("------Please slect Pizza(Press the serial number)------");
		System.out.println("1.New hand Tossed");
		System.out.println("2.Wheat thin crust");
		System.out.println("3.cheese Brust;");
		System.out.println("4.Fresh panpizza");
		int pizzacrust=sc.nextInt();
		
		System.out.println("------Please Size of Pizza(Press the serial number)------");
		System.out.println("1.Regular");
		System.out.println("2.Medium");
		System.out.println("3.Large");
		int pizzasize=sc.nextInt();
		
		switch(pizzaname)
		{
		case 1:
		{
			PizzaName="Non-Veg Supreme";
			switch(pizzasize)
			{
			case 1:price=190;
			break;
			case 2:price=325;
			break;
			case 3:price=425;
			break;
			}
		}
		break;
		case 2:
		{
			PizzaName="Chicken Tikka";
			switch(pizzasize)
			{
			case 1:price=210;
			break;
			case 2:price=370;
			break;
			case 3:price=500;
			break;
			}
		}break;
		case 3:
		{
			PizzaName="Pepper Barbecue Chicken";
			switch(pizzasize)
			{
			case 1:price=220;
			break;
			case 2:price=380;
			break;
			case 3:price=525;
			break;
			}
		}break;
		}
		System.out.println("---------Please select toppings(Press the serial number)------");
		System.out.println("1.Chicken Tikka");
		System.out.println("2.Barbeque chicken");
		System.out.println("3.Grilled cgicken");
		System.out.println("4.no I dont want to add topping");
		int pizzatopping=sc.nextInt();
		switch(pizzatopping)
		{
		case 1:price=price+35;
		break;
		case 2:price=price+45;
		break;
		case 3:price=price+40;
		break;
		}
	}
		break;
	}
	System.out.println("------Extra Cheese(Enter yes/no)--------");
	System.out.println("1.Yes");
	System.out.println("2.No");
	int cheese=sc.nextInt();
	if(cheese==1)
	{
		price=price+35;
		
	}
	System.out.println("------Please select side(Press the serial number)-------");
	System.out.println("1.cold drink");
	System.out.println("2.Mousses cake");
	System.out.println("3.Both");
	System.out.println("4.No");
	int siden=sc.nextInt();
	if(siden==1)
		price=price+55;
	else if(siden==2)
	price=price+90;
	else if(siden==3)
		price=price+145;
	
	System.out.println("your"+PizzaName+"pizza is ordered and price="+price);
	
	
		}
      }
	
