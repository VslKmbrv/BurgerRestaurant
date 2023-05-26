using System;
using System.Collections.Generic;

public class Restaurant
{
    private List<Burger> menu;
    private List<Sauce> sauces;
    private MainChef chef;

    public Restaurant()
    {
        menu = new List<Burger>();
        chef = new MainChef();
        sauces = new List<Sauce>();
    }

    public void AddBurgerToMenu(Burger burger)
    {
        menu.Add(burger);
    }

    public void AddSauceToMenu(Sauce sauce)
    {
        sauces.Add(sauce);
    }

    public void PrintMenu()
    {
        Console.WriteLine("Menu:\n");
        foreach (Burger burger in menu)
        {
            Console.WriteLine($"{burger.Name} - {burger.Price} leva");
        }
    }

    public void PrintSauces()
    {
        Console.WriteLine("\nSauces:");
        foreach (Sauce sauce in sauces)
        {
            Console.WriteLine($"{sauce.Name}");
        }
    }

    public void CookBurger(string burgerName, string sauce)
    {
        Burger burgerToCook = menu.Find(x => x.Name == burgerName);
        Sauce sauceForBurger = sauces.Find(x => x.Name == sauce);
        if (burgerToCook != null)
        {
            chef.Cook(burgerToCook);
        }
        else
        {
            Console.WriteLine("Sorry, we don't have that burger on our menu.");
        }
    }
}

public class MainChef
{
    public void Cook(Burger burger)
    {
        Console.WriteLine($"Cooking {burger.Name}");
        for (int i = 0; i < 3; i++)
        {
            Console.WriteLine("...");
        }
        Console.WriteLine($"{burger.Name} is done");
    }
}

public class Burger
{
    public string Name { get; set; }
    public double Price { get; set; }

    public Burger(string name, double price)
    {
        Name = name;
        Price = price;
    }
}

public class Sauce
{
    public string Name { get; set; }

    public Sauce(string name)
    {
        Name = name;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        Restaurant restaurant = new Restaurant();

        // Create the burgers and add them to the menu
        Burger royalBurger = new Burger("Royal Burger", 10.99);
        Burger classicalBurger = new Burger("Classical Burger", 8.99);
        Burger veggieBurger = new Burger("Veggie Burger", 6.99);
        restaurant.AddBurgerToMenu(royalBurger);
        restaurant.AddBurgerToMenu(classicalBurger);
        restaurant.AddBurgerToMenu(veggieBurger);

        // Create the sauces and add them to the menu
        Sauce ketchup = new Sauce("Ketchup");
        Sauce garlicSauce = new Sauce("Garlic sauce");
        restaurant.AddSauceToMenu(ketchup);
        restaurant.AddSauceToMenu(garlicSauce);

        // Print the menu
        restaurant.PrintMenu();
        Console.WriteLine("\nPlease choose what burger you want to order:");
        string burgerName = Console.ReadLine();

        // Print sauces
        restaurant.PrintSauces();
        Console.WriteLine("\nPlease choose what sauce you want to order:");
        string sauce = Console.ReadLine();

        // Cook the burger
        restaurant.CookBurger(burgerName, sauce);
    }
}