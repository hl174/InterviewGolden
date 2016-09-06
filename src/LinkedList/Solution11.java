package LinkedList;
/**
 * 链表分割
 * 
 * 题目描述
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 * 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 * 
 * @author hl174
 * 时间：2016年9月1日 下午7:07:09
 */
public class Solution11 {
	public ListNode partition(ListNode pHead, int x) {
        /**
         * 题目没有限制能否创建链表的话，就创建两个链表放数据
         * 
         * 
         * 235ms 624k
         */
		if(pHead==null||pHead.next==null)  return pHead;
		ListNode xiao=new ListNode(-1);//比x小的链表
		ListNode da=new ListNode(-1);
		ListNode x1=xiao;
		ListNode d=da;
		while(pHead!=null){
			if(pHead.val<x){
				x1.next=pHead;
				pHead=pHead.next;
				x1=x1.next;
				x1.next=null;//每次将最后设为空
			
			}else{
				d.next=pHead;
				pHead=pHead.next;
				d=d.next;
				d.next=null;
			
			}
		}
		x1.next=da.next;//拼接起来
		
		return xiao.next;
    }
}
