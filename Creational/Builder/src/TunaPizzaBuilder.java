public class TunaPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public TunaPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void addMainIngredients() {
        this.pizza.addIngredient("tuna");
        this.pizza.addIngredient("tomatoes");
        this.pizza.addIngredient("sweetcorn");
    }

    public void addOptionalIngredients() {
        this.pizza.addIngredient("cheese");
    }

    public void addExtra(String ingredient) {
        this.pizza.addIngredient(ingredient);
    }

    public Pizza getPizza() {
        return this.pizza;
    }
}
