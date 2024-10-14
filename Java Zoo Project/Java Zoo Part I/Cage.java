// Cage class
public class Cage {
    private int length;
    private int width;
    private boolean clean;
    private boolean covered;

    public Cage(int length, int width, boolean clean, boolean covered) {
        this.length = length;
        this.width = width;
        this.clean = clean;
        this.covered = covered;
    }

    // Getters and setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }
}
