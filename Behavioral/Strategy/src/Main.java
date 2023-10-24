public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        System.out.println("10 + 20 = " + context.execute(10, 20));

        context.setStrategy(new ConcreteStrategySub());
        System.out.println("10 - 20 = " + context.execute(10, 20));

        context.setStrategy(new ConcreteStrategyMul());
        System.out.println("10 * 20 = " + context.execute(10, 20));
    }
}