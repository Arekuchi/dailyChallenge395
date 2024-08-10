
import java.util.ArrayList;



public class main {
    public static void main(String[] args) { int[] nonogramLine = {0,1,1,1,1,1,0,1,1,1,1,0,1,1,1}; consecutiveCounts(nonogramLine); }

    static void consecutiveCounts(int[] line) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        int length = 0;

        for(int i = 0; i < line.length; i++) {
            if(line[i] == 1) {
                length++;
            } else {
                lengthList.add(length);
                length = 0;
            }
        }
        lengthList.add(length);
        lengthList.removeIf(n -> (n == 0));

        System.out.println(lengthList);
    }
    }