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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulerTaskDetail extends AbstractModel {

    /**
    * 步骤
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
    * 进度
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 失败信息
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 用来获取详情的id
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
     * Get 步骤 
     * @return Step 步骤
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set 步骤
     * @param Step 步骤
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    /**
     * Get 进度 
     * @return Progress 进度
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度
     * @param Progress 进度
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 失败信息 
     * @return FailReason 失败信息
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败信息
     * @param FailReason 失败信息
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 用来获取详情的id 
     * @return JobId 用来获取详情的id
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 用来获取详情的id
     * @param JobId 用来获取详情的id
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    public SchedulerTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulerTaskDetail(SchedulerTaskDetail source) {
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

