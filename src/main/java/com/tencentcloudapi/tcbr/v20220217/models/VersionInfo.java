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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionInfo extends AbstractModel {

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 流量比例
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * 版本状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 构建Id
    */
    @SerializedName("BuildId")
    @Expose
    private Long BuildId;

    /**
    * 上传方式
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * 操作标识
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 测试参数
    */
    @SerializedName("UrlParam")
    @Expose
    private ObjectKV UrlParam;

    /**
    * 权重
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 是否默认
    */
    @SerializedName("IsDefaultPriority")
    @Expose
    private Boolean IsDefaultPriority;

    /**
    * 流量参数
    */
    @SerializedName("FlowParams")
    @Expose
    private ObjectKVPriority [] FlowParams;

    /**
    * 最小副本数
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 最大副本数
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 操作Id
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 当前副本数
    */
    @SerializedName("CurrentReplicas")
    @Expose
    private Long CurrentReplicas;

    /**
    * 架构类型
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 流量比例 
     * @return FlowRatio 流量比例
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量比例
     * @param FlowRatio 流量比例
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get 版本状态 
     * @return Status 版本状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态
     * @param Status 版本状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 构建Id 
     * @return BuildId 构建Id
     */
    public Long getBuildId() {
        return this.BuildId;
    }

    /**
     * Set 构建Id
     * @param BuildId 构建Id
     */
    public void setBuildId(Long BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get 上传方式 
     * @return UploadType 上传方式
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 上传方式
     * @param UploadType 上传方式
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get 操作标识 
     * @return Remark 操作标识
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 操作标识
     * @param Remark 操作标识
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 测试参数 
     * @return UrlParam 测试参数
     */
    public ObjectKV getUrlParam() {
        return this.UrlParam;
    }

    /**
     * Set 测试参数
     * @param UrlParam 测试参数
     */
    public void setUrlParam(ObjectKV UrlParam) {
        this.UrlParam = UrlParam;
    }

    /**
     * Get 权重 
     * @return Priority 权重
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 权重
     * @param Priority 权重
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 是否默认 
     * @return IsDefaultPriority 是否默认
     */
    public Boolean getIsDefaultPriority() {
        return this.IsDefaultPriority;
    }

    /**
     * Set 是否默认
     * @param IsDefaultPriority 是否默认
     */
    public void setIsDefaultPriority(Boolean IsDefaultPriority) {
        this.IsDefaultPriority = IsDefaultPriority;
    }

    /**
     * Get 流量参数 
     * @return FlowParams 流量参数
     */
    public ObjectKVPriority [] getFlowParams() {
        return this.FlowParams;
    }

    /**
     * Set 流量参数
     * @param FlowParams 流量参数
     */
    public void setFlowParams(ObjectKVPriority [] FlowParams) {
        this.FlowParams = FlowParams;
    }

    /**
     * Get 最小副本数 
     * @return MinReplicas 最小副本数
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小副本数
     * @param MinReplicas 最小副本数
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 最大副本数 
     * @return MaxReplicas 最大副本数
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大副本数
     * @param MaxReplicas 最大副本数
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 操作Id 
     * @return RunId 操作Id
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set 操作Id
     * @param RunId 操作Id
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get 百分比 
     * @return Percent 百分比
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比
     * @param Percent 百分比
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 当前副本数 
     * @return CurrentReplicas 当前副本数
     */
    public Long getCurrentReplicas() {
        return this.CurrentReplicas;
    }

    /**
     * Set 当前副本数
     * @param CurrentReplicas 当前副本数
     */
    public void setCurrentReplicas(Long CurrentReplicas) {
        this.CurrentReplicas = CurrentReplicas;
    }

    /**
     * Get 架构类型 
     * @return Architecture 架构类型
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 架构类型
     * @param Architecture 架构类型
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    public VersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionInfo(VersionInfo source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
            this.FlowParams = new ObjectKVPriority[source.FlowParams.length];
            for (int i = 0; i < source.FlowParams.length; i++) {
                this.FlowParams[i] = new ObjectKVPriority(source.FlowParams[i]);
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
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamSimple(map, prefix + "Status", this.Status);
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

