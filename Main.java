import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
	    String[] ing = {"Chicken", "Water", "Salt", "Grease", "Hydrodyingthings"};
        SoupCan can = new SoupCan(10, 2, "Campbells", 110, 240, 6,ing);
        //waiting right here
        System.out.println(can.getDiameter());
        System.out.println(can.getBrand());
        System.out.println(Arrays.toString(can.getIngredients()));
        for (String n: can.getIngredients())
        {
            System.out.println(n);
        }

        NutritionLabel label = new NutritionLabel(10,15,124,ing);


        can.Open();
        if(can.isOpen())
        {
            System.out.println("The can is open!");
        }
        else
        {
            System.out.println("The can is closed!");
        }
        can.Close();
        if(can.isOpen())
        {
            System.out.println("The can is open!");
        }
        else
        {
            System.out.println("The can is closed!");
        }
    }
}
