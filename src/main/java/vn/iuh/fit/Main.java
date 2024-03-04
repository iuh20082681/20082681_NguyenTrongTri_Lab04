package vn.iuh.fit;

import jdepend.xmlui.JDepend;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        JDepend jDepend = new JDepend(new PrintWriter("reports/report.xml"));
        jDepend.addDirectory("T:\\Library-Assistant-master");
        jDepend.analyze();
        System.out.println("DONE");
    }
}