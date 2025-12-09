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
    * 该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 用于标识对本次请求的处置建议，共三种返回值。
返回值：**Block**: 建议直接做违规处置，**Review**: 建议人工二次确认，**Pass**: 未识别到风险。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailResults")
    @Expose
    private DetailResults [] DetailResults;

    /**
    * 该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskDetails")
    @Expose
    private RiskDetails [] RiskDetails;

    /**
    * 该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。
备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。
    */
    @SerializedName("ContextText")
    @Expose
    private String ContextText;

    /**
    * 该字段为历史结构字段，不再推荐使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SentimentAnalysis")
    @Expose
    private SentimentAnalysis SentimentAnalysis;

    /**
    * 该字段为历史结构字段，不再推荐使用。
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
    * 该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。 
     * @return BizType 该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。
     * @param BizType 该字段用于回显检测对象请求参数中的 BizType，与输入的 BizType 值对应。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 用于标识对本次请求的处置建议，共三种返回值。
返回值：**Block**: 建议直接做违规处置，**Review**: 建议人工二次确认，**Pass**: 未识别到风险。 
     * @return Suggestion 用于标识对本次请求的处置建议，共三种返回值。
返回值：**Block**: 建议直接做违规处置，**Review**: 建议人工二次确认，**Pass**: 未识别到风险。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 用于标识对本次请求的处置建议，共三种返回值。
返回值：**Block**: 建议直接做违规处置，**Review**: 建议人工二次确认，**Pass**: 未识别到风险。
     * @param Suggestion 用于标识对本次请求的处置建议，共三种返回值。
返回值：**Block**: 建议直接做违规处置，**Review**: 建议人工二次确认，**Pass**: 未识别到风险。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型 
     * @return Label 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型
     * @param Label 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。 
     * @return SubLabel 对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。
     * @param SubLabel 对应 Label 字段下的二级子标签，表示该 Label 下更细分的违规点。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。 
     * @return Score 该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。
     * @param Score 该字段标识 SubLabel 的置信度，取值范围为 0 - 100，值越高代表置信度越高。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords 该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords 该字段标识被检测文本所命中的关键词，可能返回0个或多个关键词。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailResults 该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailResults [] getDetailResults() {
        return this.DetailResults;
    }

    /**
     * Set 该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailResults 该字段返回的检测的详细信息，返回值信息可参阅对应数据结构 DetailResults 的详细描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailResults(DetailResults [] DetailResults) {
        this.DetailResults = DetailResults;
    }

    /**
     * Get 该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskDetails 该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetails [] getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set 该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskDetails 该字段标识入参 User 的检测结果，具体内容参阅数据结构 RiskDetails。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskDetails(RiskDetails [] RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get 该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。
备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。 
     * @return Extra 该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。
备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。
备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
     * @param Extra 该字段用于返回根据您的需求配置的附加信息（Extra），如未配置则默认返回值为空。
备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。 
     * @return DataId 该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。
     * @param DataId 该字段用于回显检测对象请求参数中的 DataId，与输入的 DataId 值对应。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。 
     * @return ContextText 历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。
     */
    public String getContextText() {
        return this.ContextText;
    }

    /**
     * Set 历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。
     * @param ContextText 历史上下文关联的字段，不再推荐使用。上下文关联审核可通过入参的 SessionId 来实现。
     */
    public void setContextText(String ContextText) {
        this.ContextText = ContextText;
    }

    /**
     * Get 该字段为历史结构字段，不再推荐使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SentimentAnalysis 该字段为历史结构字段，不再推荐使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentimentAnalysis getSentimentAnalysis() {
        return this.SentimentAnalysis;
    }

    /**
     * Set 该字段为历史结构字段，不再推荐使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SentimentAnalysis 该字段为历史结构字段，不再推荐使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSentimentAnalysis(SentimentAnalysis SentimentAnalysis) {
        this.SentimentAnalysis = SentimentAnalysis;
    }

    /**
     * Get 该字段为历史结构字段，不再推荐使用。 
     * @return HitType 该字段为历史结构字段，不再推荐使用。
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set 该字段为历史结构字段，不再推荐使用。
     * @param HitType 该字段为历史结构字段，不再推荐使用。
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
    }

    /**
     * Get 该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。 
     * @return SessionId 该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。
     * @param SessionId 该字段用于回显检测对象请求参数中的 SessionId，与输入的 SessionId 值对应。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

