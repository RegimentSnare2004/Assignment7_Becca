public class Problem4 {

    public static void main(String[] args){

        int[][] input1 = {
                {0,1,0,0},
                {1,0,1,0},
                {0,1,0,1},
                {0,0,1,0}
        };

        int[][] input2 = {
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1},
                {0,1,0,0}
        };

        System.out.println("Input 1: ");
        if(isGraphDirected(input1)){
            System.out.println("The matrix represents a directed graph.");
        }
        else{
            System.out.println("The matrix represents an undirected graph.");
        }

        System.out.println("Input 2: ");
        if(isGraphDirected(input2)){
            System.out.println("The matrix represents a directed graph.");
        }
        else{
            System.out.println("The matrix represents an undirected graph.");
        }

    }

    public static boolean isGraphDirected(int[][] input){
        boolean result = false;
        int n = input.length;

        for(int[] row: input){
            if(row.length != n){
                System.out.println("invalid input");
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(input[i][j] != 0 && input[i][j] != 1){
                    System.out.println("invalid input");

                }
                if(input[i][j] != input[j][i]){
                    return true;
                }
            }
        }




        return result;
    }
}
