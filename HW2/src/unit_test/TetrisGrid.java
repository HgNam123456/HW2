package unit_test;

public class TetrisGrid {
    boolean[][] grid;

    public TetrisGrid(boolean[][] table) {
        grid = table;
    }
    public boolean[][] getGrid() {
        return grid;
    }

    public void clearRows() {
        for (int i = 0; i < grid.length; i++) {
            boolean fullRow = true;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == false) {
                    fullRow = false;
                    break;
                }
            }
            if (fullRow) {
                // Xóa dòng i và hạ các dòng bên trên xuống một cấp
                for (int k = i; k < grid.length-1; k++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        grid[k][j] = grid[k + 1][j];
                    }
                }
                // Thêm một dòng trống lên đỉnh của bảng
                for (int j = 0; j < grid[0].length; j++) {
                    grid[grid.length-1][j] = false;
                }
            }
        }
    }

}
