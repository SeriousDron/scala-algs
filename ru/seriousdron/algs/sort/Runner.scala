package ru.seriousdron.algs.sort

object Runner extends App {
  val Length = 6
  val array = new Array[Int](Length)

  val sortAlg = selectSort

  //Input
  println(s"Enter any ${array.length} numbers for Unsorted Array : ")
  for (i <- array.indices) {
    array(i) = scala.io.StdIn.readLine().toInt
  }

  sortAlg.sort(array, Ordering[Int])

  //Output
  for (i <- array.indices) {
    print(array(i) + "\t")
  }
  println

  def selectSort: Sort = {
    val sortObjects = Array(InsertionSort, QuickSort)
    while(true) {
      //print sort types
      println("Select sort type")
      for (key <- sortObjects.indices) {
        print(key + 1); print("\t"); println(sortObjects(key).getClass.getSimpleName)
      }
      try {
        val input: Int = scala.io.StdIn.readInt
        val sort: Sort = sortObjects.apply(input - 1)
        println(s"You selected ${sort.getClass.getSimpleName}!")
        return sort
      } catch {
        case e: ArrayIndexOutOfBoundsException =>
      }
    }
    sortObjects(0) //stupid thing to fake return type
  }
}
