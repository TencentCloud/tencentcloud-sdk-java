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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQServerlessInstance extends AbstractModel {

    /**
    * 实例Id
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
    * 实例版本号
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
    * TPS
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * 带宽
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 集群过期时间
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
    * 0-后付费，1-预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 集群规格
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * 公网接入点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * 私有网络接入点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vpcs")
    @Expose
    private RabbitMQServerlessEndpoint [] Vpcs;

    /**
    * 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败

    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * 集群类型：1
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 过期时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 为了兼容托管版，固定值 0
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 为了兼容托管版，固定值 0
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
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
     * Get 实例版本号 
     * @return InstanceVersion 实例版本号
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 实例版本号
     * @param InstanceVersion 实例版本号
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
     * Get TPS 
     * @return MaxTps TPS
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set TPS
     * @param MaxTps TPS
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get 带宽 
     * @return MaxBandWidth 带宽
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 带宽
     * @param MaxBandWidth 带宽
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 集群过期时间 
     * @return ExpireTime 集群过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 集群过期时间
     * @param ExpireTime 集群过期时间
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
     * Get 0-后付费，1-预付费 
     * @return PayMode 0-后付费，1-预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 0-后付费，1-预付费
     * @param PayMode 0-后付费，1-预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 集群规格 
     * @return SpecName 集群规格
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 集群规格
     * @param SpecName 集群规格
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionInformation 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionInformation 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
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
     * Get 私有网络接入点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vpcs 私有网络接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQServerlessEndpoint [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set 私有网络接入点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vpcs 私有网络接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcs(RabbitMQServerlessEndpoint [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
 
     * @return ClusterStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败

     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败

     * @param ClusterStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败

     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 集群类型：1 
     * @return InstanceType 集群类型：1
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 集群类型：1
     * @param InstanceType 集群类型：1
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 过期时间 
     * @return CreateTime 过期时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 过期时间
     * @param CreateTime 过期时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 为了兼容托管版，固定值 0 
     * @return NodeCount 为了兼容托管版，固定值 0
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 为了兼容托管版，固定值 0
     * @param NodeCount 为了兼容托管版，固定值 0
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 为了兼容托管版，固定值 0 
     * @return MaxStorage 为了兼容托管版，固定值 0
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 为了兼容托管版，固定值 0
     * @param MaxStorage 为了兼容托管版，固定值 0
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    public RabbitMQServerlessInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQServerlessInstance(RabbitMQServerlessInstance source) {
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
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
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
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new RabbitMQServerlessEndpoint[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new RabbitMQServerlessEndpoint(source.Vpcs[i]);
            }
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
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
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);

    }
}

