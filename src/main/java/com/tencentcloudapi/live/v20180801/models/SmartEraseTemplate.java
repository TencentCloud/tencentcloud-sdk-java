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

public class SmartEraseTemplate extends AbstractModel {

    /**
    * <p>模板id。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>模板名称。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>模板描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>擦除类型，如&quot;illegal audio|illegal image|logo|privacy protection 。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>关联的审核模板id, 表audio_conf 。</p><p>取值为DescribeAuditTemplates接口返回的AuditTemplates里面的TemplateId字段</p>
    */
    @SerializedName("AuditConfId")
    @Expose
    private Long AuditConfId;

    /**
    * <p>天御图片审核策略BizType  Image 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Image&quot;的BizType值</p>
    */
    @SerializedName("ImageBizType")
    @Expose
    private String ImageBizType;

    /**
    * <p>天御音频审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;ShortAudio&quot;的BizType值</p>
    */
    @SerializedName("AudioBizType")
    @Expose
    private String AudioBizType;

    /**
    * <p>天御音频文本审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Text&quot;的BizType值</p>
    */
    @SerializedName("AudioTextBizType")
    @Expose
    private String AudioTextBizType;

    /**
    * <p>模板创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模板修改时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
    * <p>仅当擦除类型选择了违规音频，该项可见</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li></ul>
    */
    @SerializedName("PrivacyProtection")
    @Expose
    private String PrivacyProtection;

    /**
    * <p>仅当擦除类型选择了“隐私保护”后，该项可见</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul>
    */
    @SerializedName("AudioErasureMode")
    @Expose
    private Long AudioErasureMode;

    /**
     * Get <p>模板id。</p> 
     * @return TemplateId <p>模板id。</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板id。</p>
     * @param TemplateId <p>模板id。</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名称。</p> 
     * @return TemplateName <p>模板名称。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。</p>
     * @param TemplateName <p>模板名称。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>模板描述。</p> 
     * @return Description <p>模板描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模板描述。</p>
     * @param Description <p>模板描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>关联的审核模板id, 表audio_conf 。</p><p>取值为DescribeAuditTemplates接口返回的AuditTemplates里面的TemplateId字段</p> 
     * @return AuditConfId <p>关联的审核模板id, 表audio_conf 。</p><p>取值为DescribeAuditTemplates接口返回的AuditTemplates里面的TemplateId字段</p>
     */
    public Long getAuditConfId() {
        return this.AuditConfId;
    }

    /**
     * Set <p>关联的审核模板id, 表audio_conf 。</p><p>取值为DescribeAuditTemplates接口返回的AuditTemplates里面的TemplateId字段</p>
     * @param AuditConfId <p>关联的审核模板id, 表audio_conf 。</p><p>取值为DescribeAuditTemplates接口返回的AuditTemplates里面的TemplateId字段</p>
     */
    public void setAuditConfId(Long AuditConfId) {
        this.AuditConfId = AuditConfId;
    }

    /**
     * Get <p>天御图片审核策略BizType  Image 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Image&quot;的BizType值</p> 
     * @return ImageBizType <p>天御图片审核策略BizType  Image 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Image&quot;的BizType值</p>
     */
    public String getImageBizType() {
        return this.ImageBizType;
    }

    /**
     * Set <p>天御图片审核策略BizType  Image 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Image&quot;的BizType值</p>
     * @param ImageBizType <p>天御图片审核策略BizType  Image 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Image&quot;的BizType值</p>
     */
    public void setImageBizType(String ImageBizType) {
        this.ImageBizType = ImageBizType;
    }

    /**
     * Get <p>天御音频审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;ShortAudio&quot;的BizType值</p> 
     * @return AudioBizType <p>天御音频审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;ShortAudio&quot;的BizType值</p>
     */
    public String getAudioBizType() {
        return this.AudioBizType;
    }

    /**
     * Set <p>天御音频审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;ShortAudio&quot;的BizType值</p>
     * @param AudioBizType <p>天御音频审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;ShortAudio&quot;的BizType值</p>
     */
    public void setAudioBizType(String AudioBizType) {
        this.AudioBizType = AudioBizType;
    }

    /**
     * Get <p>天御音频文本审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Text&quot;的BizType值</p> 
     * @return AudioTextBizType <p>天御音频文本审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Text&quot;的BizType值</p>
     */
    public String getAudioTextBizType() {
        return this.AudioTextBizType;
    }

    /**
     * Set <p>天御音频文本审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Text&quot;的BizType值</p>
     * @param AudioTextBizType <p>天御音频文本审核策略BizType  ShortAudio 。</p><p>取值为DescribeAuditTemplates返回的SceneInfos下BizInfos里面的对应的StrategyType为&quot;Text&quot;的BizType值</p>
     */
    public void setAudioTextBizType(String AudioTextBizType) {
        this.AudioTextBizType = AudioTextBizType;
    }

    /**
     * Get <p>模板创建时间。</p> 
     * @return CreateTime <p>模板创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模板创建时间。</p>
     * @param CreateTime <p>模板创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模板修改时间。</p> 
     * @return UpdateTime <p>模板修改时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>模板修改时间。</p>
     * @param UpdateTime <p>模板修改时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get <p>仅当擦除类型选择了违规音频，该项可见</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li></ul> 
     * @return PrivacyProtection <p>仅当擦除类型选择了违规音频，该项可见</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li></ul>
     */
    public String getPrivacyProtection() {
        return this.PrivacyProtection;
    }

    /**
     * Set <p>仅当擦除类型选择了违规音频，该项可见</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li></ul>
     * @param PrivacyProtection <p>仅当擦除类型选择了违规音频，该项可见</p><p>枚举值：</p><ul><li>blur face： 人脸模糊</li><li>blur license plate： 车牌模糊</li></ul>
     */
    public void setPrivacyProtection(String PrivacyProtection) {
        this.PrivacyProtection = PrivacyProtection;
    }

    /**
     * Get <p>仅当擦除类型选择了“隐私保护”后，该项可见</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul> 
     * @return AudioErasureMode <p>仅当擦除类型选择了“隐私保护”后，该项可见</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul>
     */
    public Long getAudioErasureMode() {
        return this.AudioErasureMode;
    }

    /**
     * Set <p>仅当擦除类型选择了“隐私保护”后，该项可见</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul>
     * @param AudioErasureMode <p>仅当擦除类型选择了“隐私保护”后，该项可见</p><p>枚举值：</p><ul><li>0： 静音</li><li>1： 哔音</li></ul>
     */
    public void setAudioErasureMode(Long AudioErasureMode) {
        this.AudioErasureMode = AudioErasureMode;
    }

    public SmartEraseTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseTemplate(SmartEraseTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AuditConfId", this.AuditConfId);
        this.setParamSimple(map, prefix + "ImageBizType", this.ImageBizType);
        this.setParamSimple(map, prefix + "AudioBizType", this.AudioBizType);
        this.setParamSimple(map, prefix + "AudioTextBizType", this.AudioTextBizType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DisplayMode", this.DisplayMode);
        this.setParamSimple(map, prefix + "DisplayDelayTime", this.DisplayDelayTime);
        this.setParamSimple(map, prefix + "PrivacyProtection", this.PrivacyProtection);
        this.setParamSimple(map, prefix + "AudioErasureMode", this.AudioErasureMode);

    }
}

