package LinkedList;
/**
 * 链表中倒数第k个结点
 * 
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点
 * 
 * @author hl174
 * 时间：2016年9月1日 下午4:21:32
 */
public class Solution9 {
    public ListNode FindKthToTail(ListNode head,int k) {
      /**
       * 
       * 这题剑指offer上面也有，当时是用的前后两个指针夹
       * 
       * 法一：  递归，向来不太喜欢递归，会占用许多存储空间
       * 
       * 感觉还是两个指针来的实在
       * 
       * 
       * 36ms 503k
       */
    	if(head==null||k<=0)
    		 return null;
    	ListNode slow=head,fast=head;
    /*
     * 这里还可以多考虑下k比长度长的情况
     * 	while(k>0){
    		fast=fast.next;
    		k--;
    	}*/
    	//一个起跑线上
    	while(k>0&&fast!=null){
    		fast=fast.next;
    		k--;
    	}
    	if(k>0)
    		return null;//k长度比链表长
    	//同一起跑线
    	while(fast!=null){
    		fast=fast.next;
    		slow=slow.next;
    	}
    	return slow;
    }
}
