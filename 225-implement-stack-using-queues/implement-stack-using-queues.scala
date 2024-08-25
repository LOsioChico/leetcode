import scala.collection.mutable

class MyStack() {
    val queue = new mutable.Queue[Int]()

    def push(x: Int): Unit = {
        queue.enqueue(x)
        (0 until queue.length - 1).foreach(_ => queue.enqueue(queue.dequeue))
    }

    def pop(): Int = {
        queue.dequeue
    }

    def top(): Int = {
        queue.head
    }

    def empty(): Boolean = {
        queue.isEmpty
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = new MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */