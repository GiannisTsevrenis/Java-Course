package Section6;
public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            char[][] array = new char[number][number];
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if ((i == j) || (j == (number - i - 1))) {
                        array[i][j] = '*';
                    } else {
                        array[i][j] = ' ';
                    }
                }
            }
            for (int i = 0; i < number; i++) {
                array[0][i] = '*';
                array[number - 1][i] = '*';
                array[i][0] = '*';
                array[i][number - 1] = '*';
            }
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
