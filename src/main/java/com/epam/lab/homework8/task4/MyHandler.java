package com.epam.lab.homework8.task4;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {
    static private Logger log = Logger.getLogger(MyHandler.class);

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        log.info("START: " + qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        log.info("END: " + qName + "\n");
    }

    public void characters(char ch[], int start, int length) {
        String str = new String(ch, start, length);
        if (!str.trim().isEmpty()) {
            log.info("   " + str);
        }
    }
}
