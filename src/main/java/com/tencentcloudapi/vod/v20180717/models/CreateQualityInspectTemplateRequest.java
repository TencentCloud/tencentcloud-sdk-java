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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQualityInspectTemplateRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>音画质检测模板名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>音画质检测模板描述。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>音画质检测配置参数。</p>
    */
    @SerializedName("Configs")
    @Expose
    private QualityInspectConfig [] Configs;

    /**
    * <p>音画质检测的抽检策略参数。</p>
    */
    @SerializedName("Strategy")
    @Expose
    private QualityInspectStrategy Strategy;

    /**
    * <p>（不推荐，使用 Configs 替代）截帧间隔，单位为秒，最小值为 1。当不填时，默认截帧间隔为 1 秒。</p>
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面抖动重影检测的控制参数。</p>
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfo JitterConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面模糊检测的控制参数。</p>
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfo BlurConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面低光、过曝检测的控制参数。</p>
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfo AbnormalLightingConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面花屏检测的控制参数。</p>
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfo CrashScreenConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面黑边、白边、黑屏、白屏检测的控制参数。</p>
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面噪点检测的控制参数。</p>
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfo NoiseConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面马赛克检测的控制参数。</p>
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfo MosaicConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面二维码检测的控制参数。</p>
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfo QRCodeConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）音频（静音、低音、爆音）检测的控制参数。</p>
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfo VoiceConfigure;

    /**
    * <p>（不推荐，使用 Configs 替代）视频画面质量评价的控制参数。</p>
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfo QualityEvaluationConfigure;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>音画质检测模板名称。</p> 
     * @return Name <p>音画质检测模板名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>音画质检测模板名称。</p>
     * @param Name <p>音画质检测模板名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>音画质检测模板描述。</p> 
     * @return Comment <p>音画质检测模板描述。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>音画质检测模板描述。</p>
     * @param Comment <p>音画质检测模板描述。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>音画质检测配置参数。</p> 
     * @return Configs <p>音画质检测配置参数。</p>
     */
    public QualityInspectConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set <p>音画质检测配置参数。</p>
     * @param Configs <p>音画质检测配置参数。</p>
     */
    public void setConfigs(QualityInspectConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get <p>音画质检测的抽检策略参数。</p> 
     * @return Strategy <p>音画质检测的抽检策略参数。</p>
     */
    public QualityInspectStrategy getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>音画质检测的抽检策略参数。</p>
     * @param Strategy <p>音画质检测的抽检策略参数。</p>
     */
    public void setStrategy(QualityInspectStrategy Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）截帧间隔，单位为秒，最小值为 1。当不填时，默认截帧间隔为 1 秒。</p> 
     * @return ScreenshotInterval <p>（不推荐，使用 Configs 替代）截帧间隔，单位为秒，最小值为 1。当不填时，默认截帧间隔为 1 秒。</p>
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）截帧间隔，单位为秒，最小值为 1。当不填时，默认截帧间隔为 1 秒。</p>
     * @param ScreenshotInterval <p>（不推荐，使用 Configs 替代）截帧间隔，单位为秒，最小值为 1。当不填时，默认截帧间隔为 1 秒。</p>
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面抖动重影检测的控制参数。</p> 
     * @return JitterConfigure <p>（不推荐，使用 Configs 替代）视频画面抖动重影检测的控制参数。</p>
     */
    public JitterConfigureInfo getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面抖动重影检测的控制参数。</p>
     * @param JitterConfigure <p>（不推荐，使用 Configs 替代）视频画面抖动重影检测的控制参数。</p>
     */
    public void setJitterConfigure(JitterConfigureInfo JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面模糊检测的控制参数。</p> 
     * @return BlurConfigure <p>（不推荐，使用 Configs 替代）视频画面模糊检测的控制参数。</p>
     */
    public BlurConfigureInfo getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面模糊检测的控制参数。</p>
     * @param BlurConfigure <p>（不推荐，使用 Configs 替代）视频画面模糊检测的控制参数。</p>
     */
    public void setBlurConfigure(BlurConfigureInfo BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面低光、过曝检测的控制参数。</p> 
     * @return AbnormalLightingConfigure <p>（不推荐，使用 Configs 替代）视频画面低光、过曝检测的控制参数。</p>
     */
    public AbnormalLightingConfigureInfo getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面低光、过曝检测的控制参数。</p>
     * @param AbnormalLightingConfigure <p>（不推荐，使用 Configs 替代）视频画面低光、过曝检测的控制参数。</p>
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfo AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面花屏检测的控制参数。</p> 
     * @return CrashScreenConfigure <p>（不推荐，使用 Configs 替代）视频画面花屏检测的控制参数。</p>
     */
    public CrashScreenConfigureInfo getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面花屏检测的控制参数。</p>
     * @param CrashScreenConfigure <p>（不推荐，使用 Configs 替代）视频画面花屏检测的控制参数。</p>
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfo CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面黑边、白边、黑屏、白屏检测的控制参数。</p> 
     * @return BlackWhiteEdgeConfigure <p>（不推荐，使用 Configs 替代）视频画面黑边、白边、黑屏、白屏检测的控制参数。</p>
     */
    public BlackWhiteEdgeConfigureInfo getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面黑边、白边、黑屏、白屏检测的控制参数。</p>
     * @param BlackWhiteEdgeConfigure <p>（不推荐，使用 Configs 替代）视频画面黑边、白边、黑屏、白屏检测的控制参数。</p>
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面噪点检测的控制参数。</p> 
     * @return NoiseConfigure <p>（不推荐，使用 Configs 替代）视频画面噪点检测的控制参数。</p>
     */
    public NoiseConfigureInfo getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面噪点检测的控制参数。</p>
     * @param NoiseConfigure <p>（不推荐，使用 Configs 替代）视频画面噪点检测的控制参数。</p>
     */
    public void setNoiseConfigure(NoiseConfigureInfo NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面马赛克检测的控制参数。</p> 
     * @return MosaicConfigure <p>（不推荐，使用 Configs 替代）视频画面马赛克检测的控制参数。</p>
     */
    public MosaicConfigureInfo getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面马赛克检测的控制参数。</p>
     * @param MosaicConfigure <p>（不推荐，使用 Configs 替代）视频画面马赛克检测的控制参数。</p>
     */
    public void setMosaicConfigure(MosaicConfigureInfo MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面二维码检测的控制参数。</p> 
     * @return QRCodeConfigure <p>（不推荐，使用 Configs 替代）视频画面二维码检测的控制参数。</p>
     */
    public QRCodeConfigureInfo getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面二维码检测的控制参数。</p>
     * @param QRCodeConfigure <p>（不推荐，使用 Configs 替代）视频画面二维码检测的控制参数。</p>
     */
    public void setQRCodeConfigure(QRCodeConfigureInfo QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）音频（静音、低音、爆音）检测的控制参数。</p> 
     * @return VoiceConfigure <p>（不推荐，使用 Configs 替代）音频（静音、低音、爆音）检测的控制参数。</p>
     */
    public VoiceConfigureInfo getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）音频（静音、低音、爆音）检测的控制参数。</p>
     * @param VoiceConfigure <p>（不推荐，使用 Configs 替代）音频（静音、低音、爆音）检测的控制参数。</p>
     */
    public void setVoiceConfigure(VoiceConfigureInfo VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get <p>（不推荐，使用 Configs 替代）视频画面质量评价的控制参数。</p> 
     * @return QualityEvaluationConfigure <p>（不推荐，使用 Configs 替代）视频画面质量评价的控制参数。</p>
     */
    public QualityEvaluationConfigureInfo getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set <p>（不推荐，使用 Configs 替代）视频画面质量评价的控制参数。</p>
     * @param QualityEvaluationConfigure <p>（不推荐，使用 Configs 替代）视频画面质量评价的控制参数。</p>
     */
    public void setQualityEvaluationConfigure(QualityEvaluationConfigureInfo QualityEvaluationConfigure) {
        this.QualityEvaluationConfigure = QualityEvaluationConfigure;
    }

    public CreateQualityInspectTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityInspectTemplateRequest(CreateQualityInspectTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Configs != null) {
            this.Configs = new QualityInspectConfig[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new QualityInspectConfig(source.Configs[i]);
            }
        }
        if (source.Strategy != null) {
            this.Strategy = new QualityInspectStrategy(source.Strategy);
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
        if (source.VoiceConfigure != null) {
            this.VoiceConfigure = new VoiceConfigureInfo(source.VoiceConfigure);
        }
        if (source.QualityEvaluationConfigure != null) {
            this.QualityEvaluationConfigure = new QualityEvaluationConfigureInfo(source.QualityEvaluationConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);
        this.setParamObj(map, prefix + "Strategy.", this.Strategy);
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

