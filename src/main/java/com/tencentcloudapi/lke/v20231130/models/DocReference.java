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

public class DocReference extends AbstractModel {

    /**
    * 文档业务ID
    */
    @SerializedName("DocBizId")
    @Expose
    private Long DocBizId;

    /**
    * 文档片段参考ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferBizId")
    @Expose
    private Long ReferBizId;

    /**
    * 文档名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * 文档所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private Long KnowledgeBizId;

    /**
    * 文档所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * 文档访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 文档业务ID 
     * @return DocBizId 文档业务ID
     */
    public Long getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档业务ID
     * @param DocBizId 文档业务ID
     */
    public void setDocBizId(Long DocBizId) {
        this.DocBizId = DocBizId;
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
     * Get 文档所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeBizId 文档所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 文档所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeBizId 文档所在知识库业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeBizId(Long KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 文档所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeName 文档所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 文档所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeName 文档所在知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get 文档访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 文档访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文档访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 文档访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DocReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocReference(DocReference source) {
        if (source.DocBizId != null) {
            this.DocBizId = new Long(source.DocBizId);
        }
        if (source.ReferBizId != null) {
            this.ReferBizId = new Long(source.ReferBizId);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new Long(source.KnowledgeBizId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "ReferBizId", this.ReferBizId);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

