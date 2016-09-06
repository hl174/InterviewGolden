package LinkedList;


/**
 * 回文链表
 * 
 * 题目描述
 * 请编写一个函数，检查链表是否为回文。
 * 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 * 测试样例：
 * {1,2,3,2,1}
 * 返回：true
 * {1,2,3,2,3}
 * 返回：false
 * 
 * @author hl174
 * 时间：2016年9月1日 下午7:07:37
 */
public class Solution13 {
	 public boolean isPalindrome(ListNode pHead) {
	     /**
	      * 想到了。好像可以用数组来存储链表的数据，然后逆序比较
	      * 或者翻转链表
	      *   
	      *   
	      *   46ms 843k
	      */
		 if(pHead==null) return false;
		 int count=0;
		 ListNode p=pHead;
		 while(p!=null){
			 count++;
			 p=p.next;
		 }
		 p=pHead;
		 int[]a=new int[count];
		 for(int i=0;i<count;i++){
			 a[i]=p.val;
			 p=p.next; 
		 }
		//比较数组就好
		 for (int i = 0; i < count/2; i++) {
			if(a[i]!=a[count-1-i])
				return false;
		}
		 return true;
	    }
	 
	 
	 //法二：链表翻转之类的，感觉麻烦
	 //链表翻转
	/*  public ListNode reverseList(ListNode head) {
	        if(head==null) return null;
	         ListNode myNode=new ListNode(-1);
	         ListNode point=head;
	         while(point!=null){
	             ListNode temp=point.next;
	             
	             point.next=myNode.next;
	             myNode.next=point;
	             
	             point=temp;
	         }
	         return myNode.next;
	    }
	    
   public boolean isPalindrome(ListNode head) {
         //快慢表查找翻转列表
		  if(head==null||head.next==null) return true;
		  ListNode slow=head,fast=head;
		  //slow找到中间位置，fast到最后位置
		  while(fast!=null&&fast.next!=null){
			  slow=slow.next;
			  //fast最后可能会为空
			  fast=fast.next.next;
		  }
		  if(fast!=null){
			//奇数个的情况  
			  slow.next=reverseList(slow.next);
			  slow=slow.next;
		  }else{
			  //偶数个的情况
			  slow=reverseList(slow);
		  }
		  //前后拍对比
		  while(slow!=null){
			  if(slow.val!=head.val){
				  return false;
			  }
			  slow=slow.next;
			  head=head.next;
		  }		  
		  return true;
   }*/
}
