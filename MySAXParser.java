package com.github.akshayavenkatesh8;

import static com.sun.org.apache.xerces.internal.jaxp.JAXPConstants.JAXP_SCHEMA_LANGUAGE;
import static com.sun.org.apache.xerces.internal.jaxp.JAXPConstants.JAXP_SCHEMA_SOURCE;
import java.io.File;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 *
 * @author akshaya
 */
public class MySAXParser {
    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
 
      try {	
         SAXParserFactory factory = SAXParserFactory.newInstance();
         factory.setValidating(true);
         factory.setNamespaceAware(true);
         
         SAXParser saxParser = factory.newSAXParser();
         
         USAddressHandler userhandler = new USAddressHandler();
         
         saxParser.setProperty(JAXP_SCHEMA_LANGUAGE, "http://www.w3.org/2001/XMLSchema");
         saxParser.setProperty(JAXP_SCHEMA_SOURCE, new File("address.xsd"));
         saxParser.getXMLReader().setErrorHandler(userhandler);
         
         if(userhandler.check == null){
                saxParser.parse("address.xml", userhandler);
                Address add= userhandler.getAddress();
                System.out.println(add);
         }
      } 
      catch (Exception e) {
             System.out.println(e);
      }
    }
}
   
   
