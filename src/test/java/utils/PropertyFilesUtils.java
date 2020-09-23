package utils;

import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;
import java.io.IOException;

public class PropertyFilesUtils {

    protected static Properties browserProperties;
    protected static Properties loginCredentialsProperties;


    public static void initializeBrowserProperties() throws IOException {
        browserProperties = new Properties();
        File file = new File("src//test//resources//BrowserConfig.properties");  //creating a file object path
        FileInputStream fis = new FileInputStream(file);
        browserProperties.load(fis);
    }

    public static void initializeLoginCredentialsProperties() throws IOException {
        loginCredentialsProperties = new Properties();
        File file = new File("src//test//resources//LoginTestData.properties");  //creating a file object path
        FileInputStream fis = new FileInputStream(file);
        loginCredentialsProperties.load(fis);

    }


    public static String getBrowser() {
        return browserProperties.getProperty("Browser");
    }

    public static String getBrowserProperties() {
        return browserProperties.getProperty("ChromeProp");
    }

    public static String getBrowserDriverPath() {
        return browserProperties.getProperty("ChromePath");

    }

    public static String getTestRunLocation() {

        return browserProperties.getProperty("Location");
    }

    public static String getUserEmail() {
        return loginCredentialsProperties.getProperty("email");
    }

    public static String getUserPassword() {

        return loginCredentialsProperties.getProperty("password");
    }
//    public static String getUserFirstName(){
//       return loginCredentialsProperties.getProperty("");
//    }
//    public static String getUserLastName(){
//       return loginCredentialsProperties.getProperty("");
//    }
}

