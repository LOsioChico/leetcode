/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    def iter(list1: ListNode, list2: ListNode, newList: ListNode, carry: Int): ListNode =
      (list1, list2) match
        case (null, null)   =>
          if carry > 0 then newList.next = new ListNode(carry)
          newList
        case (list1, null)  =>
          val sum = list1.x + carry
          newList.next = new ListNode(sum % 10)
          iter(list1.next, null, newList.next, sum / 10)
        case (null, list2)  => 
          val sum = list2.x + carry
          newList.next = new ListNode(sum % 10)
          iter(null, list2.next, newList.next, sum / 10)
        case (list1, list2) => 
          val sum = list1.x + list2.x + carry
          newList.next = new ListNode(sum % 10)
          iter(list1.next, list2.next, newList.next, sum / 10)

    val newList = new ListNode()
    iter(l1, l2, newList, 0)
    newList.next
  }
}