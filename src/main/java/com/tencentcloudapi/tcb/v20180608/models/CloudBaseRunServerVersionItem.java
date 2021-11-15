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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunServerVersionItem extends AbstractModel{

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 流量占比
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 构建ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildId")
    @Expose
    private Long BuildId;

    /**
    * 构建方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * url中的参数路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlParam")
    @Expose
    private ObjectKV UrlParam;

    /**
    * 优先级（数值越小，优先级越高）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefaultPriority")
    @Expose
    private Boolean IsDefaultPriority;

    /**
    * KV Params
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowParams")
    @Expose
    private CloudBaseRunKVPriority [] FlowParams;

    /**
    * 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 当前副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentReplicas")
    @Expose
    private Long CurrentReplicas;

    /**
    * Monolithic，Microservice
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 流量占比 
     * @return FlowRatio 流量占比
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量占比
     * @param FlowRatio 流量占比
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 构建ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildId 构建ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBuildId() {
        return this.BuildId;
    }

    /**
     * Set 构建ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildId 构建ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildId(Long BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get 构建方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadType 构建方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 构建方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadType 构建方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
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
     * Get url中的参数路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlParam url中的参数路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectKV getUrlParam() {
        return this.UrlParam;
    }

    /**
     * Set url中的参数路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlParam url中的参数路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlParam(ObjectKV UrlParam) {
        this.UrlParam = UrlParam;
    }

    /**
     * Get 优先级（数值越小，优先级越高）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 优先级（数值越小，优先级越高）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级（数值越小，优先级越高）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 优先级（数值越小，优先级越高）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefaultPriority 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefaultPriority() {
        return this.IsDefaultPriority;
    }

    /**
     * Set 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefaultPriority 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefaultPriority(Boolean IsDefaultPriority) {
        this.IsDefaultPriority = IsDefaultPriority;
    }

    /**
     * Get KV Params
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowParams KV Params
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseRunKVPriority [] getFlowParams() {
        return this.FlowParams;
    }

    /**
     * Set KV Params
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowParams KV Params
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowParams(CloudBaseRunKVPriority [] FlowParams) {
        this.FlowParams = FlowParams;
    }

    /**
     * Get 最小副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinReplicas 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinReplicas 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 最大副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReplicas 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReplicas 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 操作记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunId 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunId 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get 进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 当前副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentReplicas 当前副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentReplicas() {
        return this.CurrentReplicas;
    }

    /**
     * Set 当前副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentReplicas 当前副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentReplicas(Long CurrentReplicas) {
        this.CurrentReplicas = CurrentReplicas;
    }

    /**
     * Get Monolithic，Microservice
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Architecture Monolithic，Microservice
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set Monolithic，Microservice
注意：此字段可能返回 null，表示取不到有效值。
     * @param Architecture Monolithic，Microservice
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    public CloudBaseRunServerVersionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunServerVersionItem(CloudBaseRunServerVersionItem source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.BuildId != null) {
            this.BuildId = new Long(source.BuildId);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UrlParam != null) {
            this.UrlParam = new ObjectKV(source.UrlParam);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.IsDefaultPriority != null) {
            this.IsDefaultPriority = new Boolean(source.IsDefaultPriority);
        }
        if (source.FlowParams != null) {
            this.FlowParams = new CloudBaseRunKVPriority[source.FlowParams.length];
            for (int i = 0; i < source.FlowParams.length; i++) {
                this.FlowParams[i] = new CloudBaseRunKVPriority(source.FlowParams[i]);
            }
        }
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.CurrentReplicas != null) {
            this.CurrentReplicas = new Long(source.CurrentReplicas);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "UrlParam.", this.UrlParam);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "IsDefaultPriority", this.IsDefaultPriority);
        this.setParamArrayObj(map, prefix + "FlowParams.", this.FlowParams);
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CurrentReplicas", this.CurrentReplicas);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);

    }
}

