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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitQuestionMarkAgentJobResponse extends AbstractModel {

    /**
    * 任务唯一ID。由服务端生成.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 切题题目边框坐标列表 （如果BoolSingleQuestion为true则返回空）
    */
    @SerializedName("QuestionInfo")
    @Expose
    private QuestionInfo [] QuestionInfo;

    /**
    * 题目切题数量，作为计费题目数总量
    */
    @SerializedName("QuestionCount")
    @Expose
    private String QuestionCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务唯一ID。由服务端生成. 
     * @return JobId 任务唯一ID。由服务端生成.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务唯一ID。由服务端生成.
     * @param JobId 任务唯一ID。由服务端生成.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 切题题目边框坐标列表 （如果BoolSingleQuestion为true则返回空） 
     * @return QuestionInfo 切题题目边框坐标列表 （如果BoolSingleQuestion为true则返回空）
     */
    public QuestionInfo [] getQuestionInfo() {
        return this.QuestionInfo;
    }

    /**
     * Set 切题题目边框坐标列表 （如果BoolSingleQuestion为true则返回空）
     * @param QuestionInfo 切题题目边框坐标列表 （如果BoolSingleQuestion为true则返回空）
     */
    public void setQuestionInfo(QuestionInfo [] QuestionInfo) {
        this.QuestionInfo = QuestionInfo;
    }

    /**
     * Get 题目切题数量，作为计费题目数总量 
     * @return QuestionCount 题目切题数量，作为计费题目数总量
     */
    public String getQuestionCount() {
        return this.QuestionCount;
    }

    /**
     * Set 题目切题数量，作为计费题目数总量
     * @param QuestionCount 题目切题数量，作为计费题目数总量
     */
    public void setQuestionCount(String QuestionCount) {
        this.QuestionCount = QuestionCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SubmitQuestionMarkAgentJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitQuestionMarkAgentJobResponse(SubmitQuestionMarkAgentJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.QuestionInfo != null) {
            this.QuestionInfo = new QuestionInfo[source.QuestionInfo.length];
            for (int i = 0; i < source.QuestionInfo.length; i++) {
                this.QuestionInfo[i] = new QuestionInfo(source.QuestionInfo[i]);
            }
        }
        if (source.QuestionCount != null) {
            this.QuestionCount = new String(source.QuestionCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArrayObj(map, prefix + "QuestionInfo.", this.QuestionInfo);
        this.setParamSimple(map, prefix + "QuestionCount", this.QuestionCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

