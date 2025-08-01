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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJustInTimeTranscodeTemplateRequest extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 即时转码模板名称，长度限制：64 个字符。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板描述信息，长度限制：256 个字符。默认为空。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 启用视频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
    */
    @SerializedName("VideoStreamSwitch")
    @Expose
    private String VideoStreamSwitch;

    /**
    * 启用音频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
    */
    @SerializedName("AudioStreamSwitch")
    @Expose
    private String AudioStreamSwitch;

    /**
    * 视频流配置参数，当 VideoStreamSwitch 为 on，该字段必填。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * 音频流配置参数，当 AudioStreamSwitch 为 on，该字段必填。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 即时转码模板名称，长度限制：64 个字符。 
     * @return TemplateName 即时转码模板名称，长度限制：64 个字符。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 即时转码模板名称，长度限制：64 个字符。
     * @param TemplateName 即时转码模板名称，长度限制：64 个字符。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。默认为空。 
     * @return Comment 模板描述信息，长度限制：256 个字符。默认为空。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。默认为空。
     * @param Comment 模板描述信息，长度限制：256 个字符。默认为空。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 启用视频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。 
     * @return VideoStreamSwitch 启用视频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
     */
    public String getVideoStreamSwitch() {
        return this.VideoStreamSwitch;
    }

    /**
     * Set 启用视频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
     * @param VideoStreamSwitch 启用视频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
     */
    public void setVideoStreamSwitch(String VideoStreamSwitch) {
        this.VideoStreamSwitch = VideoStreamSwitch;
    }

    /**
     * Get 启用音频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。 
     * @return AudioStreamSwitch 启用音频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
     */
    public String getAudioStreamSwitch() {
        return this.AudioStreamSwitch;
    }

    /**
     * Set 启用音频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
     * @param AudioStreamSwitch 启用音频流开关，取值：
<li>on：开启；</li>
<li>off：关闭。</li>默认值：on。
     */
    public void setAudioStreamSwitch(String AudioStreamSwitch) {
        this.AudioStreamSwitch = AudioStreamSwitch;
    }

    /**
     * Get 视频流配置参数，当 VideoStreamSwitch 为 on，该字段必填。 
     * @return VideoTemplate 视频流配置参数，当 VideoStreamSwitch 为 on，该字段必填。
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 视频流配置参数，当 VideoStreamSwitch 为 on，该字段必填。
     * @param VideoTemplate 视频流配置参数，当 VideoStreamSwitch 为 on，该字段必填。
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get 音频流配置参数，当 AudioStreamSwitch 为 on，该字段必填。 
     * @return AudioTemplate 音频流配置参数，当 AudioStreamSwitch 为 on，该字段必填。
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 音频流配置参数，当 AudioStreamSwitch 为 on，该字段必填。
     * @param AudioTemplate 音频流配置参数，当 AudioStreamSwitch 为 on，该字段必填。
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    public CreateJustInTimeTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJustInTimeTranscodeTemplateRequest(CreateJustInTimeTranscodeTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.VideoStreamSwitch != null) {
            this.VideoStreamSwitch = new String(source.VideoStreamSwitch);
        }
        if (source.AudioStreamSwitch != null) {
            this.AudioStreamSwitch = new String(source.AudioStreamSwitch);
        }
        if (source.VideoTemplate != null) {
            this.VideoTemplate = new VideoTemplateInfo(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfo(source.AudioTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "VideoStreamSwitch", this.VideoStreamSwitch);
        this.setParamSimple(map, prefix + "AudioStreamSwitch", this.AudioStreamSwitch);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);

    }
}

