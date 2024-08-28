/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def deleteDuplicates(head: ListNode): ListNode = {
        def iter(currentNode: ListNode, nextNode: ListNode): ListNode =
            (currentNode, currentNode.next) match 
                case (_, null) => head
                case (current, next) if current.x == next.x =>
                    current.next = current.next.next
                    iter(current, next.next)
                case _ => iter(currentNode.next, nextNode.next)

        
        Option(head).fold(head)(head => iter(head, head.next))
    }
}