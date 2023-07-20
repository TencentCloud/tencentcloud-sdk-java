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

public class ModifyQualityInspectTemplateRequest extends AbstractModel{

    /**
    * 模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 截帧间隔，单位为秒，最小值为 1。
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 视频画面抖动重影检测的控制参数。
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfoForUpdate JitterConfigure;

    /**
    * 视频画面模糊检测的控制参数。
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfoForUpdate BlurConfigure;

    /**
    * 视频画面低光、过曝检测的控制参数。
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure;

    /**
    * 视频画面花屏检测的控制参数。
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfoForUpdate CrashScreenConfigure;

    /**
    * 视频画面黑边、白边、黑屏、白屏检测的控制参数。
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure;

    /**
    * 视频画面噪点检测的控制参数。
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfoForUpdate NoiseConfigure;

    /**
    * 视频画面马赛克检测的控制参数。
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfoForUpdate MosaicConfigure;

    /**
    * 视频画面二维码检测的控制参数。
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfoForUpdate QRCodeConfigure;

    /**
    * 音频（静音、低音、爆音）检测的控制参数。
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfoForUpdate VoiceConfigure;

    /**
    * 视频画面质量评价的控制参数。
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfoForUpdate QualityEvaluationConfigure;

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
     * Get <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 模板名称，长度限制：64 个字符。 
     * @return Name 模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称，长度限制：64 个字符。
     * @param Name 模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 截帧间隔，单位为秒，最小值为 1。 
     * @return ScreenshotInterval 截帧间隔，单位为秒，最小值为 1。
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 截帧间隔，单位为秒，最小值为 1。
     * @param ScreenshotInterval 截帧间隔，单位为秒，最小值为 1。
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get 视频画面抖动重影检测的控制参数。 
     * @return JitterConfigure 视频画面抖动重影检测的控制参数。
     */
    public JitterConfigureInfoForUpdate getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set 视频画面抖动重影检测的控制参数。
     * @param JitterConfigure 视频画面抖动重影检测的控制参数。
     */
    public void setJitterConfigure(JitterConfigureInfoForUpdate JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get 视频画面模糊检测的控制参数。 
     * @return BlurConfigure 视频画面模糊检测的控制参数。
     */
    public BlurConfigureInfoForUpdate getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set 视频画面模糊检测的控制参数。
     * @param BlurConfigure 视频画面模糊检测的控制参数。
     */
    public void setBlurConfigure(BlurConfigureInfoForUpdate BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get 视频画面低光、过曝检测的控制参数。 
     * @return AbnormalLightingConfigure 视频画面低光、过曝检测的控制参数。
     */
    public AbnormalLightingConfigureInfoForUpdate getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set 视频画面低光、过曝检测的控制参数。
     * @param AbnormalLightingConfigure 视频画面低光、过曝检测的控制参数。
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get 视频画面花屏检测的控制参数。 
     * @return CrashScreenConfigure 视频画面花屏检测的控制参数。
     */
    public CrashScreenConfigureInfoForUpdate getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set 视频画面花屏检测的控制参数。
     * @param CrashScreenConfigure 视频画面花屏检测的控制参数。
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfoForUpdate CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get 视频画面黑边、白边、黑屏、白屏检测的控制参数。 
     * @return BlackWhiteEdgeConfigure 视频画面黑边、白边、黑屏、白屏检测的控制参数。
     */
    public BlackWhiteEdgeConfigureInfoForUpdate getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set 视频画面黑边、白边、黑屏、白屏检测的控制参数。
     * @param BlackWhiteEdgeConfigure 视频画面黑边、白边、黑屏、白屏检测的控制参数。
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get 视频画面噪点检测的控制参数。 
     * @return NoiseConfigure 视频画面噪点检测的控制参数。
     */
    public NoiseConfigureInfoForUpdate getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set 视频画面噪点检测的控制参数。
     * @param NoiseConfigure 视频画面噪点检测的控制参数。
     */
    public void setNoiseConfigure(NoiseConfigureInfoForUpdate NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get 视频画面马赛克检测的控制参数。 
     * @return MosaicConfigure 视频画面马赛克检测的控制参数。
     */
    public MosaicConfigureInfoForUpdate getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set 视频画面马赛克检测的控制参数。
     * @param MosaicConfigure 视频画面马赛克检测的控制参数。
     */
    public void setMosaicConfigure(MosaicConfigureInfoForUpdate MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get 视频画面二维码检测的控制参数。 
     * @return QRCodeConfigure 视频画面二维码检测的控制参数。
     */
    public QRCodeConfigureInfoForUpdate getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set 视频画面二维码检测的控制参数。
     * @param QRCodeConfigure 视频画面二维码检测的控制参数。
     */
    public void setQRCodeConfigure(QRCodeConfigureInfoForUpdate QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get 音频（静音、低音、爆音）检测的控制参数。 
     * @return VoiceConfigure 音频（静音、低音、爆音）检测的控制参数。
     */
    public VoiceConfigureInfoForUpdate getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set 音频（静音、低音、爆音）检测的控制参数。
     * @param VoiceConfigure 音频（静音、低音、爆音）检测的控制参数。
     */
    public void setVoiceConfigure(VoiceConfigureInfoForUpdate VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get 视频画面质量评价的控制参数。 
     * @return QualityEvaluationConfigure 视频画面质量评价的控制参数。
     */
    public QualityEvaluationConfigureInfoForUpdate getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set 视频画面质量评价的控制参数。
     * @param QualityEvaluationConfigure 视频画面质量评价的控制参数。
     */
    public void setQualityEvaluationConfigure(QualityEvaluationConfigureInfoForUpdate QualityEvaluationConfigure) {
        this.QualityEvaluationConfigure = QualityEvaluationConfigure;
    }

    public ModifyQualityInspectTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQualityInspectTemplateRequest(ModifyQualityInspectTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
            this.JitterConfigure = new JitterConfigureInfoForUpdate(source.JitterConfigure);
        }
        if (source.BlurConfigure != null) {
            this.BlurConfigure = new BlurConfigureInfoForUpdate(source.BlurConfigure);
        }
        if (source.AbnormalLightingConfigure != null) {
            this.AbnormalLightingConfigure = new AbnormalLightingConfigureInfoForUpdate(source.AbnormalLightingConfigure);
        }
        if (source.CrashScreenConfigure != null) {
            this.CrashScreenConfigure = new CrashScreenConfigureInfoForUpdate(source.CrashScreenConfigure);
        }
        if (source.BlackWhiteEdgeConfigure != null) {
            this.BlackWhiteEdgeConfigure = new BlackWhiteEdgeConfigureInfoForUpdate(source.BlackWhiteEdgeConfigure);
        }
        if (source.NoiseConfigure != null) {
            this.NoiseConfigure = new NoiseConfigureInfoForUpdate(source.NoiseConfigure);
        }
        if (source.MosaicConfigure != null) {
            this.MosaicConfigure = new MosaicConfigureInfoForUpdate(source.MosaicConfigure);
        }
        if (source.QRCodeConfigure != null) {
            this.QRCodeConfigure = new QRCodeConfigureInfoForUpdate(source.QRCodeConfigure);
        }
        if (source.VoiceConfigure != null) {
            this.VoiceConfigure = new VoiceConfigureInfoForUpdate(source.VoiceConfigure);
        }
        if (source.QualityEvaluationConfigure != null) {
            this.QualityEvaluationConfigure = new QualityEvaluationConfigureInfoForUpdate(source.QualityEvaluationConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
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
        this.setParamObj(map, prefix + "VoiceConfigure.", this.VoiceConfigure);
        this.setParamObj(map, prefix + "QualityEvaluationConfigure.", this.QualityEvaluationConfigure);

    }
}

