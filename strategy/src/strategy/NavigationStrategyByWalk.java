package strategy;

public class NavigationStrategyByWalk implements NavigationStrategy {
    @Override
    public void getRoutePath() {
        System.out.println("By Walk");
    }
}
