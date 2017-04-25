class Node{
int data;
Node link;
Node(int data)
{
this.data=data;
link=null;
}
}


class LLimplementation
{
Node head;
public void pushFirstElement(int data)
{
	Node new_node=new Node(data);
	head=new_node;
}
public void pushAtFront(int data)
{
Node nn=new Node(data);
nn.link=head;
head=nn;	
}

public void pushAtRandom(int position,int data){
	Node start=head;
	for(int i=0;i<position-1;i++)
	{
		start=start.link;
	}
	Node nn= new Node(data);
	nn.link=start.link;
	start.link=nn;
}

public void pushAtEnd(int data)
{
Node start=head;
while(true)
{
	start=start.link;
	if(start.link ==null)
		break;
}
Node nn	=new Node(data);
nn.link=null;
start.link=nn;
}

public void print()
{
	Node start= head;
	while(start!=null)
	{
		System.out.println(start.data+" "+start.link);
		start=start.link;
	}
}
}

class LL{
	public static void main(String args[])
	{
	LLimplementation l=new LLimplementation();
	l.pushFirstElement(5);
	l.pushAtFront(6);
	l.pushAtFront(7);
	l.pushAtRandom(2,8);
	l.pushAtEnd(9);
	l.print();
	
	}
}

