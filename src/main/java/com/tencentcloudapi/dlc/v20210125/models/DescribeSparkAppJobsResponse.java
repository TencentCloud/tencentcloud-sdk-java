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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppJobsResponse extends AbstractModel{

    /**
    * spark作业列表详情
    */
    @SerializedName("SparkAppJobs")
    @Expose
    private SparkJobInfo [] SparkAppJobs;

    /**
    * spark作业总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get spark作业列表详情 
     * @return SparkAppJobs spark作业列表详情
     */
    public SparkJobInfo [] getSparkAppJobs() {
        return this.SparkAppJobs;
    }

    /**
     * Set spark作业列表详情
     * @param SparkAppJobs spark作业列表详情
     */
    public void setSparkAppJobs(SparkJobInfo [] SparkAppJobs) {
        this.SparkAppJobs = SparkAppJobs;
    }

    /**
     * Get spark作业总数 
     * @return TotalCount spark作业总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set spark作业总数
     * @param TotalCount spark作业总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeSparkAppJobsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppJobsResponse(DescribeSparkAppJobsResponse source) {
        if (source.SparkAppJobs != null) {
            this.SparkAppJobs = new SparkJobInfo[source.SparkAppJobs.length];
            for (int i = 0; i < source.SparkAppJobs.length; i++) {
                this.SparkAppJobs[i] = new SparkJobInfo(source.SparkAppJobs[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SparkAppJobs.", this.SparkAppJobs);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

