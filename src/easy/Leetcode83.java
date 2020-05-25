package easy;
//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
public class Leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}


