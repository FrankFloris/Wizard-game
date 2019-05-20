import java.awt.image.BufferedImage;

public class SpriteSheet {

    private BufferedImage image;

    public SpriteSheet(BufferedImage image){
        this.image = image;
    }

    public BufferedImage grabImage(int x, int y, int w, int h){
        return image.getSubimage ((x*32)-32, (y*32)-32, w, h);
    }


}
