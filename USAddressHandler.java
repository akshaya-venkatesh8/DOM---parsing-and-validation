package com.github.akshayavenkatesh8;
import java.util.jar.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
class USAddressHandler extends DefaultHandler {
    public Address address = new Address();
    public String elementContent;
   public void startElement(String uri, String localName, String qName, Attributes att) throws SAXException {
       
       elementContent = "";
       
   }
    @Override
   public void endElement(String uri, String localName, String qName)  {
     
	
              if (qName.equalsIgnoreCase("name")) {
             address.setName(elementContent);
              } else if (qName.equalsIgnoreCase("streetnumber")) {
                     address.setStreetNumber(elementContent);
              } else if (qName.equalsIgnoreCase("streetname")) {
                     address.setStreetName(elementContent);
              } else if (qName.equalsIgnoreCase("secondaryaddress")) {
                     address.setSecondaryAddress(elementContent);
              } else if (qName.equalsIgnoreCase("city")) {
                     address.setCity(elementContent);
              } else if (qName.equalsIgnoreCase("statecode")) {
                     address.setStateCode(elementContent);
              } else if (qName.equalsIgnoreCase("zipcode")) {
                     address.setZipCode(elementContent);
              }
        


}

      @Override
   public void characters(char[] buffer, int start, int length)  {
      
         elementContent = new String(buffer, start, length);
        
   }
   public Address getAddress()
   {
       return address;
   }
    
}
