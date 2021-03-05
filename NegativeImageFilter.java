
/**
 * Write a description of class NegativeImageFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NegativeImageFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       for(int r=0;r<data.length;r++)
       {
         for(int c=0; c<data[r].length;c++)
         {
           data[r][c].setRed(255-data[r][c].getRed());
           data[r][c].setGreen(255-data[r][c].getGreen());
           data[r][c].setBlue(255-data[r][c].getBlue());
         }
       }
        pi.setData(data);
    }
}
