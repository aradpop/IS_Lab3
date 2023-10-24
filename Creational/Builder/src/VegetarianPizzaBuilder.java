public class VegetarianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VegetarianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void addMainIngredients() {
        this.pizza.addIngredient("cheese");
        this.pizza.addIngredient("tomatoes");
    }

    public void addOptionalIngredients() {
        this.pizza.addIngredient("onions");
    }

    public void addExtra(String ingredient) {
        this.pizza.addIngredient(ingredient);
    }

    public Pizza getPizza() {
        return this.pizza;
    }
}
