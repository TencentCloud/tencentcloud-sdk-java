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

public class QaReference extends AbstractModel {

    /**
    * 问答业务ID
    */
    @SerializedName("QaBizId")
    @Expose
    private Long QaBizId;

    /**
    * 文档片段参考ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferBizId")
    @Expose
    private Long ReferBizId;

    /**
    * 问答所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private Long KnowledgeBizId;

    /**
    * 问答所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
     * Get 问答业务ID 
     * @return QaBizId 问答业务ID
     */
    public Long getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set 问答业务ID
     * @param QaBizId 问答业务ID
     */
    public void setQaBizId(Long QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get 文档片段参考ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferBizId 文档片段参考ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReferBizId() {
        return this.ReferBizId;
    }

    /**
     * Set 文档片段参考ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferBizId 文档片段参考ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferBizId(Long ReferBizId) {
        this.ReferBizId = ReferBizId;
    }

    /**
     * Get 问答所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeBizId 问答所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 问答所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeBizId 问答所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeBizId(Long KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 问答所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeName 问答所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 问答所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeName 问答所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    public QaReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QaReference(QaReference source) {
        if (source.QaBizId != null) {
            this.QaBizId = new Long(source.QaBizId);
        }
        if (source.ReferBizId != null) {
            this.ReferBizId = new Long(source.ReferBizId);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new Long(source.KnowledgeBizId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "ReferBizId", this.ReferBizId);
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);

    }
}

