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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModerateTextResponse extends AbstractModel {

    /**
    * 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 该字段用于返回请求参数中的BizType参数
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。
返回值：Block：建议屏蔽，Review ：建议人工复审，Pass：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 命中标签，可参阅对应数据结构（LabelGrade）的详细描述
    */
    @SerializedName("Label")
    @Expose
    private LabelGrade Label;

    /**
    * 命中标签对应腾讯侧定义的标签
    */
    @SerializedName("TcLabelCodes")
    @Expose
    private String [] TcLabelCodes;

    /**
    * 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：加我微信）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 该字段用于返回文本审核的详细结果，返回值信息可参阅对应数据结构（ModerationDetail）的详细描述
    */
    @SerializedName("ModerationDetails")
    @Expose
    private ModerationDetail [] ModerationDetails;

    /**
    * 该字段用于返回审核结果置信度，使用百分制。分数越高表示结果可信度越高。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应 
     * @return DataId 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
     * @param DataId 该字段用于返回检测对象对应请求参数中的DataId，与输入的DataId字段中的内容对应
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

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
     * Get 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。
返回值：Block：建议屏蔽，Review ：建议人工复审，Pass：建议通过 
     * @return Suggestion 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。
返回值：Block：建议屏蔽，Review ：建议人工复审，Pass：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。
返回值：Block：建议屏蔽，Review ：建议人工复审，Pass：建议通过
     * @param Suggestion 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。
返回值：Block：建议屏蔽，Review ：建议人工复审，Pass：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 命中标签，可参阅对应数据结构（LabelGrade）的详细描述 
     * @return Label 命中标签，可参阅对应数据结构（LabelGrade）的详细描述
     */
    public LabelGrade getLabel() {
        return this.Label;
    }

    /**
     * Set 命中标签，可参阅对应数据结构（LabelGrade）的详细描述
     * @param Label 命中标签，可参阅对应数据结构（LabelGrade）的详细描述
     */
    public void setLabel(LabelGrade Label) {
        this.Label = Label;
    }

    /**
     * Get 命中标签对应腾讯侧定义的标签 
     * @return TcLabelCodes 命中标签对应腾讯侧定义的标签
     */
    public String [] getTcLabelCodes() {
        return this.TcLabelCodes;
    }

    /**
     * Set 命中标签对应腾讯侧定义的标签
     * @param TcLabelCodes 命中标签对应腾讯侧定义的标签
     */
    public void setTcLabelCodes(String [] TcLabelCodes) {
        this.TcLabelCodes = TcLabelCodes;
    }

    /**
     * Get 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：加我微信）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值 
     * @return Keywords 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：加我微信）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：加我微信）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
     * @param Keywords 该字段用于返回当前标签（Label）下被检测文本命中的关键词信息，用于标注文本违规的具体原因（如：加我微信）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 该字段用于返回文本审核的详细结果，返回值信息可参阅对应数据结构（ModerationDetail）的详细描述 
     * @return ModerationDetails 该字段用于返回文本审核的详细结果，返回值信息可参阅对应数据结构（ModerationDetail）的详细描述
     */
    public ModerationDetail [] getModerationDetails() {
        return this.ModerationDetails;
    }

    /**
     * Set 该字段用于返回文本审核的详细结果，返回值信息可参阅对应数据结构（ModerationDetail）的详细描述
     * @param ModerationDetails 该字段用于返回文本审核的详细结果，返回值信息可参阅对应数据结构（ModerationDetail）的详细描述
     */
    public void setModerationDetails(ModerationDetail [] ModerationDetails) {
        this.ModerationDetails = ModerationDetails;
    }

    /**
     * Get 该字段用于返回审核结果置信度，使用百分制。分数越高表示结果可信度越高。 
     * @return Score 该字段用于返回审核结果置信度，使用百分制。分数越高表示结果可信度越高。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回审核结果置信度，使用百分制。分数越高表示结果可信度越高。
     * @param Score 该字段用于返回审核结果置信度，使用百分制。分数越高表示结果可信度越高。
     */
    public void setScore(Long Score) {
        this.Score = Score;
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

    public ModerateTextResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerateTextResponse(ModerateTextResponse source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new LabelGrade(source.Label);
        }
        if (source.TcLabelCodes != null) {
            this.TcLabelCodes = new String[source.TcLabelCodes.length];
            for (int i = 0; i < source.TcLabelCodes.length; i++) {
                this.TcLabelCodes[i] = new String(source.TcLabelCodes[i]);
            }
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.ModerationDetails != null) {
            this.ModerationDetails = new ModerationDetail[source.ModerationDetails.length];
            for (int i = 0; i < source.ModerationDetails.length; i++) {
                this.ModerationDetails[i] = new ModerationDetail(source.ModerationDetails[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamObj(map, prefix + "Label.", this.Label);
        this.setParamArraySimple(map, prefix + "TcLabelCodes.", this.TcLabelCodes);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArrayObj(map, prefix + "ModerationDetails.", this.ModerationDetails);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

