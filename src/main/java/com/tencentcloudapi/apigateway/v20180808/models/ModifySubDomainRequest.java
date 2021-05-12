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

public class ModifySubDomainRequest extends AbstractModel{

    /**
    * 服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待修改路径映射的自定义的域名。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 是否修改为使用默认路径映射。为 true，表示使用默认路径映射，为 false，表示使用自定义路径映射。
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * 证书 ID，协议包含 HTTPS 的时候要传该字段。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 修改后的自定义域名协议类型。（http，https 或 http&https)
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 修改后的路径映射列表。
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

    /**
    * 网络类型 （'INNER' 或 'OUTER'）
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
     * Get 待修改路径映射的自定义的域名。 
     * @return SubDomain 待修改路径映射的自定义的域名。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 待修改路径映射的自定义的域名。
     * @param SubDomain 待修改路径映射的自定义的域名。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 是否修改为使用默认路径映射。为 true，表示使用默认路径映射，为 false，表示使用自定义路径映射。 
     * @return IsDefaultMapping 是否修改为使用默认路径映射。为 true，表示使用默认路径映射，为 false，表示使用自定义路径映射。
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set 是否修改为使用默认路径映射。为 true，表示使用默认路径映射，为 false，表示使用自定义路径映射。
     * @param IsDefaultMapping 是否修改为使用默认路径映射。为 true，表示使用默认路径映射，为 false，表示使用自定义路径映射。
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get 证书 ID，协议包含 HTTPS 的时候要传该字段。 
     * @return CertificateId 证书 ID，协议包含 HTTPS 的时候要传该字段。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID，协议包含 HTTPS 的时候要传该字段。
     * @param CertificateId 证书 ID，协议包含 HTTPS 的时候要传该字段。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 修改后的自定义域名协议类型。（http，https 或 http&https) 
     * @return Protocol 修改后的自定义域名协议类型。（http，https 或 http&https)
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 修改后的自定义域名协议类型。（http，https 或 http&https)
     * @param Protocol 修改后的自定义域名协议类型。（http，https 或 http&https)
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 修改后的路径映射列表。 
     * @return PathMappingSet 修改后的路径映射列表。
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set 修改后的路径映射列表。
     * @param PathMappingSet 修改后的路径映射列表。
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
    }

    /**
     * Get 网络类型 （'INNER' 或 'OUTER'） 
     * @return NetType 网络类型 （'INNER' 或 'OUTER'）
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型 （'INNER' 或 'OUTER'）
     * @param NetType 网络类型 （'INNER' 或 'OUTER'）
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

    public ModifySubDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubDomainRequest(ModifySubDomainRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.IsDefaultMapping != null) {
            this.IsDefaultMapping = new Boolean(source.IsDefaultMapping);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PathMappingSet != null) {
            this.PathMappingSet = new PathMapping[source.PathMappingSet.length];
            for (int i = 0; i < source.PathMappingSet.length; i++) {
                this.PathMappingSet[i] = new PathMapping(source.PathMappingSet[i]);
            }
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
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
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "PathMappingSet.", this.PathMappingSet);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "IsForcedHttps", this.IsForcedHttps);

    }
}

