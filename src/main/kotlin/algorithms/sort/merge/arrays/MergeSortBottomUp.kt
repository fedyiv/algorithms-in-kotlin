package algorithms.sort.merge.arrays

import kotlin.math.min


class MergeSortBottomUp : MergeSort() {
    override fun sort(arr: IntArray, left: Int, right: Int) {
        var mergingSize = 1
        while (mergingSize < arr.size) {
            var currentLeft = 0
            while (currentLeft < arr.size - mergingSize) {
                val currentRight = min(
                    currentLeft + 2 * mergingSize - 1,
                    arr.size - 1
                )
                val currentMid = currentLeft + mergingSize - 1
                // O(2*mergingSize)
                merge(arr, currentLeft, currentMid, currentRight)
                currentLeft += 2 * mergingSize
            }
            mergingSize *= 2
        }
    }

}
