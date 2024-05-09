package algorithms.sort.merge.arrays

class MergeSortBottomUpNatural : MergeSort() {
    override fun sort(arr: IntArray, left: Int, right: Int) {
        var (starts, runCount) = findNaturalSequences(arr)
        // repeat while there are more than one sorted sequences in the array
        while (runCount > 1) {
            var i = 0
            var newRunCount = 0;
            while (i < runCount) {
                val left = starts[i]
                // if there is odd number of runs, there is nothing to merge the last sequence with,
                // simply add it as a run for the next loop iteration
                if (i >= runCount - 1) {
                    starts[newRunCount++] = left
                    break
                }
                val mid = starts[i + 1] - 1
                // if we are at the end of the array,
                // use the last element as the "right" parameter in the input
                val right = if (i + 2 < runCount) starts[i + 2] - 1 else arr.size - 1
                merge(arr, left, mid, right)
                starts[newRunCount++] = left
                i += 2
            }
            runCount = newRunCount
        }
    }

    private fun findNaturalSequences(arr: IntArray): Pair<IntArray, Int> {
        //extra O(N) space is required to remember natural runs
        var starts = IntArray(arr.size)

        starts[0] = 0
        var startsCount = 1

        // extra O(N) space runtime complexity
        for (i in 1 until arr.size) {
            if (arr[i] < arr[i - 1])
                starts[startsCount++] = i
        }

        return Pair(starts, startsCount)
    }

}
