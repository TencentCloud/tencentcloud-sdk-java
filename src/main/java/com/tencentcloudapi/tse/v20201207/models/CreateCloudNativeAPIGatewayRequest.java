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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayRequest extends AbstractModel {

    /**
    * <p>云原生API网关名字, 最多支持60个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>云原生API网关类型, 目前只支持kong。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>云原生API网关版本。参考值：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * <p>云原生API网关节点配置。</p>
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * <p>云原生API网关vpc配置。</p>
    */
    @SerializedName("VpcConfig")
    @Expose
    private CloudNativeAPIGatewayVpcConfig VpcConfig;

    /**
    * <p>云原生API网关描述信息, 最多支持120个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private InstanceTagInfo [] Tags;

    /**
    * <p>是否开启 CLS 日志。默认值：fasle</p>
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * <p>产品版本</p><p>枚举值：</p><ul><li>STANDARD： 标准版</li><li>PROFESSIONAL： 专业版</li></ul>
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * <p>公网出流量带宽，[1,2048]Mbps</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>实例实际的地域信息，默认值：ap-guangzhou</p>
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * <p>ingress Class名称</p>
    */
    @SerializedName("IngressClassName")
    @Expose
    private String IngressClassName;

    /**
    * <p>付费类型。参考值：<br>0：后付费（默认值）<br>1：预付费（接口暂不支持创建预付费实例）</p>
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * <p>公网相关配置</p>
    */
    @SerializedName("InternetConfig")
    @Expose
    private InternetConfig InternetConfig;

    /**
    * <p>关联的prometheus ID</p>
    */
    @SerializedName("PromId")
    @Expose
    private String PromId;

    /**
    * <p>是否开启HTTP 80 端口的访问</p>
    */
    @SerializedName("EnableHttpPort")
    @Expose
    private Boolean EnableHttpPort;

    /**
     * Get <p>云原生API网关名字, 最多支持60个字符。</p> 
     * @return Name <p>云原生API网关名字, 最多支持60个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>云原生API网关名字, 最多支持60个字符。</p>
     * @param Name <p>云原生API网关名字, 最多支持60个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>云原生API网关类型, 目前只支持kong。</p> 
     * @return Type <p>云原生API网关类型, 目前只支持kong。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>云原生API网关类型, 目前只支持kong。</p>
     * @param Type <p>云原生API网关类型, 目前只支持kong。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>云原生API网关版本。参考值：</p><ul><li>2.4.1</li><li>2.5.1</li></ul> 
     * @return GatewayVersion <p>云原生API网关版本。参考值：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set <p>云原生API网关版本。参考值：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
     * @param GatewayVersion <p>云原生API网关版本。参考值：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get <p>云原生API网关节点配置。</p> 
     * @return NodeConfig <p>云原生API网关节点配置。</p>
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set <p>云原生API网关节点配置。</p>
     * @param NodeConfig <p>云原生API网关节点配置。</p>
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get <p>云原生API网关vpc配置。</p> 
     * @return VpcConfig <p>云原生API网关vpc配置。</p>
     */
    public CloudNativeAPIGatewayVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set <p>云原生API网关vpc配置。</p>
     * @param VpcConfig <p>云原生API网关vpc配置。</p>
     */
    public void setVpcConfig(CloudNativeAPIGatewayVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get <p>云原生API网关描述信息, 最多支持120个字符。</p> 
     * @return Description <p>云原生API网关描述信息, 最多支持120个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>云原生API网关描述信息, 最多支持120个字符。</p>
     * @param Description <p>云原生API网关描述信息, 最多支持120个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public InstanceTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(InstanceTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否开启 CLS 日志。默认值：fasle</p> 
     * @return EnableCls <p>是否开启 CLS 日志。默认值：fasle</p>
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set <p>是否开启 CLS 日志。默认值：fasle</p>
     * @param EnableCls <p>是否开启 CLS 日志。默认值：fasle</p>
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get <p>产品版本</p><p>枚举值：</p><ul><li>STANDARD： 标准版</li><li>PROFESSIONAL： 专业版</li></ul> 
     * @return FeatureVersion <p>产品版本</p><p>枚举值：</p><ul><li>STANDARD： 标准版</li><li>PROFESSIONAL： 专业版</li></ul>
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set <p>产品版本</p><p>枚举值：</p><ul><li>STANDARD： 标准版</li><li>PROFESSIONAL： 专业版</li></ul>
     * @param FeatureVersion <p>产品版本</p><p>枚举值：</p><ul><li>STANDARD： 标准版</li><li>PROFESSIONAL： 专业版</li></ul>
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get <p>公网出流量带宽，[1,2048]Mbps</p> 
     * @return InternetMaxBandwidthOut <p>公网出流量带宽，[1,2048]Mbps</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>公网出流量带宽，[1,2048]Mbps</p>
     * @param InternetMaxBandwidthOut <p>公网出流量带宽，[1,2048]Mbps</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>实例实际的地域信息，默认值：ap-guangzhou</p> 
     * @return EngineRegion <p>实例实际的地域信息，默认值：ap-guangzhou</p>
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set <p>实例实际的地域信息，默认值：ap-guangzhou</p>
     * @param EngineRegion <p>实例实际的地域信息，默认值：ap-guangzhou</p>
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get <p>ingress Class名称</p> 
     * @return IngressClassName <p>ingress Class名称</p>
     */
    public String getIngressClassName() {
        return this.IngressClassName;
    }

    /**
     * Set <p>ingress Class名称</p>
     * @param IngressClassName <p>ingress Class名称</p>
     */
    public void setIngressClassName(String IngressClassName) {
        this.IngressClassName = IngressClassName;
    }

    /**
     * Get <p>付费类型。参考值：<br>0：后付费（默认值）<br>1：预付费（接口暂不支持创建预付费实例）</p> 
     * @return TradeType <p>付费类型。参考值：<br>0：后付费（默认值）<br>1：预付费（接口暂不支持创建预付费实例）</p>
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set <p>付费类型。参考值：<br>0：后付费（默认值）<br>1：预付费（接口暂不支持创建预付费实例）</p>
     * @param TradeType <p>付费类型。参考值：<br>0：后付费（默认值）<br>1：预付费（接口暂不支持创建预付费实例）</p>
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get <p>公网相关配置</p> 
     * @return InternetConfig <p>公网相关配置</p>
     */
    public InternetConfig getInternetConfig() {
        return this.InternetConfig;
    }

    /**
     * Set <p>公网相关配置</p>
     * @param InternetConfig <p>公网相关配置</p>
     */
    public void setInternetConfig(InternetConfig InternetConfig) {
        this.InternetConfig = InternetConfig;
    }

    /**
     * Get <p>关联的prometheus ID</p> 
     * @return PromId <p>关联的prometheus ID</p>
     */
    public String getPromId() {
        return this.PromId;
    }

    /**
     * Set <p>关联的prometheus ID</p>
     * @param PromId <p>关联的prometheus ID</p>
     */
    public void setPromId(String PromId) {
        this.PromId = PromId;
    }

    /**
     * Get <p>是否开启HTTP 80 端口的访问</p> 
     * @return EnableHttpPort <p>是否开启HTTP 80 端口的访问</p>
     */
    public Boolean getEnableHttpPort() {
        return this.EnableHttpPort;
    }

    /**
     * Set <p>是否开启HTTP 80 端口的访问</p>
     * @param EnableHttpPort <p>是否开启HTTP 80 端口的访问</p>
     */
    public void setEnableHttpPort(Boolean EnableHttpPort) {
        this.EnableHttpPort = EnableHttpPort;
    }

    public CreateCloudNativeAPIGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayRequest(CreateCloudNativeAPIGatewayRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new CloudNativeAPIGatewayVpcConfig(source.VpcConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new InstanceTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new InstanceTagInfo(source.Tags[i]);
            }
        }
        if (source.EnableCls != null) {
            this.EnableCls = new Boolean(source.EnableCls);
        }
        if (source.FeatureVersion != null) {
            this.FeatureVersion = new String(source.FeatureVersion);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.IngressClassName != null) {
            this.IngressClassName = new String(source.IngressClassName);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.InternetConfig != null) {
            this.InternetConfig = new InternetConfig(source.InternetConfig);
        }
        if (source.PromId != null) {
            this.PromId = new String(source.PromId);
        }
        if (source.EnableHttpPort != null) {
            this.EnableHttpPort = new Boolean(source.EnableHttpPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableCls", this.EnableCls);
        this.setParamSimple(map, prefix + "FeatureVersion", this.FeatureVersion);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "IngressClassName", this.IngressClassName);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamObj(map, prefix + "InternetConfig.", this.InternetConfig);
        this.setParamSimple(map, prefix + "PromId", this.PromId);
        this.setParamSimple(map, prefix + "EnableHttpPort", this.EnableHttpPort);

    }
}

