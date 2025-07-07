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

public class DescribeHighlightResultRequest extends AbstractModel {

    /**
    * 精彩集锦任务唯一id。在URL方式时提交请求后会返回一个JobId，后续查询该url的结果时使用这个JobId进行查询。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

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

    public DescribeHighlightResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHighlightResultRequest(DescribeHighlightResultRequest source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

