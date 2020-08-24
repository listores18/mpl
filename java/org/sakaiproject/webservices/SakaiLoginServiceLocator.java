/**
 * SakaiLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sakaiproject.webservices;

public class SakaiLoginServiceLocator extends org.apache.axis.client.Service implements org.sakaiproject.webservices.SakaiLoginService {

    public SakaiLoginServiceLocator() {
    }


    public SakaiLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SakaiLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SakaiLoginPort
    private java.lang.String SakaiLoginPort_address = "https://qa12-mysql.nightly.sakaiproject.org/sakai-ws/soap/login";

    public java.lang.String getSakaiLoginPortAddress() {
        return SakaiLoginPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SakaiLoginPortWSDDServiceName = "SakaiLoginPort";

    public java.lang.String getSakaiLoginPortWSDDServiceName() {
        return SakaiLoginPortWSDDServiceName;
    }

    public void setSakaiLoginPortWSDDServiceName(java.lang.String name) {
        SakaiLoginPortWSDDServiceName = name;
    }

    public org.sakaiproject.webservices.SakaiLogin getSakaiLoginPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SakaiLoginPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSakaiLoginPort(endpoint);
    }

    public org.sakaiproject.webservices.SakaiLogin getSakaiLoginPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sakaiproject.webservices.SakaiLoginServiceSoapBindingStub _stub = new org.sakaiproject.webservices.SakaiLoginServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSakaiLoginPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSakaiLoginPortEndpointAddress(java.lang.String address) {
        SakaiLoginPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sakaiproject.webservices.SakaiLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sakaiproject.webservices.SakaiLoginServiceSoapBindingStub _stub = new org.sakaiproject.webservices.SakaiLoginServiceSoapBindingStub(new java.net.URL(SakaiLoginPort_address), this);
                _stub.setPortName(getSakaiLoginPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SakaiLoginPort".equals(inputPortName)) {
            return getSakaiLoginPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.sakaiproject.org/", "SakaiLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.sakaiproject.org/", "SakaiLoginPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SakaiLoginPort".equals(portName)) {
            setSakaiLoginPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
