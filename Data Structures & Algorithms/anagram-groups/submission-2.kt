class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        
        for ((currentIndex, num) in nums.withIndex()) {
            val complement = target - num
            
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, currentIndex)
            }
            
            map[num] = currentIndex
        }
        
        return intArrayOf()
    }
}
