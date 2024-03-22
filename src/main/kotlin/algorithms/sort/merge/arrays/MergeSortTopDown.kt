package algorithms.sort.merge.arrays

class MergeSortTopDown: MergeSort() {


    override fun sort(arr: IntArray, left: Int, right: Int) {
        if (left < right) {
            val mid = (right - left) / 2 + left
            sort(arr, left, mid)
            sort(arr, mid + 1, right)
            merge(arr, left, mid, right) //O(N)
        }
    }

}
