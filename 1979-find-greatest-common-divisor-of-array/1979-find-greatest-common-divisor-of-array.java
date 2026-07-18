import java.math.BigInteger;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        BigInteger small = BigInteger.valueOf(nums[0]);
        BigInteger big = BigInteger.valueOf(nums[nums.length-1]);
        return big.gcd(small).intValue();

    }
}