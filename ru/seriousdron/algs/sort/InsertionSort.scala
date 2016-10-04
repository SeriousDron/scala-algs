package ru.seriousdron.algs.sort

object InsertionSort extends App {
  val Length = 6
  val array = new Array[Int](Length)

  //Input
  println(s"Enter any ${array.length} numbers for Unsorted Array : ")
  for (i <- array.indices) {
    array(i) = scala.io.StdIn.readLine().toInt
  }

  sort(array)

  //Output
  for (i <- array.indices) {
    print(array(i) + "\t")
  }
  println

  def sort(array: Array[Int]) = {
    //Sorting
    for (i <- 1 until array.length) {
      val temp: Int = array(i)
      var j = i
      while (j > 0 && temp < array(j - 1)) {
        array(j) = array(j - 1)
        j -= 1
      }
      array(j) = temp
    }
  }
}
