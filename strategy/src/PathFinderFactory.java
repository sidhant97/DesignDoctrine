import strategy.NavigationStrategy;
import strategy.NavigationStrategyByBus;
import strategy.NavigationStrategyByCar;
import strategy.NavigationStrategyByWalk;

public class PathFinderFactory {

    public static NavigationStrategy getPathFind(String mode) {
        switch (VALID_MODE.valueOf(mode).name()) {
            case "CAR":
                return new NavigationStrategyByCar();
            case "BUS":
                return new NavigationStrategyByBus();
            case "WALK":
                return new NavigationStrategyByWalk();
            default:
                return new NavigationStrategyByWalk();
        }
    }

    private enum VALID_MODE {BUS, CAR, WALK}
}
