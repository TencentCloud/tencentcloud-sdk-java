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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadTaskCreationAttrs extends AbstractModel {

    /**
    * <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad。</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>任务描述，支持中文</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
    */
    @SerializedName("MetadataLoadAttrs")
    @Expose
    private MetadataLoadAttrs MetadataLoadAttrs;

    /**
    * <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
    */
    @SerializedName("DistributedLoadAttrs")
    @Expose
    private DistributedLoadAttrs DistributedLoadAttrs;

    /**
    * <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

    /**
    * <p>仅预热数据任务参数。入参数TaskType为LoadData时，该参数不应为空。</p>
    */
    @SerializedName("LoadDataAttrs")
    @Expose
    private LoadDataAttrs LoadDataAttrs;

    /**
     * Get <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad。</p> 
     * @return TaskType <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad。</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad。</p>
     * @param TaskType <p>预热任务类型，枚举值，MetadataLoad｜DistributedLoad。</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p> 
     * @return Priority <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
     * @param Priority <p>任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>任务描述，支持中文</p> 
     * @return Description <p>任务描述，支持中文</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述，支持中文</p>
     * @param Description <p>任务描述，支持中文</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p> 
     * @return MetadataLoadAttrs <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
     */
    public MetadataLoadAttrs getMetadataLoadAttrs() {
        return this.MetadataLoadAttrs;
    }

    /**
     * Set <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
     * @param MetadataLoadAttrs <p>元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。</p>
     */
    public void setMetadataLoadAttrs(MetadataLoadAttrs MetadataLoadAttrs) {
        this.MetadataLoadAttrs = MetadataLoadAttrs;
    }

    /**
     * Get <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p> 
     * @return DistributedLoadAttrs <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
     */
    public DistributedLoadAttrs getDistributedLoadAttrs() {
        return this.DistributedLoadAttrs;
    }

    /**
     * Set <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
     * @param DistributedLoadAttrs <p>数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。</p>
     */
    public void setDistributedLoadAttrs(DistributedLoadAttrs DistributedLoadAttrs) {
        this.DistributedLoadAttrs = DistributedLoadAttrs;
    }

    /**
     * Get <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p> 
     * @return ReportPath <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
     * @param ReportPath <p>将任务执行报告写入 COS 的路径，如果不需要报告则入参空</p>
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
    }

    /**
     * Get <p>仅预热数据任务参数。入参数TaskType为LoadData时，该参数不应为空。</p> 
     * @return LoadDataAttrs <p>仅预热数据任务参数。入参数TaskType为LoadData时，该参数不应为空。</p>
     */
    public LoadDataAttrs getLoadDataAttrs() {
        return this.LoadDataAttrs;
    }

    /**
     * Set <p>仅预热数据任务参数。入参数TaskType为LoadData时，该参数不应为空。</p>
     * @param LoadDataAttrs <p>仅预热数据任务参数。入参数TaskType为LoadData时，该参数不应为空。</p>
     */
    public void setLoadDataAttrs(LoadDataAttrs LoadDataAttrs) {
        this.LoadDataAttrs = LoadDataAttrs;
    }

    public LoadTaskCreationAttrs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadTaskCreationAttrs(LoadTaskCreationAttrs source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MetadataLoadAttrs != null) {
            this.MetadataLoadAttrs = new MetadataLoadAttrs(source.MetadataLoadAttrs);
        }
        if (source.DistributedLoadAttrs != null) {
            this.DistributedLoadAttrs = new DistributedLoadAttrs(source.DistributedLoadAttrs);
        }
        if (source.ReportPath != null) {
            this.ReportPath = new String(source.ReportPath);
        }
        if (source.LoadDataAttrs != null) {
            this.LoadDataAttrs = new LoadDataAttrs(source.LoadDataAttrs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "MetadataLoadAttrs.", this.MetadataLoadAttrs);
        this.setParamObj(map, prefix + "DistributedLoadAttrs.", this.DistributedLoadAttrs);
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);
        this.setParamObj(map, prefix + "LoadDataAttrs.", this.LoadDataAttrs);

    }
}

