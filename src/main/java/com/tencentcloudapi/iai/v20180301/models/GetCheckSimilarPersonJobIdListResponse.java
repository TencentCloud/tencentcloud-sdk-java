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

public class GetCheckSimilarPersonJobIdListResponse extends AbstractModel{

    /**
    * 人员查重任务信息列表。
    */
    @SerializedName("JobIdInfos")
    @Expose
    private JobIdInfo [] JobIdInfos;

    /**
    * 查重任务总数量。
    */
    @SerializedName("JobIdNum")
    @Expose
    private Long JobIdNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员查重任务信息列表。 
     * @return JobIdInfos 人员查重任务信息列表。
     */
    public JobIdInfo [] getJobIdInfos() {
        return this.JobIdInfos;
    }

    /**
     * Set 人员查重任务信息列表。
     * @param JobIdInfos 人员查重任务信息列表。
     */
    public void setJobIdInfos(JobIdInfo [] JobIdInfos) {
        this.JobIdInfos = JobIdInfos;
    }

    /**
     * Get 查重任务总数量。 
     * @return JobIdNum 查重任务总数量。
     */
    public Long getJobIdNum() {
        return this.JobIdNum;
    }

    /**
     * Set 查重任务总数量。
     * @param JobIdNum 查重任务总数量。
     */
    public void setJobIdNum(Long JobIdNum) {
        this.JobIdNum = JobIdNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "JobIdInfos.", this.JobIdInfos);
        this.setParamSimple(map, prefix + "JobIdNum", this.JobIdNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

