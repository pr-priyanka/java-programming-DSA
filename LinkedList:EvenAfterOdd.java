/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/


public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        	 if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> node=head,evenNode=null,oddNode=null,oddHead=null,evenHead=null;
        while(node!=null)
        {            
            int data=node.data;
            //System.out.println(data);
            
            if (data%2==0)
        	{
                //System.out.println(data+" is divisble by 2");
                if (evenNode==null)
                {
                    //System.out.println("Adding first node");
                    evenNode=node;
                    evenHead=node;
                }
                else
                {
                    evenNode.next=node;
                	evenNode=evenNode.next;
                }
                //System.out.println("Even numbers");
        		//Runner.print(evenHead);
            	
        	}
        	else
        	{
                //System.out.println(data+" is not divisble by 2");
                if (oddNode==null)
                {
                    //System.out.println("Adding first node");
                    oddNode=node;
                    oddHead=node;
                }
                else
                {
                    oddNode.next=node;
                	oddNode=oddNode.next;
                }
                //System.out.println("Odd numbers");
            	//Runner.print(oddHead);
            	
        	}
            
            //System.out.println();
            node=node.next;
        }
        //Runner.print(oddHead);
        //Runner.print(evenHead);
        if (oddHead==null)
        {
            return evenHead;
        }
        else
        {
            oddNode.next=evenHead;
        }
        
        if (evenNode!=null)
        {
            evenNode.next=null;
        }
        
        
        return oddHead;
	}
}
