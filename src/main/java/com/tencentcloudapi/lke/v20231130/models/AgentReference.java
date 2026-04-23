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

public class AgentReference extends AbstractModel {

    /**
    * <p>来源文档ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>文档业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * <p>文档名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * <p>问答业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * <p>搜索引擎索引</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>知识库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * <p>知识库标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
     * Get <p>来源文档ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocId <p>来源文档ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>来源文档ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocId <p>来源文档ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url <p>链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url <p>链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>文档业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocBizId <p>文档业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set <p>文档业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocBizId <p>文档业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get <p>文档名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocName <p>文档名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set <p>文档名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocName <p>文档名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get <p>问答业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaBizId <p>问答业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set <p>问答业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaBizId <p>问答业务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get <p>搜索引擎索引</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index <p>搜索引擎索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>搜索引擎索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index <p>搜索引擎索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>知识库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeName <p>知识库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set <p>知识库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeName <p>知识库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get <p>知识库标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeBizId <p>知识库标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set <p>知识库标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeBizId <p>知识库标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    public AgentReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentReference(AgentReference source) {
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);

    }
}

