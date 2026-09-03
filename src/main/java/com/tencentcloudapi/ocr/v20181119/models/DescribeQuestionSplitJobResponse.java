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

public class DescribeQuestionSplitJobResponse extends AbstractModel {

    /**
    * <p>切题详情</p>
    */
    @SerializedName("QuestionInfo")
    @Expose
    private QuestionInfo [] QuestionInfo;

    /**
    * <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>任务状态。</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>切题详情</p> 
     * @return QuestionInfo <p>切题详情</p>
     */
    public QuestionInfo [] getQuestionInfo() {
        return this.QuestionInfo;
    }

    /**
     * Set <p>切题详情</p>
     * @param QuestionInfo <p>切题详情</p>
     */
    public void setQuestionInfo(QuestionInfo [] QuestionInfo) {
        this.QuestionInfo = QuestionInfo;
    }

    /**
     * Get <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p> 
     * @return ErrorCode <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     * @param ErrorCode <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p> 
     * @return ErrorMessage <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     * @param ErrorMessage <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>任务状态。</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul> 
     * @return JobStatus <p>任务状态。</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set <p>任务状态。</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
     * @param JobStatus <p>任务状态。</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
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

    public DescribeQuestionSplitJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQuestionSplitJobResponse(DescribeQuestionSplitJobResponse source) {
        if (source.QuestionInfo != null) {
            this.QuestionInfo = new QuestionInfo[source.QuestionInfo.length];
            for (int i = 0; i < source.QuestionInfo.length; i++) {
                this.QuestionInfo[i] = new QuestionInfo(source.QuestionInfo[i]);
            }
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "QuestionInfo.", this.QuestionInfo);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

