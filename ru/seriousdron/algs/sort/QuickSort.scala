package ru.seriousdron.algs.sort

object QuickSort extends Sort{

  def swap[T](array: Array[T], i: Int, j: Int): Unit = {
    val temp:T = array(i)
    array(i) = array(j)
    array(j) = temp
  }

  override def sort[T](array: Array[T])(implicit ordering: Ordering[T]): Unit = {

    def partition(left: Int, right: Int): Int = {
      var i: Int = left
      var j: Int = right

      val pivot = array(left) //Any value from array will do
      while (true) {
        while (ordering.lt(array(i), pivot)) {
          i += 1
        }
        while (ordering.gt(array(j), pivot)) {
          j -= 1
        }

        if (i >= j) {
          return j
        }
        swap(array, i, j)
        i += 1
        j -= 1
      }
      1
    }

    def sortPart(left: Int, right:Int): Unit = {
      val j: Int = partition(left, right)
      if (j > left)  sortPart(left, j)
      if (j+1 < right) sortPart(j+1, right)
    }

    sortPart(0, array.length - 1)
  }
}
