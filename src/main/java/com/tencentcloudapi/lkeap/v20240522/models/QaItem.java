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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QaItem extends AbstractModel {

    /**
    * 问答id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * 问题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 答案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 属性标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeLabels")
    @Expose
    private AttributeLabelReferItem [] AttributeLabels;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 问答id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaId 问答id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQaId() {
        return this.QaId;
    }

    /**
     * Set 问答id
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaId 问答id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaId(String QaId) {
        this.QaId = QaId;
    }

    /**
     * Get 问题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question 问题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Question 问题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 答案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Answer 答案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Answer 答案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 属性标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttributeLabels 属性标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttributeLabelReferItem [] getAttributeLabels() {
        return this.AttributeLabels;
    }

    /**
     * Set 属性标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttributeLabels 属性标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributeLabels(AttributeLabelReferItem [] AttributeLabels) {
        this.AttributeLabels = AttributeLabels;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public QaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QaItem(QaItem source) {
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.AttributeLabels != null) {
            this.AttributeLabels = new AttributeLabelReferItem[source.AttributeLabels.length];
            for (int i = 0; i < source.AttributeLabels.length; i++) {
                this.AttributeLabels[i] = new AttributeLabelReferItem(source.AttributeLabels[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamArrayObj(map, prefix + "AttributeLabels.", this.AttributeLabels);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

