import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Array class with dynamic number of elements
 *
 * @author Damir Davletshin
 * @version 2.1
 */
public class EndlessArray<V> implements Iterable<V> {

    /**
     * Constant of start array size
     */
    private final int NUMBER_OF_ELEMENTS_IN_ARRAY = 10;

    /**
     * Array field
     */
    private V array[];
    /**
     * Index of first empty element in the array (also array size (not capacity) value)
     */
    private int firstEmptyElementNumber;

    /**
     * Iterator only for this endless array
     */
    private Iterator iterator = new Iterator() {
        /**
         * Cursor for this iterator
         * Contains number of next element
         */
        int cursor = 0;

        /**
         * Check is in array next value
         *
         * @return true if array has more element, false if array has not more element
         */
        @Override
        public boolean hasNext() {
            return cursor < size();
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Object next() {
            cursor++;
            if (cursor > size()) throw new NoSuchElementException();
            return array[cursor - 1];
        }
    };

    /**
     * Constructs a new object
     *
     * @see EndlessArray#EndlessArray(int)
     * @see EndlessArray#EndlessArray(V[])
     */
    public EndlessArray() {
        array = (V[]) new Objects[NUMBER_OF_ELEMENTS_IN_ARRAY];
        firstEmptyElementNumber = 0;
    }

    /**
     * Constructs a new object with certain size
     *
     * @param size size of the created array
     * @see EndlessArray#EndlessArray()
     * @see EndlessArray#EndlessArray(V[])
     */
    public EndlessArray(int size) {
        array = (V[]) new Objects[size];
        firstEmptyElementNumber = 0;
    }

    /**
     * Constructs a new object with certain values
     *
     * @param mas already created array which all elements will be added to Endless Massive
     * @see EndlessArray#EndlessArray()
     * @see EndlessArray#EndlessArray(int)
     */
    public EndlessArray(V[] mas) {
        array = (V[]) new Objects[mas.length];
        firstEmptyElementNumber = mas.length;
        for (int i = 0; i < mas.length; i++) {
            array[i] = mas[i];
        }
    }


    /**
     * Adds a new array element to a specific position in the array and
     * moves all next elements to the next positions
     * Increases the size of the array if its limit has already been reached and a new value needs to be added
     *
     * @param index array position index
     * @param value new value
     * @see EndlessArray#add(V)
     */
    public void add(int index, V value) {
        if (index >= firstEmptyElementNumber || index < 0) {
            return;
        }
        if (firstEmptyElementNumber >= array.length) {
            V[] arr = (V[]) new Objects[(int) (array.length * 1.5)];
            for (int i = 0; i < index; i++) {
                arr[i] = array[i];
            }
            arr[index] = value;
            firstEmptyElementNumber++;
            for (int i = index + 1; i < firstEmptyElementNumber; i++) {
                arr[i] = array[i - 1];
            }
            array = arr;
        } else {
            firstEmptyElementNumber++;
            for (int i = index + 1; i < firstEmptyElementNumber; i++) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        }
    }

    /**
     * Adds a new element to the end of the array
     * Increases the size of the array if its limit has already been reached and a new value needs to be added
     *
     * @param value new value
     * @see EndlessArray#add(int, V)
     */
    public void add(V value) {
        if (firstEmptyElementNumber >= array.length) {
            V[] arr = (V[]) new Objects[(int) (array.length * 1.5)];
            for (int i = 0; i < array.length; i++) {
                arr[i] = array[i];
            }
            arr[firstEmptyElementNumber] = value;
            firstEmptyElementNumber++;
            array = arr;
        } else {
            array[firstEmptyElementNumber] = value;
            firstEmptyElementNumber++;
        }
    }

    /**
     * Removes an element from the array and shifts all next elements to previous positions.
     * (deletes the first founded value)
     *
     * @param value value to be deleted
     * @see EndlessArray#removeByIndex(int)
     */
    public void removeByValue(V value) {
        for (int i = 0; i < firstEmptyElementNumber; i++) {
            if (array[i] == value) {
                for (int j = i; i < firstEmptyElementNumber; j++) {
                    array[j] = array[j + 1];
                }
                firstEmptyElementNumber--;
                break;
            }
        }
    }

    /**
     * Returns the index of the element or -1 if there is no such element in the array
     * (returns the index of the first founded element)
     *
     * @param value value whose index is to
     * @return the index of the value or -1 if there is no such element in the array
     */
    public int indexOf(V value) {
        for (int i = 0; i < firstEmptyElementNumber; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the value that is at the given index in the array
     *
     * @param index index of the value to be returned
     * @return value under the given index or last element of the array
     */
    public V getValue(int index) {
        if (index >= firstEmptyElementNumber || index < 0) {
            return null;
        }
        return array[index];
    }

    /**
     * Removes the element at a given index from the array and shifts all next elements to previous positions
     *
     * @param index index of the item to be deleted
     * @see EndlessArray#removeByValue(V)
     */
    public void removeByIndex(int index) {
        if (index >= firstEmptyElementNumber || index < 0) {
            return;
        }
        for (int i = index; i < firstEmptyElementNumber; i++) {
            array[i] = array[i + 1];
        }
        firstEmptyElementNumber--;
    }

    /**
     * Returns the workspace size of the array - the part that contains the used elements
     *
     * @return the workspace size of the array
     * @see EndlessArray#getCapacity()
     */
    public int size() {
        return firstEmptyElementNumber;
    }

    /**
     * Returns the size of the all dynamic array, not just the workspace size.
     *
     * @return size of the all array
     * @see EndlessArray#size()
     */
    public int getCapacity() {
        return array.length;
    }

    /**
     * Checks is there a value in the array
     *
     * @return TRUE if this list contains no elements
     */
    public boolean isEmpty() {
        if (firstEmptyElementNumber <= 0) return true;
        return false;
    }

    /**
     * Replaces the element at the specified position in this list with the new value
     *
     * @param index index of the element to replace
     * @param value value to be set at the specified position
     */
    public void set(int index, V value) {
        if (index >= firstEmptyElementNumber || index < 0) {
            return;
        }
        array[index] = value;
    }

    /**
     * Returns TRUE if the array contains the value
     *
     * @param value value is to be tested
     * @return true if this list contains the value
     */
    public boolean contains(V value) {
        if (indexOf(value) == -1) return false;
        return true;
    }

    /**
     * Removes all of the elements from this list
     */
    public void clear() {
        array = (V[]) new Objects[NUMBER_OF_ELEMENTS_IN_ARRAY];
        firstEmptyElementNumber = 0;
    }

    /**
     * Returns all elements of the array as a String
     *
     * @return array as String
     */
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < firstEmptyElementNumber; i++) {
            text.append(array[i] + ", ");
        }
        return text.toString();
    }

    /**
     * Checks if the object is equal to the Endless Massive
     *
     * @param o object to compare
     * @return return TRUE if the objects are equal and FALSE if different
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlessArray that = (EndlessArray) o;
        return Arrays.equals(array, that.array);
    }

    /**
     * Returns hash code of the array
     *
     * @return hash code of the array
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    /**
     * Returns iterator for this endless array
     *
     * @return iterator for this endless array
     */
    @Override
    public Iterator<V> iterator() {
        return iterator;
    }
}
