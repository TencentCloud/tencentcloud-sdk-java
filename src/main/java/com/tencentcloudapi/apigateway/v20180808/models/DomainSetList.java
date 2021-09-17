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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainSetList extends AbstractModel{

    /**
    * 域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 域名解析状态。1 表示正常解析，0 表示解析失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 证书ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 是否使用默认路径映射。
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * 自定义域名协议类型。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 网络类型（'INNER' 或 'OUTER'）。
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 是否将HTTP请求强制跳转 HTTPS，默认为false。参数为 true时，API网关会将所有使用该自定义域名的 HTTP 协议的请求重定向至 HTTPS 协议进行转发。
    */
    @SerializedName("IsForcedHttps")
    @Expose
    private Boolean IsForcedHttps;

    /**
    * 域名备案注册状态
    */
    @SerializedName("RegistrationStatus")
    @Expose
    private Boolean RegistrationStatus;

    /**
     * Get 域名名称。 
     * @return DomainName 域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名名称。
     * @param DomainName 域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 域名解析状态。1 表示正常解析，0 表示解析失败。 
     * @return Status 域名解析状态。1 表示正常解析，0 表示解析失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 域名解析状态。1 表示正常解析，0 表示解析失败。
     * @param Status 域名解析状态。1 表示正常解析，0 表示解析失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 证书ID。 
     * @return CertificateId 证书ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书ID。
     * @param CertificateId 证书ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 是否使用默认路径映射。 
     * @return IsDefaultMapping 是否使用默认路径映射。
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set 是否使用默认路径映射。
     * @param IsDefaultMapping 是否使用默认路径映射。
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get 自定义域名协议类型。 
     * @return Protocol 自定义域名协议类型。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 自定义域名协议类型。
     * @param Protocol 自定义域名协议类型。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 网络类型（'INNER' 或 'OUTER'）。 
     * @return NetType 网络类型（'INNER' 或 'OUTER'）。
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型（'INNER' 或 'OUTER'）。
     * @param NetType 网络类型（'INNER' 或 'OUTER'）。
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 是否将HTTP请求强制跳转 HTTPS，默认为false。参数为 true时，API网关会将所有使用该自定义域名的 HTTP 协议的请求重定向至 HTTPS 协议进行转发。 
     * @return IsForcedHttps 是否将HTTP请求强制跳转 HTTPS，默认为false。参数为 true时，API网关会将所有使用该自定义域名的 HTTP 协议的请求重定向至 HTTPS 协议进行转发。
     */
    public Boolean getIsForcedHttps() {
        return this.IsForcedHttps;
    }

    /**
     * Set 是否将HTTP请求强制跳转 HTTPS，默认为false。参数为 true时，API网关会将所有使用该自定义域名的 HTTP 协议的请求重定向至 HTTPS 协议进行转发。
     * @param IsForcedHttps 是否将HTTP请求强制跳转 HTTPS，默认为false。参数为 true时，API网关会将所有使用该自定义域名的 HTTP 协议的请求重定向至 HTTPS 协议进行转发。
     */
    public void setIsForcedHttps(Boolean IsForcedHttps) {
        this.IsForcedHttps = IsForcedHttps;
    }

    /**
     * Get 域名备案注册状态 
     * @return RegistrationStatus 域名备案注册状态
     */
    public Boolean getRegistrationStatus() {
        return this.RegistrationStatus;
    }

    /**
     * Set 域名备案注册状态
     * @param RegistrationStatus 域名备案注册状态
     */
    public void setRegistrationStatus(Boolean RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public DomainSetList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainSetList(DomainSetList source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.IsDefaultMapping != null) {
            this.IsDefaultMapping = new Boolean(source.IsDefaultMapping);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.IsForcedHttps != null) {
            this.IsForcedHttps = new Boolean(source.IsForcedHttps);
        }
        if (source.RegistrationStatus != null) {
            this.RegistrationStatus = new Boolean(source.RegistrationStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "IsForcedHttps", this.IsForcedHttps);
        this.setParamSimple(map, prefix + "RegistrationStatus", this.RegistrationStatus);

    }
}

