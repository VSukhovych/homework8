package com.epam.lab.homework8.task5;
import org.apache.log4j.Logger;
public class Main {
    private static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        String valid;
        if (ValidateXML.validateAgainstXSD())
            valid = "valid";
        else
            valid = "invalid";
        log.info("medicine.xml is " + valid);
    }
}
