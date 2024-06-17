import java.io.*;
import java.lang.*;
import java.util.*;

public class TunaCreateFiles{

    private Formatter X;

public void openFile(){
    try{
        X = new Formatter("James.txt");
    }
    catch (Exception e){
        System.out.println("You have an error");
    }
}
public void addRecords(){
    X.format("%s%s%s\n","34 ","Seruwu ","Jimmy ");
    X.format("%s%s%s\n","37 ","Nakiranda ","Beatrice ");
    X.format("%s%s%s\n","32 ","Muteesasira ","Moses ");
    X.format("%s%s%s\n","30 ","Yiga ","Geofrey ");
}
public void closeFile(){
    X.close();// As a programmer, you must close your file to avoid intruders
}
}