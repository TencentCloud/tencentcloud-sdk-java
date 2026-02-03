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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindCloudBaseAccessDomainRequest extends AbstractModel {

    /**
    * 服务Id，目前是指环境Id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 自定义域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 腾讯云证书Id
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 默认1，1 绑定默认Cdn，2 绑定TcbIngress（不经过cdn），4 绑定自定义cdn
    */
    @SerializedName("BindFlag")
    @Expose
    private Long BindFlag;

    /**
    * 自定义cdn cname域名
    */
    @SerializedName("CustomCname")
    @Expose
    private String CustomCname;

    /**
     * Get 服务Id，目前是指环境Id 
     * @return ServiceId 服务Id，目前是指环境Id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务Id，目前是指环境Id
     * @param ServiceId 服务Id，目前是指环境Id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 自定义域名 
     * @return Domain 自定义域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 自定义域名
     * @param Domain 自定义域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 腾讯云证书Id 
     * @return CertId 腾讯云证书Id
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 腾讯云证书Id
     * @param CertId 腾讯云证书Id
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 默认1，1 绑定默认Cdn，2 绑定TcbIngress（不经过cdn），4 绑定自定义cdn 
     * @return BindFlag 默认1，1 绑定默认Cdn，2 绑定TcbIngress（不经过cdn），4 绑定自定义cdn
     */
    public Long getBindFlag() {
        return this.BindFlag;
    }

    /**
     * Set 默认1，1 绑定默认Cdn，2 绑定TcbIngress（不经过cdn），4 绑定自定义cdn
     * @param BindFlag 默认1，1 绑定默认Cdn，2 绑定TcbIngress（不经过cdn），4 绑定自定义cdn
     */
    public void setBindFlag(Long BindFlag) {
        this.BindFlag = BindFlag;
    }

    /**
     * Get 自定义cdn cname域名 
     * @return CustomCname 自定义cdn cname域名
     */
    public String getCustomCname() {
        return this.CustomCname;
    }

    /**
     * Set 自定义cdn cname域名
     * @param CustomCname 自定义cdn cname域名
     */
    public void setCustomCname(String CustomCname) {
        this.CustomCname = CustomCname;
    }

    public BindCloudBaseAccessDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindCloudBaseAccessDomainRequest(BindCloudBaseAccessDomainRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.BindFlag != null) {
            this.BindFlag = new Long(source.BindFlag);
        }
        if (source.CustomCname != null) {
            this.CustomCname = new String(source.CustomCname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "BindFlag", this.BindFlag);
        this.setParamSimple(map, prefix + "CustomCname", this.CustomCname);

    }
}

