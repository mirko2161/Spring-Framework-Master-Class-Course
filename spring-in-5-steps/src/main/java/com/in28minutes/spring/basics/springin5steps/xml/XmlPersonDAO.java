package com.in28minutes.spring.basics.springin5steps.xml;

public class XmlPersonDAO {

    XmlJdbcConnection jdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return jdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

}
