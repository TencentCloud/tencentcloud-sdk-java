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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSampleMatrixBatchQueryRequest extends AbstractModel {

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
    * 查询语句
    */
    @SerializedName("Queries")
    @Expose
    private InternalMetricQuery [] Queries;

    /**
    * 最多返回的数据点个数
    */
    @SerializedName("MaxPoint")
    @Expose
    private Long MaxPoint;

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
     * Get 查询语句 
     * @return Queries 查询语句
     */
    public InternalMetricQuery [] getQueries() {
        return this.Queries;
    }

    /**
     * Set 查询语句
     * @param Queries 查询语句
     */
    public void setQueries(InternalMetricQuery [] Queries) {
        this.Queries = Queries;
    }

    /**
     * Get 最多返回的数据点个数 
     * @return MaxPoint 最多返回的数据点个数
     */
    public Long getMaxPoint() {
        return this.MaxPoint;
    }

    /**
     * Set 最多返回的数据点个数
     * @param MaxPoint 最多返回的数据点个数
     */
    public void setMaxPoint(Long MaxPoint) {
        this.MaxPoint = MaxPoint;
    }

    public DescribeSampleMatrixBatchQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleMatrixBatchQueryRequest(DescribeSampleMatrixBatchQueryRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Queries != null) {
            this.Queries = new InternalMetricQuery[source.Queries.length];
            for (int i = 0; i < source.Queries.length; i++) {
                this.Queries[i] = new InternalMetricQuery(source.Queries[i]);
            }
        }
        if (source.MaxPoint != null) {
            this.MaxPoint = new Long(source.MaxPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamArrayObj(map, prefix + "Queries.", this.Queries);
        this.setParamSimple(map, prefix + "MaxPoint", this.MaxPoint);

    }
}

