package assignment6;

enum Vote{
           YES,NO,INVALID;   
         }

public class VoteList 
{
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node 
    {
        Vote data;
        Node next;
        
        Node(Vote data)
        {
            this.data = data;
        }
        Vote getData()
        {
            return this.data;
        }
        Node getNext()
        {
            return this.next;
        }
    }
	 public VoteList()
        {
            this.head = null;
        }
        public Node getHead()
        {
            return this.head;
        }
	// Method to insert a new node
	public boolean add( Vote data)
	{
            // Create a new node with given data
            Node new_node = new Node(data);
            new_node.next = null;

            // If the Linked List is empty,
            // then make the new node as head
            if (this.head == null) 
            {
                this.head = new_node;
            }
            else 
            {
                // Else traverse till the last node
                // and insert the new_node there
                Node last = this.head;
                while (last.next != null) 
                    {
                        last = last.next;
                    }
		// Insert the new_node at last node
		last.next = new_node;
            }
            // Return the list by head this.head
            return true;
	}
	public int importVotes(Vote[] data)
        {  
            for(int i = 0; i<data.length; i++)
            {
            add(data[i]);
            }  
            return data.length;
        } 
        public boolean isValid()
        {
            int total_data = 0, Invalid_data = 0 ;
            Node currentNode = this.head;
	
            // Traverse through the LinkedList
            while (currentNode != null) 
            {
		total_data++;
		if(currentNode.data == Vote.INVALID)
		{
                    Invalid_data++;
		}
		// Go to next node
		currentNode = currentNode.next;
            }
		float Invalid_Vote_percentage = (Invalid_data/total_data ) * 100; 
		if(Invalid_Vote_percentage < 40)
		  return true;
		else
		  return false;
        }
        public Vote countVotes()
        {
            int Yes_data = 0 , No_data = 0, Invalid_data = 0; 
            Node currentNode = this.head;
            while (currentNode != null) 
            {
                if(currentNode.data == Vote.YES)
		{
                    Yes_data++;
		}
                if(currentNode.data == Vote.NO)
		{
                    No_data++;
		}
		if(currentNode.data == Vote.INVALID)
		{
                    Invalid_data++;
		}		
		// Go to next node
		currentNode = currentNode.next;
            }
                   
            if(Yes_data > No_data)
            {
                return Vote.YES;
            }
            else if(Yes_data < No_data)
            {
                return Vote.NO;
            }
            else
            {
                return  Vote.INVALID;
            } 
        } 
	// Method to print the LinkedList.
	public static void printList(VoteList list)
	{
            Node currNode = list.head;
	
            System.out.print("LinkedList: ");
	
            // Traverse through the LinkedList
            while (currNode != null) 
            {
		// Print the data at current node
		System.out.print(currNode.data + " ");	
		// Go to next node
		currNode = currNode.next;
            }
	}
		// Driver code
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		VoteList christmasPartyVoting = new VoteList();
		// Insert the values
		Vote YES = Vote.YES;
		Vote NO = Vote.NO;
		Vote INVALID = Vote.INVALID; 
	    Vote[] friendVotes = {YES, YES, NO, INVALID, INVALID, NO, YES, NO};
	    System.out.println(christmasPartyVoting.importVotes(friendVotes)); // returns 8
	    System.out.println(christmasPartyVoting.isValid());
        System.out.println(christmasPartyVoting.countVotes());
        
		// Print the LinkedList
		printList(christmasPartyVoting);
	}
}
