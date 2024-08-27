/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def reverseList(head: ListNode): ListNode = {
        def iter(prev: ListNode, current: ListNode): ListNode =
            current match
                case null => prev
                case node =>
                    val next = node.next
                    current.next = prev
                    iter(current, next)

        iter(null, head)
    }
}