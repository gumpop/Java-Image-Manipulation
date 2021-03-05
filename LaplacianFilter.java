public class LaplacianFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       Pixel[][] temp = pi.getData();  
       for(int r=0; r<data.length;r++)
       {
         for(int c=0; c<data[r].length;c++)
         {
           temp[r][c].setRed(calTotal(r,c,'r',data));
           temp[r][c].setGreen(calTotal(r,c,'g',data));
           temp[r][c].setBlue(calTotal(r,c,'b',data));
           //System.out.println(r+" "+c);
         }
       }
        pi.setData(temp);
    }
   
   public int calTotal(int row, int col, char color, Pixel[][] mat)
   { 
     int sum=0;
     
     for(int r=row-1;r<row+2;r++)
     {
        for(int c=col-1; c<col+2; c++)
        {
          if(inBounds(r,c,mat))
          {
            if(color=='r') 
            {
                if(r==row&&c==col)
                {
                    sum+=mat[r][c].getRed()*8;  
                }
                else
                 {
                   sum-=mat[r][c].getRed(); 
                 }
            }
            else if(color=='g') 
            {
                if(r==row&&c==col)
                {
                    sum+=mat[r][c].getGreen()*8;  
                }
                else
                 {
                   sum-=mat[r][c].getGreen(); 
                 }
            }
            else if(color=='b') 
            {
                 if(r==row&&c==col)
                {
                    sum+=mat[r][c].getBlue()*8;  
                }
                else
                 {
                   sum-=mat[r][c].getBlue(); 
                 }
            }
          }
        }
     }
     if(sum>255)
     {
         return 255;
     }
     else if(sum<0)
     {
     return 0;
     }
     else
     {
     return sum;
     }
   }
   
   public boolean inBounds(int r, int c, Pixel[][] mat)
   {
       if(r>=0&&r<mat.length&&c>=0&&c<mat[0].length)
       {
           return true;
       
       }
       return false;
   }
}

