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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EDRScanTaskContainerItem extends AbstractModel {

    /**
    * <p>容器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * <p>容器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>告警数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
     * Get <p>容器ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerID <p>容器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set <p>容器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerID <p>容器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get <p>容器名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName <p>容器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>容器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName <p>容器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudType <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudType <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>告警数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount <p>告警数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>告警数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount <p>告警数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixSuggestion <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixSuggestion <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    public EDRScanTaskContainerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRScanTaskContainerItem(EDRScanTaskContainerItem source) {
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);

    }
}

