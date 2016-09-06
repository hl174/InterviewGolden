package LinkedList;
/**
 * 链式A+B
 * 
 * 题目描述
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。
 * 给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。
 * 测试样例：
 * {1,2,3},{3,2,1}
 * 返回：{4,4,4}
 * 
 * @author hl174
 * 时间：2016年9月1日 下午7:07:20
 */
public class Solution12 {
/*	public ListNode plusAB(ListNode a, ListNode b) {
		*//**
		 * 结果也用反序的方式存储的话，这题可以用迭代的方式进行
		 * 
		 * 39ms 772k
		 *//*
		
		return digui(a,b,0);
    }
	
	public ListNode digui(ListNode a,ListNode b,int flag){
		if(a==null&&b==null&&flag==0)//全部都结束了
			return null;
		ListNode result=new ListNode(-1);
		int value=flag;
		if(a!=null){
			value+=a.val;//
		}
		if(b!=null){
			value+=b.val;
		}
		result.val=value%10;
		result.next=digui(a==null?null:a.next,b==null?null:b.next,value>=10?1:0);
		return result;
	}*/
	
	//法二:不用递归
	public ListNode plusAB(ListNode a, ListNode b) {
		/**
		 * 
		 * 不用递归的话，就两边循环加标记位
		 * 
		 * 39ms 772k
		 */
		if(a==null) return b;
		if(b==null)  return a;
		ListNode result=new ListNode(-1);
		ListNode p=result;
		int flag=0;
		while(a!=null&&b!=null){
			int value=a.val+b.val+flag;
			ListNode temp=new ListNode(value%10);
			p.next=temp;
			p=p.next;
			flag=(value>=10?1:0);
			
			a=a.next;
			b=b.next;
		}
		
		while(a!=null){//这个时候假定b短
			int value=a.val+flag;
			ListNode temp=new ListNode(value%10);
			p.next=temp;
			p=p.next;
			flag=(value>=10?1:0);
			a=a.next;
		}

		while(b!=null){//这个时候假定a短
			int value=b.val+flag;
			ListNode temp=new ListNode(value%10);
			p.next=temp;
			p=p.next;
			flag=(value>=10?1:0);
			b=b.next;
		}
		
		if(flag>0){
			p.next=new ListNode(1);
		}
	
		return result.next;
    }
	
}
