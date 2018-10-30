package com.amartus.yang.sdwan.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("mef-common,ietf-inet-types,tapi-connectivity,tapi-common,tapi-path-computation,mef-sdwan,mef-common-types,tapi-topology,mef-sdwan-connectivity API generated from yang definitions")
      .termsOfService("")
      .contact(new Contact()
        .email(""))
      .license(new License()
        .name("")
        .url(""));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
