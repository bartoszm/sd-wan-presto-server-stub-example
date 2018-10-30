package com.amartus.yang.sdwan.api;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public abstract class OperationsApiService {
    /**
      *   For path @javax.ws.rs.Path("/compute-p-2-p-path")
      *   
      *   @param tapiPathComputationComputep2ppathInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.OutputWrapper }
      */
    public abstract Response operationsComputeP2PPathPost(com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.InputWrapper tapiPathComputationComputep2ppathInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/create-connectivity-service")
      *   
      *   @param tapiConnectivityCreateconnectivityserviceInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.OutputWrapper }
      */
    public abstract Response operationsCreateConnectivityServicePost(com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.InputWrapper tapiConnectivityCreateconnectivityserviceInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/delete-connectivity-service")
      *   
      *   @param tapiConnectivityDeleteconnectivityserviceInputWrapper
      *   @return in case of success {@link Void }
      */
    public abstract Response operationsDeleteConnectivityServicePost(com.amartus.yang.sdwan.model.tapi.connectivity.deleteconnectivityservice.InputWrapper tapiConnectivityDeleteconnectivityserviceInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/delete-p-2-p-path")
      *   
      *   @param tapiPathComputationDeletep2ppathInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.OutputWrapper }
      */
    public abstract Response operationsDeleteP2PPathPost(com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.InputWrapper tapiPathComputationDeletep2ppathInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-connection-details")
      *   
      *   @param tapiConnectivityGetconnectiondetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.OutputWrapper }
      */
    public abstract Response operationsGetConnectionDetailsPost(com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.InputWrapper tapiConnectivityGetconnectiondetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-connectivity-service-details")
      *   
      *   @param tapiConnectivityGetconnectivityservicedetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.OutputWrapper }
      */
    public abstract Response operationsGetConnectivityServiceDetailsPost(com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.InputWrapper tapiConnectivityGetconnectivityservicedetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-connectivity-service-list")
      *   
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicelist.OutputWrapper }
      */
    public abstract Response operationsGetConnectivityServiceListPost(SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-link-details")
      *   
      *   @param tapiTopologyGetlinkdetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.OutputWrapper }
      */
    public abstract Response operationsGetLinkDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.InputWrapper tapiTopologyGetlinkdetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-node-details")
      *   
      *   @param tapiTopologyGetnodedetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.OutputWrapper }
      */
    public abstract Response operationsGetNodeDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.InputWrapper tapiTopologyGetnodedetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-node-edge-point-details")
      *   
      *   @param tapiTopologyGetnodeedgepointdetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.OutputWrapper }
      */
    public abstract Response operationsGetNodeEdgePointDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.InputWrapper tapiTopologyGetnodeedgepointdetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-service-interface-point-details")
      *   
      *   @param tapiCommonGetserviceinterfacepointdetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.OutputWrapper }
      */
    public abstract Response operationsGetServiceInterfacePointDetailsPost(com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.InputWrapper tapiCommonGetserviceinterfacepointdetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-service-interface-point-list")
      *   
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.OutputWrapper }
      */
    public abstract Response operationsGetServiceInterfacePointListPost(SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-topology-details")
      *   
      *   @param tapiTopologyGettopologydetailsInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.OutputWrapper }
      */
    public abstract Response operationsGetTopologyDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.InputWrapper tapiTopologyGettopologydetailsInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/get-topology-list")
      *   
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.topology.gettopologylist.OutputWrapper }
      */
    public abstract Response operationsGetTopologyListPost(SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/optimize-p-2-p-path")
      *   
      *   @param tapiPathComputationOptimizep2ppathInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.OutputWrapper }
      */
    public abstract Response operationsOptimizeP2PPathPost(com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.InputWrapper tapiPathComputationOptimizep2ppathInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/update-connectivity-service")
      *   
      *   @param tapiConnectivityUpdateconnectivityserviceInputWrapper
      *   @return in case of success {@link com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.OutputWrapper }
      */
    public abstract Response operationsUpdateConnectivityServicePost(com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.InputWrapper tapiConnectivityUpdateconnectivityserviceInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
    /**
      *   For path @javax.ws.rs.Path("/update-service-interface-point")
      *   
      *   @param tapiCommonUpdateserviceinterfacepointInputWrapper
      *   @return in case of success {@link Void }
      */
    public abstract Response operationsUpdateServiceInterfacePointPost(com.amartus.yang.sdwan.model.tapi.common.updateserviceinterfacepoint.InputWrapper tapiCommonUpdateserviceinterfacepointInputWrapper,SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception;
}
