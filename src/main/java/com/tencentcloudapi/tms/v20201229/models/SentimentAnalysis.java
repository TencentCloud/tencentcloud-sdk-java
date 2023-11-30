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

public class SentimentAnalysis extends AbstractModel {

    /**
    * 情感标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 标签分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 情感分析明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private SentimentDetail Detail;

    /**
    * 响应码，成功为"OK"，失败为"InternalError"
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 情感标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 情感标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 情感标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 情感标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 标签分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 标签分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 标签分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 标签分数，取值范围0到100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 情感分析明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 情感分析明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentimentDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set 情感分析明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 情感分析明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(SentimentDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 响应码，成功为"OK"，失败为"InternalError" 
     * @return Code 响应码，成功为"OK"，失败为"InternalError"
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 响应码，成功为"OK"，失败为"InternalError"
     * @param Code 响应码，成功为"OK"，失败为"InternalError"
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SentimentAnalysis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentimentAnalysis(SentimentAnalysis source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Detail != null) {
            this.Detail = new SentimentDetail(source.Detail);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

