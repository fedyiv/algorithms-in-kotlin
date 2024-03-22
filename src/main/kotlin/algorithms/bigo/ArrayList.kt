package bigo

class ArrayList {
    private var array = IntArray(1)
    private var size = 0

    fun addElement(a: Int) {
        if (size == array.size) {
            val newArray = IntArray(array.size * 2)
            for (i in 0 until array.size) {
                newArray[i] = array[i]
            }
            array = newArray
        }
        array[size] = a
        size++
    }
}
