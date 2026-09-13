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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAudioModerationSyncResponse extends AbstractModel {

    /**
    * <p>返回传入的DataId</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>审核返回的任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>1：语音。 2：图片。</p>
    */
    @SerializedName("MediaType")
    @Expose
    private Long MediaType;

    /**
    * <p>0：建议通过。 1 ：建议人工重新内容识别。 2：建议屏蔽。</p>
    */
    @SerializedName("Suggest")
    @Expose
    private Long Suggest;

    /**
    * <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * <p>Normal：正常文本  Ad:广告 Porn：色情 Abuse：谩骂 Illegal: 违禁 Polity: 涉政 Terror: 暴恐 Sexy: 性感 Moan: 呻吟/娇喘 QRCode: 二维码 Custom: 自定义</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>子标签</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>音频链接地址</p>
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * <p>审核识别音频文本</p>
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * <p>音频时长，单位 ms</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>审核明细</p>
    */
    @SerializedName("CheckDetail")
    @Expose
    private ModerationCheckDetail [] CheckDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>返回传入的DataId</p> 
     * @return DataId <p>返回传入的DataId</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>返回传入的DataId</p>
     * @param DataId <p>返回传入的DataId</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>审核返回的任务id</p> 
     * @return TaskId <p>审核返回的任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>审核返回的任务id</p>
     * @param TaskId <p>审核返回的任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>文件名</p> 
     * @return FileName <p>文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名</p>
     * @param FileName <p>文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>1：语音。 2：图片。</p> 
     * @return MediaType <p>1：语音。 2：图片。</p>
     */
    public Long getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>1：语音。 2：图片。</p>
     * @param MediaType <p>1：语音。 2：图片。</p>
     */
    public void setMediaType(Long MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get <p>0：建议通过。 1 ：建议人工重新内容识别。 2：建议屏蔽。</p> 
     * @return Suggest <p>0：建议通过。 1 ：建议人工重新内容识别。 2：建议屏蔽。</p>
     */
    public Long getSuggest() {
        return this.Suggest;
    }

    /**
     * Set <p>0：建议通过。 1 ：建议人工重新内容识别。 2：建议屏蔽。</p>
     * @param Suggest <p>0：建议通过。 1 ：建议人工重新内容识别。 2：建议屏蔽。</p>
     */
    public void setSuggest(Long Suggest) {
        this.Suggest = Suggest;
    }

    /**
     * Get <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p> 
     * @return Rate <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
     * @param Rate <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get <p>Normal：正常文本  Ad:广告 Porn：色情 Abuse：谩骂 Illegal: 违禁 Polity: 涉政 Terror: 暴恐 Sexy: 性感 Moan: 呻吟/娇喘 QRCode: 二维码 Custom: 自定义</p> 
     * @return Label <p>Normal：正常文本  Ad:广告 Porn：色情 Abuse：谩骂 Illegal: 违禁 Polity: 涉政 Terror: 暴恐 Sexy: 性感 Moan: 呻吟/娇喘 QRCode: 二维码 Custom: 自定义</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Normal：正常文本  Ad:广告 Porn：色情 Abuse：谩骂 Illegal: 违禁 Polity: 涉政 Terror: 暴恐 Sexy: 性感 Moan: 呻吟/娇喘 QRCode: 二维码 Custom: 自定义</p>
     * @param Label <p>Normal：正常文本  Ad:广告 Porn：色情 Abuse：谩骂 Illegal: 违禁 Polity: 涉政 Terror: 暴恐 Sexy: 性感 Moan: 呻吟/娇喘 QRCode: 二维码 Custom: 自定义</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>子标签</p> 
     * @return SubLabel <p>子标签</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>子标签</p>
     * @param SubLabel <p>子标签</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>音频链接地址</p> 
     * @return Audio <p>音频链接地址</p>
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set <p>音频链接地址</p>
     * @param Audio <p>音频链接地址</p>
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get <p>审核识别音频文本</p> 
     * @return AudioText <p>审核识别音频文本</p>
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set <p>审核识别音频文本</p>
     * @param AudioText <p>审核识别音频文本</p>
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get <p>音频时长，单位 ms</p> 
     * @return Duration <p>音频时长，单位 ms</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>音频时长，单位 ms</p>
     * @param Duration <p>音频时长，单位 ms</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>审核明细</p> 
     * @return CheckDetail <p>审核明细</p>
     */
    public ModerationCheckDetail [] getCheckDetail() {
        return this.CheckDetail;
    }

    /**
     * Set <p>审核明细</p>
     * @param CheckDetail <p>审核明细</p>
     */
    public void setCheckDetail(ModerationCheckDetail [] CheckDetail) {
        this.CheckDetail = CheckDetail;
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

    public CreateAudioModerationSyncResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAudioModerationSyncResponse(CreateAudioModerationSyncResponse source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.MediaType != null) {
            this.MediaType = new Long(source.MediaType);
        }
        if (source.Suggest != null) {
            this.Suggest = new Long(source.Suggest);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.AudioText != null) {
            this.AudioText = new String(source.AudioText);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CheckDetail != null) {
            this.CheckDetail = new ModerationCheckDetail[source.CheckDetail.length];
            for (int i = 0; i < source.CheckDetail.length; i++) {
                this.CheckDetail[i] = new ModerationCheckDetail(source.CheckDetail[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "Suggest", this.Suggest);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "AudioText", this.AudioText);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "CheckDetail.", this.CheckDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

