public interface PizzaBuilder {

    Pizza getPizza();


    void addMainIngredients();

    void addOptionalIngredients();

    void addExtra(String sweetcorn);
}
