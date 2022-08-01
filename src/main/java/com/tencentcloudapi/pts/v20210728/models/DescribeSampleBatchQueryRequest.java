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

public class DescribeSampleBatchQueryRequest extends AbstractModel{

    /**
    * job id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 场景id
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 查询指标数组
    */
    @SerializedName("Queries")
    @Expose
    private InternalMetricQuery [] Queries;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
     * Get 场景id 
     * @return ScenarioId 场景id
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景id
     * @param ScenarioId 场景id
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 查询指标数组 
     * @return Queries 查询指标数组
     */
    public InternalMetricQuery [] getQueries() {
        return this.Queries;
    }

    /**
     * Set 查询指标数组
     * @param Queries 查询指标数组
     */
    public void setQueries(InternalMetricQuery [] Queries) {
        this.Queries = Queries;
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

    public DescribeSampleBatchQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleBatchQueryRequest(DescribeSampleBatchQueryRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
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
        this.setParamArrayObj(map, prefix + "Queries.", this.Queries);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

