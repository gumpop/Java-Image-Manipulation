public class GrayScaleFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       for(int r=0;r<data.length;r++)
       {
         for(int c=0; c<data[r].length;c++)
         {
           int avg=(data[r][c].getRed()+data[r][c].getGreen()+data[r][c].getBlue())/3;
           data[r][c].setRed(avg);
           data[r][c].setGreen(avg);
           data[r][c].setBlue(avg);
         }
       }
        pi.setData(data);
    }
}

