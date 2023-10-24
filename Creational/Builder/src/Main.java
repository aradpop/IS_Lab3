public class Main {
    public static void main(String[] args) {
        PizzaDirector director;

        director = new PizzaDirector();

        PizzaBuilder builder = new VegetarianPizzaBuilder();
        director.makeVegetarianPizza(builder);
        System.out.println(builder.getPizza().toString());

        PizzaBuilder builder2 = new MargheritaPizzaBuilder();
        director.makeMargheritaPizza(builder2);
        System.out.println(builder2.getPizza().toString());

        PizzaBuilder builder3 = new TunaPizzaBuilder();
        director.makeTunaPizza(builder3);
        System.out.println(builder3.getPizza().toString());
    }
}