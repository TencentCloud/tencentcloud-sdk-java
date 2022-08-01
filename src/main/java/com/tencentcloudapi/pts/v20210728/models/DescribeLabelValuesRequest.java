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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLabelValuesRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 场景ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 指标名称
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 查询标签名称
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 任务ID 
     * @return JobId 任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID
     * @param JobId 任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 场景ID 
     * @return ScenarioId 场景ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景ID
     * @param ScenarioId 场景ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 指标名称 
     * @return Metric 指标名称
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称
     * @param Metric 指标名称
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 查询标签名称 
     * @return LabelName 查询标签名称
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 查询标签名称
     * @param LabelName 查询标签名称
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeLabelValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLabelValuesRequest(DescribeLabelValuesRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

