package ru.seriousdron.algs.sort

trait Sort {
  def sort[T](array: Array[T], ordering: Ordering[T])
}