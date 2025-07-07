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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHighlightResultResponse extends AbstractModel {

    /**
    * 精彩集锦详细信息。
    */
    @SerializedName("HighlightsInfo")
    @Expose
    private HighlightsInfomation [] HighlightsInfo;

    /**
    * 精彩集锦任务唯一id。在URL方式时提交请求后会返回一个JobId，后续查询该url的结果时使用这个JobId进行查询。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 任务的进度百分比，100表示任务已完成。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 精彩集锦详细信息。 
     * @return HighlightsInfo 精彩集锦详细信息。
     */
    public HighlightsInfomation [] getHighlightsInfo() {
        return this.HighlightsInfo;
    }

    /**
     * Set 精彩集锦详细信息。
     * @param HighlightsInfo 精彩集锦详细信息。
     */
    public void setHighlightsInfo(HighlightsInfomation [] HighlightsInfo) {
        this.HighlightsInfo = HighlightsInfo;
    }

    /**
     * Get 精彩集锦任务唯一id。在URL方式时提交请求后会返回一个JobId，后续查询该url的结果时使用这个JobId进行查询。 
     * @return JobId 精彩集锦任务唯一id。在URL方式时提交请求后会返回一个JobId，后续查询该url的结果时使用这个JobId进行查询。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 精彩集锦任务唯一id。在URL方式时提交请求后会返回一个JobId，后续查询该url的结果时使用这个JobId进行查询。
     * @param JobId 精彩集锦任务唯一id。在URL方式时提交请求后会返回一个JobId，后续查询该url的结果时使用这个JobId进行查询。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务的进度百分比，100表示任务已完成。 
     * @return Progress 任务的进度百分比，100表示任务已完成。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务的进度百分比，100表示任务已完成。
     * @param Progress 任务的进度百分比，100表示任务已完成。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
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

    public DescribeHighlightResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHighlightResultResponse(DescribeHighlightResultResponse source) {
        if (source.HighlightsInfo != null) {
            this.HighlightsInfo = new HighlightsInfomation[source.HighlightsInfo.length];
            for (int i = 0; i < source.HighlightsInfo.length; i++) {
                this.HighlightsInfo[i] = new HighlightsInfomation(source.HighlightsInfo[i]);
            }
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightsInfo.", this.HighlightsInfo);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

