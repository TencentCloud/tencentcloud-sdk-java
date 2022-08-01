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

public class AbortJobRequest extends AbstractModel{

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
    * 中断原因
    */
    @SerializedName("AbortReason")
    @Expose
    private Long AbortReason;

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
     * Get 中断原因 
     * @return AbortReason 中断原因
     */
    public Long getAbortReason() {
        return this.AbortReason;
    }

    /**
     * Set 中断原因
     * @param AbortReason 中断原因
     */
    public void setAbortReason(Long AbortReason) {
        this.AbortReason = AbortReason;
    }

    public AbortJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbortJobRequest(AbortJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.AbortReason != null) {
            this.AbortReason = new Long(source.AbortReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "AbortReason", this.AbortReason);

    }
}

