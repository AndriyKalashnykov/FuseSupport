package org.oasis_open.docs.ws_sx.ws_trust._200512;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-12-13T16:33:33.511+05:30
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "SecurityTokenService", 
                  wsdlLocation = "file:/VirtualMachines/Git/FuseSupportExamples/cxf-sts-route-service/src/main/resources/wsdl/ws-trust-1.4-service.wsdl",
                  targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/") 
public class SecurityTokenService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/ws-sx/ws-trust/200512/", "SecurityTokenService");
    public final static QName UTPort = new QName("http://docs.oasis-open.org/ws-sx/ws-trust/200512/", "UT_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/VirtualMachines/Git/FuseSupportExamples/cxf-sts-route-service/src/main/resources/wsdl/ws-trust-1.4-service.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SecurityTokenService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/VirtualMachines/Git/FuseSupportExamples/cxf-sts-route-service/src/main/resources/wsdl/ws-trust-1.4-service.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SecurityTokenService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SecurityTokenService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SecurityTokenService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SecurityTokenService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SecurityTokenService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SecurityTokenService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns STS
     */
    @WebEndpoint(name = "UT_Port")
    public STS getUTPort() {
        return super.getPort(UTPort, STS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns STS
     */
    @WebEndpoint(name = "UT_Port")
    public STS getUTPort(WebServiceFeature... features) {
        return super.getPort(UTPort, STS.class, features);
    }

}
