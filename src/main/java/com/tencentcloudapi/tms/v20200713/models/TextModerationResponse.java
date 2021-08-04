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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationResponse extends AbstractModel{

    /**
    * 您在入参时所填入的Biztype参数
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 数据是否属于恶意类型，0：正常 1：可疑
    */
    @SerializedName("EvilFlag")
    @Expose
    private Long EvilFlag;

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库，以及令人反感、不安全或不适宜的内容类型
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 建议您拿到判断结果后的执行操作
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 文本命中的关键词信息，用于提示您文本违规的具体原因，可能会返回多个命中的关键词。（如：加我微信）
如返回值为空，Score不为空，即识别结果（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 接口识别样本后返回的详细结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailResults")
    @Expose
    private DetailResults [] DetailResults;

    /**
    * 接口识别样本中存在违规账号风险的检测结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskDetails")
    @Expose
    private RiskDetails [] RiskDetails;

    /**
    * 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 请求参数中的DataId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 您在入参时所填入的Biztype参数 
     * @return BizType 您在入参时所填入的Biztype参数
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 您在入参时所填入的Biztype参数
     * @param BizType 您在入参时所填入的Biztype参数
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 数据是否属于恶意类型，0：正常 1：可疑 
     * @return EvilFlag 数据是否属于恶意类型，0：正常 1：可疑
     */
    public Long getEvilFlag() {
        return this.EvilFlag;
    }

    /**
     * Set 数据是否属于恶意类型，0：正常 1：可疑
     * @param EvilFlag 数据是否属于恶意类型，0：正常 1：可疑
     */
    public void setEvilFlag(Long EvilFlag) {
        this.EvilFlag = EvilFlag;
    }

    /**
     * Get 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库，以及令人反感、不安全或不适宜的内容类型 
     * @return Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库，以及令人反感、不安全或不适宜的内容类型
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库，以及令人反感、不安全或不适宜的内容类型
     * @param Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库，以及令人反感、不安全或不适宜的内容类型
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 建议您拿到判断结果后的执行操作
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过 
     * @return Suggestion 建议您拿到判断结果后的执行操作
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议您拿到判断结果后的执行操作
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     * @param Suggestion 建议您拿到判断结果后的执行操作
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 文本命中的关键词信息，用于提示您文本违规的具体原因，可能会返回多个命中的关键词。（如：加我微信）
如返回值为空，Score不为空，即识别结果（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords 文本命中的关键词信息，用于提示您文本违规的具体原因，可能会返回多个命中的关键词。（如：加我微信）
如返回值为空，Score不为空，即识别结果（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 文本命中的关键词信息，用于提示您文本违规的具体原因，可能会返回多个命中的关键词。（如：加我微信）
如返回值为空，Score不为空，即识别结果（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords 文本命中的关键词信息，用于提示您文本违规的具体原因，可能会返回多个命中的关键词。（如：加我微信）
如返回值为空，Score不为空，即识别结果（Label）是来自于语义模型判断的返回值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。） 
     * @return Score 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
     * @param Score 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 接口识别样本后返回的详细结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailResults 接口识别样本后返回的详细结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailResults [] getDetailResults() {
        return this.DetailResults;
    }

    /**
     * Set 接口识别样本后返回的详细结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailResults 接口识别样本后返回的详细结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailResults(DetailResults [] DetailResults) {
        this.DetailResults = DetailResults;
    }

    /**
     * Get 接口识别样本中存在违规账号风险的检测结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskDetails 接口识别样本中存在违规账号风险的检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetails [] getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set 接口识别样本中存在违规账号风险的检测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskDetails 接口识别样本中存在违规账号风险的检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskDetails(RiskDetails [] RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 请求参数中的DataId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataId 请求参数中的DataId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 请求参数中的DataId
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataId 请求参数中的DataId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
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
        if (source.EvilFlag != null) {
            this.EvilFlag = new Long(source.EvilFlag);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "EvilFlag", this.EvilFlag);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "DetailResults.", this.DetailResults);
        this.setParamArrayObj(map, prefix + "RiskDetails.", this.RiskDetails);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

