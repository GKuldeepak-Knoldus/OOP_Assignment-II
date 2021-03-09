package queue

import traits.Queue

class DoubleQueue extends Queue{

  // Overriding the enqueue method to add double of element to the queue
  override def enqueue(element: Int): Unit = {
    if (firstIndex == -1 && lastIndex == -1){
      firstIndex += 1
      list = list :+ (2*element)
    }
    else{
      list = list :+ (2*element)
    }
    lastIndex += 1
  }

}

