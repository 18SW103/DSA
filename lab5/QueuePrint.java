import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
class QueuePrint 
{
public static void main(String [] args)
{
Queue<String> q = new LinkedList <> ()
          q.add("10");
	   q.add("12");
	   q.add("14");
	   q.add("16");
	   q.add("18");
           q.add("19");
System.out.println("Queue  :"+ q);
System.out.println("\nElement at the head of Queue : "+q.poll())
String r= q.remove();
System.out.println("\nRemove element from Queue  : "+r+"\n");
System.out.println("New Queue : "+q);
ystem.out.println("\n Size of Queue is  : "+q.size());
        q.offer("20");
        q.offer("22");
        q.offer("24");
        q.offer("26");
System.out.println("\n Final Queue  :"+q);
System.out.println("\n The element at the head of Queue  : "+q.peek());
}
]