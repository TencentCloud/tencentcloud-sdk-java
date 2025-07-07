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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoSummaryTaskRequest extends AbstractModel {

    /**
    * 目前只支持 1，表示新闻缩编。
    */
    @SerializedName("SummaryType")
    @Expose
    private Long SummaryType;

    /**
    * 待处理的视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
    */
    @SerializedName("VideoURL")
    @Expose
    private String VideoURL;

    /**
    * 任务处理完成的回调地址。
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
    * 如果需要你输出 TTS 或者视频，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。

    */
    @SerializedName("WriteBackCosPath")
    @Expose
    private String WriteBackCosPath;

    /**
    * 是否开启结果视频生成功能，如果开启，需要指定WriteBackCosPath 参数
    */
    @SerializedName("ActiveVideoGenerate")
    @Expose
    private Boolean ActiveVideoGenerate;

    /**
    * 生成结果视频的时候，控制生成的结果视频的横转竖参数。如果 ActiveVideoGenerate 为 false, 该参数无效。
    */
    @SerializedName("VideoRotationMode")
    @Expose
    private VideoRotationMode VideoRotationMode;

    /**
    * 语音合成相关的控制参数
    */
    @SerializedName("TTSMode")
    @Expose
    private TTSMode TTSMode;

    /**
    * 是否输出合成好的语音列表。
    */
    @SerializedName("ActiveTTSOutput")
    @Expose
    private Boolean ActiveTTSOutput;

    /**
    * 用户指定的精确的 asr 结果列表 
    */
    @SerializedName("ExactAsrSet")
    @Expose
    private AsrResult [] ExactAsrSet;

    /**
    * 用户指定的精确的文本摘要
    */
    @SerializedName("ExactTextSummary")
    @Expose
    private String ExactTextSummary;

    /**
    * 用户指定的精确的文本摘要分割结果
    */
    @SerializedName("ExactTextSegSet")
    @Expose
    private String [] ExactTextSegSet;

    /**
    * 用户指定的精确的镜头分割结果
    */
    @SerializedName("ExactShotSegSet")
    @Expose
    private ShotInfo [] ExactShotSegSet;

    /**
     * Get 目前只支持 1，表示新闻缩编。 
     * @return SummaryType 目前只支持 1，表示新闻缩编。
     */
    public Long getSummaryType() {
        return this.SummaryType;
    }

    /**
     * Set 目前只支持 1，表示新闻缩编。
     * @param SummaryType 目前只支持 1，表示新闻缩编。
     */
    public void setSummaryType(Long SummaryType) {
        this.SummaryType = SummaryType;
    }

    /**
     * Get 待处理的视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB 
     * @return VideoURL 待处理的视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
     */
    public String getVideoURL() {
        return this.VideoURL;
    }

    /**
     * Set 待处理的视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
     * @param VideoURL 待处理的视频的URL，目前只支持*不带签名的*COS地址，长度最长1KB
     */
    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    /**
     * Get 任务处理完成的回调地址。 
     * @return CallbackURL 任务处理完成的回调地址。
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set 任务处理完成的回调地址。
     * @param CallbackURL 任务处理完成的回调地址。
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    /**
     * Get 如果需要你输出 TTS 或者视频，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。
 
     * @return WriteBackCosPath 如果需要你输出 TTS 或者视频，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。

     */
    public String getWriteBackCosPath() {
        return this.WriteBackCosPath;
    }

    /**
     * Set 如果需要你输出 TTS 或者视频，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。

     * @param WriteBackCosPath 如果需要你输出 TTS 或者视频，该字段为转存的cos桶地址且不可为空; 示例：https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${PathPrefix}/  (注意，cos路径需要以/分隔符结尾)。

     */
    public void setWriteBackCosPath(String WriteBackCosPath) {
        this.WriteBackCosPath = WriteBackCosPath;
    }

    /**
     * Get 是否开启结果视频生成功能，如果开启，需要指定WriteBackCosPath 参数 
     * @return ActiveVideoGenerate 是否开启结果视频生成功能，如果开启，需要指定WriteBackCosPath 参数
     */
    public Boolean getActiveVideoGenerate() {
        return this.ActiveVideoGenerate;
    }

    /**
     * Set 是否开启结果视频生成功能，如果开启，需要指定WriteBackCosPath 参数
     * @param ActiveVideoGenerate 是否开启结果视频生成功能，如果开启，需要指定WriteBackCosPath 参数
     */
    public void setActiveVideoGenerate(Boolean ActiveVideoGenerate) {
        this.ActiveVideoGenerate = ActiveVideoGenerate;
    }

    /**
     * Get 生成结果视频的时候，控制生成的结果视频的横转竖参数。如果 ActiveVideoGenerate 为 false, 该参数无效。 
     * @return VideoRotationMode 生成结果视频的时候，控制生成的结果视频的横转竖参数。如果 ActiveVideoGenerate 为 false, 该参数无效。
     */
    public VideoRotationMode getVideoRotationMode() {
        return this.VideoRotationMode;
    }

    /**
     * Set 生成结果视频的时候，控制生成的结果视频的横转竖参数。如果 ActiveVideoGenerate 为 false, 该参数无效。
     * @param VideoRotationMode 生成结果视频的时候，控制生成的结果视频的横转竖参数。如果 ActiveVideoGenerate 为 false, 该参数无效。
     */
    public void setVideoRotationMode(VideoRotationMode VideoRotationMode) {
        this.VideoRotationMode = VideoRotationMode;
    }

    /**
     * Get 语音合成相关的控制参数 
     * @return TTSMode 语音合成相关的控制参数
     */
    public TTSMode getTTSMode() {
        return this.TTSMode;
    }

    /**
     * Set 语音合成相关的控制参数
     * @param TTSMode 语音合成相关的控制参数
     */
    public void setTTSMode(TTSMode TTSMode) {
        this.TTSMode = TTSMode;
    }

    /**
     * Get 是否输出合成好的语音列表。 
     * @return ActiveTTSOutput 是否输出合成好的语音列表。
     */
    public Boolean getActiveTTSOutput() {
        return this.ActiveTTSOutput;
    }

    /**
     * Set 是否输出合成好的语音列表。
     * @param ActiveTTSOutput 是否输出合成好的语音列表。
     */
    public void setActiveTTSOutput(Boolean ActiveTTSOutput) {
        this.ActiveTTSOutput = ActiveTTSOutput;
    }

    /**
     * Get 用户指定的精确的 asr 结果列表  
     * @return ExactAsrSet 用户指定的精确的 asr 结果列表 
     */
    public AsrResult [] getExactAsrSet() {
        return this.ExactAsrSet;
    }

    /**
     * Set 用户指定的精确的 asr 结果列表 
     * @param ExactAsrSet 用户指定的精确的 asr 结果列表 
     */
    public void setExactAsrSet(AsrResult [] ExactAsrSet) {
        this.ExactAsrSet = ExactAsrSet;
    }

    /**
     * Get 用户指定的精确的文本摘要 
     * @return ExactTextSummary 用户指定的精确的文本摘要
     */
    public String getExactTextSummary() {
        return this.ExactTextSummary;
    }

    /**
     * Set 用户指定的精确的文本摘要
     * @param ExactTextSummary 用户指定的精确的文本摘要
     */
    public void setExactTextSummary(String ExactTextSummary) {
        this.ExactTextSummary = ExactTextSummary;
    }

    /**
     * Get 用户指定的精确的文本摘要分割结果 
     * @return ExactTextSegSet 用户指定的精确的文本摘要分割结果
     */
    public String [] getExactTextSegSet() {
        return this.ExactTextSegSet;
    }

    /**
     * Set 用户指定的精确的文本摘要分割结果
     * @param ExactTextSegSet 用户指定的精确的文本摘要分割结果
     */
    public void setExactTextSegSet(String [] ExactTextSegSet) {
        this.ExactTextSegSet = ExactTextSegSet;
    }

    /**
     * Get 用户指定的精确的镜头分割结果 
     * @return ExactShotSegSet 用户指定的精确的镜头分割结果
     */
    public ShotInfo [] getExactShotSegSet() {
        return this.ExactShotSegSet;
    }

    /**
     * Set 用户指定的精确的镜头分割结果
     * @param ExactShotSegSet 用户指定的精确的镜头分割结果
     */
    public void setExactShotSegSet(ShotInfo [] ExactShotSegSet) {
        this.ExactShotSegSet = ExactShotSegSet;
    }

    public CreateVideoSummaryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoSummaryTaskRequest(CreateVideoSummaryTaskRequest source) {
        if (source.SummaryType != null) {
            this.SummaryType = new Long(source.SummaryType);
        }
        if (source.VideoURL != null) {
            this.VideoURL = new String(source.VideoURL);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
        if (source.WriteBackCosPath != null) {
            this.WriteBackCosPath = new String(source.WriteBackCosPath);
        }
        if (source.ActiveVideoGenerate != null) {
            this.ActiveVideoGenerate = new Boolean(source.ActiveVideoGenerate);
        }
        if (source.VideoRotationMode != null) {
            this.VideoRotationMode = new VideoRotationMode(source.VideoRotationMode);
        }
        if (source.TTSMode != null) {
            this.TTSMode = new TTSMode(source.TTSMode);
        }
        if (source.ActiveTTSOutput != null) {
            this.ActiveTTSOutput = new Boolean(source.ActiveTTSOutput);
        }
        if (source.ExactAsrSet != null) {
            this.ExactAsrSet = new AsrResult[source.ExactAsrSet.length];
            for (int i = 0; i < source.ExactAsrSet.length; i++) {
                this.ExactAsrSet[i] = new AsrResult(source.ExactAsrSet[i]);
            }
        }
        if (source.ExactTextSummary != null) {
            this.ExactTextSummary = new String(source.ExactTextSummary);
        }
        if (source.ExactTextSegSet != null) {
            this.ExactTextSegSet = new String[source.ExactTextSegSet.length];
            for (int i = 0; i < source.ExactTextSegSet.length; i++) {
                this.ExactTextSegSet[i] = new String(source.ExactTextSegSet[i]);
            }
        }
        if (source.ExactShotSegSet != null) {
            this.ExactShotSegSet = new ShotInfo[source.ExactShotSegSet.length];
            for (int i = 0; i < source.ExactShotSegSet.length; i++) {
                this.ExactShotSegSet[i] = new ShotInfo(source.ExactShotSegSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SummaryType", this.SummaryType);
        this.setParamSimple(map, prefix + "VideoURL", this.VideoURL);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);
        this.setParamSimple(map, prefix + "WriteBackCosPath", this.WriteBackCosPath);
        this.setParamSimple(map, prefix + "ActiveVideoGenerate", this.ActiveVideoGenerate);
        this.setParamObj(map, prefix + "VideoRotationMode.", this.VideoRotationMode);
        this.setParamObj(map, prefix + "TTSMode.", this.TTSMode);
        this.setParamSimple(map, prefix + "ActiveTTSOutput", this.ActiveTTSOutput);
        this.setParamArrayObj(map, prefix + "ExactAsrSet.", this.ExactAsrSet);
        this.setParamSimple(map, prefix + "ExactTextSummary", this.ExactTextSummary);
        this.setParamArraySimple(map, prefix + "ExactTextSegSet.", this.ExactTextSegSet);
        this.setParamArrayObj(map, prefix + "ExactShotSegSet.", this.ExactShotSegSet);

    }
}

