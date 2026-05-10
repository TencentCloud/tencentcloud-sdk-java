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

public class CreateMPSTemplateRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>需要创建的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。<br>目前仅支持通过此方式创建以下任务类型的模板：</p><ol><li>智能分析：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/40249">创建内容分析模板</a>”接口中的Name、Comment、ClassificationConfigure、TagConfigure、CoverConfigure、FrameTagConfigure几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能字幕：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/117004">创建智能字幕模板</a>”接口中的Name、Comment、TranslateSwitch、VideoSrcLanguage、SubtitleFormat、SubtitleType、AsrHotWordsConfigure、TranslateDstLanguage、ProcessType几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能擦除：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/123735">创建智能擦除模板</a>”接口中的Name、Comment、EraseType、EraseSubtitleConfig、EraseWatermarkConfig、ErasePrivacyConfig几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li></ol><p>目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。</p>
    */
    @SerializedName("MPSCreateTemplateParams")
    @Expose
    private String MPSCreateTemplateParams;

    /**
    * <p>智能分析模板参数，MPSCreateTemplateParams为空时有效。</p>
    */
    @SerializedName("AIAnalysisTemplate")
    @Expose
    private MPSAIAnalysisTemplate AIAnalysisTemplate;

    /**
    * <p>智能字幕模板参数，MPSCreateTemplateParams为空时有效。</p>
    */
    @SerializedName("SmartSubtitleTemplate")
    @Expose
    private MPSSmartSubtitleTemplate SmartSubtitleTemplate;

    /**
    * <p>智能擦除模板参数，MPSCreateTemplateParams为空时有效。</p>
    */
    @SerializedName("SmartEraseTemplate")
    @Expose
    private MPSSmartEraseTemplate SmartEraseTemplate;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>需要创建的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li> 
     * @return TemplateType <p>需要创建的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>需要创建的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li>
     * @param TemplateType <p>需要创建的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。<br>目前仅支持通过此方式创建以下任务类型的模板：</p><ol><li>智能分析：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/40249">创建内容分析模板</a>”接口中的Name、Comment、ClassificationConfigure、TagConfigure、CoverConfigure、FrameTagConfigure几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能字幕：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/117004">创建智能字幕模板</a>”接口中的Name、Comment、TranslateSwitch、VideoSrcLanguage、SubtitleFormat、SubtitleType、AsrHotWordsConfigure、TranslateDstLanguage、ProcessType几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能擦除：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/123735">创建智能擦除模板</a>”接口中的Name、Comment、EraseType、EraseSubtitleConfig、EraseWatermarkConfig、ErasePrivacyConfig几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li></ol><p>目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。</p> 
     * @return MPSCreateTemplateParams <p>MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。<br>目前仅支持通过此方式创建以下任务类型的模板：</p><ol><li>智能分析：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/40249">创建内容分析模板</a>”接口中的Name、Comment、ClassificationConfigure、TagConfigure、CoverConfigure、FrameTagConfigure几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能字幕：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/117004">创建智能字幕模板</a>”接口中的Name、Comment、TranslateSwitch、VideoSrcLanguage、SubtitleFormat、SubtitleType、AsrHotWordsConfigure、TranslateDstLanguage、ProcessType几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能擦除：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/123735">创建智能擦除模板</a>”接口中的Name、Comment、EraseType、EraseSubtitleConfig、EraseWatermarkConfig、ErasePrivacyConfig几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li></ol><p>目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。</p>
     */
    public String getMPSCreateTemplateParams() {
        return this.MPSCreateTemplateParams;
    }

    /**
     * Set <p>MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。<br>目前仅支持通过此方式创建以下任务类型的模板：</p><ol><li>智能分析：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/40249">创建内容分析模板</a>”接口中的Name、Comment、ClassificationConfigure、TagConfigure、CoverConfigure、FrameTagConfigure几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能字幕：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/117004">创建智能字幕模板</a>”接口中的Name、Comment、TranslateSwitch、VideoSrcLanguage、SubtitleFormat、SubtitleType、AsrHotWordsConfigure、TranslateDstLanguage、ProcessType几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能擦除：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/123735">创建智能擦除模板</a>”接口中的Name、Comment、EraseType、EraseSubtitleConfig、EraseWatermarkConfig、ErasePrivacyConfig几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li></ol><p>目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。</p>
     * @param MPSCreateTemplateParams <p>MPS 创建模板参数。该参数用于透传至媒体处理服务（MPS），从云点播侧创建用户自定义的 MPS 任务模板。<br>目前仅支持通过此方式创建以下任务类型的模板：</p><ol><li>智能分析：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/40249">创建内容分析模板</a>”接口中的Name、Comment、ClassificationConfigure、TagConfigure、CoverConfigure、FrameTagConfigure几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能字幕：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/117004">创建智能字幕模板</a>”接口中的Name、Comment、TranslateSwitch、VideoSrcLanguage、SubtitleFormat、SubtitleType、AsrHotWordsConfigure、TranslateDstLanguage、ProcessType几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li><li>智能擦除：仅支持填写“<a href="https://cloud.tencent.com/document/api/862/123735">创建智能擦除模板</a>”接口中的Name、Comment、EraseType、EraseSubtitleConfig、EraseWatermarkConfig、ErasePrivacyConfig几个参数的内容。目前仅支持在模板中配置以上参数，其他参数无需填写，若包含其它参数，系统将自动忽略。</li></ol><p>目前模板中仅支持配置以上参数，其他参数无需填写。若包含其它参数，系统将自动忽略。以上透传参数以JSON形式表示。</p>
     */
    public void setMPSCreateTemplateParams(String MPSCreateTemplateParams) {
        this.MPSCreateTemplateParams = MPSCreateTemplateParams;
    }

    /**
     * Get <p>智能分析模板参数，MPSCreateTemplateParams为空时有效。</p> 
     * @return AIAnalysisTemplate <p>智能分析模板参数，MPSCreateTemplateParams为空时有效。</p>
     */
    public MPSAIAnalysisTemplate getAIAnalysisTemplate() {
        return this.AIAnalysisTemplate;
    }

    /**
     * Set <p>智能分析模板参数，MPSCreateTemplateParams为空时有效。</p>
     * @param AIAnalysisTemplate <p>智能分析模板参数，MPSCreateTemplateParams为空时有效。</p>
     */
    public void setAIAnalysisTemplate(MPSAIAnalysisTemplate AIAnalysisTemplate) {
        this.AIAnalysisTemplate = AIAnalysisTemplate;
    }

    /**
     * Get <p>智能字幕模板参数，MPSCreateTemplateParams为空时有效。</p> 
     * @return SmartSubtitleTemplate <p>智能字幕模板参数，MPSCreateTemplateParams为空时有效。</p>
     */
    public MPSSmartSubtitleTemplate getSmartSubtitleTemplate() {
        return this.SmartSubtitleTemplate;
    }

    /**
     * Set <p>智能字幕模板参数，MPSCreateTemplateParams为空时有效。</p>
     * @param SmartSubtitleTemplate <p>智能字幕模板参数，MPSCreateTemplateParams为空时有效。</p>
     */
    public void setSmartSubtitleTemplate(MPSSmartSubtitleTemplate SmartSubtitleTemplate) {
        this.SmartSubtitleTemplate = SmartSubtitleTemplate;
    }

    /**
     * Get <p>智能擦除模板参数，MPSCreateTemplateParams为空时有效。</p> 
     * @return SmartEraseTemplate <p>智能擦除模板参数，MPSCreateTemplateParams为空时有效。</p>
     */
    public MPSSmartEraseTemplate getSmartEraseTemplate() {
        return this.SmartEraseTemplate;
    }

    /**
     * Set <p>智能擦除模板参数，MPSCreateTemplateParams为空时有效。</p>
     * @param SmartEraseTemplate <p>智能擦除模板参数，MPSCreateTemplateParams为空时有效。</p>
     */
    public void setSmartEraseTemplate(MPSSmartEraseTemplate SmartEraseTemplate) {
        this.SmartEraseTemplate = SmartEraseTemplate;
    }

    public CreateMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMPSTemplateRequest(CreateMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MPSCreateTemplateParams != null) {
            this.MPSCreateTemplateParams = new String(source.MPSCreateTemplateParams);
        }
        if (source.AIAnalysisTemplate != null) {
            this.AIAnalysisTemplate = new MPSAIAnalysisTemplate(source.AIAnalysisTemplate);
        }
        if (source.SmartSubtitleTemplate != null) {
            this.SmartSubtitleTemplate = new MPSSmartSubtitleTemplate(source.SmartSubtitleTemplate);
        }
        if (source.SmartEraseTemplate != null) {
            this.SmartEraseTemplate = new MPSSmartEraseTemplate(source.SmartEraseTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MPSCreateTemplateParams", this.MPSCreateTemplateParams);
        this.setParamObj(map, prefix + "AIAnalysisTemplate.", this.AIAnalysisTemplate);
        this.setParamObj(map, prefix + "SmartSubtitleTemplate.", this.SmartSubtitleTemplate);
        this.setParamObj(map, prefix + "SmartEraseTemplate.", this.SmartEraseTemplate);

    }
}

