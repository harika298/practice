package java.org.cars.example;

public class bracket {
    public static int minSwapsToBalance(String s) {
        // Initial checks
        int n = s.length();
        if (n % 2 != 0) {
            return -1;
        }

        int balance = 0;
        int imbalance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance += 1;
            } else { // ch == ')'
                balance -= 1;
            }

            // Whenever balance is negative, we have an imbalance
            if (balance < 0) {
                imbalance += 1;
                balance += 1; // fix the imbalance temporarily
            }
        }

        // If after fixing all temporary imbalances, balance is not zero
        if (balance != 0) {
            return -1;
        }

        // Each swap can correct two imbalances
        return (imbalance + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(minSwapsToBalance("()))(("));  // Output should be 2
        System.out.println(minSwapsToBalance("((())"));   // Output should be -1 (impossible to balance)
        System.out.println(minSwapsToBalance("(()"));     // Output should be 1
    }
}


