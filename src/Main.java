

public class Main {
    public static void main(String[] args) {
        MyStupidDataStructure myData = new MyStupidDataStructure();
        // MY CODE

        for (int i = 500; i < 602; i = i + 1) {
            myData.put(i);
        }

        for (int i = 500; i < 602; i = i + 1) {
            System.out.println(myData.get());
        }
    }
}