package com.epam.lab.homework8.task4;

import org.apache.log4j.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("DOM parse:");
        DOMParse.parseDOM();
        System.out.println();
        log.info("SAX parse:");
        SAXParse.parseSAX();
    }
}
