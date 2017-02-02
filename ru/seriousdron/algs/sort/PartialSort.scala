package ru.seriousdron.algs.sort

/**
  * Sort algorithm that can sort part of an array in-place
  */
trait PartialSort extends Sort {
  override def sort[T](array: Array[T])(implicit ordering: Ordering[T]): Unit = partialSort(array, 0, array.length - 1)(ordering)
  def partialSort[T](array: Array[T], left: Int = 0, right: Int = -1)(implicit ordering: Ordering[T])
}
