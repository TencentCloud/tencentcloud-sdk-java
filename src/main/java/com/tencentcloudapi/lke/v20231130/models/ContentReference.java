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

public class ContentReference extends AbstractModel {

    /**
    * 引用来源索引ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 参考来源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参考来源类型
1：问答
2：文档片段
4：联网检索到的内容
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 文档片段参考信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocRefer")
    @Expose
    private DocReference DocRefer;

    /**
    * 问答参考信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaRefer")
    @Expose
    private QaReference QaRefer;

    /**
    * 联网检索内容参考信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSearchRefer")
    @Expose
    private WebSearchReference WebSearchRefer;

    /**
     * Get 引用来源索引ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 引用来源索引ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 引用来源索引ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 引用来源索引ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 参考来源名称 
     * @return Name 参考来源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参考来源名称
     * @param Name 参考来源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参考来源类型
1：问答
2：文档片段
4：联网检索到的内容 
     * @return Type 参考来源类型
1：问答
2：文档片段
4：联网检索到的内容
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 参考来源类型
1：问答
2：文档片段
4：联网检索到的内容
     * @param Type 参考来源类型
1：问答
2：文档片段
4：联网检索到的内容
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 文档片段参考信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocRefer 文档片段参考信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocReference getDocRefer() {
        return this.DocRefer;
    }

    /**
     * Set 文档片段参考信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocRefer 文档片段参考信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocRefer(DocReference DocRefer) {
        this.DocRefer = DocRefer;
    }

    /**
     * Get 问答参考信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaRefer 问答参考信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QaReference getQaRefer() {
        return this.QaRefer;
    }

    /**
     * Set 问答参考信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaRefer 问答参考信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaRefer(QaReference QaRefer) {
        this.QaRefer = QaRefer;
    }

    /**
     * Get 联网检索内容参考信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSearchRefer 联网检索内容参考信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSearchReference getWebSearchRefer() {
        return this.WebSearchRefer;
    }

    /**
     * Set 联网检索内容参考信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSearchRefer 联网检索内容参考信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSearchRefer(WebSearchReference WebSearchRefer) {
        this.WebSearchRefer = WebSearchRefer;
    }

    public ContentReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReference(ContentReference source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DocRefer != null) {
            this.DocRefer = new DocReference(source.DocRefer);
        }
        if (source.QaRefer != null) {
            this.QaRefer = new QaReference(source.QaRefer);
        }
        if (source.WebSearchRefer != null) {
            this.WebSearchRefer = new WebSearchReference(source.WebSearchRefer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "DocRefer.", this.DocRefer);
        this.setParamObj(map, prefix + "QaRefer.", this.QaRefer);
        this.setParamObj(map, prefix + "WebSearchRefer.", this.WebSearchRefer);

    }
}

