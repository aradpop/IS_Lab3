import java.util.ArrayList;

public class Pizza {
    private ArrayList<String> ingredients;

    public Pizza() {
        ingredients = new ArrayList<String>();
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String toString() {
        return "Pizza with " + ingredients.toString();
    }
}