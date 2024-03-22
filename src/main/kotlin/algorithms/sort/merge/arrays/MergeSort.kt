package algorithms.sort.merge.arrays

abstract class MergeSort {
    private lateinit var aux: IntArray
    fun sort(arr: IntArray) {
        aux = IntArray(arr.size)
        sort(arr, 0, arr.size - 1)
    }

    protected abstract fun sort(arr: IntArray, left: Int, right: Int)

    protected fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
        println("Merge: ${arr.contentToString()}, left : $left, mid: $mid, right: $right")

        for (i in left..right) {
            aux[i] = arr[i]
        }

        var leftIndex = left
        var rightIndex = mid + 1

        var index = left
        while (leftIndex <= mid && rightIndex <= right) {
            arr[index++] = if (aux[leftIndex] <= aux[rightIndex])
                aux[leftIndex++]
            else
                aux[rightIndex++]

        }
        while (leftIndex <= mid) {
            arr[index++] = aux[leftIndex++]
        }
        /* this code is not needed because the right part of the array is already there.
        while (rightIndex <= right) {
            arr[index++] = aux[rightIndex++]
        }*/
    }
}
