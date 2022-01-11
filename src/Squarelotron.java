public class Squarelotron {
    int[][] squarelotron;
    int size;

    public Squarelotron(int n) {
        size = n;
        squarelotron = new int[size][size];
        int number = 1;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                squarelotron[i][j] = number++;
            }
        }
    }

    public void printSquarelotron() {
        System.out.println();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(squarelotron[i][j] < 10) {
                    System.out.print("|0" + squarelotron[i][j] + "|");
                } else {
                    System.out.print("|" + squarelotron[i][j] + "|");
                }
            }
            System.out.println();
        }
    }

    public boolean isOnRing(int i, int j, int ring) {
        if(i == ring - 1 || i == size - ring || j == ring - 1 || j == size - ring) {
            return true;
        } else {
            return false;
        }
    }

    public Squarelotron upsideDownFlip(int ring) {
        Squarelotron newMatrix = new Squarelotron(size);
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(isOnRing(i, j, ring)) {
                    newMatrix.squarelotron[i][j] = squarelotron[size - i - 1][j];
                }
            }
        }
        return newMatrix;
    }

    public Squarelotron mainDiagonalFlip(int ring) {
        Squarelotron newMatrix = new Squarelotron(size);
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(isOnRing(i, j, ring)) {
                    newMatrix.squarelotron[i][j] = squarelotron[j][i];
                }
            }
        }
        return newMatrix;
    }

    public void rotateRight(int numberOfTurns) {
        numberOfTurns = (numberOfTurns % 4 + 4) % 4; // take care of negative number of turns
        for (int n = 0; n < numberOfTurns; n++) {
            Squarelotron newMatrix = new Squarelotron(size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    newMatrix.squarelotron[j][size - i - 1] = squarelotron[i][j];
                }
            }
            squarelotron = newMatrix.squarelotron;
        }
    }
}
