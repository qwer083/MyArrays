public class KitschArray {
    public static boolean isSorted(int[] array) {
        boolean isSorted = true;
        boolean flag = true;
        boolean skip = true;

        if (array.length == 1) {
            return isSorted;
        }

        for (int i = 0; i < array.length - 1; i++) {

            if ((array[i] <= array[i + 1]) && flag) {
            } else {
                flag = false;
                if (skip) {
                    i = 0;
                    skip = false;
                }

                if (!(array[i] >= array[i + 1])) {
                    isSorted = false;
                }
            }
        }
        return isSorted;

    }

    public static void main(String[] args) {
        KitschArray kitschArray = new KitschArray();

        int[] someArray = new int[10];
        someArray[0] = 7;
        someArray[1] = 85;
        someArray[2] = 31;
        someArray[3] = 27;
        someArray[4] = 35;
        someArray[5] = 49;
        someArray[6] = 55;
        someArray[7] = 66;
        someArray[8] = 47;
        someArray[9] = 8;

//данные массивы являются рандомными и предназначены для проверки работы метода
//        int[] huArray = {145, 358, 35, 38, -34, 368};
//        int[] fuArray = {56, 57, 58, 59, 60, 61, 62};
//        int[] juArray = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90};

        if (kitschArray.isSorted(someArray) == true) {
            System.out.println("элементы массива отсортированы");
        } else {
            System.out.println("элементы массива не отсортированы");
        }
    }
}
