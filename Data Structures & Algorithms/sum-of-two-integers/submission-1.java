 class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; // Carry is AND shifted left
            a = a ^ b;                // Sum without carry
            b = carry;                // Add the carry in next iteration
        }
        return a;
    }
}
