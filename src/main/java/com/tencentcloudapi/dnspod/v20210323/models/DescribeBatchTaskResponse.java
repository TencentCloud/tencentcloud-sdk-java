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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchTaskResponse extends AbstractModel{

    /**
    * 批量任务详情
    */
    @SerializedName("DetailList")
    @Expose
    private DescribeBatchTaskDetail [] DetailList;

    /**
    * 总任务条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 成功条数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败条数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 批量任务类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 任务创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量任务详情 
     * @return DetailList 批量任务详情
     */
    public DescribeBatchTaskDetail [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set 批量任务详情
     * @param DetailList 批量任务详情
     */
    public void setDetailList(DescribeBatchTaskDetail [] DetailList) {
        this.DetailList = DetailList;
    }

    /**
     * Get 总任务条数 
     * @return TotalCount 总任务条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总任务条数
     * @param TotalCount 总任务条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 成功条数 
     * @return SuccessCount 成功条数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功条数
     * @param SuccessCount 成功条数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败条数 
     * @return FailCount 失败条数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败条数
     * @param FailCount 失败条数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 批量任务类型 
     * @return JobType 批量任务类型
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 批量任务类型
     * @param JobType 批量任务类型
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 任务创建时间 
     * @return CreatedAt 任务创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 任务创建时间
     * @param CreatedAt 任务创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
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

    public DescribeBatchTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchTaskResponse(DescribeBatchTaskResponse source) {
        if (source.DetailList != null) {
            this.DetailList = new DescribeBatchTaskDetail[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new DescribeBatchTaskDetail(source.DetailList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

