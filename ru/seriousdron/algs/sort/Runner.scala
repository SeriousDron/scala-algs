package ru.seriousdron.algs.sort

object Runner extends App {
  val Length = 6
  val array = new Array[Int](Length)

  //Input
  println(s"Enter any ${array.length} numbers for Unsorted Array : ")
  for (i <- array.indices) {
    array(i) = scala.io.StdIn.readLine().toInt
  }

  InsertionSort.sort(array, Ordering[Int])

  //Output
  for (i <- array.indices) {
    print(array(i) + "\t")
  }
  println

}
