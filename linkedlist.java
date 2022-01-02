import java.sql.SQLOutput;
import java.util.Scanner;

public class linkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

        Node head = null;

        public void creation() {
            int data, n;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("enter a data");
                data = sc.nextInt();
                Node new_node = new Node(data);
                if (head == null) {
                    head = new_node;
                } else {
                    new_node.next = head;
                    head = new_node;
                }
                System.out.println("continue press 1");
                n = sc.nextInt();
            }
            while (n == 1);

        }
        public void travers(){
            Node temp=head;
            if(head==null){
                System.out.println("not exixts");
            }
            else{
                while (temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }
        /*public void endinsert() {
            Node newNode=new Node
        }
            if (head == null) {
                return;
            }
            else {
                Node temp = head;
                while (temp != null) {
                    temp = temp.next;
                }
                temp.next = ;
          */

    public void maximum(){
        if(head==null){
            return ;
        }
       Node temp=head;
        int max=0;
        while (temp!=null){
            if(max<temp.data) {
                max = temp.data;
            }
            temp=temp.next;
        }
        System.out.println("max="+max);
    }
    public void reverse(){
        if(head==null){
            return;
        }

            Node temp=head;
            Node back=null;
            Node next=null;
        while (temp!=null){
            next=temp.next;
            temp.next=back;
            back=temp;
            temp=next;
        }

    }


        public static void main(String[] args) {
            linkedlist l = new linkedlist();
            l.creation();
            l.travers();
            l.maximum();
            l.reverse();
        }
    }





