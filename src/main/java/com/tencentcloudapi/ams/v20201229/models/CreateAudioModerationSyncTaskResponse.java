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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAudioModerationSyncTaskResponse extends AbstractModel{

    /**
    * 请求接口时传入的数据标识
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrText")
    @Expose
    private String AsrText;

    /**
    * 音频中对话内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextResults")
    @Expose
    private TextResult [] TextResults;

    /**
    * 音频中低俗内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MoanResults")
    @Expose
    private MoanResult [] MoanResults;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求接口时传入的数据标识 
     * @return DataId 请求接口时传入的数据标识
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 请求接口时传入的数据标识
     * @param DataId 请求接口时传入的数据标识
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。 
     * @return BizType Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
     * @param BizType Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrText 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrText() {
        return this.AsrText;
    }

    /**
     * Set 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrText 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrText(String AsrText) {
        this.AsrText = AsrText;
    }

    /**
     * Get 音频中对话内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextResults 音频中对话内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextResult [] getTextResults() {
        return this.TextResults;
    }

    /**
     * Set 音频中对话内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextResults 音频中对话内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextResults(TextResult [] TextResults) {
        this.TextResults = TextResults;
    }

    /**
     * Get 音频中低俗内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MoanResults 音频中低俗内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MoanResult [] getMoanResults() {
        return this.MoanResults;
    }

    /**
     * Set 音频中低俗内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
     * @param MoanResults 音频中低俗内容审核结果；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMoanResults(MoanResult [] MoanResults) {
        this.MoanResults = MoanResults;
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

    public CreateAudioModerationSyncTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAudioModerationSyncTaskResponse(CreateAudioModerationSyncTaskResponse source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.AsrText != null) {
            this.AsrText = new String(source.AsrText);
        }
        if (source.TextResults != null) {
            this.TextResults = new TextResult[source.TextResults.length];
            for (int i = 0; i < source.TextResults.length; i++) {
                this.TextResults[i] = new TextResult(source.TextResults[i]);
            }
        }
        if (source.MoanResults != null) {
            this.MoanResults = new MoanResult[source.MoanResults.length];
            for (int i = 0; i < source.MoanResults.length; i++) {
                this.MoanResults[i] = new MoanResult(source.MoanResults[i]);
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
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "AsrText", this.AsrText);
        this.setParamArrayObj(map, prefix + "TextResults.", this.TextResults);
        this.setParamArrayObj(map, prefix + "MoanResults.", this.MoanResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

