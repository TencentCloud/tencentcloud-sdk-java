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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobInstanceForSubmissionLog extends AbstractModel{

    /**
    * 实例的Id, 按照启动的时间顺序，从1开始
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
    * 作业实例的启动时间
    */
    @SerializedName("JobInstanceStartTime")
    @Expose
    private String JobInstanceStartTime;

    /**
    * 作业实例启动的时间（毫秒）
    */
    @SerializedName("StartingMillis")
    @Expose
    private Long StartingMillis;

    /**
     * Get 实例的Id, 按照启动的时间顺序，从1开始 
     * @return RunningOrderId 实例的Id, 按照启动的时间顺序，从1开始
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set 实例的Id, 按照启动的时间顺序，从1开始
     * @param RunningOrderId 实例的Id, 按照启动的时间顺序，从1开始
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    /**
     * Get 作业实例的启动时间 
     * @return JobInstanceStartTime 作业实例的启动时间
     */
    public String getJobInstanceStartTime() {
        return this.JobInstanceStartTime;
    }

    /**
     * Set 作业实例的启动时间
     * @param JobInstanceStartTime 作业实例的启动时间
     */
    public void setJobInstanceStartTime(String JobInstanceStartTime) {
        this.JobInstanceStartTime = JobInstanceStartTime;
    }

    /**
     * Get 作业实例启动的时间（毫秒） 
     * @return StartingMillis 作业实例启动的时间（毫秒）
     */
    public Long getStartingMillis() {
        return this.StartingMillis;
    }

    /**
     * Set 作业实例启动的时间（毫秒）
     * @param StartingMillis 作业实例启动的时间（毫秒）
     */
    public void setStartingMillis(Long StartingMillis) {
        this.StartingMillis = StartingMillis;
    }

    public JobInstanceForSubmissionLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobInstanceForSubmissionLog(JobInstanceForSubmissionLog source) {
        if (source.RunningOrderId != null) {
            this.RunningOrderId = new Long(source.RunningOrderId);
        }
        if (source.JobInstanceStartTime != null) {
            this.JobInstanceStartTime = new String(source.JobInstanceStartTime);
        }
        if (source.StartingMillis != null) {
            this.StartingMillis = new Long(source.StartingMillis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunningOrderId", this.RunningOrderId);
        this.setParamSimple(map, prefix + "JobInstanceStartTime", this.JobInstanceStartTime);
        this.setParamSimple(map, prefix + "StartingMillis", this.StartingMillis);

    }
}

