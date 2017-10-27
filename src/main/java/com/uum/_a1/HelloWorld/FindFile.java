package com.uum._a1.HelloWorld;

import static com.uum._a1.HelloWorld.Scan.filterJava;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class FindFile {
    public String[] listJavaFile;

    public FindFile() {
        Collection<File> all = new ArrayList<>();
        addTree(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Assignment1\\test"), all);
        Collection<File> a = all;
        listJavaFile = filterJava(a);
    }

    static void addTree(File file, Collection<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
                addTree(child, all);
            }
        }
    }

    
}
