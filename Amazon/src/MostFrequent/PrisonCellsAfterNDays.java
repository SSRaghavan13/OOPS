package MostFrequent;

import java.util.HashMap;
import java.util.Map;

public class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int len = cells.length;
        int row[] = new int[len];
        Map<Integer, Integer[]> map = new HashMap<>();
        for(int days = 0; days < N; days++) {
            row = new int[len];
            for(int i = 1; i < len - 1; i++) {
                if((cells[i - 1] == 0 && cells[i + 1] == 0) || (cells[i - 1] == 1 && cells[i + 1] == 1))
                    row[i] = 1;
            }
            for(int n: row)
                System.out.print(n);
            System.out.println();
        }
        return row;
    }

    public static void main(String[] args) {
        PrisonCellsAfterNDays prison = new PrisonCellsAfterNDays();
        prison.prisonAfterNDays(new int[] {0,1,0,1,1,0,0,1}, 7);
    }
}