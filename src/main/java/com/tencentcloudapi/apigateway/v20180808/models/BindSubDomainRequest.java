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

public class BindSubDomainRequest extends AbstractModel{

    /**
    * 服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待绑定的自定义的域名。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 服务支持协议，可选值为http、https、http&https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 网络类型，可选值为OUTER、INNER。
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 是否使用默认路径映射，默认为 true。为 false 时，表示自定义路径映射，此时 PathMappingSet 必填。
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * 默认域名。
    */
    @SerializedName("NetSubDomain")
    @Expose
    private String NetSubDomain;

    /**
    * 待绑定自定义域名的证书唯一 ID。针对Protocol 为https或http&https可以选择上传。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 自定义域名路径映射，最多输入三个Environment，并且只能分别取值“test”、 ”prepub“、”release“。
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

    /**
    * 是否将HTTP请求强制跳转 HTTPS，默认为false。参数为 true时，API网关会将所有使用该自定义域名的 HTTP 协议的请求重定向至 HTTPS 协议进行转发。
    */
    @SerializedName("IsForcedHttps")
    @Expose
    private Boolean IsForcedHttps;

    /**
     * Get 服务唯一 ID。 
     * @return ServiceId 服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一 ID。
     * @param ServiceId 服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待绑定的自定义的域名。 
     * @return SubDomain 待绑定的自定义的域名。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 待绑定的自定义的域名。
     * @param SubDomain 待绑定的自定义的域名。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 服务支持协议，可选值为http、https、http&https。 
     * @return Protocol 服务支持协议，可选值为http、https、http&https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 服务支持协议，可选值为http、https、http&https。
     * @param Protocol 服务支持协议，可选值为http、https、http&https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 网络类型，可选值为OUTER、INNER。 
     * @return NetType 网络类型，可选值为OUTER、INNER。
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型，可选值为OUTER、INNER。
     * @param NetType 网络类型，可选值为OUTER、INNER。
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 是否使用默认路径映射，默认为 true。为 false 时，表示自定义路径映射，此时 PathMappingSet 必填。 
     * @return IsDefaultMapping 是否使用默认路径映射，默认为 true。为 false 时，表示自定义路径映射，此时 PathMappingSet 必填。
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set 是否使用默认路径映射，默认为 true。为 false 时，表示自定义路径映射，此时 PathMappingSet 必填。
     * @param IsDefaultMapping 是否使用默认路径映射，默认为 true。为 false 时，表示自定义路径映射，此时 PathMappingSet 必填。
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get 默认域名。 
     * @return NetSubDomain 默认域名。
     */
    public String getNetSubDomain() {
        return this.NetSubDomain;
    }

    /**
     * Set 默认域名。
     * @param NetSubDomain 默认域名。
     */
    public void setNetSubDomain(String NetSubDomain) {
        this.NetSubDomain = NetSubDomain;
    }

    /**
     * Get 待绑定自定义域名的证书唯一 ID。针对Protocol 为https或http&https可以选择上传。 
     * @return CertificateId 待绑定自定义域名的证书唯一 ID。针对Protocol 为https或http&https可以选择上传。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 待绑定自定义域名的证书唯一 ID。针对Protocol 为https或http&https可以选择上传。
     * @param CertificateId 待绑定自定义域名的证书唯一 ID。针对Protocol 为https或http&https可以选择上传。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 自定义域名路径映射，最多输入三个Environment，并且只能分别取值“test”、 ”prepub“、”release“。 
     * @return PathMappingSet 自定义域名路径映射，最多输入三个Environment，并且只能分别取值“test”、 ”prepub“、”release“。
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set 自定义域名路径映射，最多输入三个Environment，并且只能分别取值“test”、 ”prepub“、”release“。
     * @param PathMappingSet 自定义域名路径映射，最多输入三个Environment，并且只能分别取值“test”、 ”prepub“、”release“。
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
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

    public BindSubDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSubDomainRequest(BindSubDomainRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.IsDefaultMapping != null) {
            this.IsDefaultMapping = new Boolean(source.IsDefaultMapping);
        }
        if (source.NetSubDomain != null) {
            this.NetSubDomain = new String(source.NetSubDomain);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.PathMappingSet != null) {
            this.PathMappingSet = new PathMapping[source.PathMappingSet.length];
            for (int i = 0; i < source.PathMappingSet.length; i++) {
                this.PathMappingSet[i] = new PathMapping(source.PathMappingSet[i]);
            }
        }
        if (source.IsForcedHttps != null) {
            this.IsForcedHttps = new Boolean(source.IsForcedHttps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "NetSubDomain", this.NetSubDomain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArrayObj(map, prefix + "PathMappingSet.", this.PathMappingSet);
        this.setParamSimple(map, prefix + "IsForcedHttps", this.IsForcedHttps);

    }
}

