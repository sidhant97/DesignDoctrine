package strategy;

public class NavigationStrategyByCar implements NavigationStrategy {
    @Override
    public void getRoutePath() {
        System.out.println("By Car");
    }
}
