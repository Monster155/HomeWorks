import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    //Assert.assertEquals(expected, actual);

    @Test
    void add() {
        LinkedList<Integer> list = new LinkedList<>(0);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(8);
        list.add(3);

        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(list, list2);
    }

    @Test
    void add2() {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.add(9);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(5);

        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{10, 9, 4, 1, 7, 5});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addFirst() {
        LinkedList<Integer> list = new LinkedList<>(0);
        list.addFirst(2);
        list.add(6);
        list.add(1);
        list.addFirst(8);
        list.addFirst(3);

        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{3, 8, 2, 0, 6, 1});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addFirst2() {
        LinkedList<Integer> list = new LinkedList<>(9);
        list.addFirst(3);
        list.add(7);
        list.addFirst(6);
        list.addFirst(1);
        list.add(2);

        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{1, 6, 3, 9, 7, 2});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addLast() {
        LinkedList<Integer> list = new LinkedList<>(0);
        list.add(2);
        list.addLast(6);
        list.addLast(1);
        list.add(8);
        list.add(3);

        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addLast2() {
        LinkedList<Integer> list = new LinkedList<>(8);
        list.add(3);
        list.addLast(2);
        list.addLast(7);
        list.add(5);
        list.add(9);
        list.addLast(6);

        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{8, 3, 2, 7, 5, 9, 6});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addAfterI() {
        LinkedList<String> list = new LinkedList<>("Damir");
        list.add("Bulat");
        list.addAfter("Rinat", "Damir");
        list.add("Daniyar");
        list.add("Kirill");
        list.addAfter("Amir", "Bulat");
        list.addAfter("Ruslan", "Daniyar");

        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addAfterI2() {
        LinkedList<String> list = new LinkedList<>("Damir");
        list.add("Kirill");
        list.addAfter("Rinat", "Damir");
        list.addAfter("Amir", "Rinat");
        list.add("Daniyar");
        list.add("Bulat");
        list.addAfter("Ruslan", "Daniyar");

        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill", "Daniyar", "Ruslan", "Bulat"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addAfterII() {
        LinkedList<String> list = new LinkedList<>("Damir");
        list.add("Bulat");
        list.addAfter("Rinat", 0);
        list.add("Daniyar");
        list.add("Kirill");
        list.addAfter("Amir", 2);
        list.addAfter("Ruslan", 4);

        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void addAfterII2() {
        LinkedList<String> list = new LinkedList<>("Damir");
        list.add("Kirill");
        list.addAfter("Rinat", 0);
        list.addAfter("Amir", 1);
        list.add("Daniyar");
        list.add("Bulat");
        list.addAfter("Ruslan", 4);

        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill", "Daniyar", "Ruslan", "Bulat"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void get() {
        LinkedList<Integer> list = new LinkedList<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Long(list.get(5)), new Long(3));
    }

    @Test
    void get2() {
        LinkedList<Integer> list = new LinkedList<>(new Integer[]{8, 3, 2, 7, 5, 9, 6});
        Assert.assertEquals(new Long(list.get(3)), new Long(7));
    }

    @Test
    void indexOf() {
        LinkedList<Integer> list = new LinkedList<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Integer(list.indexOf(6)), new Integer(2));
    }

    @Test
    void indexOf2() {
        LinkedList<Integer> list = new LinkedList<>(new Integer[]{8, 3, 2, 7, 5, 9, 6});
        Assert.assertEquals(new Integer(list.indexOf(5)), new Integer(4));
    }

    @Test
    void removeI() {
        LinkedList<String> list = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill", "Daniyar", "Ruslan", "Bulat"});
        list.remove(4);
        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill", "Ruslan", "Bulat"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void removeI2() {
        LinkedList<String> list = new LinkedList<>(new String[]{"Damir", "Rinat", "Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        list.remove(2);
        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void removeII() {
        LinkedList<String> list = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill", "Daniyar", "Ruslan", "Bulat"});
        list.remove("Amir");
        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Kirill", "Daniyar", "Ruslan", "Bulat"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void removeII2() {
        LinkedList<String> list = new LinkedList<>(new String[]{"Damir", "Rinat", "Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        list.remove("Rinat");
        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void merge() {
        LinkedList<String> list = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill"});
        list.merge(new LinkedList<>(new String[]{"Daniyar", "Ruslan", "Bulat"}));
        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Amir", "Kirill", "Daniyar", "Ruslan", "Bulat"});
        Assert.assertEquals(list, list2);
    }

    @Test
    void merge2() {
        LinkedList<String> list = new LinkedList<>(new String[]{"Damir", "Rinat"});
        list.merge(new LinkedList<>(new String[]{"Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"}));
        LinkedList<String> list2 = new LinkedList<>(new String[]{"Damir", "Rinat", "Bulat", "Amir", "Daniyar", "Ruslan", "Kirill"});
        Assert.assertEquals(list, list2);
    }
}