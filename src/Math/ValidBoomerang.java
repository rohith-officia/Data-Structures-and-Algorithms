package Math;

public class ValidBoomerang {

    // Method to check if 3 points form a valid boomerang
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        // Check if any two points are identical
        if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
            return false;
        }

        // Check if points are not collinear
        return (y2 - y1) * (x3 - x1) != (y3 - y1) * (x2 - x1);
    }

    // Main method for testing
    public static void main(String[] args) {
        ValidBoomerang vb = new ValidBoomerang();

        int[][] points1 = {{1, 1}, {2, 3}, {3, 2}};
        System.out.println(vb.isBoomerang(points1)); // true

        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}};
        System.out.println(vb.isBoomerang(points2)); // false

        int[][] points3 = {{1, 1}, {1, 1}, {2, 3}};
        System.out.println(vb.isBoomerang(points3)); // false
    }
}
