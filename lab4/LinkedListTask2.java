public class LinkedListTask2
{


	public static void main(String args[])
	{
		Node start = new Node(22);
		Node p=start;
		for(int i=1;i<5;i++)
		{
			p=p.next=new Node(22+11*i);
		}
		for (p=start;p!=null;p=p.next)
		{
			System.out.println(p.data);
		}
		for(p=start;p!=null;p=p.next)
		{
			System.out.println(p);
		}
 

	}
}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;

	}
}