import java.util.Objects;

public class LinkedList<T> {
    private Node head;

    public LinkedList(T value) {
        head = new Node(value, null);
    }

    public LinkedList(T[] array) {
        head = new Node(array[0], null);
        Node node, nodePrevious = head;
        for (T t : array) {
            node = new Node(t, null);
            nodePrevious.next = node;
            nodePrevious = node;
        }
        head = head.next;
    }


    public void add(T value) {
        addAfter(value, null);
    }

    public void addFirst(T value) {
        if (head.equals(null)) {
            head = new Node(value, null);
        } else {
            Node newHead = new Node(value, head);
            head = newHead;
        }
    }

    public void addLast(T value) {
        addAfter(value, null);
    }

    public void addAfter(T value, T afterThis) {
        if (head.equals(null)) {
            head = new Node(value, null);
        } else {
            Node node = head;
            while (true) {
                if (node.value == afterThis || node.next == null) {
                    node.next = new Node(value, null);
                    return;
                } else {
                    node = node.next;
                }
            }
        }
    }

    public void addAfter(T value, int id) {
        if (head.equals(null)) {
            head = new Node(value, null);
        } else {
            int count = 0;
            Node node = head;
            while (count <= id) {
                if (count == id || node.next == null) {
                    node.next = new Node(value, null);
                    return;
                } else {
                    node = node.next;
                }
                count++;
            }
        }
    }

    public T get(int id) {
        if (head.equals(null)) {
            return null;
        } else {
            int count = 0;
            Node node = head;
            while (true) {
                if (count == id) {
                    return node.value;
                } else if (count > id) {
                    return null;
                } else {
                    node = node.next;
                }
                count++;
            }
        }
    }

    public int indexOf(T t) {
        int count = 0;
        Node node = head;
        while (!node.equals(null)) {
            if (node.value.equals(t)) {
                return count;
            }
            node = node.next;
            count++;
        }
        return -1;
    }

    public void remove(int id) {
        if (id >= size()) return;
        if (id == 0) {
            head = head.next;
            return;
        }
        Node node = head.next;
        int number = 1;
        while (number < id) {
            node = node.next;
            number++;
        }
        node.next = node.next.next;
    }

    public void remove(T value) {
        if (head.value.equals(value)) {
            head = head.next;
            return;
        }
        Node node = head;
        while (true) {
            if (node.next.value.equals(value)) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }

    public LinkedList<T> merge(LinkedList<T> list) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = list.head;
        while (node.next != null)  {
            node = node.next;
        }
        return this;
    }

    public int size() {
        int size = 0;
        Node node = head;
        while (node.next != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        return head.equals(null);
    }

    public T getLast() {
        Node node = head;
        while (!node.next.equals(null)) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedList<?> that = (LinkedList<?>) o;
        if (size() != that.size()) return false;
        int i = 0;
        while (i < size()) {
            if (get(i) != that.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = head;
        sb.append("LinkedList {" + node.value);
        while (node.next != null) {
            node = node.next;
            sb.append(", " + node.value);
        }
        sb.append("}");
        return sb.toString();
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
