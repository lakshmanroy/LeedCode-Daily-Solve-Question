class MaximumScoreAfterSplitting {
    public static int maxScore(String s) {
        int totalOnes = 0; // Count total number of '1's in the string
        // Count the total number of '1's
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }

        int leftZeros = 0, rightOnes = totalOnes, maxScore = 0;

        // Iterate through the string, calculating score for each split
        // We stop at s.length() - 1 to ensure we leave non-empty substrings
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            // Calculate score and update maxScore
            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }
        return maxScore; // Return the maximum score
    }
    public static void main(String[] args) {
        String s = "011101"; // Example string

        // Test case: print the maximum score after splitting the string
        System.out.println(maxScore(s)); // Output: 5
    }
}
