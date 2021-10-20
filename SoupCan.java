public class SoupCan
{
    private double height;
    private double radius;
    private String brand;
    private boolean isOpen;
    private NutritionLabel label;
    private  static final double PI = 3.14159;

    public SoupCan(double height, double radius, String brand, int calories, int carbs, int sugar, String[] ingredients)
    {
        this.height = height;
        this.radius = radius;
        this.brand = brand;
        this.isOpen = false;
        label = new NutritionLabel(calories, carbs, sugar, ingredients);
    }
    public double calCircumference()
    {
        return getDiameter() * PI;
    }
    public double calVolume()
    {
        return PI * (radius * radius) * height;
    }
    public void Open()
    {
        isOpen = true;
    }
    public void Close()
    {
        isOpen = false;
    }
    public boolean isOpen()
    {
        return isOpen;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }
    public String[] getIngredients()
    {
        return label.getIngredients();
    }
    public String getBrand()
    {
        return this.brand.toUpperCase();
    }

}
