public class Descending {
    public boolean defineUnSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Descending descending = new Descending();

        int[] desArray = new int[10];
        desArray[0] = 9;
        desArray[1] = 20;
        desArray[2] = 31;
        desArray[3] = 2;
        desArray[4] = 35;
        desArray[5] = 34;
        desArray[6] = 55;
        desArray[7] = 66;
        desArray[8] = 47;
        desArray[9] = 8;

        if (descending.defineUnSort(desArray) == true) {
            System.out.println("массив отсортирован по убыванию");
        } else {
            System.out.println("массив не отсортирован по убыванию");
        }
    }
}