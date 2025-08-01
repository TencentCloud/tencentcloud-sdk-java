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

public class JustInTimeTranscodeTemplate extends AbstractModel {

    /**
    * 即时转码模板唯一标识。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 转码模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 模板类型，取值：<li>preset：系统预置模板；</li><li>custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 启用视频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("VideoStreamSwitch")
    @Expose
    private String VideoStreamSwitch;

    /**
    * 启用音频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("AudioStreamSwitch")
    @Expose
    private String AudioStreamSwitch;

    /**
    * 视频流配置参数，仅当 VideoStreamSwitch 为 on，该字段有效。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * 音频流配置参数，仅当 AudioStreamSwitch 为 on，该字段有效。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 即时转码模板唯一标识。 
     * @return TemplateId 即时转码模板唯一标识。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 即时转码模板唯一标识。
     * @param TemplateId 即时转码模板唯一标识。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 转码模板名称。 
     * @return TemplateName 转码模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 转码模板名称。
     * @param TemplateName 转码模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板描述信息。 
     * @return Comment 模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息。
     * @param Comment 模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 模板类型，取值：<li>preset：系统预置模板；</li><li>custom：用户自定义模板。</li> 
     * @return Type 模板类型，取值：<li>preset：系统预置模板；</li><li>custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值：<li>preset：系统预置模板；</li><li>custom：用户自定义模板。</li>
     * @param Type 模板类型，取值：<li>preset：系统预置模板；</li><li>custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 启用视频流开关，取值：<li>on：开启；</li><li>off：关闭。</li> 
     * @return VideoStreamSwitch 启用视频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getVideoStreamSwitch() {
        return this.VideoStreamSwitch;
    }

    /**
     * Set 启用视频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
     * @param VideoStreamSwitch 启用视频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setVideoStreamSwitch(String VideoStreamSwitch) {
        this.VideoStreamSwitch = VideoStreamSwitch;
    }

    /**
     * Get 启用音频流开关，取值：<li>on：开启；</li><li>off：关闭。</li> 
     * @return AudioStreamSwitch 启用音频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getAudioStreamSwitch() {
        return this.AudioStreamSwitch;
    }

    /**
     * Set 启用音频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
     * @param AudioStreamSwitch 启用音频流开关，取值：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setAudioStreamSwitch(String AudioStreamSwitch) {
        this.AudioStreamSwitch = AudioStreamSwitch;
    }

    /**
     * Get 视频流配置参数，仅当 VideoStreamSwitch 为 on，该字段有效。 
     * @return VideoTemplate 视频流配置参数，仅当 VideoStreamSwitch 为 on，该字段有效。
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 视频流配置参数，仅当 VideoStreamSwitch 为 on，该字段有效。
     * @param VideoTemplate 视频流配置参数，仅当 VideoStreamSwitch 为 on，该字段有效。
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get 音频流配置参数，仅当 AudioStreamSwitch 为 on，该字段有效。 
     * @return AudioTemplate 音频流配置参数，仅当 AudioStreamSwitch 为 on，该字段有效。
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 音频流配置参数，仅当 AudioStreamSwitch 为 on，该字段有效。
     * @param AudioTemplate 音频流配置参数，仅当 AudioStreamSwitch 为 on，该字段有效。
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public JustInTimeTranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JustInTimeTranscodeTemplate(JustInTimeTranscodeTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VideoStreamSwitch", this.VideoStreamSwitch);
        this.setParamSimple(map, prefix + "AudioStreamSwitch", this.AudioStreamSwitch);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

