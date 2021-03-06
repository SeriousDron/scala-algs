package ru.seriousdron.algs.sort

object InsertionSort extends Sort with PartialSort {

  override def partialSort[T](array: Array[T], left: Int, right: Int)(implicit ordering: Ordering[T]): Unit = {
    for (i <- left to right) {
      val temp: T = array(i)
      var j = i
      while (j > 0 && ordering.lt(temp, array(j - 1))) {
        array(j) = array(j - 1)
        j -= 1
      }
      array(j) = temp
    }
  }
}
