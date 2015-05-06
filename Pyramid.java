/**
 * Created by danie_000 on 5/4/2015.
 */
public class Pyramid {

    private String thePyramid;

    public void builder(int n) {
        StringBuilder levelBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {

            int spaces;
            spaces = (n - 1) - i;

            int hashes;
            hashes = i + 2;

            while (spaces > 0) {
                levelBuilder.append(" ");
                spaces = spaces - 1;
            }

            while (hashes > 0) {
                levelBuilder.append("#");
                hashes = hashes - 1;
            }

            levelBuilder.append("\n");
        }
        thePyramid = levelBuilder.toString();
    }

    public java.lang.String toString() {
        return thePyramid;
    }
}
