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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationResponse extends AbstractModel{

    /**
    * 该字段用于返回请求参数中的BizType参数
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：*加我微信*）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容；*色情 0*，则表明该文本不属于色情内容
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段用于返回基于文本风险库审核的详细结果，返回值信息可参阅对应数据结构（DetailResults）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailResults")
    @Expose
    private DetailResults [] DetailResults;

    /**
    * 该字段用于返回文本检测中存在违规风险的账号检测结果，主要包括违规风险类别和风险等级信息，具体内容可参阅对应数据结构（RiskDetails）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskDetails")
    @Expose
    private RiskDetails [] RiskDetails;

    /**
    * 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 该字段用于返回当前标签（Label）下的二级标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该字段用于返回请求参数中的BizType参数 
     * @return BizType 该字段用于返回请求参数中的BizType参数
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于返回请求参数中的BizType参数
     * @param BizType 该字段用于返回请求参数中的BizType参数
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型 
     * @return Label 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型
     * @param Label 该字段用于返回检测结果（DetailResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过 
     * @return Suggestion 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     * @param Suggestion 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：*加我微信*）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：*加我微信*）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：*加我微信*）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：*加我微信*）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容；*色情 0*，则表明该文本不属于色情内容 
     * @return Score 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容；*色情 0*，则表明该文本不属于色情内容
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容；*色情 0*，则表明该文本不属于色情内容
     * @param Score 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容；*色情 0*，则表明该文本不属于色情内容
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段用于返回基于文本风险库审核的详细结果，返回值信息可参阅对应数据结构（DetailResults）的详细描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailResults 该字段用于返回基于文本风险库审核的详细结果，返回值信息可参阅对应数据结构（DetailResults）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailResults [] getDetailResults() {
        return this.DetailResults;
    }

    /**
     * Set 该字段用于返回基于文本风险库审核的详细结果，返回值信息可参阅对应数据结构（DetailResults）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailResults 该字段用于返回基于文本风险库审核的详细结果，返回值信息可参阅对应数据结构（DetailResults）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailResults(DetailResults [] DetailResults) {
        this.DetailResults = DetailResults;
    }

    /**
     * Get 该字段用于返回文本检测中存在违规风险的账号检测结果，主要包括违规风险类别和风险等级信息，具体内容可参阅对应数据结构（RiskDetails）的详细描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskDetails 该字段用于返回文本检测中存在违规风险的账号检测结果，主要包括违规风险类别和风险等级信息，具体内容可参阅对应数据结构（RiskDetails）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetails [] getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set 该字段用于返回文本检测中存在违规风险的账号检测结果，主要包括违规风险类别和风险等级信息，具体内容可参阅对应数据结构（RiskDetails）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskDetails 该字段用于返回文本检测中存在违规风险的账号检测结果，主要包括违规风险类别和风险等级信息，具体内容可参阅对应数据结构（RiskDetails）的详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskDetails(RiskDetails [] RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataId 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataId 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 该字段用于返回当前标签（Label）下的二级标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubLabel 该字段用于返回当前标签（Label）下的二级标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回当前标签（Label）下的二级标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubLabel 该字段用于返回当前标签（Label）下的二级标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
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
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
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
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "DetailResults.", this.DetailResults);
        this.setParamArrayObj(map, prefix + "RiskDetails.", this.RiskDetails);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

