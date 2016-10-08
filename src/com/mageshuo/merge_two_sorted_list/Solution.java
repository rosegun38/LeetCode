package com.mageshuo.merge_two_sorted_list;

import java.util.List;

/**
 * Created by majian on 08/10/2016.
 */

public class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start;

        if(l1 == null ) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        if(l1.val <= l2.val) {
            start = new ListNode(l1.val);
            start.next = mergeTwoLists(l1.next, l2);
        } else {
            start = new ListNode(l2.val);
            start.next = mergeTwoLists(l1, l2.next);
        }
        return start;
    }
}
