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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseResult extends AbstractModel {

    /**
    * ES实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 诊断报告ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 诊断触发时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 诊断是否完成
    */
    @SerializedName("Completed")
    @Expose
    private Boolean Completed;

    /**
    * 诊断总得分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 诊断类型，2 定时诊断，3 客户手动触发诊断
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * 诊断参数，如诊断时间，诊断索引等
    */
    @SerializedName("JobParam")
    @Expose
    private JobParam JobParam;

    /**
    * 诊断项结果列表
    */
    @SerializedName("JobResults")
    @Expose
    private DiagnoseJobResult [] JobResults;

    /**
     * Get ES实例ID 
     * @return InstanceId ES实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES实例ID
     * @param InstanceId ES实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 诊断报告ID 
     * @return RequestId 诊断报告ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 诊断报告ID
     * @param RequestId 诊断报告ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 诊断触发时间 
     * @return CreateTime 诊断触发时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 诊断触发时间
     * @param CreateTime 诊断触发时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 诊断是否完成 
     * @return Completed 诊断是否完成
     */
    public Boolean getCompleted() {
        return this.Completed;
    }

    /**
     * Set 诊断是否完成
     * @param Completed 诊断是否完成
     */
    public void setCompleted(Boolean Completed) {
        this.Completed = Completed;
    }

    /**
     * Get 诊断总得分 
     * @return Score 诊断总得分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 诊断总得分
     * @param Score 诊断总得分
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 诊断类型，2 定时诊断，3 客户手动触发诊断 
     * @return JobType 诊断类型，2 定时诊断，3 客户手动触发诊断
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set 诊断类型，2 定时诊断，3 客户手动触发诊断
     * @param JobType 诊断类型，2 定时诊断，3 客户手动触发诊断
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 诊断参数，如诊断时间，诊断索引等 
     * @return JobParam 诊断参数，如诊断时间，诊断索引等
     */
    public JobParam getJobParam() {
        return this.JobParam;
    }

    /**
     * Set 诊断参数，如诊断时间，诊断索引等
     * @param JobParam 诊断参数，如诊断时间，诊断索引等
     */
    public void setJobParam(JobParam JobParam) {
        this.JobParam = JobParam;
    }

    /**
     * Get 诊断项结果列表 
     * @return JobResults 诊断项结果列表
     */
    public DiagnoseJobResult [] getJobResults() {
        return this.JobResults;
    }

    /**
     * Set 诊断项结果列表
     * @param JobResults 诊断项结果列表
     */
    public void setJobResults(DiagnoseJobResult [] JobResults) {
        this.JobResults = JobResults;
    }

    public DiagnoseResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseResult(DiagnoseResult source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Completed != null) {
            this.Completed = new Boolean(source.Completed);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.JobParam != null) {
            this.JobParam = new JobParam(source.JobParam);
        }
        if (source.JobResults != null) {
            this.JobResults = new DiagnoseJobResult[source.JobResults.length];
            for (int i = 0; i < source.JobResults.length; i++) {
                this.JobResults[i] = new DiagnoseJobResult(source.JobResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Completed", this.Completed);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobParam.", this.JobParam);
        this.setParamArrayObj(map, prefix + "JobResults.", this.JobResults);

    }
}

