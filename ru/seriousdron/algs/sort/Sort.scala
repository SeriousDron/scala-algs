package ru.seriousdron.algs.sort

trait Sort {
  def sort[T](array: Array[T])(implicit ordering: Ordering[T])
}