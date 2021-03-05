/**
 * Represents a pixel, which is a red, green, and blue value
 * 
 * @author Richard Dunn 
 * @version March 1, 2002
 */
public class Pixel
{
    // RGB color values for this pixel (0-255)
    private int red;        // changed to private Adam Heck and Stephen Preast    4/20/04        
    private int green;      //  "           "       "
    private int blue;       //  "           "       "

    /**
     * Constructor for objects of class Pixel
     * Initializes the pixel values;
     */
    public Pixel(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    // Accessors and settors added by Adam Heck and Stephen Preast  4/20/04
    public int getRed() { return red; }
    public int getGreen() { return green; }
    public int getBlue() { return blue;}
    
    public void setRed(int value) { red = value; }
    public void setGreen(int value) { green = value;}
    public void setBlue(int value) { blue = value;}
}
