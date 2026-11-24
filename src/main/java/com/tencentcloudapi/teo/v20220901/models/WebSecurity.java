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
    * <p>站点级策略的配置详情。</p>
    */
    @SerializedName("ZoneDefaultPolicy")
    @Expose
    private SecurityPolicy ZoneDefaultPolicy;

    /**
    * <p>域名级策略的配置详情。</p>
    */
    @SerializedName("HostPolicy")
    @Expose
    private HostPolicy [] HostPolicy;

    /**
    * <p>策略模板的配置详情。</p>
    */
    @SerializedName("Templates")
    @Expose
    private WebSecurityTemplates [] Templates;

    /**
     * Get <p>站点级策略的配置详情。</p> 
     * @return ZoneDefaultPolicy <p>站点级策略的配置详情。</p>
     */
    public SecurityPolicy getZoneDefaultPolicy() {
        return this.ZoneDefaultPolicy;
    }

    /**
     * Set <p>站点级策略的配置详情。</p>
     * @param ZoneDefaultPolicy <p>站点级策略的配置详情。</p>
     */
    public void setZoneDefaultPolicy(SecurityPolicy ZoneDefaultPolicy) {
        this.ZoneDefaultPolicy = ZoneDefaultPolicy;
    }

    /**
     * Get <p>域名级策略的配置详情。</p> 
     * @return HostPolicy <p>域名级策略的配置详情。</p>
     */
    public HostPolicy [] getHostPolicy() {
        return this.HostPolicy;
    }

    /**
     * Set <p>域名级策略的配置详情。</p>
     * @param HostPolicy <p>域名级策略的配置详情。</p>
     */
    public void setHostPolicy(HostPolicy [] HostPolicy) {
        this.HostPolicy = HostPolicy;
    }

    /**
     * Get <p>策略模板的配置详情。</p> 
     * @return Templates <p>策略模板的配置详情。</p>
     */
    public WebSecurityTemplates [] getTemplates() {
        return this.Templates;
    }

    /**
     * Set <p>策略模板的配置详情。</p>
     * @param Templates <p>策略模板的配置详情。</p>
     */
    public void setTemplates(WebSecurityTemplates [] Templates) {
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
            this.HostPolicy = new HostPolicy[source.HostPolicy.length];
            for (int i = 0; i < source.HostPolicy.length; i++) {
                this.HostPolicy[i] = new HostPolicy(source.HostPolicy[i]);
            }
        }
        if (source.Templates != null) {
            this.Templates = new WebSecurityTemplates[source.Templates.length];
            for (int i = 0; i < source.Templates.length; i++) {
                this.Templates[i] = new WebSecurityTemplates(source.Templates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ZoneDefaultPolicy.", this.ZoneDefaultPolicy);
        this.setParamArrayObj(map, prefix + "HostPolicy.", this.HostPolicy);
        this.setParamArrayObj(map, prefix + "Templates.", this.Templates);

    }
}

