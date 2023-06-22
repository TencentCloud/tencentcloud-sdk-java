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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectTemplateItem extends AbstractModel{

    /**
    * 模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 截帧间隔，单位为秒。
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 视频画面抖动重影检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfo JitterConfigure;

    /**
    * 视频画面模糊检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfo BlurConfigure;

    /**
    * 视频画面低光、过曝检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfo AbnormalLightingConfigure;

    /**
    * 视频画面花屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfo CrashScreenConfigure;

    /**
    * 视频画面黑边、白边、黑屏、白屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure;

    /**
    * 视频画面噪点检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfo NoiseConfigure;

    /**
    * 视频画面马赛克检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfo MosaicConfigure;

    /**
    * 视频画面二维码检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfo QRCodeConfigure;

    /**
    * 视频画面质量评价的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfo QualityEvaluationConfigure;

    /**
    * 音频（静音、低音、爆音）检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfo VoiceConfigure;

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
     * Get 模板 ID。 
     * @return Definition 模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 模板 ID。
     * @param Definition 模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li> 
     * @return Type 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     * @param Type 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 模板名称。 
     * @return Name 模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称。
     * @param Name 模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述。 
     * @return Comment 模板描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述。
     * @param Comment 模板描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 截帧间隔，单位为秒。 
     * @return ScreenshotInterval 截帧间隔，单位为秒。
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 截帧间隔，单位为秒。
     * @param ScreenshotInterval 截帧间隔，单位为秒。
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get 视频画面抖动重影检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JitterConfigure 视频画面抖动重影检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JitterConfigureInfo getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set 视频画面抖动重影检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param JitterConfigure 视频画面抖动重影检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJitterConfigure(JitterConfigureInfo JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get 视频画面模糊检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlurConfigure 视频画面模糊检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlurConfigureInfo getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set 视频画面模糊检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlurConfigure 视频画面模糊检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlurConfigure(BlurConfigureInfo BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get 视频画面低光、过曝检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbnormalLightingConfigure 视频画面低光、过曝检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AbnormalLightingConfigureInfo getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set 视频画面低光、过曝检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbnormalLightingConfigure 视频画面低光、过曝检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfo AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get 视频画面花屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrashScreenConfigure 视频画面花屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CrashScreenConfigureInfo getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set 视频画面花屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrashScreenConfigure 视频画面花屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfo CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get 视频画面黑边、白边、黑屏、白屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlackWhiteEdgeConfigure 视频画面黑边、白边、黑屏、白屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlackWhiteEdgeConfigureInfo getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set 视频画面黑边、白边、黑屏、白屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlackWhiteEdgeConfigure 视频画面黑边、白边、黑屏、白屏检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get 视频画面噪点检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoiseConfigure 视频画面噪点检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoiseConfigureInfo getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set 视频画面噪点检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoiseConfigure 视频画面噪点检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoiseConfigure(NoiseConfigureInfo NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get 视频画面马赛克检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MosaicConfigure 视频画面马赛克检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MosaicConfigureInfo getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set 视频画面马赛克检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MosaicConfigure 视频画面马赛克检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMosaicConfigure(MosaicConfigureInfo MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get 视频画面二维码检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QRCodeConfigure 视频画面二维码检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QRCodeConfigureInfo getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set 视频画面二维码检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QRCodeConfigure 视频画面二维码检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQRCodeConfigure(QRCodeConfigureInfo QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get 视频画面质量评价的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEvaluationConfigure 视频画面质量评价的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityEvaluationConfigureInfo getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set 视频画面质量评价的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEvaluationConfigure 视频画面质量评价的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEvaluationConfigure(QualityEvaluationConfigureInfo QualityEvaluationConfigure) {
        this.QualityEvaluationConfigure = QualityEvaluationConfigure;
    }

    /**
     * Get 音频（静音、低音、爆音）检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceConfigure 音频（静音、低音、爆音）检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceConfigureInfo getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set 音频（静音、低音、爆音）检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceConfigure 音频（静音、低音、爆音）检测的控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceConfigure(VoiceConfigureInfo VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
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

    public QualityInspectTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTemplateItem(QualityInspectTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
        if (source.JitterConfigure != null) {
            this.JitterConfigure = new JitterConfigureInfo(source.JitterConfigure);
        }
        if (source.BlurConfigure != null) {
            this.BlurConfigure = new BlurConfigureInfo(source.BlurConfigure);
        }
        if (source.AbnormalLightingConfigure != null) {
            this.AbnormalLightingConfigure = new AbnormalLightingConfigureInfo(source.AbnormalLightingConfigure);
        }
        if (source.CrashScreenConfigure != null) {
            this.CrashScreenConfigure = new CrashScreenConfigureInfo(source.CrashScreenConfigure);
        }
        if (source.BlackWhiteEdgeConfigure != null) {
            this.BlackWhiteEdgeConfigure = new BlackWhiteEdgeConfigureInfo(source.BlackWhiteEdgeConfigure);
        }
        if (source.NoiseConfigure != null) {
            this.NoiseConfigure = new NoiseConfigureInfo(source.NoiseConfigure);
        }
        if (source.MosaicConfigure != null) {
            this.MosaicConfigure = new MosaicConfigureInfo(source.MosaicConfigure);
        }
        if (source.QRCodeConfigure != null) {
            this.QRCodeConfigure = new QRCodeConfigureInfo(source.QRCodeConfigure);
        }
        if (source.QualityEvaluationConfigure != null) {
            this.QualityEvaluationConfigure = new QualityEvaluationConfigureInfo(source.QualityEvaluationConfigure);
        }
        if (source.VoiceConfigure != null) {
            this.VoiceConfigure = new VoiceConfigureInfo(source.VoiceConfigure);
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamObj(map, prefix + "JitterConfigure.", this.JitterConfigure);
        this.setParamObj(map, prefix + "BlurConfigure.", this.BlurConfigure);
        this.setParamObj(map, prefix + "AbnormalLightingConfigure.", this.AbnormalLightingConfigure);
        this.setParamObj(map, prefix + "CrashScreenConfigure.", this.CrashScreenConfigure);
        this.setParamObj(map, prefix + "BlackWhiteEdgeConfigure.", this.BlackWhiteEdgeConfigure);
        this.setParamObj(map, prefix + "NoiseConfigure.", this.NoiseConfigure);
        this.setParamObj(map, prefix + "MosaicConfigure.", this.MosaicConfigure);
        this.setParamObj(map, prefix + "QRCodeConfigure.", this.QRCodeConfigure);
        this.setParamObj(map, prefix + "QualityEvaluationConfigure.", this.QualityEvaluationConfigure);
        this.setParamObj(map, prefix + "VoiceConfigure.", this.VoiceConfigure);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

