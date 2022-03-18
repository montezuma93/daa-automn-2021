import java.util.ArrayList;
import java.util.List;

public class LatticePathCalculator {

    LatticePathCalculator() {

    }

    /**
     * Starting in the top left corner of a 2×2 grid,
     * and only being able to move to the right and down,
     * there are exactly 6 routes to the bottom right corner.
     **/
    public int calculatePathCombinations(int gridSizeX, int gridSizeY) {
        List<Path> paths = new ArrayList();
        Path initialPath = new Path(new ArrayList<>(List.of(new Point(0,0))));
        paths.add(initialPath);
        // [[(0,0)]]

        while(! areAllPathsAlreadyInDestination(paths, gridSizeX, gridSizeY)) {
            List<Path> newPaths = new ArrayList<>();
            for (Path path : paths) {
                newPaths.addAll(createNewPaths(path, gridSizeX, gridSizeY));
            }
            paths = newPaths;
        }
        return paths.size();
    }

    boolean areAllPathsAlreadyInDestination(List<Path> paths, int gridSizeX, int gridSizeY){
        for(Path path: paths) {
            List<Point> pointsInPath = path.getPointsInPath();
            Point lastPointInPath = pointsInPath.get(pointsInPath.size()-1);
            if(lastPointInPath.x != gridSizeX || lastPointInPath.y != gridSizeY) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param path Original path, which will be used to calculate new paths (go-right, go-down)
     * @return two new paths, resulting of given path, but just paths which are inside the grid
     * i.e. given path [(0,0)] will return List of [[(0,0), (1,0)], [(0,0), (0,1)]]
     * i.e. given path [(0,0), (1,0)] will return List of [[(0,0), (1,0), (2,0)], [(0,0), (1,0), (1,1)]]
     * i.e. dont ignore the borders of the grid: given path [(0,0), (1,0), (2,0)] will return List of [[(0,0), (1,0), (2,0), (2,1)]]
     */
    private List<Path> createNewPaths(Path path, int gridSizeX, int gridSizeY) {

        List<Path> newPaths = new ArrayList<>();
        // [(0,0)]
        List<Point> pointsInPath = path.getPointsInPath();
        // (0,0)
        Point lastPointInPath = pointsInPath.get(pointsInPath.size()-1);

        // [(0,0),(1,0)]
        if(lastPointInPath.x<gridSizeX) {
            List<Point> newPointsListRight = new ArrayList<>();
            newPointsListRight.addAll(pointsInPath);
            newPointsListRight.add(new Point(lastPointInPath.x + 1, lastPointInPath.y));
            Path pathGoRight = new Path(newPointsListRight);
            newPaths.add(pathGoRight);
        }

        // [(0,0),(0,1)]
        if(lastPointInPath.y <gridSizeY) {
            List<Point> newPointsListDown = new ArrayList<>();
            newPointsListDown.addAll(pointsInPath);
            newPointsListDown.add(new Point(lastPointInPath.x, lastPointInPath.y + 1));
            Path pathGoDown = new Path(newPointsListDown);
            newPaths.add(pathGoDown);
        }
        return newPaths;
    }

    public class Path {
        private List<Point> pointsInPath;
        Path(List<Point> pointsInPath) {
            this.pointsInPath = pointsInPath;
        }
        public List<Point> getPointsInPath(){
            return this.pointsInPath;
        }
    }

    public class Point {
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


}
