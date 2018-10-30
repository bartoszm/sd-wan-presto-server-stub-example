package com.amartus.yang.sdwan.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import io.swagger.util.Json;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Provider
@Produces({MediaType.APPLICATION_JSON, "application/yang-data+json"})
public class JacksonJsonProvider extends JacksonJaxbJsonProvider {
    private static ObjectMapper commonMapper = Json.mapper();
    static {
        commonMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public JacksonJsonProvider() {
        super.setMapper(commonMapper);
    }
}