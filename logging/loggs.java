package com.sparta.ay.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loggs {
    public static void main(String[] args) {
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/ay/logging/myLog.log", true);
            logger.addHandler(fileHandler);
            //logger.setFilter(new CustomFilter());
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.setLevel(Level.ALL);
        logger.log(Level.INFO, "this is an information message");
        logger.log(Level.FINE, "this is a fine message");
        logger.log(Level.WARNING, "this is a Warning message");
    }

    private static final Logger logger = Logger.getLogger("my logger");
}
