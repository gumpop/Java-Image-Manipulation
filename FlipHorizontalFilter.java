/**
 * Filter that flips the image horizontally.
 */
public class FlipHorizontalFilter implements Filter
{
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length / 2; col++) {
                Pixel temp = data[row][col];
                data[row][col] = data[row][ data[row].length - col - 1 ];
                data[row][ data[row].length - col - 1 ] = temp;
            }
        }

        pi.setData(data);
    }
}
