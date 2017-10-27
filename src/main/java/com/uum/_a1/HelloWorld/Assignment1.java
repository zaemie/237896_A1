//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #237896
//Name: #Mohamad Zaemie Azamry Bin Mohamed Zain

package com.uum._a1.HelloWorld;

public class Assignment1 {
    public static void main(String[] args) {
        FindFile obj = new FindFile();
        String[] listJavaFile = obj.listJavaFile;
        Scan find = new Scan();
        find.scan(listJavaFile);
        System.out.println("Number of Java Files = " + find.totalJava);
        System.out.println("Number of Issues = " + find.noIssue);
    }
    
}
