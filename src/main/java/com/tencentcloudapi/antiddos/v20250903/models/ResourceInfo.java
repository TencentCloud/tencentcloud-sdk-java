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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInfo extends AbstractModel {

    /**
    * <p>防护资源的资源六段式标识。</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>防护资源类型。</p><p>枚举值：</p><ul><li>cvm： 云服务器</li><li>lighthouse： 轻量应用服务器</li><li>clb： 负载均衡</li><li>eip： 弹性公网 IP</li><li>waf： Web 应用防火墙</li><li>teo_l7_domain： EdgeOne 域名</li><li>teo_l4_proxy： EdgeOne 四层代理</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>防护资源的防护状态。</p><p>枚举值：</p><ul><li>protecting： 防护中</li><li>processing： 防护变更中</li><li>disabling： 防护停用中</li><li>disabled： 防护已停用</li><li>process_failed： 防护变更失败</li><li>disabled_failed： 防护停用失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>防护资源所属地域，例如 <code>ap-beijing</code>。</p><p>资源类型为 EdgeOne 时，Region 取以下枚举值：</p><ul><li>global：全球可用区。</li><li>mainland：中国大陆可用区。</li><li>overseas：全球可用区（中国大陆除外）。</li></ul>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>公网访问地址。</p><ul><li>资源类型是以公网 IP 提供接入的云资产时，返回对应的公网 IP。</li><li>资源类型是以域名提供接入的云资产时，返回对应域名，例如 <a href="https://cloud.tencent.com/document/product/214/86948">域名化负载均衡实例</a>。</li><li>资源类型为 EdgeOne 四层代理或七层域名时，不返回该字段。</li></ul>
    */
    @SerializedName("PublicAddresses")
    @Expose
    private String [] PublicAddresses;

    /**
     * Get <p>防护资源的资源六段式标识。</p> 
     * @return Resource <p>防护资源的资源六段式标识。</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>防护资源的资源六段式标识。</p>
     * @param Resource <p>防护资源的资源六段式标识。</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>防护资源类型。</p><p>枚举值：</p><ul><li>cvm： 云服务器</li><li>lighthouse： 轻量应用服务器</li><li>clb： 负载均衡</li><li>eip： 弹性公网 IP</li><li>waf： Web 应用防火墙</li><li>teo_l7_domain： EdgeOne 域名</li><li>teo_l4_proxy： EdgeOne 四层代理</li></ul> 
     * @return ResourceType <p>防护资源类型。</p><p>枚举值：</p><ul><li>cvm： 云服务器</li><li>lighthouse： 轻量应用服务器</li><li>clb： 负载均衡</li><li>eip： 弹性公网 IP</li><li>waf： Web 应用防火墙</li><li>teo_l7_domain： EdgeOne 域名</li><li>teo_l4_proxy： EdgeOne 四层代理</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>防护资源类型。</p><p>枚举值：</p><ul><li>cvm： 云服务器</li><li>lighthouse： 轻量应用服务器</li><li>clb： 负载均衡</li><li>eip： 弹性公网 IP</li><li>waf： Web 应用防火墙</li><li>teo_l7_domain： EdgeOne 域名</li><li>teo_l4_proxy： EdgeOne 四层代理</li></ul>
     * @param ResourceType <p>防护资源类型。</p><p>枚举值：</p><ul><li>cvm： 云服务器</li><li>lighthouse： 轻量应用服务器</li><li>clb： 负载均衡</li><li>eip： 弹性公网 IP</li><li>waf： Web 应用防火墙</li><li>teo_l7_domain： EdgeOne 域名</li><li>teo_l4_proxy： EdgeOne 四层代理</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>防护资源的防护状态。</p><p>枚举值：</p><ul><li>protecting： 防护中</li><li>processing： 防护变更中</li><li>disabling： 防护停用中</li><li>disabled： 防护已停用</li><li>process_failed： 防护变更失败</li><li>disabled_failed： 防护停用失败</li></ul> 
     * @return Status <p>防护资源的防护状态。</p><p>枚举值：</p><ul><li>protecting： 防护中</li><li>processing： 防护变更中</li><li>disabling： 防护停用中</li><li>disabled： 防护已停用</li><li>process_failed： 防护变更失败</li><li>disabled_failed： 防护停用失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>防护资源的防护状态。</p><p>枚举值：</p><ul><li>protecting： 防护中</li><li>processing： 防护变更中</li><li>disabling： 防护停用中</li><li>disabled： 防护已停用</li><li>process_failed： 防护变更失败</li><li>disabled_failed： 防护停用失败</li></ul>
     * @param Status <p>防护资源的防护状态。</p><p>枚举值：</p><ul><li>protecting： 防护中</li><li>processing： 防护变更中</li><li>disabling： 防护停用中</li><li>disabled： 防护已停用</li><li>process_failed： 防护变更失败</li><li>disabled_failed： 防护停用失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>防护资源所属地域，例如 <code>ap-beijing</code>。</p><p>资源类型为 EdgeOne 时，Region 取以下枚举值：</p><ul><li>global：全球可用区。</li><li>mainland：中国大陆可用区。</li><li>overseas：全球可用区（中国大陆除外）。</li></ul> 
     * @return Region <p>防护资源所属地域，例如 <code>ap-beijing</code>。</p><p>资源类型为 EdgeOne 时，Region 取以下枚举值：</p><ul><li>global：全球可用区。</li><li>mainland：中国大陆可用区。</li><li>overseas：全球可用区（中国大陆除外）。</li></ul>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>防护资源所属地域，例如 <code>ap-beijing</code>。</p><p>资源类型为 EdgeOne 时，Region 取以下枚举值：</p><ul><li>global：全球可用区。</li><li>mainland：中国大陆可用区。</li><li>overseas：全球可用区（中国大陆除外）。</li></ul>
     * @param Region <p>防护资源所属地域，例如 <code>ap-beijing</code>。</p><p>资源类型为 EdgeOne 时，Region 取以下枚举值：</p><ul><li>global：全球可用区。</li><li>mainland：中国大陆可用区。</li><li>overseas：全球可用区（中国大陆除外）。</li></ul>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>公网访问地址。</p><ul><li>资源类型是以公网 IP 提供接入的云资产时，返回对应的公网 IP。</li><li>资源类型是以域名提供接入的云资产时，返回对应域名，例如 <a href="https://cloud.tencent.com/document/product/214/86948">域名化负载均衡实例</a>。</li><li>资源类型为 EdgeOne 四层代理或七层域名时，不返回该字段。</li></ul> 
     * @return PublicAddresses <p>公网访问地址。</p><ul><li>资源类型是以公网 IP 提供接入的云资产时，返回对应的公网 IP。</li><li>资源类型是以域名提供接入的云资产时，返回对应域名，例如 <a href="https://cloud.tencent.com/document/product/214/86948">域名化负载均衡实例</a>。</li><li>资源类型为 EdgeOne 四层代理或七层域名时，不返回该字段。</li></ul>
     */
    public String [] getPublicAddresses() {
        return this.PublicAddresses;
    }

    /**
     * Set <p>公网访问地址。</p><ul><li>资源类型是以公网 IP 提供接入的云资产时，返回对应的公网 IP。</li><li>资源类型是以域名提供接入的云资产时，返回对应域名，例如 <a href="https://cloud.tencent.com/document/product/214/86948">域名化负载均衡实例</a>。</li><li>资源类型为 EdgeOne 四层代理或七层域名时，不返回该字段。</li></ul>
     * @param PublicAddresses <p>公网访问地址。</p><ul><li>资源类型是以公网 IP 提供接入的云资产时，返回对应的公网 IP。</li><li>资源类型是以域名提供接入的云资产时，返回对应域名，例如 <a href="https://cloud.tencent.com/document/product/214/86948">域名化负载均衡实例</a>。</li><li>资源类型为 EdgeOne 四层代理或七层域名时，不返回该字段。</li></ul>
     */
    public void setPublicAddresses(String [] PublicAddresses) {
        this.PublicAddresses = PublicAddresses;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PublicAddresses != null) {
            this.PublicAddresses = new String[source.PublicAddresses.length];
            for (int i = 0; i < source.PublicAddresses.length; i++) {
                this.PublicAddresses[i] = new String(source.PublicAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "PublicAddresses.", this.PublicAddresses);

    }
}

