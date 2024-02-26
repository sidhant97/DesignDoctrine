public class PathFinder {
    public PathFinder() {
    }

    public void getPath(String mode) {
        PathFinderFactory.getPathFind(mode).getRoutePath();
    }


}