package Y2019_3_4;

import java.math.BigInteger;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建一个空链表
        ListNode listNodeHeader = new ListNode(-1);
        ListNode retList = listNodeHeader;
        StringBuilder stringBuilder1 = new StringBuilder("");
        StringBuilder stringBuilder2 = new StringBuilder("");
        l1 = l1.next;
        while(l1!=null){
            stringBuilder1.append(l1.val);
            l1 = l1.next;
        }
        l2=l2.next;
        while(l2!=null){
            stringBuilder2.append(l2.val);
            l2 = l2.next;
        }
        BigInteger b1 = new BigInteger(stringBuilder1.reverse().toString());
        BigInteger b2 = new BigInteger(stringBuilder2.reverse().toString());
        BigInteger sum = b1.add(b2);
        String lastString = sum.toString();
        System.out.println(lastString);
        for (int length = lastString.length()-1; length >= 0; length--) {
            ListNode newNode  = new ListNode(lastString.charAt(length)-48);
            listNodeHeader.next = newNode;
            newNode.next = null;
            listNodeHeader = newNode;
        }
        return retList;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(-1);
        ListNode listNode1Buf = listNode1;
        ListNode newNode1 = new ListNode(2);
        ListNode newNode2 = new ListNode(4);
        ListNode newNode3 = new ListNode(3);
        listNode1.next = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = null;

        ListNode listNode2 = new ListNode(-1);
        ListNode listNode2Buf = listNode2;
        ListNode newNode4 = new ListNode(5);
        ListNode newNode5 = new ListNode(6);
        ListNode newNode6 = new ListNode(6);
        listNode2.next = newNode4;
        newNode4.next = newNode5;
        newNode5.next = newNode6;
        newNode6.next = null;

        ListNode listNode = addTwoNumbers(listNode1Buf, listNode2Buf);
    }

}
