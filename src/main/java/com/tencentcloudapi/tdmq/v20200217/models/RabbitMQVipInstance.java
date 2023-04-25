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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVipInstance extends AbstractModel{

    /**
    * 实例id
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
注意：此字段可能返回 null，表示取不到有效值。
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
    * 实例到期时间，毫秒为单位
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
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 实例配置ID
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 集群异常。
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
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceVersion 实例版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 实例版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceVersion 实例版本
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 实例到期时间，毫秒为单位 
     * @return ExpireTime 实例到期时间，毫秒为单位
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例到期时间，毫秒为单位
     * @param ExpireTime 实例到期时间，毫秒为单位
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
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 实例配置ID 
     * @return SpecName 实例配置ID
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 实例配置ID
     * @param SpecName 实例配置ID
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 集群异常。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionInformation 集群异常。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set 集群异常。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionInformation 集群异常。
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

    }
}

