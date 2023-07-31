package assignment4;

public class Plot {
    private int width;
    private int depth;
    private int x;
    private int y;
    
    public Plot() {
        x = 0;
        y = 0;
        width = 1;
        depth = 1;
    }

    public Plot(Plot property) {

        x = property.x;
        y = property.y;
        width = property.width;
        depth = property.depth;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public boolean overlaps(Plot plot) {
        if (plot.width <= plot.x + (plot.width - plot.x) && this.y <= plot.y + (plot.depth - plot.y)) {


            if (plot.depth <= this.x + (this.width - this.x) && plot.y <= this.y + (this.depth - this.y))
                return false;
        }

        return true;
    }

    public boolean encompasses(Plot plot) {
        if (this.x <= plot.x && this.y <= plot.y) {
            return true;
        }
        if (this.depth <= plot.depth && this.width <= plot.width) {
            return true;
        }
        return false;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public String toString() {
        return "Upper left: (" + x + "," + y + "); " + "Width: " + width + " Depth: " + depth;
    }
}