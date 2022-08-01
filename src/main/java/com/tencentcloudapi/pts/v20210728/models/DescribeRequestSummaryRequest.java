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

public class DescribeRequestSummaryRequest extends AbstractModel{

    /**
    * 压测任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 压测场景ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 压测项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 压测任务ID 
     * @return JobId 压测任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 压测任务ID
     * @param JobId 压测任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 压测场景ID 
     * @return ScenarioId 压测场景ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 压测场景ID
     * @param ScenarioId 压测场景ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 压测项目ID 
     * @return ProjectId 压测项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 压测项目ID
     * @param ProjectId 压测项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeRequestSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRequestSummaryRequest(DescribeRequestSummaryRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

