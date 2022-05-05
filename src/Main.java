public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        float[] arrayTwo = {1.57f, 7.654f, 9.986f};

        int[] arrayThree = {8, 916, 704, 70, 11};

        // Задача 2

        for (int i = 0; i < 3; i++) {
            if (i == arrayOne.length - 1) {
                System.out.print(arrayOne[i]);
            } else {
                System.out.print(arrayOne[i] + ", ");
            }
        }
        System.out.println();
        for (int j = 0; j < 3; j++) {
            if (j == arrayTwo.length - 1) {
                System.out.print(arrayTwo[j]);
            } else {
                System.out.print(arrayTwo[j] + ", ");
            }
        }
        System.out.println();

        for (int y = 0; y < arrayThree.length; y++) {
            if (y == arrayThree.length - 1) {
                System.out.print(arrayThree[y]);
            } else {
                System.out.print(arrayThree[y] + ", ");
            }
        }
        System.out.println();

        // Задача 3
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayOne[i]);
            } else {
                System.out.print(arrayOne[i] + ", ");
            }
        }
        System.out.println();

        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayTwo[i]);
            } else {
                System.out.print(arrayTwo[i] + ", ");
            }
        }
        System.out.println();

        for (int i = arrayThree.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayThree[i]);
            } else {
                System.out.print(arrayThree[i] + ", ");
            }
        }
        System.out.println();

        // Задача 4

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2!= 0) {
                System.out.print(arrayOne[i] + 1 + " ");
            } else {
                System.out.print(arrayOne[i] + " ");
            }
        }

    }
}


