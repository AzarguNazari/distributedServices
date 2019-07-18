
package resources.jaxws.searchservice.uniba.de;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SearchTicketResourceService", targetNamespace = "de.uniba.searchservice.jaxws.resources", wsdlLocation = "http://localhost:9999/search?wsdl")
public class SearchTicketResourceService
    extends Service
{

    private final static URL SEARCHTICKETRESOURCESERVICE_WSDL_LOCATION;
    private final static WebServiceException SEARCHTICKETRESOURCESERVICE_EXCEPTION;
    private final static QName SEARCHTICKETRESOURCESERVICE_QNAME = new QName("de.uniba.searchservice.jaxws.resources", "SearchTicketResourceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/search?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SEARCHTICKETRESOURCESERVICE_WSDL_LOCATION = url;
        SEARCHTICKETRESOURCESERVICE_EXCEPTION = e;
    }

    public SearchTicketResourceService() {
        super(__getWsdlLocation(), SEARCHTICKETRESOURCESERVICE_QNAME);
    }

    public SearchTicketResourceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEARCHTICKETRESOURCESERVICE_QNAME, features);
    }

    public SearchTicketResourceService(URL wsdlLocation) {
        super(wsdlLocation, SEARCHTICKETRESOURCESERVICE_QNAME);
    }

    public SearchTicketResourceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEARCHTICKETRESOURCESERVICE_QNAME, features);
    }

    public SearchTicketResourceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchTicketResourceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SearchTicketResource
     */
    @WebEndpoint(name = "SearchTicketResourcePort")
    public SearchTicketResource getSearchTicketResourcePort() {
        return super.getPort(new QName("de.uniba.searchservice.jaxws.resources", "SearchTicketResourcePort"), SearchTicketResource.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchTicketResource
     */
    @WebEndpoint(name = "SearchTicketResourcePort")
    public SearchTicketResource getSearchTicketResourcePort(WebServiceFeature... features) {
        return super.getPort(new QName("de.uniba.searchservice.jaxws.resources", "SearchTicketResourcePort"), SearchTicketResource.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEARCHTICKETRESOURCESERVICE_EXCEPTION!= null) {
            throw SEARCHTICKETRESOURCESERVICE_EXCEPTION;
        }
        return SEARCHTICKETRESOURCESERVICE_WSDL_LOCATION;
    }

}
