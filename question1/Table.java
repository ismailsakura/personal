package question1;

public class Table {
    private int [][]values;
    public Table(int rows, int columns){
        values= new int[rows][columns];

    }
    public void set(int i, int j, int n){
        values[i][j]=n;

    }
    public double neighbourAverage(int row,int column){
        int numberofRows=values.length;
        int numberofColumns=values[0].length;
        int numberofNeighbour=0;
        int sumofNeighbour=0;
        if(row -1 >=0 && column -1 >=0){
            sumofNeighbour=sumofNeighbour+values[row-1][column-1];
            numberofNeighbour=numberofNeighbour+1;
        }
        if(row-1 >=0 && column == column){
            sumofNeighbour=sumofNeighbour+values[row-1][column];
            numberofNeighbour=numberofNeighbour+1;
        }

        if(row-1 >=0 && column+1<numberofColumns){
            sumofNeighbour=sumofNeighbour+values[row-1][column+1];
            numberofNeighbour=numberofNeighbour+1;
        }

        if(row==row && column-1>=0){
            sumofNeighbour=sumofNeighbour+values[row][column-1];
            numberofNeighbour=numberofNeighbour+1;

        }
        if(row==row && column+1< numberofColumns){
            sumofNeighbour=sumofNeighbour+values[row][column+1];
            numberofNeighbour=numberofNeighbour+1;
        }
        if(row+1<numberofRows && column-1>=0){
            sumofNeighbour=sumofNeighbour+ values[row+1][column-1];

        }
        if(row+1<numberofRows && column==column){
            sumofNeighbour=sumofNeighbour+values[row+1][column];
            numberofNeighbour=numberofNeighbour+1;

        }
        if(row+1<numberofRows && column+1<numberofColumns){
            sumofNeighbour=sumofNeighbour+values[row+1][column+1];
            numberofNeighbour=numberofNeighbour+1;
        }
        return (double) sumofNeighbour/numberofNeighbour;
    }

}
