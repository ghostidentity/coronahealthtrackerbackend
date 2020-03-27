package me.mtagab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

@Configuration
public class WebConfigSupport extends WebMvcConfigurationSupport {

    @Override
    protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new ApiAwareRequestMappingHandlerMapping();
    }

    private static class ApiAwareRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

        private static final String API_PATH_PREFIX = "api";

        @Override
        protected void registerHandlerMethod(Object handler, Method method, RequestMappingInfo mapping) {
            Class<?> beanType = method.getDeclaringClass();
            if (AnnotationUtils.findAnnotation(beanType, RestController.class) != null) {
                PatternsRequestCondition apiPattern = new PatternsRequestCondition(API_PATH_PREFIX)
                        .combine(mapping.getPatternsCondition());

                mapping = new RequestMappingInfo(mapping.getName(), apiPattern, mapping.getMethodsCondition(),
                        mapping.getParamsCondition(), mapping.getHeadersCondition(), mapping.getConsumesCondition(),
                        mapping.getProducesCondition(), mapping.getCustomCondition());
            }
            super.registerHandlerMethod(handler, method, mapping);
        }
    }
}
