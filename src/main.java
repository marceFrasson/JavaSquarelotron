public class main {
    public static void main(String[] args) {
        Squarelotron square = new Squarelotron(5);
        Squarelotron backup = new Squarelotron(5);
        System.out.println("\nOriginal:");
        square.printSquarelotron();
        System.out.println("\nupsideDownFlip:");
        square = square.upsideDownFlip(1);
        square.printSquarelotron();
        square.squarelotron = backup.squarelotron;
        System.out.println("\nmainDiagonalFlip:");
        square = square.mainDiagonalFlip(1);
        square.printSquarelotron();
        square.squarelotron = backup.squarelotron;
        System.out.println("\nrotateRight:");
        square.rotateRight(1);
        square.printSquarelotron();
    }
}
