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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMicroserviceRequest extends AbstractModel {

    /**
    * <p>命名空间ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/649/36096">DescribeSimpleNamespaces</a> 的返回值中的 NamespaceId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tsf/resource?tab=namespace">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * <p>微服务名称。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/36084">DescribeMicroservices</a> 的返回值中的 MicroserviceName 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=service">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/85860">CreateMicroserviceWithDetailResp</a>创建新的微服务。</p>
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * <p>微服务备注信息，最多支持200个字符。</p>
    */
    @SerializedName("MicroserviceDesc")
    @Expose
    private String MicroserviceDesc;

    /**
    * <p>服务类型，默认SDK</p><p>枚举值：</p><ul><li>SDK： sdk服务</li><li>MESH_EXTERNAL： mesh外部服务</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>域名+端口，或者是纯域名方式，其他的不允许配置，不支持 IP</p>
    */
    @SerializedName("ServiceUrl")
    @Expose
    private String ServiceUrl;

    /**
    * <p>协议类型</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>服务发现方式</p><p>枚举值：</p><ul><li>DNS： DNS方式</li></ul>
    */
    @SerializedName("ServiceDiscovery")
    @Expose
    private String ServiceDiscovery;

    /**
     * Get <p>命名空间ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/649/36096">DescribeSimpleNamespaces</a> 的返回值中的 NamespaceId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tsf/resource?tab=namespace">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p> 
     * @return NamespaceId <p>命名空间ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/649/36096">DescribeSimpleNamespaces</a> 的返回值中的 NamespaceId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tsf/resource?tab=namespace">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>命名空间ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/649/36096">DescribeSimpleNamespaces</a> 的返回值中的 NamespaceId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tsf/resource?tab=namespace">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
     * @param NamespaceId <p>命名空间ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/649/36096">DescribeSimpleNamespaces</a> 的返回值中的 NamespaceId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tsf/resource?tab=namespace">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/36098">CreateNamespace</a>创建新的命名空间。</p>
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>微服务名称。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/36084">DescribeMicroservices</a> 的返回值中的 MicroserviceName 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=service">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/85860">CreateMicroserviceWithDetailResp</a>创建新的微服务。</p> 
     * @return MicroserviceName <p>微服务名称。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/36084">DescribeMicroservices</a> 的返回值中的 MicroserviceName 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=service">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/85860">CreateMicroserviceWithDetailResp</a>创建新的微服务。</p>
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set <p>微服务名称。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/36084">DescribeMicroservices</a> 的返回值中的 MicroserviceName 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=service">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/85860">CreateMicroserviceWithDetailResp</a>创建新的微服务。</p>
     * @param MicroserviceName <p>微服务名称。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/36084">DescribeMicroservices</a> 的返回值中的 MicroserviceName 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=service">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/85860">CreateMicroserviceWithDetailResp</a>创建新的微服务。</p>
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get <p>微服务备注信息，最多支持200个字符。</p> 
     * @return MicroserviceDesc <p>微服务备注信息，最多支持200个字符。</p>
     */
    public String getMicroserviceDesc() {
        return this.MicroserviceDesc;
    }

    /**
     * Set <p>微服务备注信息，最多支持200个字符。</p>
     * @param MicroserviceDesc <p>微服务备注信息，最多支持200个字符。</p>
     */
    public void setMicroserviceDesc(String MicroserviceDesc) {
        this.MicroserviceDesc = MicroserviceDesc;
    }

    /**
     * Get <p>服务类型，默认SDK</p><p>枚举值：</p><ul><li>SDK： sdk服务</li><li>MESH_EXTERNAL： mesh外部服务</li></ul> 
     * @return ServiceType <p>服务类型，默认SDK</p><p>枚举值：</p><ul><li>SDK： sdk服务</li><li>MESH_EXTERNAL： mesh外部服务</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型，默认SDK</p><p>枚举值：</p><ul><li>SDK： sdk服务</li><li>MESH_EXTERNAL： mesh外部服务</li></ul>
     * @param ServiceType <p>服务类型，默认SDK</p><p>枚举值：</p><ul><li>SDK： sdk服务</li><li>MESH_EXTERNAL： mesh外部服务</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>域名+端口，或者是纯域名方式，其他的不允许配置，不支持 IP</p> 
     * @return ServiceUrl <p>域名+端口，或者是纯域名方式，其他的不允许配置，不支持 IP</p>
     */
    public String getServiceUrl() {
        return this.ServiceUrl;
    }

    /**
     * Set <p>域名+端口，或者是纯域名方式，其他的不允许配置，不支持 IP</p>
     * @param ServiceUrl <p>域名+端口，或者是纯域名方式，其他的不允许配置，不支持 IP</p>
     */
    public void setServiceUrl(String ServiceUrl) {
        this.ServiceUrl = ServiceUrl;
    }

    /**
     * Get <p>协议类型</p> 
     * @return Protocol <p>协议类型</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议类型</p>
     * @param Protocol <p>协议类型</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>服务发现方式</p><p>枚举值：</p><ul><li>DNS： DNS方式</li></ul> 
     * @return ServiceDiscovery <p>服务发现方式</p><p>枚举值：</p><ul><li>DNS： DNS方式</li></ul>
     */
    public String getServiceDiscovery() {
        return this.ServiceDiscovery;
    }

    /**
     * Set <p>服务发现方式</p><p>枚举值：</p><ul><li>DNS： DNS方式</li></ul>
     * @param ServiceDiscovery <p>服务发现方式</p><p>枚举值：</p><ul><li>DNS： DNS方式</li></ul>
     */
    public void setServiceDiscovery(String ServiceDiscovery) {
        this.ServiceDiscovery = ServiceDiscovery;
    }

    public CreateMicroserviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMicroserviceRequest(CreateMicroserviceRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.MicroserviceName != null) {
            this.MicroserviceName = new String(source.MicroserviceName);
        }
        if (source.MicroserviceDesc != null) {
            this.MicroserviceDesc = new String(source.MicroserviceDesc);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceUrl != null) {
            this.ServiceUrl = new String(source.ServiceUrl);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ServiceDiscovery != null) {
            this.ServiceDiscovery = new String(source.ServiceDiscovery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "MicroserviceName", this.MicroserviceName);
        this.setParamSimple(map, prefix + "MicroserviceDesc", this.MicroserviceDesc);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceUrl", this.ServiceUrl);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceDiscovery", this.ServiceDiscovery);

    }
}

