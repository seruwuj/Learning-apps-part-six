public class AddindDataToFiles {
    public static void main(String[] args) {
        
        TunaCreateFiles g = new TunaCreateFiles();
        g.openFile();
        g.addRecords();
        g.closeFile();
    }
}
