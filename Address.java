package com.github.akshayavenkatesh8;
class Address {
        public String name;
        public String streetNumber;
        public String streetName;
        public String secondaryAddress;
        public String city;
        public String stateCode;
        public String zipCode;
        
        public void setName(String name)
        {
            this.name=name;
        }
        
        public void setStreetNumber(String streetNumber)
        {
            this.streetNumber=streetNumber;
        }
        public void setStreetName(String streetName)
        {
            this.streetName=streetName;
        }
        public void setSecondaryAddress(String secondaryAddress)
        {
            this.secondaryAddress=secondaryAddress;
        }
        public void setCity(String city)
        {
            this.city=city;
        }
        public void setStateCode (String stateCode)
        {
            this.stateCode=stateCode;
        }
        public void setZipCode (String zipCode)
        {
            this.zipCode=zipCode;
        }
        public String toString()
        {
           return "Address :\n"+name+",\n"+streetNumber+" "+streetName+",\n"+secondaryAddress+",\n"+city+",\n"+stateCode+" "+zipCode;
        }
}
