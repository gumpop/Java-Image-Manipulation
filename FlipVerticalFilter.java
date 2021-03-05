public class FlipVerticalFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       for(int r=0; r<data.length/2; r++)
       {
         for(int c=0; c<data[0].length; c++)
         {
           Pixel old= data[r][c];
           data[r][c]=data[data.length-r-1][c];
           data[data.length-r-1][c]=old;
         }
       }
        pi.setData(data);
    }
}
