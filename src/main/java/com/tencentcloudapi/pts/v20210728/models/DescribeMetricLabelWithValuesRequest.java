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

public class DescribeMetricLabelWithValuesRequest extends AbstractModel{

    /**
    * job id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * project id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * scenario id
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

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
     * Get project id 
     * @return ProjectId project id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set project id
     * @param ProjectId project id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get scenario id 
     * @return ScenarioId scenario id
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set scenario id
     * @param ScenarioId scenario id
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    public DescribeMetricLabelWithValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricLabelWithValuesRequest(DescribeMetricLabelWithValuesRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);

    }
}

