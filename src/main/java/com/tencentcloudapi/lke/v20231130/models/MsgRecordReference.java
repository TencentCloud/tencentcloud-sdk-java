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

public class MsgRecordReference extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 来源文档ID
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * 知识库名称
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * 知识库业务id
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * 文档业务id
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 问答业务id
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * 文档索引id
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get id 
     * @return Id id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 链接 
     * @return Url 链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 链接
     * @param Url 链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 来源文档ID 
     * @return DocId 来源文档ID
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 来源文档ID
     * @param DocId 来源文档ID
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get 知识库名称 
     * @return KnowledgeName 知识库名称
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 知识库名称
     * @param KnowledgeName 知识库名称
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get 知识库业务id 
     * @return KnowledgeBizId 知识库业务id
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 知识库业务id
     * @param KnowledgeBizId 知识库业务id
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 文档业务id 
     * @return DocBizId 文档业务id
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档业务id
     * @param DocBizId 文档业务id
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 问答业务id 
     * @return QaBizId 问答业务id
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set 问答业务id
     * @param QaBizId 问答业务id
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get 文档索引id 
     * @return Index 文档索引id
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 文档索引id
     * @param Index 文档索引id
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public MsgRecordReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordReference(MsgRecordReference source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

