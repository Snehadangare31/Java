import java.util.*;

public class KMeans {
    private static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double distance(Point other) {
            return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of clusters (k)
        System.out.print("Enter the number of clusters (k): ");
        int k = scanner.nextInt();

        // Input number of data points
        System.out.print("Enter the number of data points: ");
        int n = scanner.nextInt();

        // Input data points
        List<Point> points = new ArrayList<>();
        System.out.println("Enter the data points (x y):");
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points.add(new Point(x, y));
        }

        // Initialize centroids randomly
        List<Point> centroids = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            centroids.add(points.get(random.nextInt(points.size())));
        }

        Map<Point, List<Point>> clusters = null;
        boolean convergence = false;

        while (!convergence) {
            clusters = new HashMap<>();

            // Initialize clusters
            for (Point centroid : centroids) {
                clusters.put(centroid, new ArrayList<>());
            }

            // Assign points to the nearest centroid
            for (Point point : points) {
                Point nearestCentroid = centroids.get(0);
                double minDistance = point.distance(nearestCentroid);

                for (Point centroid : centroids) {
                    double distance = point.distance(centroid);
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestCentroid = centroid;
                    }
                }

                clusters.get(nearestCentroid).add(point);
            }

            // Update centroids
            List<Point> newCentroids = new ArrayList<>();
            for (Point centroid : centroids) {
                List<Point> clusterPoints = clusters.get(centroid);
                if (clusterPoints.isEmpty()) {
                    newCentroids.add(centroid);
                    continue;
                }
                double sumX = 0, sumY = 0;
                for (Point p : clusterPoints) {
                    sumX += p.x;
                    sumY += p.y;
                }
                newCentroids.add(new Point(sumX / clusterPoints.size(), sumY / clusterPoints.size()));
            }

            // Check for convergence
            convergence = centroids.equals(newCentroids);
            centroids = newCentroids;
        }

        // Output clusters
        System.out.println("Clusters:");
        for (Map.Entry<Point, List<Point>> entry : clusters.entrySet()) {
            System.out.println("Centroid: " + entry.getKey());
            System.out.println("Points: " + entry.getValue());
        }

        // Calculate Mean Squared Error (MSE)
        double mse = 0.0;
        for (Map.Entry<Point, List<Point>> entry : clusters.entrySet()) {
            Point centroid = entry.getKey();
            for (Point point : entry.getValue()) {
                mse += Math.pow(point.distance(centroid), 2);
            }
        }
        mse /= n;
        System.out.println("Mean Squared Error (MSE): " + mse);

        scanner.close();
    }
}
