package edu.miracosta.cs113.change;

public class ChangeCalculator {
    static final int[] COINS = {25, 10, 5, 1};
    static final int Quarter = 0;
    static final int Dime = 1;
    static final int Nickel = 2;
    static final int Penny = 3;

    protected static String getCoinName(int coinValue) {
        switch (coinValue) {
            case 25: return "q ";
            case 10: return "d ";
            case 5: return "n ";
            default: return "p ";
        }
    }

    protected static String combinationToString(int quarter, int dime, int nickel, int penny) {
        int[] counts = new int[COINS.length];
        counts[Quarter] = quarter;
        counts[Dime] = dime;
        counts[Nickel] = nickel;
        counts[Penny] = penny;
        return combinationToString(counts);
    }

    protected static String combinationToString(int[] coinCounts) {
        StringBuilder combination = new StringBuilder();
        for (int i = 0; i < coinCounts.length; i++) {
            combination.append(String.valueOf(coinCounts[i]) + getCoinName(COINS[i]));
        }
        return combination.toString();
    }
}
