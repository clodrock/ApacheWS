package in.benchresources.services.musicservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-10-09T10:17:41.478+03:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "MusicService", 
                  wsdlLocation = "file:/C:/Users/samet/git/mts-education/ApacheCXF-JAX-WS-Top-Down-Spring-Hibernate/src/main/resources/com/jaxws/series/td/spring/hibernate/services/MusicService.wsdl",
                  targetNamespace = "http://benchresources.in/services/MusicService/") 
public class MusicService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://benchresources.in/services/MusicService/", "MusicService");
    public final static QName MusicServicePort = new QName("http://benchresources.in/services/MusicService/", "MusicServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/samet/git/mts-education/ApacheCXF-JAX-WS-Top-Down-Spring-Hibernate/src/main/resources/com/jaxws/series/td/spring/hibernate/services/MusicService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MusicService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/samet/git/mts-education/ApacheCXF-JAX-WS-Top-Down-Spring-Hibernate/src/main/resources/com/jaxws/series/td/spring/hibernate/services/MusicService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MusicService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MusicService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MusicService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MusicService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MusicService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MusicService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IMusicService
     */
    @WebEndpoint(name = "MusicServicePort")
    public IMusicService getMusicServicePort() {
        return super.getPort(MusicServicePort, IMusicService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMusicService
     */
    @WebEndpoint(name = "MusicServicePort")
    public IMusicService getMusicServicePort(WebServiceFeature... features) {
        return super.getPort(MusicServicePort, IMusicService.class, features);
    }

}