package com.amartus.yang.sdwan.api.factories;

import com.amartus.yang.sdwan.api.OperationsApiService;
import com.amartus.yang.sdwan.api.impl.OperationsApiServiceImpl;

@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class OperationsApiServiceFactory {
    private final static OperationsApiService service = new OperationsApiServiceImpl();

    public static OperationsApiService getOperationsApi() {
        return service;
    }
}
