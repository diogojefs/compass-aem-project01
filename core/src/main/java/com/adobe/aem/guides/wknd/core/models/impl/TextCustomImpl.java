package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import com.day.cq.wcm.api.components.ComponentContext;
import com.adobe.aem.guides.wknd.core.models.TextCustom;


@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {TextCustom.class},
        resourceType = {TextCustomImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TextCustomImpl implements TextCustom {
    protected static final String RESOURCE_TYPE = "wknd/components/textcustom";

    @ValueMapValue
    private String text;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public boolean isEmpty() {
        if (StringUtils.isBlank(text)) {
            // Name is missing, but required
            return true;
        } else {
            // Everything is populated, so this component is not considered empty
            return false;
        }
    }
}  
