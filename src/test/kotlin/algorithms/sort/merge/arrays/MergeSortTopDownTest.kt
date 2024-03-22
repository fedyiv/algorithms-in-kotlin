package algorithms.sort.merge.arrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MergeSortTopDownTest {

    @Test
    fun sort() {
        val mergeSort = MergeSortTopDown()
        val arr = intArrayOf(5,4,3,2,1)
        val expectedSortedArr =  intArrayOf(1,2,3,4,5)

        mergeSort.sort(arr)
        arr.forEach { print("$it ") }

        assertArrayEquals(expectedSortedArr,arr)
    }

}
