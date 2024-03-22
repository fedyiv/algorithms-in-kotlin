package algorithms.sort.merge.arrays

class MergeSortTopDownNaive {
    fun sort(arr: IntArray): IntArray {
        if(arr.size == 1)
            return arr

        val mid = arr.size / 2
        val left = arr.copyOfRange(0, mid)
        val right = arr.copyOfRange(mid, arr.size)
        val sortedLeft = sort(left)
        val sortedRight = sort(right)

        return merge(sortedLeft, sortedRight) //O(N)
    }

    private fun merge(left: IntArray, right: IntArray): IntArray {
        val result = IntArray(left.size + right.size)
        var leftIndex = 0
        var rightIndex = 0

        for (i in 0 until result.size) {

            if (leftIndex == left.size) {
                result[i] = right[rightIndex++]
                continue
            }
            if (rightIndex == right.size) {
                result[i] = left[leftIndex++]
                continue
            }
            result[i] = if (left[leftIndex] < right[rightIndex]) {
                left[leftIndex++]
            } else {
                right[rightIndex++]
            }

        }
        return result
    }
}
