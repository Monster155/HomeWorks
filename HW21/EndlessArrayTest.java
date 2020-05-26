import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EndlessArrayTest {

    @Test
    void addI() {
        EndlessArray<Integer> array = new EndlessArray<>();
        array.add(0);
        array.add(2);
        array.add(1, 6);
        array.add(1);
        array.add(3, 8);
        array.add(3);

        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{0, 6, 2, 8, 1, 3});
        Assert.assertEquals(array, array2);
    }

    @Test
    void addI2() {
        EndlessArray<Integer> array = new EndlessArray<>();
        array.add(10);
        array.add(0, 9);
        array.add(4);
        array.add(1);
        array.add(3, 7);
        array.add(5);

        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{9, 10, 4, 7, 1, 5});
        Assert.assertEquals(array, array2);
    }

    @Test
    void addII() {
        EndlessArray<Integer> array = new EndlessArray<>();
        array.add(0);
        array.add(2);
        array.add(6);
        array.add(1);
        array.add(8);
        array.add(3);

        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(array, array2);
    }

    @Test
    void addII2() {
        EndlessArray<Integer> array = new EndlessArray<>();
        array.add(10);
        array.add(9);
        array.add(4);
        array.add(1);
        array.add(7);
        array.add(5);

        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5});
        Assert.assertEquals(array, array2);
    }

    @Test
    void removeByValue() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5});
        array.removeByValue(7);
        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 5});
        Assert.assertEquals(array, array2);
    }

    @Test
    void removeByValue2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        array.removeByValue(6);
        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{0, 2, 1, 8, 3});
        Assert.assertEquals(array, array2);
    }

    @Test
    void indexOf() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Integer(array.indexOf(8)), new Integer(4));
    }

    @Test
    void indexOf2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5});
        Assert.assertEquals(new Integer(array.indexOf(9)), new Integer(1));
    }

    @Test
    void getValue() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5});
        Assert.assertEquals(new Integer(array.getValue(4)), new Integer(7));
    }

    @Test
    void getValue2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Integer(array.getValue(3)), new Integer(1));
    }

    @Test
    void removeByIndex() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        array.removeByIndex(1);
        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{0, 6, 1, 8, 3});
        Assert.assertEquals(array, array2);
    }

    @Test
    void removeByIndex2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5});
        array.removeByIndex(5);
        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7});
        Assert.assertEquals(array, array2);
    }

    @Test
    void size() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Integer(array.size()), new Integer(6));
    }

    @Test
    void size2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5, 8});
        Assert.assertEquals(new Integer(array.size()), new Integer(7));
    }

    @Test
    void getCapacity() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5, 8, 14, 6, 2});
        Assert.assertEquals(new Integer(array.getCapacity()), new Integer(15));
    }

    @Test
    void getCapacity2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Integer(array.getCapacity()), new Integer(10));
    }

    @Test
    void set() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5});
        array.set(1, 3);
        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{10, 3, 4, 1, 7, 5});
        Assert.assertEquals(array, array2);
    }

    @Test
    void set2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        array.set(3, 9);
        EndlessArray<Integer> array2 = new EndlessArray<>(new Integer[]{0, 2, 6, 9, 8, 3});
        Assert.assertEquals(array, array2);
    }

    @Test
    void contains() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{0, 2, 6, 1, 8, 3});
        Assert.assertEquals(new Boolean(array.contains(9)), new Boolean(false));
    }

    @Test
    void contains2() {
        EndlessArray<Integer> array = new EndlessArray<>(new Integer[]{10, 9, 4, 1, 7, 5, 8, 14, 6, 2});
        Assert.assertEquals(new Boolean(array.contains(7)), new Boolean(true));
    }
}