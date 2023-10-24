public class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void addMainIngredients() {
        this.pizza.addIngredient("cheese");
        this.pizza.addIngredient("tomatoes");
        this.pizza.addIngredient("basil");
    }

    public void addOptionalIngredients() {
        this.pizza.addIngredient("sweetcorn");
    }

    public void addExtra(String ingredient) {
        this.pizza.addIngredient(ingredient);
    }

    public Pizza getPizza() {
        return this.pizza;
    }
}
