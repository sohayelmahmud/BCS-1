public class Question10 {

    public static int[][] optimizeGrid(int[][] grid, int threshold) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] newGrid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > threshold) {
                    int sum = 0;
                    int count = 0;

                    if (i - 1 >= 0) {
                        sum += grid[i - 1][j];
                        count++;
                    }
                    if (i + 1 < rows) {
                        sum += grid[i + 1][j];
                        count++;
                    }
                    if (j - 1 >= 0) {
                        sum += grid[i][j - 1];
                        count++;
                    }
                    if (j + 1 < cols) {
                        sum += grid[i][j + 1];
                        count++;
                    }

                    newGrid[i][j] = sum / count;
                } else {
                    newGrid[i][j] = grid[i][j];
                }
            }
        }
        return newGrid;
    }

    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 120, 200, 150 },
                { 180, 250, 300 },
                { 170, 160, 140 }
        };
        int threshold = 200;

        System.out.println("Original Grid:");
        printGrid(grid);

        int[][] optimizedGrid = optimizeGrid(grid, threshold);

        System.out.println("\nOptimized Grid:");
        printGrid(optimizedGrid);
    }
}