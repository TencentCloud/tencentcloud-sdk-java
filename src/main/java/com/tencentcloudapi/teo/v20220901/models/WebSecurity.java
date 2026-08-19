/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebSecurity extends AbstractModel {

    /**
    * 站点级策略的配置详情。
    */
    @SerializedName("ZoneDefaultPolicy")
    @Expose
    private SecurityPolicy ZoneDefaultPolicy;

    /**
    * 域名级策略的配置详情。
    */
    @SerializedName("HostPolicy")
    @Expose
    private HostPolicy HostPolicy;

    /**
    * 策略模板的配置详情。
    */
    @SerializedName("Templates")
    @Expose
    private WebSecurityTemplates Templates;

    /**
     * Get 站点级策略的配置详情。 
     * @return ZoneDefaultPolicy 站点级策略的配置详情。
     */
    public SecurityPolicy getZoneDefaultPolicy() {
        return this.ZoneDefaultPolicy;
    }

    /**
     * Set 站点级策略的配置详情。
     * @param ZoneDefaultPolicy 站点级策略的配置详情。
     */
    public void setZoneDefaultPolicy(SecurityPolicy ZoneDefaultPolicy) {
        this.ZoneDefaultPolicy = ZoneDefaultPolicy;
    }

    /**
     * Get 域名级策略的配置详情。 
     * @return HostPolicy 域名级策略的配置详情。
     */
    public HostPolicy getHostPolicy() {
        return this.HostPolicy;
    }

    /**
     * Set 域名级策略的配置详情。
     * @param HostPolicy 域名级策略的配置详情。
     */
    public void setHostPolicy(HostPolicy HostPolicy) {
        this.HostPolicy = HostPolicy;
    }

    /**
     * Get 策略模板的配置详情。 
     * @return Templates 策略模板的配置详情。
     */
    public WebSecurityTemplates getTemplates() {
        return this.Templates;
    }

    /**
     * Set 策略模板的配置详情。
     * @param Templates 策略模板的配置详情。
     */
    public void setTemplates(WebSecurityTemplates Templates) {
        this.Templates = Templates;
    }

    public WebSecurity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSecurity(WebSecurity source) {
        if (source.ZoneDefaultPolicy != null) {
            this.ZoneDefaultPolicy = new SecurityPolicy(source.ZoneDefaultPolicy);
        }
        if (source.HostPolicy != null) {
            this.HostPolicy = new HostPolicy(source.HostPolicy);
        }
        if (source.Templates != null) {
            this.Templates = new WebSecurityTemplates(source.Templates);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ZoneDefaultPolicy.", this.ZoneDefaultPolicy);
        this.setParamObj(map, prefix + "HostPolicy.", this.HostPolicy);
        this.setParamObj(map, prefix + "Templates.", this.Templates);

    }
}

