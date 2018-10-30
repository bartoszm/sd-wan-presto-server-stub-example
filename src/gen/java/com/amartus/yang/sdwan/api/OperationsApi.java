package com.amartus.yang.sdwan.api;

import com.amartus.yang.sdwan.api.OperationsApiService;
import com.amartus.yang.sdwan.api.factories.OperationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@javax.ws.rs.Path("/operations")
@Consumes({ "application/yang-data+json" })
@Produces({ "application/yang-data+json" })
@io.swagger.annotations.Api(description = "the operations API")
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
    public class OperationsApi  {
    private final OperationsApiService delegate = OperationsApiServiceFactory.getOperationsApi();
    @javax.ws.rs.core.Context
    javax.ws.rs.core.UriInfo uriInfo;

        @POST
        @javax.ws.rs.Path("/compute-p-2-p-path")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.OutputWrapper.class, tags={ "tapi-path-computation", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.OutputWrapper.class) })
        public Response operationsComputeP2PPathPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.InputWrapper tapiPathComputationComputep2ppathInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsComputeP2PPathPost(tapiPathComputationComputep2ppathInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/create-connectivity-service")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.OutputWrapper.class, tags={ "tapi-connectivity", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.OutputWrapper.class) })
        public Response operationsCreateConnectivityServicePost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.InputWrapper tapiConnectivityCreateconnectivityserviceInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsCreateConnectivityServicePost(tapiConnectivityCreateconnectivityserviceInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/delete-connectivity-service")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-connectivity", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
        public Response operationsDeleteConnectivityServicePost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.connectivity.deleteconnectivityservice.InputWrapper tapiConnectivityDeleteconnectivityserviceInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsDeleteConnectivityServicePost(tapiConnectivityDeleteconnectivityserviceInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/delete-p-2-p-path")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.OutputWrapper.class, tags={ "tapi-path-computation", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.OutputWrapper.class) })
        public Response operationsDeleteP2PPathPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.InputWrapper tapiPathComputationDeletep2ppathInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsDeleteP2PPathPost(tapiPathComputationDeletep2ppathInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-connection-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.OutputWrapper.class, tags={ "tapi-connectivity", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.OutputWrapper.class) })
        public Response operationsGetConnectionDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.InputWrapper tapiConnectivityGetconnectiondetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetConnectionDetailsPost(tapiConnectivityGetconnectiondetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-connectivity-service-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.OutputWrapper.class, tags={ "tapi-connectivity", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.OutputWrapper.class) })
        public Response operationsGetConnectivityServiceDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.InputWrapper tapiConnectivityGetconnectivityservicedetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetConnectivityServiceDetailsPost(tapiConnectivityGetconnectivityservicedetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-connectivity-service-list")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicelist.OutputWrapper.class, tags={ "tapi-connectivity", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicelist.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicelist.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicelist.OutputWrapper.class) })
        public Response operationsGetConnectivityServiceListPost(@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetConnectivityServiceListPost(securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-link-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.OutputWrapper.class, tags={ "tapi-topology", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.OutputWrapper.class) })
        public Response operationsGetLinkDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.InputWrapper tapiTopologyGetlinkdetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetLinkDetailsPost(tapiTopologyGetlinkdetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-node-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.OutputWrapper.class, tags={ "tapi-topology", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.OutputWrapper.class) })
        public Response operationsGetNodeDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.InputWrapper tapiTopologyGetnodedetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetNodeDetailsPost(tapiTopologyGetnodedetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-node-edge-point-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.OutputWrapper.class, tags={ "tapi-topology", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.OutputWrapper.class) })
        public Response operationsGetNodeEdgePointDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.InputWrapper tapiTopologyGetnodeedgepointdetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetNodeEdgePointDetailsPost(tapiTopologyGetnodeedgepointdetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-service-interface-point-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.OutputWrapper.class, tags={ "tapi-common", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.OutputWrapper.class) })
        public Response operationsGetServiceInterfacePointDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.InputWrapper tapiCommonGetserviceinterfacepointdetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetServiceInterfacePointDetailsPost(tapiCommonGetserviceinterfacepointdetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-service-interface-point-list")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.OutputWrapper.class, tags={ "tapi-common", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.OutputWrapper.class) })
        public Response operationsGetServiceInterfacePointListPost(@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetServiceInterfacePointListPost(securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-topology-details")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.OutputWrapper.class, tags={ "tapi-topology", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.OutputWrapper.class) })
        public Response operationsGetTopologyDetailsPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.InputWrapper tapiTopologyGettopologydetailsInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetTopologyDetailsPost(tapiTopologyGettopologydetailsInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/get-topology-list")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologylist.OutputWrapper.class, tags={ "tapi-topology", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologylist.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologylist.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.topology.gettopologylist.OutputWrapper.class) })
        public Response operationsGetTopologyListPost(@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsGetTopologyListPost(securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/optimize-p-2-p-path")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.OutputWrapper.class, tags={ "tapi-path-computation", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.OutputWrapper.class) })
        public Response operationsOptimizeP2PPathPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.InputWrapper tapiPathComputationOptimizep2ppathInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsOptimizeP2PPathPost(tapiPathComputationOptimizep2ppathInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/update-connectivity-service")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.OutputWrapper.class, tags={ "tapi-connectivity", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.OutputWrapper.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.OutputWrapper.class) })
        public Response operationsUpdateConnectivityServicePost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.InputWrapper tapiConnectivityUpdateconnectivityserviceInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsUpdateConnectivityServicePost(tapiConnectivityUpdateconnectivityserviceInputWrapper,securityContext, uriInfo);
        }
        @POST
        @javax.ws.rs.Path("/update-service-interface-point")
        @Consumes({ "application/yang-data+json" })
        @Produces({ "application/yang-data+json" })
        @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-common", })
        @io.swagger.annotations.ApiResponses(value = { 
            @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
        public Response operationsUpdateServiceInterfacePointPost(@ApiParam(value = "" ) com.amartus.yang.sdwan.model.tapi.common.updateserviceinterfacepoint.InputWrapper tapiCommonUpdateserviceinterfacepointInputWrapper
,@javax.ws.rs.core.Context SecurityContext securityContext)
        throws Exception {
        return delegate.operationsUpdateServiceInterfacePointPost(tapiCommonUpdateserviceinterfacepointInputWrapper,securityContext, uriInfo);
        }
    }
