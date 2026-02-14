package LinkedList;

class Lode {
    int val;
    Lode next;
    Lode prev;

    Lode() {
    }

    Lode(int val) {
        this.val = val;
    }
}

class dll {
    Lode head;
    Lode tail;
    int size;

    // add node at head
    public void addathead(int val) {
        Lode temp = new Lode(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    // add node at tail
    public void addattail(int val) {
        Lode temp = new Lode(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // display list forward
    public void display() {
        Lode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // display list in reverse
    public void displayreverse() {
        Lode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // delete at head
    public void deleteathead() {
        if (size == 0) {
            System.out.println("list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // delete at tail
    public void deleteattail() {
        if (size == 0) {
            System.out.println("list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // add at any index
    public void addatanyindex(int i, int val) {
        if (i < 0 || i > size) {
            System.out.println("invalid idx");
            return;
        }
        if (i == 0) {
            addathead(val);
            return;
        }
        if (i == size) {
            addattail(val);
            return;
        }

        Lode temp = head;
        for (int idx = 0; idx < i - 1; idx++) {
            temp = temp.next;
        }

        Lode a = new Lode(val);
        a.next = temp.next;
        a.prev = temp;
        temp.next.prev = a;
        temp.next = a;

        size++;
    }

    //  delete at any index
    public void deleteatanyindex(int i) {
        if (i < 0 || i >= size) {
            System.out.println("invalid idx");
            return;
        }

        if (i == 0) {
            deleteathead();
            return;
        }

        if (i == size - 1) {
            deleteattail();
            return;
        }

        // reach node at index i
        Lode temp = head;
        for (int idx = 0; idx < i; idx++) {
            temp = temp.next;
        }

        // adjust links
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }
}

public class DoublyLL {
    public static void main(String[] args) {

        dll ll2 = new dll();

        ll2.addathead(34);
        ll2.addathead(56);
        ll2.addathead(3);
        ll2.addathead(4);

        ll2.display();

        ll2.addattail(45);
        ll2.addattail(23);
        ll2.addattail(32);
        ll2.addattail(67);

        ll2.display();

        System.out.println("reverse:");
        ll2.displayreverse();

        ll2.deleteathead();
        ll2.deleteattail();
        ll2.display();

        ll2.addatanyindex(4, 89);
        ll2.display();

        //  delete at index 3
        ll2.deleteatanyindex(3);
        ll2.display();
    }
}
