/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProtectionStatusRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 1：开启WAF开关，0：关闭WAF开关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 1：开启WAF开关，0：关闭WAF开关 
     * @return Status 1：开启WAF开关，0：关闭WAF开关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1：开启WAF开关，0：关闭WAF开关
     * @param Status 1：开启WAF开关，0：关闭WAF开关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。 
     * @return Edition WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
     * @param Edition WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public ModifyProtectionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectionStatusRequest(ModifyProtectionStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Edition", this.Edition);

    }
}

