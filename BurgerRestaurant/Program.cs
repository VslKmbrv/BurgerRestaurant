using System;
using System.Collections.Generic;

public class Restaurant
{
    private List<Burger> menu;
    private MainChef chef;

    public Restaurant()
    {
        menu = new List<Burger>();
        chef = new MainChef();
    }

    public void AddBurgerToMenu(Burger burger)
    {
        menu.Add(burger);
    }

    public void PrintMenu()
    {
        Console.WriteLine("Menu:");
        foreach (Burger burger in menu)
        {
            Console.WriteLine($"{burger.Name} - {burger.Price} leva");
        }
    }

    public void CookBurger(string burgerName)
    {
        Burger burgerToCook = menu.Find(x => x.Name == burgerName);
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

        // Print the menu
        restaurant.PrintMenu();

        // Order a burger
        Console.WriteLine("Please choose what burger you want to order:");
        string burgerName = Console.ReadLine();
        restaurant.CookBurger(burgerName);

    }
}