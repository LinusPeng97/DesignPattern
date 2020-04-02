package main.java.pers.linus.construct.proxy;

public class RealFile implements File {
    private String filename;

    public RealFile(String filename) {
        this.filename = filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public void open() {
        System.out.println("open " + filename);
    }
}
