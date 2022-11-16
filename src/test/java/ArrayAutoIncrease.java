public class ArrayAutoIncrease {
    public static void main(String[] args) {
        int[] arrayThree = new int[100];

        for (int index = 0; index < arrayThree.length; index++) {

            arrayThree[index] = index;
            System.out.println("index: " + index + " = " + arrayThree[index]);
        }
    }
}
