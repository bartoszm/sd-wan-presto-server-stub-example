package com.amartus.yang.sdwan.api.impl;

import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePoint;
import com.amartus.yang.sdwan.model.tapi.topology.Node;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePoint;
import com.amartus.yang.sdwan.model.tapi.topology.Topology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bartosz.michalik@amartus.com
 */
public class TopologyServiceImpl {

    Logger logger = LoggerFactory.getLogger(TopologyServiceImpl.class);
    private final HashMap<String, Topology> topologies;
    private final ArrayList<ServiceInterfacePoint> serviceInterfacePoints;


    public TopologyServiceImpl() {
        logger.info("foo");

        topologies = new HashMap<>();
        serviceInterfacePoints = new ArrayList<>();

        Node n1 = toNode.apply("node1", Stream.of("ep11", "ep12", "ep13"));
        Node n2 = toNode.apply("node2", Stream.of("ep21", "ep22", "ep23"));

        Topology topoSystem = new Topology()
                .node(Arrays.asList(n1, n2));
        topologies.put("system", topoSystem);


    }

    public Optional<Topology> getTopologyDetails(String name) {
        logger.debug("Retrieving topology {}", name);
        return Optional.ofNullable(topologies.get(name));
    }


    public Optional<ServiceInterfacePoint> getServiceInterfacePointDetails(String uuid) throws Exception {
        // do some magic!
        // but for now
        throw new IllegalAccessException("Not implemented");
    }
    public List<ServiceInterfacePoint> getServiceInterfacePointList() throws Exception {
        return serviceInterfacePoints;
    }

    static Function<String, NodeEdgePoint> toNep = uuid ->
            new NodeEdgePoint()
                    .uuid(uuid)
                    .layerProtocolName(LayerProtocolName.ETH)
                    .name(Collections.singletonList(new NameAndValue("name", uuid)));

    static BiFunction<String, Stream<String>, Node> toNode = (uuid, neps) ->
            new Node()
                .uuid(uuid)
                .layerProtocolName(Collections.singletonList(LayerProtocolName.ETH))
                .ownedNodeEdgePoint(neps.map(toNep).collect(Collectors.toList()));



}
