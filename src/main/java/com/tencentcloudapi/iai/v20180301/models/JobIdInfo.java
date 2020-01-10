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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobIdInfo extends AbstractModel{

    /**
    * 查重任务ID，用于查询、获取查重的进度和结果。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

    /**
     * Get 查重任务ID，用于查询、获取查重的进度和结果。 
     * @return JobId 查重任务ID，用于查询、获取查重的进度和结果。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 查重任务ID，用于查询、获取查重的进度和结果。
     * @param JobId 查重任务ID，用于查询、获取查重的进度和结果。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。 
     * @return StartTime 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     * @param StartTime 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查重任务是否已完成。0: 成功 1: 未完成 2: 失败 
     * @return JobStatus 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
     * @param JobStatus 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);

    }
}

