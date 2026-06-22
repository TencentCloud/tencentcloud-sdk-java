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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * <p>资源组节点id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>节点已用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedResource")
    @Expose
    private ResourceInfo UsedResource;

    /**
    * <p>节点总资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalResource")
    @Expose
    private ResourceInfo TotalResource;

    /**
    * <p>节点状态<br>注意：此字段为枚举值<br>说明:<br>DEPLOYING: 部署中<br>RUNNING: 运行中<br>DEPLOY_FAILED: 部署失败<br>RELEASING 释放中<br>RELEASED：已释放<br>EXCEPTION：异常<br>DEBT_OR_EXPIRED: 欠费过期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>创建人</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>创建时间:<br>注意：北京时间，比如: 2021-12-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>到期时间<br>注意：北京时间，比如：2021-12-11 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>自动续费标识<br>注意：此字段为枚举值<br>说明：<br>NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知<br>NOTIFY_AND_AUTO_RENEW：自动续费且到期通知<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private String AutoRenewFlag;

    /**
    * <p>计费项ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>计费项别名</p>
    */
    @SerializedName("SpecAlias")
    @Expose
    private String SpecAlias;

    /**
    * <p>计费项特性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecFeatures")
    @Expose
    private String [] SpecFeatures;

    /**
    * <p>纳管cvmid</p>
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * <p>部署失败错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>部署失败错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>节点可用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableResource")
    @Expose
    private ResourceInfo AvailableResource;

    /**
    * <p>资源组节点的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIP")
    @Expose
    private String InstanceIP;

    /**
    * <p>资源组节点的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>cvm机型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmInstanceType")
    @Expose
    private String CvmInstanceType;

    /**
    * <p>是否自动续买</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Boolean AutoRenew;

    /**
    * <p>是否被隔离</p>
    */
    @SerializedName("Isolated")
    @Expose
    private Boolean Isolated;

    /**
    * <p>维修任务信息</p>
    */
    @SerializedName("RepairTaskInfo")
    @Expose
    private RepairTaskInfo RepairTaskInfo;

    /**
    * <p>节点可用区名称</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get <p>资源组节点id</p> 
     * @return InstanceId <p>资源组节点id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>资源组节点id</p>
     * @param InstanceId <p>资源组节点id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>节点已用资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedResource <p>节点已用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getUsedResource() {
        return this.UsedResource;
    }

    /**
     * Set <p>节点已用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedResource <p>节点已用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedResource(ResourceInfo UsedResource) {
        this.UsedResource = UsedResource;
    }

    /**
     * Get <p>节点总资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalResource <p>节点总资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getTotalResource() {
        return this.TotalResource;
    }

    /**
     * Set <p>节点总资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalResource <p>节点总资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalResource(ResourceInfo TotalResource) {
        this.TotalResource = TotalResource;
    }

    /**
     * Get <p>节点状态<br>注意：此字段为枚举值<br>说明:<br>DEPLOYING: 部署中<br>RUNNING: 运行中<br>DEPLOY_FAILED: 部署失败<br>RELEASING 释放中<br>RELEASED：已释放<br>EXCEPTION：异常<br>DEBT_OR_EXPIRED: 欠费过期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus <p>节点状态<br>注意：此字段为枚举值<br>说明:<br>DEPLOYING: 部署中<br>RUNNING: 运行中<br>DEPLOY_FAILED: 部署失败<br>RELEASING 释放中<br>RELEASED：已释放<br>EXCEPTION：异常<br>DEBT_OR_EXPIRED: 欠费过期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>节点状态<br>注意：此字段为枚举值<br>说明:<br>DEPLOYING: 部署中<br>RUNNING: 运行中<br>DEPLOY_FAILED: 部署失败<br>RELEASING 释放中<br>RELEASED：已释放<br>EXCEPTION：异常<br>DEBT_OR_EXPIRED: 欠费过期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus <p>节点状态<br>注意：此字段为枚举值<br>说明:<br>DEPLOYING: 部署中<br>RUNNING: 运行中<br>DEPLOY_FAILED: 部署失败<br>RELEASING 释放中<br>RELEASED：已释放<br>EXCEPTION：异常<br>DEBT_OR_EXPIRED: 欠费过期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>创建人</p> 
     * @return SubUin <p>创建人</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>创建人</p>
     * @param SubUin <p>创建人</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>创建时间:<br>注意：北京时间，比如: 2021-12-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间:<br>注意：北京时间，比如: 2021-12-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间:<br>注意：北京时间，比如: 2021-12-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间:<br>注意：北京时间，比如: 2021-12-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>到期时间<br>注意：北京时间，比如：2021-12-11 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>到期时间<br>注意：北京时间，比如：2021-12-11 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>到期时间<br>注意：北京时间，比如：2021-12-11 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>到期时间<br>注意：北京时间，比如：2021-12-11 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>自动续费标识<br>注意：此字段为枚举值<br>说明：<br>NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知<br>NOTIFY_AND_AUTO_RENEW：自动续费且到期通知<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag <p>自动续费标识<br>注意：此字段为枚举值<br>说明：<br>NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知<br>NOTIFY_AND_AUTO_RENEW：自动续费且到期通知<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标识<br>注意：此字段为枚举值<br>说明：<br>NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知<br>NOTIFY_AND_AUTO_RENEW：自动续费且到期通知<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag <p>自动续费标识<br>注意：此字段为枚举值<br>说明：<br>NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知<br>NOTIFY_AND_AUTO_RENEW：自动续费且到期通知<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(String AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>计费项ID</p> 
     * @return SpecId <p>计费项ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>计费项ID</p>
     * @param SpecId <p>计费项ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>计费项别名</p> 
     * @return SpecAlias <p>计费项别名</p>
     */
    public String getSpecAlias() {
        return this.SpecAlias;
    }

    /**
     * Set <p>计费项别名</p>
     * @param SpecAlias <p>计费项别名</p>
     */
    public void setSpecAlias(String SpecAlias) {
        this.SpecAlias = SpecAlias;
    }

    /**
     * Get <p>计费项特性列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecFeatures <p>计费项特性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSpecFeatures() {
        return this.SpecFeatures;
    }

    /**
     * Set <p>计费项特性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecFeatures <p>计费项特性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecFeatures(String [] SpecFeatures) {
        this.SpecFeatures = SpecFeatures;
    }

    /**
     * Get <p>纳管cvmid</p> 
     * @return CvmInstanceId <p>纳管cvmid</p>
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set <p>纳管cvmid</p>
     * @param CvmInstanceId <p>纳管cvmid</p>
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get <p>部署失败错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode <p>部署失败错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>部署失败错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode <p>部署失败错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>部署失败错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg <p>部署失败错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>部署失败错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg <p>部署失败错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>节点可用资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableResource <p>节点可用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getAvailableResource() {
        return this.AvailableResource;
    }

    /**
     * Set <p>节点可用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableResource <p>节点可用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableResource(ResourceInfo AvailableResource) {
        this.AvailableResource = AvailableResource;
    }

    /**
     * Get <p>资源组节点的IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIP <p>资源组节点的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceIP() {
        return this.InstanceIP;
    }

    /**
     * Set <p>资源组节点的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIP <p>资源组节点的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIP(String InstanceIP) {
        this.InstanceIP = InstanceIP;
    }

    /**
     * Get <p>资源组节点的名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName <p>资源组节点的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>资源组节点的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName <p>资源组节点的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>cvm机型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmInstanceType <p>cvm机型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmInstanceType() {
        return this.CvmInstanceType;
    }

    /**
     * Set <p>cvm机型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmInstanceType <p>cvm机型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmInstanceType(String CvmInstanceType) {
        this.CvmInstanceType = CvmInstanceType;
    }

    /**
     * Get <p>是否自动续买</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenew <p>是否自动续买</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>是否自动续买</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenew <p>是否自动续买</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenew(Boolean AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>是否被隔离</p> 
     * @return Isolated <p>是否被隔离</p>
     */
    public Boolean getIsolated() {
        return this.Isolated;
    }

    /**
     * Set <p>是否被隔离</p>
     * @param Isolated <p>是否被隔离</p>
     */
    public void setIsolated(Boolean Isolated) {
        this.Isolated = Isolated;
    }

    /**
     * Get <p>维修任务信息</p> 
     * @return RepairTaskInfo <p>维修任务信息</p>
     */
    public RepairTaskInfo getRepairTaskInfo() {
        return this.RepairTaskInfo;
    }

    /**
     * Set <p>维修任务信息</p>
     * @param RepairTaskInfo <p>维修任务信息</p>
     */
    public void setRepairTaskInfo(RepairTaskInfo RepairTaskInfo) {
        this.RepairTaskInfo = RepairTaskInfo;
    }

    /**
     * Get <p>节点可用区名称</p> 
     * @return ZoneName <p>节点可用区名称</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>节点可用区名称</p>
     * @param ZoneName <p>节点可用区名称</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UsedResource != null) {
            this.UsedResource = new ResourceInfo(source.UsedResource);
        }
        if (source.TotalResource != null) {
            this.TotalResource = new ResourceInfo(source.TotalResource);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new String(source.AutoRenewFlag);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecAlias != null) {
            this.SpecAlias = new String(source.SpecAlias);
        }
        if (source.SpecFeatures != null) {
            this.SpecFeatures = new String[source.SpecFeatures.length];
            for (int i = 0; i < source.SpecFeatures.length; i++) {
                this.SpecFeatures[i] = new String(source.SpecFeatures[i]);
            }
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.AvailableResource != null) {
            this.AvailableResource = new ResourceInfo(source.AvailableResource);
        }
        if (source.InstanceIP != null) {
            this.InstanceIP = new String(source.InstanceIP);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.CvmInstanceType != null) {
            this.CvmInstanceType = new String(source.CvmInstanceType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Boolean(source.AutoRenew);
        }
        if (source.Isolated != null) {
            this.Isolated = new Boolean(source.Isolated);
        }
        if (source.RepairTaskInfo != null) {
            this.RepairTaskInfo = new RepairTaskInfo(source.RepairTaskInfo);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "UsedResource.", this.UsedResource);
        this.setParamObj(map, prefix + "TotalResource.", this.TotalResource);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecAlias", this.SpecAlias);
        this.setParamArraySimple(map, prefix + "SpecFeatures.", this.SpecFeatures);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamObj(map, prefix + "AvailableResource.", this.AvailableResource);
        this.setParamSimple(map, prefix + "InstanceIP", this.InstanceIP);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "CvmInstanceType", this.CvmInstanceType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Isolated", this.Isolated);
        this.setParamObj(map, prefix + "RepairTaskInfo.", this.RepairTaskInfo);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

