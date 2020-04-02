package main.java.pers.linus.construct.proxy;

public class FileProxy implements File {
    private String filename;
    private File file;

    public FileProxy(String filename) {
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
        if(file == null){
            file = new RealFile(filename);
        }
        file.open();
    }
}
