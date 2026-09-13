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

public class ModerationCheckDetail extends AbstractModel {

    /**
    * <p>该字段在内容理解回调事件中可直接忽略，仅在第三方审核时存在，检出违规的模型场景，枚举值：Ad/Porn/Abuse/Illegal/Polity/Terror/Sexy/Moan/Custom</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

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
    * <p>0：建议通过。 1 ：建议人工重新内容识别。 2：建议屏蔽。</p>
    */
    @SerializedName("Suggest")
    @Expose
    private Long Suggest;

    /**
    * <p>自定义词库名。</p>
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * <p>关键词。</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * <p>中文二级标签。</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>违规严重程度: 0-不区分 1-轻度 2-严重</p>
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * <p>违规严重程度描述 仅名单内sdkappid返回 负面表达,正面或中性表达,语义模糊</p>
    */
    @SerializedName("SeverityDesc")
    @Expose
    private String SeverityDesc;

    /**
    * <p>音频切片位置信息。</p>
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments AudioSegments;

    /**
    * <p>图片命中坐标信息。</p>
    */
    @SerializedName("ImageLocation")
    @Expose
    private ImageLocation ImageLocation;

    /**
     * Get <p>该字段在内容理解回调事件中可直接忽略，仅在第三方审核时存在，检出违规的模型场景，枚举值：Ad/Porn/Abuse/Illegal/Polity/Terror/Sexy/Moan/Custom</p> 
     * @return Scene <p>该字段在内容理解回调事件中可直接忽略，仅在第三方审核时存在，检出违规的模型场景，枚举值：Ad/Porn/Abuse/Illegal/Polity/Terror/Sexy/Moan/Custom</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>该字段在内容理解回调事件中可直接忽略，仅在第三方审核时存在，检出违规的模型场景，枚举值：Ad/Porn/Abuse/Illegal/Polity/Terror/Sexy/Moan/Custom</p>
     * @param Scene <p>该字段在内容理解回调事件中可直接忽略，仅在第三方审核时存在，检出违规的模型场景，枚举值：Ad/Porn/Abuse/Illegal/Polity/Terror/Sexy/Moan/Custom</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
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
     * Get <p>自定义词库名。</p> 
     * @return LibName <p>自定义词库名。</p>
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set <p>自定义词库名。</p>
     * @param LibName <p>自定义词库名。</p>
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get <p>关键词。</p> 
     * @return Keywords <p>关键词。</p>
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>关键词。</p>
     * @param Keywords <p>关键词。</p>
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>中文二级标签。</p> 
     * @return Desc <p>中文二级标签。</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>中文二级标签。</p>
     * @param Desc <p>中文二级标签。</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p> 
     * @return Score <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
     * @param Score <p>置信度分数，取值范围：0（置信度最低）-100（置信度最高 ），越高代表越有可能属于当前返回的标签。 实例值：100</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>违规严重程度: 0-不区分 1-轻度 2-严重</p> 
     * @return Severity <p>违规严重程度: 0-不区分 1-轻度 2-严重</p>
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>违规严重程度: 0-不区分 1-轻度 2-严重</p>
     * @param Severity <p>违规严重程度: 0-不区分 1-轻度 2-严重</p>
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>违规严重程度描述 仅名单内sdkappid返回 负面表达,正面或中性表达,语义模糊</p> 
     * @return SeverityDesc <p>违规严重程度描述 仅名单内sdkappid返回 负面表达,正面或中性表达,语义模糊</p>
     */
    public String getSeverityDesc() {
        return this.SeverityDesc;
    }

    /**
     * Set <p>违规严重程度描述 仅名单内sdkappid返回 负面表达,正面或中性表达,语义模糊</p>
     * @param SeverityDesc <p>违规严重程度描述 仅名单内sdkappid返回 负面表达,正面或中性表达,语义模糊</p>
     */
    public void setSeverityDesc(String SeverityDesc) {
        this.SeverityDesc = SeverityDesc;
    }

    /**
     * Get <p>音频切片位置信息。</p> 
     * @return AudioSegments <p>音频切片位置信息。</p>
     */
    public AudioSegments getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set <p>音频切片位置信息。</p>
     * @param AudioSegments <p>音频切片位置信息。</p>
     */
    public void setAudioSegments(AudioSegments AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get <p>图片命中坐标信息。</p> 
     * @return ImageLocation <p>图片命中坐标信息。</p>
     */
    public ImageLocation getImageLocation() {
        return this.ImageLocation;
    }

    /**
     * Set <p>图片命中坐标信息。</p>
     * @param ImageLocation <p>图片命中坐标信息。</p>
     */
    public void setImageLocation(ImageLocation ImageLocation) {
        this.ImageLocation = ImageLocation;
    }

    public ModerationCheckDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerationCheckDetail(ModerationCheckDetail source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Suggest != null) {
            this.Suggest = new Long(source.Suggest);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.SeverityDesc != null) {
            this.SeverityDesc = new String(source.SeverityDesc);
        }
        if (source.AudioSegments != null) {
            this.AudioSegments = new AudioSegments(source.AudioSegments);
        }
        if (source.ImageLocation != null) {
            this.ImageLocation = new ImageLocation(source.ImageLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Suggest", this.Suggest);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "SeverityDesc", this.SeverityDesc);
        this.setParamObj(map, prefix + "AudioSegments.", this.AudioSegments);
        this.setParamObj(map, prefix + "ImageLocation.", this.ImageLocation);

    }
}

