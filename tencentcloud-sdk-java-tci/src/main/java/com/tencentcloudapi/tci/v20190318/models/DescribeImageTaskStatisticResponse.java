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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageTaskStatisticResponse extends AbstractModel{

    /**
    * 任务统计信息
    */
    @SerializedName("Statistic")
    @Expose
    private ImageTaskStatistic Statistic;

    /**
    * 图像任务唯一标识符
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务统计信息 
     * @return Statistic 任务统计信息
     */
    public ImageTaskStatistic getStatistic() {
        return this.Statistic;
    }

    /**
     * Set 任务统计信息
     * @param Statistic 任务统计信息
     */
    public void setStatistic(ImageTaskStatistic Statistic) {
        this.Statistic = Statistic;
    }

    /**
     * Get 图像任务唯一标识符 
     * @return JobId 图像任务唯一标识符
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 图像任务唯一标识符
     * @param JobId 图像任务唯一标识符
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
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
        this.setParamObj(map, prefix + "Statistic.", this.Statistic);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

