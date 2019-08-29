package com.blackjack.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The config properties holder for socket server.
 * Contains basic configuration like socket port, name.
 * A config file should be directly in classpath of the project like resources folder.
 *
 * @author Timur Berezhnoi
 */
public enum BlackJackServerProperty {

    SERVER_IP("server.ip", "127.0.0.1"),
    SERVER_PORT("server.port", "7765"),
    SERVER_NAME("server.name", "Black Jack game");

    private final String key;
    private final String defaultValue;

    private static final Properties properties;

    static {
        properties = new Properties();
        try(BufferedInputStream inputStream = new BufferedInputStream(BlackJackServerProperty.class.getClassLoader().getResourceAsStream("application.properties"))) {
            properties.load(inputStream);
        } catch(IOException e) {
            throw new RuntimeException("Error when loading configuration file", e);
        }
    }


    BlackJackServerProperty(final String key, final String defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    /**
     * Returns property value specified in application.properties or default value
     * if value or key is not found.
     *
     * @return property's value
     */
    public String getValue() {
        String value = properties.getProperty(key, defaultValue);
        return value.equals("") ? defaultValue : value;
    }
}