package com.amartus.yang.sdwan.api.impl;

import com.amartus.yang.sdwan.api.*;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePoint;
import com.amartus.yang.sdwan.model.tapi.topology.Topology;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Optional;

@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class OperationsApiServiceImpl extends OperationsApiService {

    private ConnectivityServiceImpl connectivityService = new ConnectivityServiceImpl();
    private TopologyServiceImpl topologyService = new TopologyServiceImpl();

    @Override
    public Response operationsComputeP2PPathPost(com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath.InputWrapper tapiPathComputationComputep2ppathInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsCreateConnectivityServicePost(com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        return connectivityService.createConnectivityService(input, securityContext, uriInfo);
    }
    @Override
    public Response operationsDeleteConnectivityServicePost(com.amartus.yang.sdwan.model.tapi.connectivity.deleteconnectivityservice.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        return connectivityService.deleteConnectivityService(input, securityContext, uriInfo);
    }
    @Override
    public Response operationsDeleteP2PPathPost(com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath.InputWrapper tapiPathComputationDeletep2ppathInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsGetConnectionDetailsPost(com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails.InputWrapper tapiConnectivityGetconnectiondetailsInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsGetConnectivityServiceDetailsPost(com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        return connectivityService.getConnectivityServiceDetails(input, securityContext, uriInfo);
    }
    @Override
    public Response operationsGetConnectivityServiceListPost(SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        return connectivityService.getConnectivityServiceList(securityContext, uriInfo);
    }
    @Override
    public Response operationsGetLinkDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.getlinkdetails.InputWrapper tapiTopologyGetlinkdetailsInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsGetNodeDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.getnodedetails.InputWrapper tapiTopologyGetnodedetailsInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsGetNodeEdgePointDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails.InputWrapper tapiTopologyGetnodeedgepointdetailsInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsGetServiceInterfacePointDetailsPost(com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointdetails.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        String name = input.getInput().getSipIdOrName();
        try {
            Optional<ServiceInterfacePoint> sip = topologyService.getServiceInterfacePointDetails(name);
            if(sip.isPresent()) {
                return Response.ok(sip).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch(Exception e) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response operationsGetServiceInterfacePointListPost(SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
//        return topologyService.getServiceInterfacePointList();
        return null;
    }
    @Override
    public Response operationsGetTopologyDetailsPost(com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        String name = input.getInput().getTopologyIdOrName();
        try {
            Optional<Topology> topology = topologyService.getTopologyDetails(name);
            if(topology.isPresent()) {
                return Response.ok(topology).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
    @Override
    public Response operationsGetTopologyListPost(SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsOptimizeP2PPathPost(com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath.InputWrapper tapiPathComputationOptimizep2ppathInputWrapper, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    @Override
    public Response operationsUpdateConnectivityServicePost(com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {
        return connectivityService.updateConnectivityService(input, securityContext, uriInfo);
    }
    @Override
    public Response operationsUpdateServiceInterfacePointPost(com.amartus.yang.sdwan.model.tapi.common.updateserviceinterfacepoint.InputWrapper input, SecurityContext securityContext, javax.ws.rs.core.UriInfo uriInfo) throws Exception {

        throw new IllegalAccessException("Not implemented");
    }
}
