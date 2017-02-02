package ru.seriousdron.algs.sort

/**
  * Sort algorithm that can sort part of an array in-place
  */
trait PartialSort extends Sort {
  def partialSort[T](array: Array[T], left: Int = 0, right: Int = -1)(implicit ordering: Ordering[T])
}
