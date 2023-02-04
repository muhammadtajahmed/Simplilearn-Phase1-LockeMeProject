package com.lockedme;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

    // MyFile file = new MyFile();
    List<MyFile> files = new ArrayList<>();
    public void addfile(String fname) throws IOException {
        File f = new File("D://downloads/New folder/" + fname + ".txt");
        if (f.createNewFile())
            System.out.println("file " + fname + ".txt Successfully Added");
        else
            System.out.println("File already existed");

    }

    public void deletefile(String fname) throws IOException {
        boolean match1 = fileMatch(fname);
        if (match1) {
            File f = new File("D://downloads/New folder/" + fname + ".txt");
            if (f.delete())
                System.out.println("file " + fname + ".txt Successfully deleted");
        }
    }

    public boolean fileMatch(String fname) { // performing match by making file as String
        boolean match = false;
        String fm;                                      // fm -> file match
        File f = new File("D://downloads/New folder/");
        String[] flist = f.list();
        for (String name : flist) {
            fm = name.split("\\.")[0];
            if (fname.equals(fm)) {
                // System.out.println("file Exist");
                match = true;
            } 
        }
        if(!match)System.out.println("file Doesnot Exist");
        return match;

    }

    public void searchfile(String fname) { // performing search by making file as object
        String fs;
        boolean found = false; // fs -> file search
        File f = new File("D://downloads/New folder/");
        String[] filelist = f.list();
        for (String fn : filelist) {
            files.add(new MyFile(fn));
        }
        for (MyFile x : files) {
            fs = x.getFileName().split("\\.")[0];
            if (fname.equals(fs)) {
                System.out.println("file you are searching is present in the Application");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("file you are searching is NOT present in the Application");

    }

    public void displayfiles() {
        String df;                                       // df- display files
        File f = new File("D://downloads/New folder/");
        String[] filelist = f.list();
        for (String fn : filelist) {
            files.add(new MyFile(fn));
        }
        for (MyFile x : files) {
            df = x.getFileName();
            System.out.println(df);
        }
    }
}

