package perfios;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinCash {


    public static void main(String[] args) {
        Map<Integer, Integer> cashStock = new LinkedHashMap<>();
        cashStock.put(2000, 10);
        cashStock.put(500, 10);
        cashStock.put(100, 10);
        cashStock.put(50, 10);

        int drawAmount = 50;
        int count = 0;

        int minCount = getCash(drawAmount, cashStock);
        System.out.println(minCount);
    }

    private static int getCash(int drawAmount, Map<Integer, Integer> cashStock) {
        if (drawAmount == 0) {
            return 0;
        }

        for (int note : cashStock.keySet()) {
            if (drawAmount >= note && note * cashStock.get(note) >= drawAmount) {
                cashStock.put(note,cashStock.get(note) -1); //reducing count from cash stock
                return 1 + getCash(drawAmount - note, cashStock);
            }
        }

        return 0;
    }
}
