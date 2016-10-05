package ru.seriousdron.algs.sort

object InsertionSort extends Sort {

  override def sort[T](array: Array[T], ordering: Ordering[T]): Unit = {
    //Sorting
    for (i <- 1 until array.length) {
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
