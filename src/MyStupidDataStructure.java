public class MyStupidDataStructure implements DataStructure {
    Object[] numbers = new Object[100];

    // Field for knowing where to put next
    int putlocation = 0;
    // Field for knowing where to get next
    // Field for knowing if there is space to put into and if there is an object to get

    // Methods
    public boolean put(Object obj) {
        numbers[putlocation] = obj;
        putlocation = putlocation + 1;
        return true;
    }
    public Object get() {
        if (putlocation < 1) {
            return null;
        }

        Object value =  numbers[putlocation-1];
        putlocation=putlocation-1;
        return value;
    }
}