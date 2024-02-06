package com.coding.quetions.linkedlist;

public class Questions {


    //MIDDLE NODE.
//    public static void middleNode() {
//        //Tortoise and Hare approach, slow and fast pointer technique.
//        Node slow = head;
//        Node fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//
//    }

    //HAS LOOP.
//    public boolean hasLoop() {
//        Node slow = head;
//        Node fast = head;
//        while (fast != null & fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                return true;
//            }
//        }
//        return false;
//    }

    //KTH NODE FROM END.
    public static Node kthNode(int k) {
        Node fast = head;
        Node slow = head;

        //move fast k steps ahead of slow.
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }

            fast = fast.next;
        }

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
