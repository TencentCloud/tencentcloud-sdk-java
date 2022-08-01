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

public class DescribeSampleQueryRequest extends AbstractModel{

    /**
    * job id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 场景Id
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 指标名
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 聚合条件
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 过滤条件
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
     * Get job id 
     * @return JobId job id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set job id
     * @param JobId job id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 场景Id 
     * @return ScenarioId 场景Id
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景Id
     * @param ScenarioId 场景Id
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 指标名 
     * @return Metric 指标名
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名
     * @param Metric 指标名
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 聚合条件 
     * @return Aggregation 聚合条件
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set 聚合条件
     * @param Aggregation 聚合条件
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
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

    /**
     * Get 过滤条件 
     * @return Labels 过滤条件
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 过滤条件
     * @param Labels 过滤条件
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    public DescribeSampleQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleQueryRequest(DescribeSampleQueryRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

