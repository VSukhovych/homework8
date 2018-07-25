package com.epam.lab.homework8.task5;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ValidateXML {
    static InputStream xmlIS, xsdIS;

    static boolean validateAgainstXSD() {
        try {
            xmlIS = new FileInputStream("src/main/resources/medicine.xml");
            xsdIS = new FileInputStream("src/main/resources/medicine.xsd");
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsdIS));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlIS));
            return true;
        } catch (IOException | SAXException e) {
            e.printStackTrace();
            return false;
        }
    }
}
