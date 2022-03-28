package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import com.adobe.aem.guides.wknd.core.models.TitleCustom;


@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {TitleCustom.class},
        resourceType = {TitleCustomImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleCustomImpl implements TitleCustom {
    protected static final String RESOURCE_TYPE = "wknd/components/titlecustom";

    @ValueMapValue
    private String title;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isEmpty() {
        if (StringUtils.isBlank(title)) {
            // Name is missing, but required
            return true;
        } else {
            // Everything is populated, so this component is not considered empty
            return false;
        }
    }
}  
