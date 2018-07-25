package com.epam.lab.homework8.task4;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

class SAXParse {
    static private final SAXParserFactory FACTORY = SAXParserFactory.newInstance();
    static private final File FILE = new File("src/main/resources/medicine.xml");

    static void parseSAX() {
        try {
            SAXParser saxParser = FACTORY.newSAXParser();
            DefaultHandler handler = new MyHandler();
            saxParser.parse(FILE, handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
