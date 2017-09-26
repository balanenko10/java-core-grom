package lesson5;

import java.util.Arrays;

public class Exercise42 {
    public static void main(String[] args) {
        String[] names = {"Roman", "Andrii", "Julia", "Yuriy", "Victoria"};
        int[] balances = {500, 2000, 750, 1000, 1500};

        withdraw(names, balances, "Roman", 1000);
        System.out.println(Arrays.toString(balances));
    }

    public static int withdraw(String[] clients, int[] balances, String client, int amount) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }int result;
            if (balances[clientIndex] >= amount) {
                balances[clientIndex] -= amount;
                result = balances[clientIndex];
            } else {
                result = -1;
                System.out.println(-1);
            }
        return result;
        }
    }
