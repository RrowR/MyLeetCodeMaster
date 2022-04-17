/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int value = 0;
        // value和别的值异或不影响
        for (int i = 0; i < nums.length; i++) {
            value ^= nums[i];
        }
        return value;
    }
}
// @lc code=end

