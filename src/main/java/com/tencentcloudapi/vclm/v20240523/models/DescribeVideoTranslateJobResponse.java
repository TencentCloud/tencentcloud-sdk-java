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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoTranslateJobResponse extends AbstractModel {

    /**
    * 任务状态。 1：音频翻译中。 2：音频翻译失败。 3：音频翻译成功。 4：音频结果待确认。 5：音频结果已确认完毕。6：视频翻译中。 7：视频翻译失败。 8：视频翻译成功。	
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

    /**
    * 任务错误码。	
    */
    @SerializedName("JobErrorCode")
    @Expose
    private String JobErrorCode;

    /**
    * 任务错误信息。	
    */
    @SerializedName("JobErrorMsg")
    @Expose
    private String JobErrorMsg;

    /**
    * 视频翻译结果。	
    */
    @SerializedName("ResultVideoUrl")
    @Expose
    private String ResultVideoUrl;

    /**
    * 音频翻译结果。	
    */
    @SerializedName("TranslateResults")
    @Expose
    private TranslateResult [] TranslateResults;

    /**
    * 是否需要确认翻译结果。0：不需要，1：需要	
    */
    @SerializedName("JobConfirm")
    @Expose
    private Long JobConfirm;

    /**
    * 音频任务 ID	
    */
    @SerializedName("JobAudioTaskId")
    @Expose
    private String JobAudioTaskId;

    /**
    * 视频审核任务ID	
    */
    @SerializedName("JobVideoModerationId")
    @Expose
    private String JobVideoModerationId;

    /**
    * 音频审核任务 ID	
    */
    @SerializedName("JobAudioModerationId")
    @Expose
    private String JobAudioModerationId;

    /**
    * 口型驱动任务 ID	
    */
    @SerializedName("JobVideoId")
    @Expose
    private String JobVideoId;

    /**
    * 视频素材原始 URL	
    */
    @SerializedName("OriginalVideoUrl")
    @Expose
    private String OriginalVideoUrl;

    /**
    * 文本片段及其时间戳	
    */
    @SerializedName("AsrTimestamps")
    @Expose
    private AsrTimestamps [] AsrTimestamps;

    /**
    * 提交视频翻译任务时的 requestId	
    */
    @SerializedName("JobSubmitReqId")
    @Expose
    private String JobSubmitReqId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态。 1：音频翻译中。 2：音频翻译失败。 3：音频翻译成功。 4：音频结果待确认。 5：音频结果已确认完毕。6：视频翻译中。 7：视频翻译失败。 8：视频翻译成功。	 
     * @return JobStatus 任务状态。 1：音频翻译中。 2：音频翻译失败。 3：音频翻译成功。 4：音频结果待确认。 5：音频结果已确认完毕。6：视频翻译中。 7：视频翻译失败。 8：视频翻译成功。	
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 任务状态。 1：音频翻译中。 2：音频翻译失败。 3：音频翻译成功。 4：音频结果待确认。 5：音频结果已确认完毕。6：视频翻译中。 7：视频翻译失败。 8：视频翻译成功。	
     * @param JobStatus 任务状态。 1：音频翻译中。 2：音频翻译失败。 3：音频翻译成功。 4：音频结果待确认。 5：音频结果已确认完毕。6：视频翻译中。 7：视频翻译失败。 8：视频翻译成功。	
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get 任务错误码。	 
     * @return JobErrorCode 任务错误码。	
     */
    public String getJobErrorCode() {
        return this.JobErrorCode;
    }

    /**
     * Set 任务错误码。	
     * @param JobErrorCode 任务错误码。	
     */
    public void setJobErrorCode(String JobErrorCode) {
        this.JobErrorCode = JobErrorCode;
    }

    /**
     * Get 任务错误信息。	 
     * @return JobErrorMsg 任务错误信息。	
     */
    public String getJobErrorMsg() {
        return this.JobErrorMsg;
    }

    /**
     * Set 任务错误信息。	
     * @param JobErrorMsg 任务错误信息。	
     */
    public void setJobErrorMsg(String JobErrorMsg) {
        this.JobErrorMsg = JobErrorMsg;
    }

    /**
     * Get 视频翻译结果。	 
     * @return ResultVideoUrl 视频翻译结果。	
     */
    public String getResultVideoUrl() {
        return this.ResultVideoUrl;
    }

    /**
     * Set 视频翻译结果。	
     * @param ResultVideoUrl 视频翻译结果。	
     */
    public void setResultVideoUrl(String ResultVideoUrl) {
        this.ResultVideoUrl = ResultVideoUrl;
    }

    /**
     * Get 音频翻译结果。	 
     * @return TranslateResults 音频翻译结果。	
     */
    public TranslateResult [] getTranslateResults() {
        return this.TranslateResults;
    }

    /**
     * Set 音频翻译结果。	
     * @param TranslateResults 音频翻译结果。	
     */
    public void setTranslateResults(TranslateResult [] TranslateResults) {
        this.TranslateResults = TranslateResults;
    }

    /**
     * Get 是否需要确认翻译结果。0：不需要，1：需要	 
     * @return JobConfirm 是否需要确认翻译结果。0：不需要，1：需要	
     */
    public Long getJobConfirm() {
        return this.JobConfirm;
    }

    /**
     * Set 是否需要确认翻译结果。0：不需要，1：需要	
     * @param JobConfirm 是否需要确认翻译结果。0：不需要，1：需要	
     */
    public void setJobConfirm(Long JobConfirm) {
        this.JobConfirm = JobConfirm;
    }

    /**
     * Get 音频任务 ID	 
     * @return JobAudioTaskId 音频任务 ID	
     */
    public String getJobAudioTaskId() {
        return this.JobAudioTaskId;
    }

    /**
     * Set 音频任务 ID	
     * @param JobAudioTaskId 音频任务 ID	
     */
    public void setJobAudioTaskId(String JobAudioTaskId) {
        this.JobAudioTaskId = JobAudioTaskId;
    }

    /**
     * Get 视频审核任务ID	 
     * @return JobVideoModerationId 视频审核任务ID	
     */
    public String getJobVideoModerationId() {
        return this.JobVideoModerationId;
    }

    /**
     * Set 视频审核任务ID	
     * @param JobVideoModerationId 视频审核任务ID	
     */
    public void setJobVideoModerationId(String JobVideoModerationId) {
        this.JobVideoModerationId = JobVideoModerationId;
    }

    /**
     * Get 音频审核任务 ID	 
     * @return JobAudioModerationId 音频审核任务 ID	
     */
    public String getJobAudioModerationId() {
        return this.JobAudioModerationId;
    }

    /**
     * Set 音频审核任务 ID	
     * @param JobAudioModerationId 音频审核任务 ID	
     */
    public void setJobAudioModerationId(String JobAudioModerationId) {
        this.JobAudioModerationId = JobAudioModerationId;
    }

    /**
     * Get 口型驱动任务 ID	 
     * @return JobVideoId 口型驱动任务 ID	
     */
    public String getJobVideoId() {
        return this.JobVideoId;
    }

    /**
     * Set 口型驱动任务 ID	
     * @param JobVideoId 口型驱动任务 ID	
     */
    public void setJobVideoId(String JobVideoId) {
        this.JobVideoId = JobVideoId;
    }

    /**
     * Get 视频素材原始 URL	 
     * @return OriginalVideoUrl 视频素材原始 URL	
     */
    public String getOriginalVideoUrl() {
        return this.OriginalVideoUrl;
    }

    /**
     * Set 视频素材原始 URL	
     * @param OriginalVideoUrl 视频素材原始 URL	
     */
    public void setOriginalVideoUrl(String OriginalVideoUrl) {
        this.OriginalVideoUrl = OriginalVideoUrl;
    }

    /**
     * Get 文本片段及其时间戳	 
     * @return AsrTimestamps 文本片段及其时间戳	
     */
    public AsrTimestamps [] getAsrTimestamps() {
        return this.AsrTimestamps;
    }

    /**
     * Set 文本片段及其时间戳	
     * @param AsrTimestamps 文本片段及其时间戳	
     */
    public void setAsrTimestamps(AsrTimestamps [] AsrTimestamps) {
        this.AsrTimestamps = AsrTimestamps;
    }

    /**
     * Get 提交视频翻译任务时的 requestId	 
     * @return JobSubmitReqId 提交视频翻译任务时的 requestId	
     */
    public String getJobSubmitReqId() {
        return this.JobSubmitReqId;
    }

    /**
     * Set 提交视频翻译任务时的 requestId	
     * @param JobSubmitReqId 提交视频翻译任务时的 requestId	
     */
    public void setJobSubmitReqId(String JobSubmitReqId) {
        this.JobSubmitReqId = JobSubmitReqId;
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

    public DescribeVideoTranslateJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoTranslateJobResponse(DescribeVideoTranslateJobResponse source) {
        if (source.JobStatus != null) {
            this.JobStatus = new Long(source.JobStatus);
        }
        if (source.JobErrorCode != null) {
            this.JobErrorCode = new String(source.JobErrorCode);
        }
        if (source.JobErrorMsg != null) {
            this.JobErrorMsg = new String(source.JobErrorMsg);
        }
        if (source.ResultVideoUrl != null) {
            this.ResultVideoUrl = new String(source.ResultVideoUrl);
        }
        if (source.TranslateResults != null) {
            this.TranslateResults = new TranslateResult[source.TranslateResults.length];
            for (int i = 0; i < source.TranslateResults.length; i++) {
                this.TranslateResults[i] = new TranslateResult(source.TranslateResults[i]);
            }
        }
        if (source.JobConfirm != null) {
            this.JobConfirm = new Long(source.JobConfirm);
        }
        if (source.JobAudioTaskId != null) {
            this.JobAudioTaskId = new String(source.JobAudioTaskId);
        }
        if (source.JobVideoModerationId != null) {
            this.JobVideoModerationId = new String(source.JobVideoModerationId);
        }
        if (source.JobAudioModerationId != null) {
            this.JobAudioModerationId = new String(source.JobAudioModerationId);
        }
        if (source.JobVideoId != null) {
            this.JobVideoId = new String(source.JobVideoId);
        }
        if (source.OriginalVideoUrl != null) {
            this.OriginalVideoUrl = new String(source.OriginalVideoUrl);
        }
        if (source.AsrTimestamps != null) {
            this.AsrTimestamps = new AsrTimestamps[source.AsrTimestamps.length];
            for (int i = 0; i < source.AsrTimestamps.length; i++) {
                this.AsrTimestamps[i] = new AsrTimestamps(source.AsrTimestamps[i]);
            }
        }
        if (source.JobSubmitReqId != null) {
            this.JobSubmitReqId = new String(source.JobSubmitReqId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "JobErrorCode", this.JobErrorCode);
        this.setParamSimple(map, prefix + "JobErrorMsg", this.JobErrorMsg);
        this.setParamSimple(map, prefix + "ResultVideoUrl", this.ResultVideoUrl);
        this.setParamArrayObj(map, prefix + "TranslateResults.", this.TranslateResults);
        this.setParamSimple(map, prefix + "JobConfirm", this.JobConfirm);
        this.setParamSimple(map, prefix + "JobAudioTaskId", this.JobAudioTaskId);
        this.setParamSimple(map, prefix + "JobVideoModerationId", this.JobVideoModerationId);
        this.setParamSimple(map, prefix + "JobAudioModerationId", this.JobAudioModerationId);
        this.setParamSimple(map, prefix + "JobVideoId", this.JobVideoId);
        this.setParamSimple(map, prefix + "OriginalVideoUrl", this.OriginalVideoUrl);
        this.setParamArrayObj(map, prefix + "AsrTimestamps.", this.AsrTimestamps);
        this.setParamSimple(map, prefix + "JobSubmitReqId", this.JobSubmitReqId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

