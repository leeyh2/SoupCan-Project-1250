public class NutritionLabel
{
    private int calories;
    private int carbs;
    private int sugar;
    private String[] ingredients;



    public NutritionLabel(int calories, int carbs, int sugar, String[] ingredients)
    {
        this.calories = calories;
        this.carbs = carbs;
        this.sugar = sugar;
        //0x940 is the location of the new
        this.ingredients = new String[ingredients.length];
        for (int i = 0; i < ingredients.length; i++)
        {
            this.ingredients[i] = ingredients[i];
        }
    }
    public String[] getIngredients()
    {
        return ingredients;
    }
}
