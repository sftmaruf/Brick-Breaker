package brick._breaker;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Feature {

    //variables
    private int x, y, directY, mod, width, height;
    boolean doesntFallYet;
    boolean mod1CollideDone;
    boolean mod2CollideDone;
    private Color color;

    public final static int paddleExpandMod = 4;
    public final static int ballFastMod = 5;
    public final static Color mod1Color = Color.GREEN;
    public final static Color mod2Color = Color.orange;

    public Feature(int x, int y, int mod, int width, int height) {
        this.x = x;
        this.y = y;
        this.mod = mod;
        this.width = width;
        this.height = height;
        mod1CollideDone = false;
        mod2CollideDone = false;

//        if (mod < 4) {
//            mod = 4;
//        }
        if (mod > 5) {
            mod = 5;
        }
        if (mod == paddleExpandMod) {
            color = mod1Color;
        }
        if (mod == ballFastMod) {
            color = mod2Color;
        }

        directY = (int) (Math.random() * 4 + 1);
    }

    public void draw(Graphics2D a) {
        a.setColor(color);
        a.fillRoundRect(x, y, width, height, 10, 10);
    }

    public void update() {
        y += directY;
        if (y > Brick_Breaker.Height) {
            doesntFallYet = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMod() {
        return mod;
    }

    public boolean getdoesntFallYet() {
        return doesntFallYet;
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, width, height);
    }

    public void setMod1CollideDone(boolean mod1CollideDone) {
        this.mod1CollideDone = mod1CollideDone;
    }

    public void setMod2CollideDone(boolean mod2CollideDone) {
        this.mod2CollideDone = mod2CollideDone;
    }

    public boolean getmod1CollideDone() {
        return mod1CollideDone;
    }

    public boolean getmod2CollideDone() {
        return mod2CollideDone;
    }

}
