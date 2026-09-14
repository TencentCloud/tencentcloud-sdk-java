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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyQARequest extends AbstractModel {

    /**
    * <p>修改字段内容（与 update_mask 配合使用）</p>
    */
    @SerializedName("Fields")
    @Expose
    private QAModifyFields Fields;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>QA ID</p>
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * <p>字段掩码：指定要修改的字段（支持的 Paths：Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted）</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>修改字段内容（与 update_mask 配合使用）</p> 
     * @return Fields <p>修改字段内容（与 update_mask 配合使用）</p>
     */
    public QAModifyFields getFields() {
        return this.Fields;
    }

    /**
     * Set <p>修改字段内容（与 update_mask 配合使用）</p>
     * @param Fields <p>修改字段内容（与 update_mask 配合使用）</p>
     */
    public void setFields(QAModifyFields Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>QA ID</p> 
     * @return QaId <p>QA ID</p>
     */
    public String getQaId() {
        return this.QaId;
    }

    /**
     * Set <p>QA ID</p>
     * @param QaId <p>QA ID</p>
     */
    public void setQaId(String QaId) {
        this.QaId = QaId;
    }

    /**
     * Get <p>字段掩码：指定要修改的字段（支持的 Paths：Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted）</p> 
     * @return UpdateMask <p>字段掩码：指定要修改的字段（支持的 Paths：Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted）</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>字段掩码：指定要修改的字段（支持的 Paths：Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted）</p>
     * @param UpdateMask <p>字段掩码：指定要修改的字段（支持的 Paths：Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted）</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQARequest(ModifyQARequest source) {
        if (source.Fields != null) {
            this.Fields = new QAModifyFields(source.Fields);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

