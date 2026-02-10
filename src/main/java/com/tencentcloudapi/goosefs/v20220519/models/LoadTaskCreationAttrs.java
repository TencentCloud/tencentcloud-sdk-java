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
    * 预热任务类型，枚举值，MetadataLoad｜DistributedLoad。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 任务描述，支持中文
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
    */
    @SerializedName("MetadataLoadAttrs")
    @Expose
    private MetadataLoadAttrs MetadataLoadAttrs;

    /**
    * 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
    */
    @SerializedName("DistributedLoadAttrs")
    @Expose
    private DistributedLoadAttrs DistributedLoadAttrs;

    /**
    * 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

    /**
     * Get 预热任务类型，枚举值，MetadataLoad｜DistributedLoad。 
     * @return TaskType 预热任务类型，枚举值，MetadataLoad｜DistributedLoad。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 预热任务类型，枚举值，MetadataLoad｜DistributedLoad。
     * @param TaskType 预热任务类型，枚举值，MetadataLoad｜DistributedLoad。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1 
     * @return Priority 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     * @param Priority 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 任务描述，支持中文 
     * @return Description 任务描述，支持中文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述，支持中文
     * @param Description 任务描述，支持中文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。 
     * @return MetadataLoadAttrs 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
     */
    public MetadataLoadAttrs getMetadataLoadAttrs() {
        return this.MetadataLoadAttrs;
    }

    /**
     * Set 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
     * @param MetadataLoadAttrs 元数据预热任务参数，用于仅预热元数据时入参。入参数TaskType为MetadataLoad时，该参数不应为空。
     */
    public void setMetadataLoadAttrs(MetadataLoadAttrs MetadataLoadAttrs) {
        this.MetadataLoadAttrs = MetadataLoadAttrs;
    }

    /**
     * Get 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。 
     * @return DistributedLoadAttrs 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
     */
    public DistributedLoadAttrs getDistributedLoadAttrs() {
        return this.DistributedLoadAttrs;
    }

    /**
     * Set 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
     * @param DistributedLoadAttrs 数据预热任务参数。入参数TaskType为DistributedLoad时，该参数不应为空。
     */
    public void setDistributedLoadAttrs(DistributedLoadAttrs DistributedLoadAttrs) {
        this.DistributedLoadAttrs = DistributedLoadAttrs;
    }

    /**
     * Get 将任务执行报告写入 COS 的路径，如果不需要报告则入参空 
     * @return ReportPath 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
     * @param ReportPath 将任务执行报告写入 COS 的路径，如果不需要报告则入参空
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
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

    }
}

