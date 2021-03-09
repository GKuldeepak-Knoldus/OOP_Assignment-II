package queue

import traits.Queue

class SquareQueue extends Queue{

  //Overriding the enqueue method to add the square of the element in the queue
  override def enqueue(element: Int): Unit = {
    if (firstIndex == -1 && lastIndex == -1){
      firstIndex += 1
      list = list :+ (element*element)
    }
    else{
      list = list :+ (element*element)
    }
    lastIndex += 1
  }
}
