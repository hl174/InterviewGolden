package LinkedList;
/**
 * 
 * 访问单个节点的删除
 * 
 * 
 * 题目描述
 * 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
 * 给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true
 * 
 * @author hl174
 * 时间：2016年9月1日 下午7:06:53
 */
public class Solution10 {
	 public boolean removeNode(ListNode pNode) {
	     /**
	      * 这样的话只有将下一个节点的值复制 到当前节点就完了
	      * 
	      * 30ms 709k
	      */
		 if(pNode==null||pNode.next==null)
			 return false;
		 pNode.val=pNode.next.val;
		 pNode.next=pNode.next.next;
		 return true;
	    }
}
