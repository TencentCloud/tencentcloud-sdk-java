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

public class Service extends AbstractModel{

    /**
    * 内网访问https端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpsPort")
    @Expose
    private Long InnerHttpsPort;

    /**
    * 用户自定义的服务描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * 服务的前端请求类型。如http、https 或者 http&https。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 服务支持的网络类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * 独占集群名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveSetName")
    @Expose
    private String ExclusiveSetName;

    /**
    * 服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * IP版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 已经发布的环境列表。如test、prepub、release。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableEnvironments")
    @Expose
    private String [] AvailableEnvironments;

    /**
    * 用户自定义的服务名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 系统为该服务分配的外网域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OuterSubDomain")
    @Expose
    private String OuterSubDomain;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 内网访问http端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpPort")
    @Expose
    private Long InnerHttpPort;

    /**
    * 系统为该服务自动分配的内网域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerSubDomain")
    @Expose
    private String InnerSubDomain;

    /**
    * 服务的计费状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeIsolateStatus")
    @Expose
    private Long TradeIsolateStatus;

    /**
    * 服务绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 独享实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
    * 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentType")
    @Expose
    private String DeploymentType;

    /**
     * Get 内网访问https端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpsPort 内网访问https端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInnerHttpsPort() {
        return this.InnerHttpsPort;
    }

    /**
     * Set 内网访问https端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpsPort 内网访问https端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpsPort(Long InnerHttpsPort) {
        this.InnerHttpsPort = InnerHttpsPort;
    }

    /**
     * Get 用户自定义的服务描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDesc 用户自定义的服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set 用户自定义的服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDesc 用户自定义的服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get 服务的前端请求类型。如http、https 或者 http&https。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 服务的前端请求类型。如http、https 或者 http&https。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 服务的前端请求类型。如http、https 或者 http&https。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 服务的前端请求类型。如http、https 或者 http&https。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 服务支持的网络类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetTypes 服务支持的网络类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set 服务支持的网络类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetTypes 服务支持的网络类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get 独占集群名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveSetName 独占集群名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExclusiveSetName() {
        return this.ExclusiveSetName;
    }

    /**
     * Set 独占集群名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveSetName 独占集群名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveSetName(String ExclusiveSetName) {
        this.ExclusiveSetName = ExclusiveSetName;
    }

    /**
     * Get 服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get IP版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpVersion IP版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpVersion IP版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 已经发布的环境列表。如test、prepub、release。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableEnvironments 已经发布的环境列表。如test、prepub、release。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAvailableEnvironments() {
        return this.AvailableEnvironments;
    }

    /**
     * Set 已经发布的环境列表。如test、prepub、release。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableEnvironments 已经发布的环境列表。如test、prepub、release。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableEnvironments(String [] AvailableEnvironments) {
        this.AvailableEnvironments = AvailableEnvironments;
    }

    /**
     * Get 用户自定义的服务名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 用户自定义的服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 用户自定义的服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 用户自定义的服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 系统为该服务分配的外网域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OuterSubDomain 系统为该服务分配的外网域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOuterSubDomain() {
        return this.OuterSubDomain;
    }

    /**
     * Set 系统为该服务分配的外网域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OuterSubDomain 系统为该服务分配的外网域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOuterSubDomain(String OuterSubDomain) {
        this.OuterSubDomain = OuterSubDomain;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 内网访问http端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpPort 内网访问http端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInnerHttpPort() {
        return this.InnerHttpPort;
    }

    /**
     * Set 内网访问http端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpPort 内网访问http端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpPort(Long InnerHttpPort) {
        this.InnerHttpPort = InnerHttpPort;
    }

    /**
     * Get 系统为该服务自动分配的内网域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerSubDomain 系统为该服务自动分配的内网域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerSubDomain() {
        return this.InnerSubDomain;
    }

    /**
     * Set 系统为该服务自动分配的内网域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerSubDomain 系统为该服务自动分配的内网域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerSubDomain(String InnerSubDomain) {
        this.InnerSubDomain = InnerSubDomain;
    }

    /**
     * Get 服务的计费状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeIsolateStatus 服务的计费状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTradeIsolateStatus() {
        return this.TradeIsolateStatus;
    }

    /**
     * Set 服务的计费状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeIsolateStatus 服务的计费状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeIsolateStatus(Long TradeIsolateStatus) {
        this.TradeIsolateStatus = TradeIsolateStatus;
    }

    /**
     * Get 服务绑定的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 服务绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 服务绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 服务绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 独享实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 独享实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 独享实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetType() {
        return this.SetType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetType(String SetType) {
        this.SetType = SetType;
    }

    /**
     * Get 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentType 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeploymentType() {
        return this.DeploymentType;
    }

    /**
     * Set 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentType 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentType(String DeploymentType) {
        this.DeploymentType = DeploymentType;
    }

    public Service() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Service(Service source) {
        if (source.InnerHttpsPort != null) {
            this.InnerHttpsPort = new Long(source.InnerHttpsPort);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
        if (source.ExclusiveSetName != null) {
            this.ExclusiveSetName = new String(source.ExclusiveSetName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.AvailableEnvironments != null) {
            this.AvailableEnvironments = new String[source.AvailableEnvironments.length];
            for (int i = 0; i < source.AvailableEnvironments.length; i++) {
                this.AvailableEnvironments[i] = new String(source.AvailableEnvironments[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.OuterSubDomain != null) {
            this.OuterSubDomain = new String(source.OuterSubDomain);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.InnerHttpPort != null) {
            this.InnerHttpPort = new Long(source.InnerHttpPort);
        }
        if (source.InnerSubDomain != null) {
            this.InnerSubDomain = new String(source.InnerSubDomain);
        }
        if (source.TradeIsolateStatus != null) {
            this.TradeIsolateStatus = new Long(source.TradeIsolateStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SetType != null) {
            this.SetType = new String(source.SetType);
        }
        if (source.DeploymentType != null) {
            this.DeploymentType = new String(source.DeploymentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InnerHttpsPort", this.InnerHttpsPort);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "ExclusiveSetName", this.ExclusiveSetName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamArraySimple(map, prefix + "AvailableEnvironments.", this.AvailableEnvironments);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "OuterSubDomain", this.OuterSubDomain);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "InnerHttpPort", this.InnerHttpPort);
        this.setParamSimple(map, prefix + "InnerSubDomain", this.InnerSubDomain);
        this.setParamSimple(map, prefix + "TradeIsolateStatus", this.TradeIsolateStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SetType", this.SetType);
        this.setParamSimple(map, prefix + "DeploymentType", this.DeploymentType);

    }
}

