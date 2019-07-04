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

public class DescribeImageTaskResponse  extends AbstractModel{

    /**
    * 任务处理结果
    */
    @SerializedName("ResultSet")
    @Expose
    private ImageTaskResult [] ResultSet;

    /**
    * 任务唯一标识
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 任务执行进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务结果数目
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
     * 获取任务处理结果
     * @return ResultSet 任务处理结果
     */
    public ImageTaskResult [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * 设置任务处理结果
     * @param ResultSet 任务处理结果
     */
    public void setResultSet(ImageTaskResult [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * 获取任务唯一标识
     * @return JobId 任务唯一标识
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * 设置任务唯一标识
     * @param JobId 任务唯一标识
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取任务执行进度
     * @return Progress 任务执行进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * 设置任务执行进度
     * @param Progress 任务执行进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * 获取任务结果数目
     * @return TotalCount 任务结果数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置任务结果数目
     * @param TotalCount 任务结果数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

