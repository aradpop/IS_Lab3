public class PizzaDirector {
    public PizzaDirector() {
    }

    public void makeVegetarianPizza(PizzaBuilder builder) {
        builder.addMainIngredients();
        builder.addOptionalIngredients();
        builder.addExtra("onions");
    }

    public void makeTunaPizza(PizzaBuilder builder) {
        builder.addMainIngredients();
        builder.addOptionalIngredients();
        builder.addExtra("tuna");
    }

    public void makeMargheritaPizza(PizzaBuilder builder) {
        builder.addMainIngredients();
        builder.addOptionalIngredients();
        builder.addExtra("cheese");
    }
}
