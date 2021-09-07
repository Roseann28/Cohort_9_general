package WeekTwo;
public class Two {
    public int[] solve(int[]arrays){
        int temp;
        for (int j = 0; j < arrays.length; j++) {
            for (int k = j; k > 0; k--) {
                if (arrays[k] < arrays[k - 1]) {
                    temp = arrays[k];
                    arrays[k] = arrays[k - 1];
                    arrays[k - 1] = temp;
                }
            }
        }
        return arrays;

        }
    }