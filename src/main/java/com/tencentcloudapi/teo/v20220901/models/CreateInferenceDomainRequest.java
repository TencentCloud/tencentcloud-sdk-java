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

public class CreateInferenceDomainRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>推理服务ID。</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>推理服务域名。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
    */
    @SerializedName("AuthSwitch")
    @Expose
    private String AuthSwitch;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>推理服务ID。</p> 
     * @return ServiceId <p>推理服务ID。</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务ID。</p>
     * @param ServiceId <p>推理服务ID。</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>推理服务域名。</p> 
     * @return Domain <p>推理服务域名。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>推理服务域名。</p>
     * @param Domain <p>推理服务域名。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p> 
     * @return AuthSwitch <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
     */
    public String getAuthSwitch() {
        return this.AuthSwitch;
    }

    /**
     * Set <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
     * @param AuthSwitch <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
     */
    public void setAuthSwitch(String AuthSwitch) {
        this.AuthSwitch = AuthSwitch;
    }

    public CreateInferenceDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInferenceDomainRequest(CreateInferenceDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AuthSwitch != null) {
            this.AuthSwitch = new String(source.AuthSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AuthSwitch", this.AuthSwitch);

    }
}

