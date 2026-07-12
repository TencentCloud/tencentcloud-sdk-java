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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationResponse extends AbstractModel {

    /**
    * <p>该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。</p>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>用于标识对本次请求的处置建议，共三种返回值。<br>返回值：<strong>Block</strong>: 建议直接做违规处置，<strong>Review</strong>: 建议人工二次确认，<strong>Pass</strong>: 未识别到风险。</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>该字段用于返回检测结果（DetailResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * <p>该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailResults")
    @Expose
    private DetailResults [] DetailResults;

    /**
    * <p>该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskDetails")
    @Expose
    private RiskDetails [] RiskDetails;

    /**
    * <p>该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。</p>
    */
    @SerializedName("ContextText")
    @Expose
    private String ContextText;

    /**
    * <p>该字段为历史结构字段，不再推荐使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SentimentAnalysis")
    @Expose
    private SentimentAnalysis SentimentAnalysis;

    /**
    * <p>该字段为历史结构字段，不再推荐使用。</p>
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
    * <p>该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>该字段用于标记导致本次审核命中标签的原文内容位置信息</p>
    */
    @SerializedName("HitSnippetInfos")
    @Expose
    private HitSnippetInfo [] HitSnippetInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。</p> 
     * @return BizType <p>该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。</p>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。</p>
     * @param BizType <p>该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。</p>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>用于标识对本次请求的处置建议，共三种返回值。<br>返回值：<strong>Block</strong>: 建议直接做违规处置，<strong>Review</strong>: 建议人工二次确认，<strong>Pass</strong>: 未识别到风险。</p> 
     * @return Suggestion <p>用于标识对本次请求的处置建议，共三种返回值。<br>返回值：<strong>Block</strong>: 建议直接做违规处置，<strong>Review</strong>: 建议人工二次确认，<strong>Pass</strong>: 未识别到风险。</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>用于标识对本次请求的处置建议，共三种返回值。<br>返回值：<strong>Block</strong>: 建议直接做违规处置，<strong>Review</strong>: 建议人工二次确认，<strong>Pass</strong>: 未识别到风险。</p>
     * @param Suggestion <p>用于标识对本次请求的处置建议，共三种返回值。<br>返回值：<strong>Block</strong>: 建议直接做违规处置，<strong>Review</strong>: 建议人工二次确认，<strong>Pass</strong>: 未识别到风险。</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>该字段用于返回检测结果（DetailResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型</p> 
     * @return Label <p>该字段用于返回检测结果（DetailResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>该字段用于返回检测结果（DetailResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型</p>
     * @param Label <p>该字段用于返回检测结果（DetailResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。</p> 
     * @return SubLabel <p>对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。</p>
     * @param SubLabel <p>对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。</p> 
     * @return Score <p>该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。</p>
     * @param Score <p>该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords <p>该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords <p>该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailResults <p>该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailResults [] getDetailResults() {
        return this.DetailResults;
    }

    /**
     * Set <p>该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailResults <p>该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailResults(DetailResults [] DetailResults) {
        this.DetailResults = DetailResults;
    }

    /**
     * Get <p>该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskDetails <p>该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetails [] getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set <p>该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskDetails <p>该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskDetails(RiskDetails [] RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get <p>该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p> 
     * @return Extra <p>该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
     * @param Extra <p>该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。</p> 
     * @return DataId <p>该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。</p>
     * @param DataId <p>该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。</p> 
     * @return ContextText <p>历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。</p>
     */
    public String getContextText() {
        return this.ContextText;
    }

    /**
     * Set <p>历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。</p>
     * @param ContextText <p>历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。</p>
     */
    public void setContextText(String ContextText) {
        this.ContextText = ContextText;
    }

    /**
     * Get <p>该字段为历史结构字段，不再推荐使用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SentimentAnalysis <p>该字段为历史结构字段，不再推荐使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentimentAnalysis getSentimentAnalysis() {
        return this.SentimentAnalysis;
    }

    /**
     * Set <p>该字段为历史结构字段，不再推荐使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SentimentAnalysis <p>该字段为历史结构字段，不再推荐使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSentimentAnalysis(SentimentAnalysis SentimentAnalysis) {
        this.SentimentAnalysis = SentimentAnalysis;
    }

    /**
     * Get <p>该字段为历史结构字段，不再推荐使用。</p> 
     * @return HitType <p>该字段为历史结构字段，不再推荐使用。</p>
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set <p>该字段为历史结构字段，不再推荐使用。</p>
     * @param HitType <p>该字段为历史结构字段，不再推荐使用。</p>
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
    }

    /**
     * Get <p>该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。</p> 
     * @return SessionId <p>该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。</p>
     * @param SessionId <p>该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>该字段用于标记导致本次审核命中标签的原文内容位置信息</p> 
     * @return HitSnippetInfos <p>该字段用于标记导致本次审核命中标签的原文内容位置信息</p>
     */
    public HitSnippetInfo [] getHitSnippetInfos() {
        return this.HitSnippetInfos;
    }

    /**
     * Set <p>该字段用于标记导致本次审核命中标签的原文内容位置信息</p>
     * @param HitSnippetInfos <p>该字段用于标记导致本次审核命中标签的原文内容位置信息</p>
     */
    public void setHitSnippetInfos(HitSnippetInfo [] HitSnippetInfos) {
        this.HitSnippetInfos = HitSnippetInfos;
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

    public TextModerationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextModerationResponse(TextModerationResponse source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.DetailResults != null) {
            this.DetailResults = new DetailResults[source.DetailResults.length];
            for (int i = 0; i < source.DetailResults.length; i++) {
                this.DetailResults[i] = new DetailResults(source.DetailResults[i]);
            }
        }
        if (source.RiskDetails != null) {
            this.RiskDetails = new RiskDetails[source.RiskDetails.length];
            for (int i = 0; i < source.RiskDetails.length; i++) {
                this.RiskDetails[i] = new RiskDetails(source.RiskDetails[i]);
            }
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.ContextText != null) {
            this.ContextText = new String(source.ContextText);
        }
        if (source.SentimentAnalysis != null) {
            this.SentimentAnalysis = new SentimentAnalysis(source.SentimentAnalysis);
        }
        if (source.HitType != null) {
            this.HitType = new String(source.HitType);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.HitSnippetInfos != null) {
            this.HitSnippetInfos = new HitSnippetInfo[source.HitSnippetInfos.length];
            for (int i = 0; i < source.HitSnippetInfos.length; i++) {
                this.HitSnippetInfos[i] = new HitSnippetInfo(source.HitSnippetInfos[i]);
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArrayObj(map, prefix + "DetailResults.", this.DetailResults);
        this.setParamArrayObj(map, prefix + "RiskDetails.", this.RiskDetails);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "ContextText", this.ContextText);
        this.setParamObj(map, prefix + "SentimentAnalysis.", this.SentimentAnalysis);
        this.setParamSimple(map, prefix + "HitType", this.HitType);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "HitSnippetInfos.", this.HitSnippetInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

