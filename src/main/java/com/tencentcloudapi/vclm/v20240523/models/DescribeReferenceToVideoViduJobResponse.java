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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReferenceToVideoViduJobResponse extends AbstractModel {

    /**
    * <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
    * <p>结果视频 URL。有效期 24 小时。</p>
    */
    @SerializedName("ResultVideoUrl")
    @Expose
    private String ResultVideoUrl;

    /**
    * <p>该任务消耗的积分数量。</p>
    */
    @SerializedName("Credits")
    @Expose
    private Float Credits;

    /**
    * <p>任务调用时传入的透传参数。</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p> 
     * @return Status <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     * @param Status <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>结果视频 URL。有效期 24 小时。</p> 
     * @return ResultVideoUrl <p>结果视频 URL。有效期 24 小时。</p>
     */
    public String getResultVideoUrl() {
        return this.ResultVideoUrl;
    }

    /**
     * Set <p>结果视频 URL。有效期 24 小时。</p>
     * @param ResultVideoUrl <p>结果视频 URL。有效期 24 小时。</p>
     */
    public void setResultVideoUrl(String ResultVideoUrl) {
        this.ResultVideoUrl = ResultVideoUrl;
    }

    /**
     * Get <p>该任务消耗的积分数量。</p> 
     * @return Credits <p>该任务消耗的积分数量。</p>
     */
    public Float getCredits() {
        return this.Credits;
    }

    /**
     * Set <p>该任务消耗的积分数量。</p>
     * @param Credits <p>该任务消耗的积分数量。</p>
     */
    public void setCredits(Float Credits) {
        this.Credits = Credits;
    }

    /**
     * Get <p>任务调用时传入的透传参数。</p> 
     * @return Payload <p>任务调用时传入的透传参数。</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>任务调用时传入的透传参数。</p>
     * @param Payload <p>任务调用时传入的透传参数。</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
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

    public DescribeReferenceToVideoViduJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReferenceToVideoViduJobResponse(DescribeReferenceToVideoViduJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultVideoUrl != null) {
            this.ResultVideoUrl = new String(source.ResultVideoUrl);
        }
        if (source.Credits != null) {
            this.Credits = new Float(source.Credits);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ResultVideoUrl", this.ResultVideoUrl);
        this.setParamSimple(map, prefix + "Credits", this.Credits);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

