package com.epam.lab.homework8.task4;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

class DOMParse {
    static private Logger log = Logger.getLogger(DOMParse.class);
    static private File file = new File("src/main/resources/medicine.xml");

    static void parseDOM() {
        try {
            DocumentBuilderFactory docBuildFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuild = docBuildFact.newDocumentBuilder();
            Document doc = docBuild.parse(file);
            NodeList nList = doc.getElementsByTagName("medicine");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node node = nList.item(temp);
                log.info("Current element: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    log.info("Name: " + element.getElementsByTagName("name"));
                    log.info("Pharm: " + element.getElementsByTagName("pharm"));
                    log.info("Group: " + element.getElementsByTagName("group"));
                    log.info("Analogs: " + element.getElementsByTagName("analogs"));
                    log.info("Versions: " + element.getElementsByTagName("versions"));
                    log.info("Certificate: " + element.getElementsByTagName("certificate"));
                    log.info("Certificate number: " + element.getElementsByTagName("certificate_number"));
                    log.info("Issue date: " + element.getElementsByTagName("issue_date"));
                    log.info("Expiration date: " + element.getElementsByTagName("expiration_date"));
                    log.info("Org registration: " + element.getElementsByTagName("org_registration"));
                    log.info("Package: " + element.getElementsByTagName("package"));
                    log.info("Type: " + element.getElementsByTagName("type"));
                    log.info("Quantity: " + element.getElementsByTagName("quantity"));
                    log.info("Price: " + element.getElementsByTagName("price"));
                    log.info("Dosage: " + element.getElementsByTagName("dosage"));
                    log.info("Quantity dosage: " + element.getElementsByTagName("quantity"));
                    log.info("Frequency: " + element.getElementsByTagName("frequency"));
                }
            }
        } catch (IOException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
