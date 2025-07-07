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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimilarQuestion extends AbstractModel {

    /**
    * 相似问ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimBizId")
    @Expose
    private String SimBizId;

    /**
    * 相似问内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 相似问审核状态，1审核失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
     * Get 相似问ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimBizId 相似问ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSimBizId() {
        return this.SimBizId;
    }

    /**
     * Set 相似问ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimBizId 相似问ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimBizId(String SimBizId) {
        this.SimBizId = SimBizId;
    }

    /**
     * Get 相似问内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question 相似问内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 相似问内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Question 相似问内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 相似问审核状态，1审核失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditStatus 相似问审核状态，1审核失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 相似问审核状态，1审核失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditStatus 相似问审核状态，1审核失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    public SimilarQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimilarQuestion(SimilarQuestion source) {
        if (source.SimBizId != null) {
            this.SimBizId = new String(source.SimBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SimBizId", this.SimBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);

    }
}

