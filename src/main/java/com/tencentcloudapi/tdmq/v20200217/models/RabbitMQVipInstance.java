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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVipInstance extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例版本
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 实例配置规格名称
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * 峰值TPS
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * 峰值带宽，Mbps为单位
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 存储容量，GB为单位
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 1 表示预付费，0 表示后付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为4C8G：rabbit-vip-basic-1
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
为了和计费区分开，额外开启一个状态位，用于显示。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * 公网接入点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * VPC 接入点列表
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * 创建时间，毫秒为单位。unix 时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 实例类型，0 托管版、1 Serverless 版
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 隔离时间，毫秒为单位。unix 时间戳
    */
    @SerializedName("IsolatedTime")
    @Expose
    private Long IsolatedTime;

    /**
    * 是否已开启删除保护
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例版本 
     * @return InstanceVersion 实例版本
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 实例版本
     * @param InstanceVersion 实例版本
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败 
     * @return Status 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
     * @param Status 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 实例配置规格名称 
     * @return ConfigDisplay 实例配置规格名称
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set 实例配置规格名称
     * @param ConfigDisplay 实例配置规格名称
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get 峰值TPS 
     * @return MaxTps 峰值TPS
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set 峰值TPS
     * @param MaxTps 峰值TPS
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get 峰值带宽，Mbps为单位 
     * @return MaxBandWidth 峰值带宽，Mbps为单位
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 峰值带宽，Mbps为单位
     * @param MaxBandWidth 峰值带宽，Mbps为单位
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 存储容量，GB为单位 
     * @return MaxStorage 存储容量，GB为单位
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 存储容量，GB为单位
     * @param MaxStorage 存储容量，GB为单位
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳 
     * @return ExpireTime 实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳
     * @param ExpireTime 实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置) 
     * @return AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
     * @param AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 1 表示预付费，0 表示后付费 
     * @return PayMode 1 表示预付费，0 表示后付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 1 表示预付费，0 表示后付费
     * @param PayMode 1 表示预付费，0 表示后付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为4C8G：rabbit-vip-basic-1 
     * @return SpecName 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为4C8G：rabbit-vip-basic-1
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为4C8G：rabbit-vip-basic-1
     * @param SpecName 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为4C8G：rabbit-vip-basic-1
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionInformation 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionInformation 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
为了和计费区分开，额外开启一个状态位，用于显示。 
     * @return ClusterStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
为了和计费区分开，额外开启一个状态位，用于显示。
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
为了和计费区分开，额外开启一个状态位，用于显示。
     * @param ClusterStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
为了和计费区分开，额外开启一个状态位，用于显示。
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 公网接入点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAccessEndpoint 公网接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set 公网接入点
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAccessEndpoint 公网接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get VPC 接入点列表 
     * @return Vpcs VPC 接入点列表
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC 接入点列表
     * @param Vpcs VPC 接入点列表
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get 创建时间，毫秒为单位。unix 时间戳 
     * @return CreateTime 创建时间，毫秒为单位。unix 时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒为单位。unix 时间戳
     * @param CreateTime 创建时间，毫秒为单位。unix 时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例类型，0 托管版、1 Serverless 版 
     * @return InstanceType 实例类型，0 托管版、1 Serverless 版
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，0 托管版、1 Serverless 版
     * @param InstanceType 实例类型，0 托管版、1 Serverless 版
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 隔离时间，毫秒为单位。unix 时间戳 
     * @return IsolatedTime 隔离时间，毫秒为单位。unix 时间戳
     */
    public Long getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间，毫秒为单位。unix 时间戳
     * @param IsolatedTime 隔离时间，毫秒为单位。unix 时间戳
     */
    public void setIsolatedTime(Long IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 是否已开启删除保护 
     * @return EnableDeletionProtection 是否已开启删除保护
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set 是否已开启删除保护
     * @param EnableDeletionProtection 是否已开启删除保护
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public RabbitMQVipInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVipInstance(RabbitMQVipInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.ExceptionInformation != null) {
            this.ExceptionInformation = new String(source.ExceptionInformation);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcEndpointInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcEndpointInfo(source.Vpcs[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new Long(source.IsolatedTime);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

