
    public class MultiDimensionalArray {
        public static void main(String[] args) {
            // Declare and initialize a 2D array with 3 rows and 4 columns
            int[][] grid = new int[3][4];

            // Assign values to the elements
            grid[0][0] = 1;
            grid[0][1] = 2;
            grid[0][2] = 3;
            grid[0][3] = 4;

            grid[1][0] = 5;
            grid[1][1] = 6;
            grid[1][2] = 7;
            grid[1][3] = 8;

            grid[2][0] = 9;
            grid[2][1] = 10;
            grid[2][2] = 11;
            grid[2][3] = 12;

            // Access and print elements of the 2D array
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
