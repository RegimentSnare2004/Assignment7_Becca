public class Problem4 {

    public static void main(String[] args){

        int[][] input = {
                {0,1,0},
                {0,0,1},
                {1,0,0}
        };

        if(isGraphDirected(input)){
            System.out.println("The matrix represents a directed graph.");
        }
        else{
            System.out.println("The matrix does not represent a directed graph.");
        }

    }

    public static boolean isGraphDirected(int[][] input){
        boolean result = true;
        int n = input.length;

        for(int[] row: input){
            if(row.length != n){
                return false;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(input[i][j] != 0 && input[i][j] != 1){
                    return false;
                }
            }
        }


        return result;
    }
}
