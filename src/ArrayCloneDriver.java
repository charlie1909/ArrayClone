import java.util.Arrays;

public class ArrayCloneDriver {

    public static void main(String[] args){
        ArrayCloneApp app = new ArrayCloneApp();
        int [][] result = app.appClone();
        System.out.println(Arrays.deepToString(result));
    }
}
