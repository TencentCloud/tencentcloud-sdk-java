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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoSummaryDetailResponse extends AbstractModel {

    /**
    * 任务的状态
1: 等待处理中
2: 处理中
3: 处理成功
4: 处理失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 如果处理失败，返回失败的原因
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 提取出的视频的 Asr 结果
    */
    @SerializedName("AsrSet")
    @Expose
    private AsrResult [] AsrSet;

    /**
    * 文本摘要结果
    */
    @SerializedName("TextSummary")
    @Expose
    private String TextSummary;

    /**
    * 文本摘要分割结果
    */
    @SerializedName("TextSegSet")
    @Expose
    private String [] TextSegSet;

    /**
    * 镜头分割结果
    */
    @SerializedName("ShotSegSet")
    @Expose
    private ShotInfo [] ShotSegSet;

    /**
    * 数组第 i 个结构 TextSegMatchShotConfidenceSet[i] 表示第 i 个文本摘要分割结果和所有镜头的匹配度。
    */
    @SerializedName("TextSegMatchShotScoreSet")
    @Expose
    private TextSegMatchShotScore [] TextSegMatchShotScoreSet;

    /**
    * TTS 输出音频下载地址列表
    */
    @SerializedName("TTSResultURLSet")
    @Expose
    private String [] TTSResultURLSet;

    /**
    * 合成视频输出下载地址
    */
    @SerializedName("VideoResultURL")
    @Expose
    private String VideoResultURL;

    /**
    * 合成后的视频横竖屏转换后的视频下载地址
    */
    @SerializedName("VideoRotateResultURL")
    @Expose
    private String VideoRotateResultURL;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务的状态
1: 等待处理中
2: 处理中
3: 处理成功
4: 处理失败 
     * @return Status 任务的状态
1: 等待处理中
2: 处理中
3: 处理成功
4: 处理失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的状态
1: 等待处理中
2: 处理中
3: 处理成功
4: 处理失败
     * @param Status 任务的状态
1: 等待处理中
2: 处理中
3: 处理成功
4: 处理失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 如果处理失败，返回失败的原因 
     * @return FailedReason 如果处理失败，返回失败的原因
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 如果处理失败，返回失败的原因
     * @param FailedReason 如果处理失败，返回失败的原因
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 提取出的视频的 Asr 结果 
     * @return AsrSet 提取出的视频的 Asr 结果
     */
    public AsrResult [] getAsrSet() {
        return this.AsrSet;
    }

    /**
     * Set 提取出的视频的 Asr 结果
     * @param AsrSet 提取出的视频的 Asr 结果
     */
    public void setAsrSet(AsrResult [] AsrSet) {
        this.AsrSet = AsrSet;
    }

    /**
     * Get 文本摘要结果 
     * @return TextSummary 文本摘要结果
     */
    public String getTextSummary() {
        return this.TextSummary;
    }

    /**
     * Set 文本摘要结果
     * @param TextSummary 文本摘要结果
     */
    public void setTextSummary(String TextSummary) {
        this.TextSummary = TextSummary;
    }

    /**
     * Get 文本摘要分割结果 
     * @return TextSegSet 文本摘要分割结果
     */
    public String [] getTextSegSet() {
        return this.TextSegSet;
    }

    /**
     * Set 文本摘要分割结果
     * @param TextSegSet 文本摘要分割结果
     */
    public void setTextSegSet(String [] TextSegSet) {
        this.TextSegSet = TextSegSet;
    }

    /**
     * Get 镜头分割结果 
     * @return ShotSegSet 镜头分割结果
     */
    public ShotInfo [] getShotSegSet() {
        return this.ShotSegSet;
    }

    /**
     * Set 镜头分割结果
     * @param ShotSegSet 镜头分割结果
     */
    public void setShotSegSet(ShotInfo [] ShotSegSet) {
        this.ShotSegSet = ShotSegSet;
    }

    /**
     * Get 数组第 i 个结构 TextSegMatchShotConfidenceSet[i] 表示第 i 个文本摘要分割结果和所有镜头的匹配度。 
     * @return TextSegMatchShotScoreSet 数组第 i 个结构 TextSegMatchShotConfidenceSet[i] 表示第 i 个文本摘要分割结果和所有镜头的匹配度。
     */
    public TextSegMatchShotScore [] getTextSegMatchShotScoreSet() {
        return this.TextSegMatchShotScoreSet;
    }

    /**
     * Set 数组第 i 个结构 TextSegMatchShotConfidenceSet[i] 表示第 i 个文本摘要分割结果和所有镜头的匹配度。
     * @param TextSegMatchShotScoreSet 数组第 i 个结构 TextSegMatchShotConfidenceSet[i] 表示第 i 个文本摘要分割结果和所有镜头的匹配度。
     */
    public void setTextSegMatchShotScoreSet(TextSegMatchShotScore [] TextSegMatchShotScoreSet) {
        this.TextSegMatchShotScoreSet = TextSegMatchShotScoreSet;
    }

    /**
     * Get TTS 输出音频下载地址列表 
     * @return TTSResultURLSet TTS 输出音频下载地址列表
     */
    public String [] getTTSResultURLSet() {
        return this.TTSResultURLSet;
    }

    /**
     * Set TTS 输出音频下载地址列表
     * @param TTSResultURLSet TTS 输出音频下载地址列表
     */
    public void setTTSResultURLSet(String [] TTSResultURLSet) {
        this.TTSResultURLSet = TTSResultURLSet;
    }

    /**
     * Get 合成视频输出下载地址 
     * @return VideoResultURL 合成视频输出下载地址
     */
    public String getVideoResultURL() {
        return this.VideoResultURL;
    }

    /**
     * Set 合成视频输出下载地址
     * @param VideoResultURL 合成视频输出下载地址
     */
    public void setVideoResultURL(String VideoResultURL) {
        this.VideoResultURL = VideoResultURL;
    }

    /**
     * Get 合成后的视频横竖屏转换后的视频下载地址 
     * @return VideoRotateResultURL 合成后的视频横竖屏转换后的视频下载地址
     */
    public String getVideoRotateResultURL() {
        return this.VideoRotateResultURL;
    }

    /**
     * Set 合成后的视频横竖屏转换后的视频下载地址
     * @param VideoRotateResultURL 合成后的视频横竖屏转换后的视频下载地址
     */
    public void setVideoRotateResultURL(String VideoRotateResultURL) {
        this.VideoRotateResultURL = VideoRotateResultURL;
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

    public DescribeVideoSummaryDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoSummaryDetailResponse(DescribeVideoSummaryDetailResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.AsrSet != null) {
            this.AsrSet = new AsrResult[source.AsrSet.length];
            for (int i = 0; i < source.AsrSet.length; i++) {
                this.AsrSet[i] = new AsrResult(source.AsrSet[i]);
            }
        }
        if (source.TextSummary != null) {
            this.TextSummary = new String(source.TextSummary);
        }
        if (source.TextSegSet != null) {
            this.TextSegSet = new String[source.TextSegSet.length];
            for (int i = 0; i < source.TextSegSet.length; i++) {
                this.TextSegSet[i] = new String(source.TextSegSet[i]);
            }
        }
        if (source.ShotSegSet != null) {
            this.ShotSegSet = new ShotInfo[source.ShotSegSet.length];
            for (int i = 0; i < source.ShotSegSet.length; i++) {
                this.ShotSegSet[i] = new ShotInfo(source.ShotSegSet[i]);
            }
        }
        if (source.TextSegMatchShotScoreSet != null) {
            this.TextSegMatchShotScoreSet = new TextSegMatchShotScore[source.TextSegMatchShotScoreSet.length];
            for (int i = 0; i < source.TextSegMatchShotScoreSet.length; i++) {
                this.TextSegMatchShotScoreSet[i] = new TextSegMatchShotScore(source.TextSegMatchShotScoreSet[i]);
            }
        }
        if (source.TTSResultURLSet != null) {
            this.TTSResultURLSet = new String[source.TTSResultURLSet.length];
            for (int i = 0; i < source.TTSResultURLSet.length; i++) {
                this.TTSResultURLSet[i] = new String(source.TTSResultURLSet[i]);
            }
        }
        if (source.VideoResultURL != null) {
            this.VideoResultURL = new String(source.VideoResultURL);
        }
        if (source.VideoRotateResultURL != null) {
            this.VideoRotateResultURL = new String(source.VideoRotateResultURL);
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
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamArrayObj(map, prefix + "AsrSet.", this.AsrSet);
        this.setParamSimple(map, prefix + "TextSummary", this.TextSummary);
        this.setParamArraySimple(map, prefix + "TextSegSet.", this.TextSegSet);
        this.setParamArrayObj(map, prefix + "ShotSegSet.", this.ShotSegSet);
        this.setParamArrayObj(map, prefix + "TextSegMatchShotScoreSet.", this.TextSegMatchShotScoreSet);
        this.setParamArraySimple(map, prefix + "TTSResultURLSet.", this.TTSResultURLSet);
        this.setParamSimple(map, prefix + "VideoResultURL", this.VideoResultURL);
        this.setParamSimple(map, prefix + "VideoRotateResultURL", this.VideoRotateResultURL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

