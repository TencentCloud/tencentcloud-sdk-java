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

public class DescribeSampleMatrixQueryRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 场景ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 指标名字
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 聚合函数
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * 指标过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分组
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

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
     * Get 指标名字 
     * @return Metric 指标名字
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名字
     * @param Metric 指标名字
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 聚合函数 
     * @return Aggregation 聚合函数
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set 聚合函数
     * @param Aggregation 聚合函数
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get 指标过滤 
     * @return Filters 指标过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 指标过滤
     * @param Filters 指标过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分组 
     * @return GroupBy 分组
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 分组
     * @param GroupBy 分组
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    public DescribeSampleMatrixQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleMatrixQueryRequest(DescribeSampleMatrixQueryRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);

    }
}

