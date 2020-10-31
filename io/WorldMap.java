/* *****************************************************************************
 *  Reads boundary information of a country (or other geographic entity) from
 *  standard input and plots the results to standard drawing.
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        // Canvas size will be width-by-height pixels
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        // Set canvas size
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            // Name of region
            StdIn.readString();
            // Number of vertices
            int vertices = StdIn.readInt();

            // x-coordinates of vertices of polygon describing the region
            double[] x = new double[vertices];
            // y-coordinates of vertices of polygon describing the region
            double[] y = new double[vertices];

            for (int i = 0; i < vertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
