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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveSmartEraseTemplateRequest extends AbstractModel {

    /**
    * <p>模板名称。长度上限：100字节。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>擦除类型，如&quot;illegal audio|illegal image|logo|privacy protection 。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>描述信息。<br>长度上限：1024字节。<br>仅支持中文、英文、数字、_、-。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>关联的审核模板id, 表audio_conf 。</p>
    */
    @SerializedName("AuditConfId")
    @Expose
    private Long AuditConfId;

    /**
    * <p>天御图片审核策略BizType  Image 。</p>
    */
    @SerializedName("ImageBizType")
    @Expose
    private String ImageBizType;

    /**
    * <p>天御音频审核策略BizType  ShortAudio 。</p>
    */
    @SerializedName("AudioBizType")
    @Expose
    private String AudioBizType;

    /**
    * <p>天御音频文本审核策略BizType  ShortAudio 。</p>
    */
    @SerializedName("AudioTextBizType")
    @Expose
    private String AudioTextBizType;

    /**
    * <p>展示模式，取值 1:延时稳态展示; 3.实时动态展示。默认1 。</p>
    */
    @SerializedName("DisplayMode")
    @Expose
    private Long DisplayMode;

    /**
    * <p>字幕延迟展示时间,单位毫秒。默认10000。</p>
    */
    @SerializedName("DisplayDelayTime")
    @Expose
    private Long DisplayDelayTime;

    /**
    * <p>隐私保护可选的类型名，包括人脸模糊、车牌模糊</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li><li>blur face|blur license plate： 复选</li></ul>
    */
    @SerializedName("PrivacyProtection")
    @Expose
    private String PrivacyProtection;

    /**
    * <p>音频处理可选项：静音擦除、哔音擦除，默认选择静音擦除</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul><p>默认值：0</p>
    */
    @SerializedName("AudioErasureMode")
    @Expose
    private Long AudioErasureMode;

    /**
     * Get <p>模板名称。长度上限：100字节。</p> 
     * @return TemplateName <p>模板名称。长度上限：100字节。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。长度上限：100字节。</p>
     * @param TemplateName <p>模板名称。长度上限：100字节。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>擦除类型，如&quot;illegal audio|illegal image|logo|privacy protection 。</p> 
     * @return Type <p>擦除类型，如&quot;illegal audio|illegal image|logo|privacy protection 。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>擦除类型，如&quot;illegal audio|illegal image|logo|privacy protection 。</p>
     * @param Type <p>擦除类型，如&quot;illegal audio|illegal image|logo|privacy protection 。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>描述信息。<br>长度上限：1024字节。<br>仅支持中文、英文、数字、_、-。</p> 
     * @return Description <p>描述信息。<br>长度上限：1024字节。<br>仅支持中文、英文、数字、_、-。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。<br>长度上限：1024字节。<br>仅支持中文、英文、数字、_、-。</p>
     * @param Description <p>描述信息。<br>长度上限：1024字节。<br>仅支持中文、英文、数字、_、-。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>关联的审核模板id, 表audio_conf 。</p> 
     * @return AuditConfId <p>关联的审核模板id, 表audio_conf 。</p>
     */
    public Long getAuditConfId() {
        return this.AuditConfId;
    }

    /**
     * Set <p>关联的审核模板id, 表audio_conf 。</p>
     * @param AuditConfId <p>关联的审核模板id, 表audio_conf 。</p>
     */
    public void setAuditConfId(Long AuditConfId) {
        this.AuditConfId = AuditConfId;
    }

    /**
     * Get <p>天御图片审核策略BizType  Image 。</p> 
     * @return ImageBizType <p>天御图片审核策略BizType  Image 。</p>
     */
    public String getImageBizType() {
        return this.ImageBizType;
    }

    /**
     * Set <p>天御图片审核策略BizType  Image 。</p>
     * @param ImageBizType <p>天御图片审核策略BizType  Image 。</p>
     */
    public void setImageBizType(String ImageBizType) {
        this.ImageBizType = ImageBizType;
    }

    /**
     * Get <p>天御音频审核策略BizType  ShortAudio 。</p> 
     * @return AudioBizType <p>天御音频审核策略BizType  ShortAudio 。</p>
     */
    public String getAudioBizType() {
        return this.AudioBizType;
    }

    /**
     * Set <p>天御音频审核策略BizType  ShortAudio 。</p>
     * @param AudioBizType <p>天御音频审核策略BizType  ShortAudio 。</p>
     */
    public void setAudioBizType(String AudioBizType) {
        this.AudioBizType = AudioBizType;
    }

    /**
     * Get <p>天御音频文本审核策略BizType  ShortAudio 。</p> 
     * @return AudioTextBizType <p>天御音频文本审核策略BizType  ShortAudio 。</p>
     */
    public String getAudioTextBizType() {
        return this.AudioTextBizType;
    }

    /**
     * Set <p>天御音频文本审核策略BizType  ShortAudio 。</p>
     * @param AudioTextBizType <p>天御音频文本审核策略BizType  ShortAudio 。</p>
     */
    public void setAudioTextBizType(String AudioTextBizType) {
        this.AudioTextBizType = AudioTextBizType;
    }

    /**
     * Get <p>展示模式，取值 1:延时稳态展示; 3.实时动态展示。默认1 。</p> 
     * @return DisplayMode <p>展示模式，取值 1:延时稳态展示; 3.实时动态展示。默认1 。</p>
     */
    public Long getDisplayMode() {
        return this.DisplayMode;
    }

    /**
     * Set <p>展示模式，取值 1:延时稳态展示; 3.实时动态展示。默认1 。</p>
     * @param DisplayMode <p>展示模式，取值 1:延时稳态展示; 3.实时动态展示。默认1 。</p>
     */
    public void setDisplayMode(Long DisplayMode) {
        this.DisplayMode = DisplayMode;
    }

    /**
     * Get <p>字幕延迟展示时间,单位毫秒。默认10000。</p> 
     * @return DisplayDelayTime <p>字幕延迟展示时间,单位毫秒。默认10000。</p>
     */
    public Long getDisplayDelayTime() {
        return this.DisplayDelayTime;
    }

    /**
     * Set <p>字幕延迟展示时间,单位毫秒。默认10000。</p>
     * @param DisplayDelayTime <p>字幕延迟展示时间,单位毫秒。默认10000。</p>
     */
    public void setDisplayDelayTime(Long DisplayDelayTime) {
        this.DisplayDelayTime = DisplayDelayTime;
    }

    /**
     * Get <p>隐私保护可选的类型名，包括人脸模糊、车牌模糊</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li><li>blur face|blur license plate： 复选</li></ul> 
     * @return PrivacyProtection <p>隐私保护可选的类型名，包括人脸模糊、车牌模糊</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li><li>blur face|blur license plate： 复选</li></ul>
     */
    public String getPrivacyProtection() {
        return this.PrivacyProtection;
    }

    /**
     * Set <p>隐私保护可选的类型名，包括人脸模糊、车牌模糊</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li><li>blur face|blur license plate： 复选</li></ul>
     * @param PrivacyProtection <p>隐私保护可选的类型名，包括人脸模糊、车牌模糊</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li><li>blur face|blur license plate： 复选</li></ul>
     */
    public void setPrivacyProtection(String PrivacyProtection) {
        this.PrivacyProtection = PrivacyProtection;
    }

    /**
     * Get <p>音频处理可选项：静音擦除、哔音擦除，默认选择静音擦除</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul><p>默认值：0</p> 
     * @return AudioErasureMode <p>音频处理可选项：静音擦除、哔音擦除，默认选择静音擦除</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul><p>默认值：0</p>
     */
    public Long getAudioErasureMode() {
        return this.AudioErasureMode;
    }

    /**
     * Set <p>音频处理可选项：静音擦除、哔音擦除，默认选择静音擦除</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul><p>默认值：0</p>
     * @param AudioErasureMode <p>音频处理可选项：静音擦除、哔音擦除，默认选择静音擦除</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul><p>默认值：0</p>
     */
    public void setAudioErasureMode(Long AudioErasureMode) {
        this.AudioErasureMode = AudioErasureMode;
    }

    public CreateLiveSmartEraseTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveSmartEraseTemplateRequest(CreateLiveSmartEraseTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AuditConfId != null) {
            this.AuditConfId = new Long(source.AuditConfId);
        }
        if (source.ImageBizType != null) {
            this.ImageBizType = new String(source.ImageBizType);
        }
        if (source.AudioBizType != null) {
            this.AudioBizType = new String(source.AudioBizType);
        }
        if (source.AudioTextBizType != null) {
            this.AudioTextBizType = new String(source.AudioTextBizType);
        }
        if (source.DisplayMode != null) {
            this.DisplayMode = new Long(source.DisplayMode);
        }
        if (source.DisplayDelayTime != null) {
            this.DisplayDelayTime = new Long(source.DisplayDelayTime);
        }
        if (source.PrivacyProtection != null) {
            this.PrivacyProtection = new String(source.PrivacyProtection);
        }
        if (source.AudioErasureMode != null) {
            this.AudioErasureMode = new Long(source.AudioErasureMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AuditConfId", this.AuditConfId);
        this.setParamSimple(map, prefix + "ImageBizType", this.ImageBizType);
        this.setParamSimple(map, prefix + "AudioBizType", this.AudioBizType);
        this.setParamSimple(map, prefix + "AudioTextBizType", this.AudioTextBizType);
        this.setParamSimple(map, prefix + "DisplayMode", this.DisplayMode);
        this.setParamSimple(map, prefix + "DisplayDelayTime", this.DisplayDelayTime);
        this.setParamSimple(map, prefix + "PrivacyProtection", this.PrivacyProtection);
        this.setParamSimple(map, prefix + "AudioErasureMode", this.AudioErasureMode);

    }
}

