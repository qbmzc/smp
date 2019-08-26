package com.congco.smp.code;

/**
 * created on 2019/8/8 下午2:00
 *
 * @author congco
 */
public class ListNodeTest {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(3);
        l1.next=n1;
        n1.next=n2;
        ListNode l2 = new ListNode(5);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(4);
        l2.next=n3;
        n3.next=n4;
        ListNode listNode = addTwoNumber(l1, l2);
        getNext(listNode);
    }

    private static void getNext(ListNode listNode) {
        if (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
            if (listNode!=null){
                getNext(listNode);
            }
        }

    }


    public static ListNode addTwoNumber(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p=l1,q=l2,curr=dummyHead;
        int carry = 0;
        while (p!=null ||q!=null){
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = x+y+carry;
            carry=sum/10;
            curr.next = new ListNode(sum%10);
            curr=curr.next;
            if (p!=null){p=p.next;}
            if (q!=null){q=q.next;}
        }
        if (carry>0){
            curr.next =new ListNode(carry);
        }
        return dummyHead.next;
    }
}
