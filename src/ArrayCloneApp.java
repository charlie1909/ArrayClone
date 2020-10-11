public class ArrayCloneApp {


    int[][] original = new int[10][5];

    public int[][] appClone(){
        int [][] backup = new int[10][5];
        for(int i = 0; i < original.length; i++){
            backup[i] = original[i].clone();
            //we use clone as if not used, if origin al data changes then the backup data also changes,
            // clone creates a single individual instance of the data that will not change if original changes
        }
        return backup;
    }
}
