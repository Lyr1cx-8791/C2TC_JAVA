public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        }
        return list1;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode l7 = new ListNode(4);
        ListNode l6 = new ListNode(3, l7);
        ListNode l5 = new ListNode(1, l6);
        Solution s1 = new Solution();
        ListNode finalList = s1.mergeTwoLists(l1, l5);
        while (finalList != null) {
            System.out.println(finalList.val);
            finalList = finalList.next;
        }
    }
}
