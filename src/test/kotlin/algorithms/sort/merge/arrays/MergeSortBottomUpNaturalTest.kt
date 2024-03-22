package algorithms.sort.merge.arrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MergeSortBottomUpNaturalTest {

    @Test
    fun sortSortedSequence() {
        val mergeSort = MergeSortBottomUpNatural()
        val arr = intArrayOf(1,2,3,4,5)
        val expectedSortedArr =  intArrayOf(1,2,3,4,5)



        mergeSort.sort(arr)
        arr.forEach { print("$it ") }

        assertArrayEquals(expectedSortedArr,arr)
    }

    @Test
    fun sortOddNumberOfsubsequences() {
        val mergeSort = MergeSortBottomUpNatural()
        val arr = intArrayOf(4,5,6,1,2,3,0)
        val expectedSortedArr =  intArrayOf(0,1,2,3,4,5,6)



        mergeSort.sort(arr)
        arr.forEach { print("$it ") }

        assertArrayEquals(expectedSortedArr,arr)
    }

    @Test
    fun sortSequenceWithSOrtedSubsequences() {
        val mergeSort = MergeSortBottomUpNatural()
        val arr = intArrayOf(4,5,6,1,2,8,9)
        val expectedSortedArr =  intArrayOf(1,2,4,5,6,8,9)



        mergeSort.sort(arr)
        arr.forEach { print("$it ") }

        assertArrayEquals(expectedSortedArr,arr)
    }

    @Test
    fun sortSequenceWithSOrtedLongerSubsequences() {
        val mergeSort = MergeSortBottomUpNatural()
        val arr = intArrayOf(3,2,1,6,5,4,9,7,8,12,11,10)
        val expectedSortedArr =  intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12)



        mergeSort.sort(arr)
        arr.forEach { print("$it ") }

        assertArrayEquals(expectedSortedArr,arr)
    }
}
