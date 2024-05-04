package unit_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tetrisTest {
    @Test
    public void main() {
        boolean[][] table=new boolean[][]{
                {true,true,true},
                {true,true,false},
                {true,true,true},
                {false,true,true},
                {true,false,false},
                {false,false,false},
                {false,false,false},
        };
        TetrisGrid TG=new TetrisGrid(table);
        TG.clearRows();
        boolean[][]grid=TG.getGrid();
        boolean[][] trueTable=new boolean[][]{
                {true,true,false},
                {false,true,true},
                {true,false,false},
                {false,false,false},
                {false,false,false},
                {false,false,false},
                {false,false,false}
        };
        assertEquals(trueTable,grid);
    }

}