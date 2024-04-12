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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferDetail extends AbstractModel {

    /**
    * 引用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferBizId")
    @Expose
    private String ReferBizId;

    /**
    * 文档类型 (1 QA, 2 文档段)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocType")
    @Expose
    private Long DocType;

    /**
    * 文档名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * 分片内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

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
    * 置信度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mark")
    @Expose
    private Long Mark;

    /**
    * 分片高亮内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Highlights")
    @Expose
    private Highlight [] Highlights;

    /**
    * 原始内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgData")
    @Expose
    private String OrgData;

    /**
     * Get 引用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferBizId 引用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReferBizId() {
        return this.ReferBizId;
    }

    /**
     * Set 引用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferBizId 引用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferBizId(String ReferBizId) {
        this.ReferBizId = ReferBizId;
    }

    /**
     * Get 文档类型 (1 QA, 2 文档段)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocType 文档类型 (1 QA, 2 文档段)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDocType() {
        return this.DocType;
    }

    /**
     * Set 文档类型 (1 QA, 2 文档段)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocType 文档类型 (1 QA, 2 文档段)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocType(Long DocType) {
        this.DocType = DocType;
    }

    /**
     * Get 文档名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocName 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocName 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get 分片内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageContent 分片内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set 分片内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageContent 分片内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
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
     * Get 置信度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 置信度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 置信度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mark 标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMark() {
        return this.Mark;
    }

    /**
     * Set 标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mark 标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMark(Long Mark) {
        this.Mark = Mark;
    }

    /**
     * Get 分片高亮内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Highlights 分片高亮内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Highlight [] getHighlights() {
        return this.Highlights;
    }

    /**
     * Set 分片高亮内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Highlights 分片高亮内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighlights(Highlight [] Highlights) {
        this.Highlights = Highlights;
    }

    /**
     * Get 原始内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgData 原始内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgData() {
        return this.OrgData;
    }

    /**
     * Set 原始内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgData 原始内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgData(String OrgData) {
        this.OrgData = OrgData;
    }

    public ReferDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferDetail(ReferDetail source) {
        if (source.ReferBizId != null) {
            this.ReferBizId = new String(source.ReferBizId);
        }
        if (source.DocType != null) {
            this.DocType = new Long(source.DocType);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Mark != null) {
            this.Mark = new Long(source.Mark);
        }
        if (source.Highlights != null) {
            this.Highlights = new Highlight[source.Highlights.length];
            for (int i = 0; i < source.Highlights.length; i++) {
                this.Highlights[i] = new Highlight(source.Highlights[i]);
            }
        }
        if (source.OrgData != null) {
            this.OrgData = new String(source.OrgData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReferBizId", this.ReferBizId);
        this.setParamSimple(map, prefix + "DocType", this.DocType);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamArrayObj(map, prefix + "Highlights.", this.Highlights);
        this.setParamSimple(map, prefix + "OrgData", this.OrgData);

    }
}

