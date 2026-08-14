class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int count = 0;
        int mini = Integer.MAX_VALUE;

        for (int right = 0; right < blocks.length(); right++) {

            // Add the new character
            if (blocks.charAt(right) == 'W') {
                count++;
            }

            // Keep window size exactly k
            if (right - left + 1 > k) {
                if (blocks.charAt(left) == 'W') {
                    count--;
                }
                left++;
            }

            // Check window of size k
            if (right - left + 1 == k) {
                mini = Math.min(mini, count);
            }
        }

        return mini;
    }
}