class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sort1 = s.lowercase().toCharArray().sortedArray()
        val sort2 = t.lowercase().toCharArray().sortedArray()

        return sort1.contentEquals(sort2)

    }
}
