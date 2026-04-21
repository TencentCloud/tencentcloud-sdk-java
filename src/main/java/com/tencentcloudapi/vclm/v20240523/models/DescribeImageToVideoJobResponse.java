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

public class DescribeImageToVideoJobResponse extends AbstractModel {

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
    * <p>视频id</p>
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
    * <p>视频总时长，单位s</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>任务最终扣减积分数值</p>
    */
    @SerializedName("FinalUnitDeduction")
    @Expose
    private String FinalUnitDeduction;

    /**
    * 
    */
    @SerializedName("ExternalTaskId")
    @Expose
    private String ExternalTaskId;

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
     * Get <p>视频id</p> 
     * @return VideoId <p>视频id</p>
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set <p>视频id</p>
     * @param VideoId <p>视频id</p>
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    /**
     * Get <p>视频总时长，单位s</p> 
     * @return Duration <p>视频总时长，单位s</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频总时长，单位s</p>
     * @param Duration <p>视频总时长，单位s</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>任务最终扣减积分数值</p> 
     * @return FinalUnitDeduction <p>任务最终扣减积分数值</p>
     */
    public String getFinalUnitDeduction() {
        return this.FinalUnitDeduction;
    }

    /**
     * Set <p>任务最终扣减积分数值</p>
     * @param FinalUnitDeduction <p>任务最终扣减积分数值</p>
     */
    public void setFinalUnitDeduction(String FinalUnitDeduction) {
        this.FinalUnitDeduction = FinalUnitDeduction;
    }

    /**
     * Get  
     * @return ExternalTaskId 
     */
    public String getExternalTaskId() {
        return this.ExternalTaskId;
    }

    /**
     * Set 
     * @param ExternalTaskId 
     */
    public void setExternalTaskId(String ExternalTaskId) {
        this.ExternalTaskId = ExternalTaskId;
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

    public DescribeImageToVideoJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageToVideoJobResponse(DescribeImageToVideoJobResponse source) {
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
        if (source.VideoId != null) {
            this.VideoId = new String(source.VideoId);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.FinalUnitDeduction != null) {
            this.FinalUnitDeduction = new String(source.FinalUnitDeduction);
        }
        if (source.ExternalTaskId != null) {
            this.ExternalTaskId = new String(source.ExternalTaskId);
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
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FinalUnitDeduction", this.FinalUnitDeduction);
        this.setParamSimple(map, prefix + "ExternalTaskId", this.ExternalTaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

