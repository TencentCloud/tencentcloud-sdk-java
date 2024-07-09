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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayRequest extends AbstractModel {

    /**
    * 云原生API网关名字, 最多支持60个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云原生API网关类型, 目前只支持kong。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 云原生API网关版本。参考值：
- 2.4.1
- 2.5.1
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * 云原生API网关节点配置。
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * 云原生API网关vpc配置。
    */
    @SerializedName("VpcConfig")
    @Expose
    private CloudNativeAPIGatewayVpcConfig VpcConfig;

    /**
    * 云原生API网关描述信息, 最多支持120个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private InstanceTagInfo [] Tags;

    /**
    * 是否开启 CLS 日志。默认值：fasle
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * 产品版本。参考值：
- TRIAL：开发版
- STANDARD：标准版 （默认值）
- PROFESSIONAL：专业版
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * 公网出流量带宽，[1,2048]Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 实例实际的地域信息，默认值：ap-guangzhou
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * ingress Class名称
    */
    @SerializedName("IngressClassName")
    @Expose
    private String IngressClassName;

    /**
    * 付费类型。参考值：
0：后付费（默认值）
1：预付费（接口暂不支持创建预付费实例）
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * 公网相关配置
    */
    @SerializedName("InternetConfig")
    @Expose
    private InternetConfig InternetConfig;

    /**
    * 关联的prometheus ID
    */
    @SerializedName("PromId")
    @Expose
    private String PromId;

    /**
     * Get 云原生API网关名字, 最多支持60个字符。 
     * @return Name 云原生API网关名字, 最多支持60个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云原生API网关名字, 最多支持60个字符。
     * @param Name 云原生API网关名字, 最多支持60个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云原生API网关类型, 目前只支持kong。 
     * @return Type 云原生API网关类型, 目前只支持kong。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 云原生API网关类型, 目前只支持kong。
     * @param Type 云原生API网关类型, 目前只支持kong。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 云原生API网关版本。参考值：
- 2.4.1
- 2.5.1 
     * @return GatewayVersion 云原生API网关版本。参考值：
- 2.4.1
- 2.5.1
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set 云原生API网关版本。参考值：
- 2.4.1
- 2.5.1
     * @param GatewayVersion 云原生API网关版本。参考值：
- 2.4.1
- 2.5.1
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get 云原生API网关节点配置。 
     * @return NodeConfig 云原生API网关节点配置。
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set 云原生API网关节点配置。
     * @param NodeConfig 云原生API网关节点配置。
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get 云原生API网关vpc配置。 
     * @return VpcConfig 云原生API网关vpc配置。
     */
    public CloudNativeAPIGatewayVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 云原生API网关vpc配置。
     * @param VpcConfig 云原生API网关vpc配置。
     */
    public void setVpcConfig(CloudNativeAPIGatewayVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 云原生API网关描述信息, 最多支持120个字符。 
     * @return Description 云原生API网关描述信息, 最多支持120个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 云原生API网关描述信息, 最多支持120个字符。
     * @param Description 云原生API网关描述信息, 最多支持120个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public InstanceTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(InstanceTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启 CLS 日志。默认值：fasle 
     * @return EnableCls 是否开启 CLS 日志。默认值：fasle
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set 是否开启 CLS 日志。默认值：fasle
     * @param EnableCls 是否开启 CLS 日志。默认值：fasle
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get 产品版本。参考值：
- TRIAL：开发版
- STANDARD：标准版 （默认值）
- PROFESSIONAL：专业版 
     * @return FeatureVersion 产品版本。参考值：
- TRIAL：开发版
- STANDARD：标准版 （默认值）
- PROFESSIONAL：专业版
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set 产品版本。参考值：
- TRIAL：开发版
- STANDARD：标准版 （默认值）
- PROFESSIONAL：专业版
     * @param FeatureVersion 产品版本。参考值：
- TRIAL：开发版
- STANDARD：标准版 （默认值）
- PROFESSIONAL：专业版
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get 公网出流量带宽，[1,2048]Mbps 
     * @return InternetMaxBandwidthOut 公网出流量带宽，[1,2048]Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网出流量带宽，[1,2048]Mbps
     * @param InternetMaxBandwidthOut 公网出流量带宽，[1,2048]Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 实例实际的地域信息，默认值：ap-guangzhou 
     * @return EngineRegion 实例实际的地域信息，默认值：ap-guangzhou
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 实例实际的地域信息，默认值：ap-guangzhou
     * @param EngineRegion 实例实际的地域信息，默认值：ap-guangzhou
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get ingress Class名称 
     * @return IngressClassName ingress Class名称
     */
    public String getIngressClassName() {
        return this.IngressClassName;
    }

    /**
     * Set ingress Class名称
     * @param IngressClassName ingress Class名称
     */
    public void setIngressClassName(String IngressClassName) {
        this.IngressClassName = IngressClassName;
    }

    /**
     * Get 付费类型。参考值：
0：后付费（默认值）
1：预付费（接口暂不支持创建预付费实例） 
     * @return TradeType 付费类型。参考值：
0：后付费（默认值）
1：预付费（接口暂不支持创建预付费实例）
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 付费类型。参考值：
0：后付费（默认值）
1：预付费（接口暂不支持创建预付费实例）
     * @param TradeType 付费类型。参考值：
0：后付费（默认值）
1：预付费（接口暂不支持创建预付费实例）
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 公网相关配置 
     * @return InternetConfig 公网相关配置
     */
    public InternetConfig getInternetConfig() {
        return this.InternetConfig;
    }

    /**
     * Set 公网相关配置
     * @param InternetConfig 公网相关配置
     */
    public void setInternetConfig(InternetConfig InternetConfig) {
        this.InternetConfig = InternetConfig;
    }

    /**
     * Get 关联的prometheus ID 
     * @return PromId 关联的prometheus ID
     */
    public String getPromId() {
        return this.PromId;
    }

    /**
     * Set 关联的prometheus ID
     * @param PromId 关联的prometheus ID
     */
    public void setPromId(String PromId) {
        this.PromId = PromId;
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

    }
}

