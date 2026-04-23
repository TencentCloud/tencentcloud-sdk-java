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
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>链接</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>来源文档ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>知识库名称</p>
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * <p>知识库业务id</p>
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * <p>文档业务id</p>
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * <p>问答业务id</p>
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * <p>文档索引id</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>链接</p> 
     * @return Url <p>链接</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>链接</p>
     * @param Url <p>链接</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul> 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>1： 问答</li><li>2： 文档片段</li><li>4： 联网检索到的内容</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>来源文档ID</p> 
     * @return DocId <p>来源文档ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>来源文档ID</p>
     * @param DocId <p>来源文档ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>知识库名称</p> 
     * @return KnowledgeName <p>知识库名称</p>
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set <p>知识库名称</p>
     * @param KnowledgeName <p>知识库名称</p>
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get <p>知识库业务id</p> 
     * @return KnowledgeBizId <p>知识库业务id</p>
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set <p>知识库业务id</p>
     * @param KnowledgeBizId <p>知识库业务id</p>
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get <p>文档业务id</p> 
     * @return DocBizId <p>文档业务id</p>
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set <p>文档业务id</p>
     * @param DocBizId <p>文档业务id</p>
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get <p>问答业务id</p> 
     * @return QaBizId <p>问答业务id</p>
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set <p>问答业务id</p>
     * @param QaBizId <p>问答业务id</p>
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get <p>文档索引id</p> 
     * @return Index <p>文档索引id</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>文档索引id</p>
     * @param Index <p>文档索引id</p>
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

