package com.explore.response_wrapper.controlleradvice;

import com.explore.response_wrapper.entity.MetaData;
import com.explore.response_wrapper.entity.RestResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class ResponseControllerBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {
        // TODO Auto-generated method stub
        final RestResponse<Object> output = new RestResponse<>();
        output.setData(body);
        MetaData metaData = new MetaData(true, "success.code", "2343wssdf352362835686987978");
        output.setMetaData(metaData);
        return output;
    }

}
