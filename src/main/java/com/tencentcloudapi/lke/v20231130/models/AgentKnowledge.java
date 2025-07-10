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

public class AgentKnowledge extends AbstractModel {

    /**
    * 知识库id
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * 0-应用内知识库
1-共享知识库
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
    * 0-全部知识
1-按文档和问答
2-按标签
    */
    @SerializedName("Filter")
    @Expose
    private Long Filter;

    /**
    * 文档id
    */
    @SerializedName("DocBizIds")
    @Expose
    private String [] DocBizIds;

    /**
    * true:包含所有问答
false:不包含问答
    */
    @SerializedName("AllQa")
    @Expose
    private Boolean AllQa;

    /**
    * 文档标签过滤器
    */
    @SerializedName("Tag")
    @Expose
    private AgentKnowledgeFilterTag Tag;

    /**
     * Get 知识库id 
     * @return KnowledgeBizId 知识库id
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 知识库id
     * @param KnowledgeBizId 知识库id
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 0-应用内知识库
1-共享知识库 
     * @return KnowledgeType 0-应用内知识库
1-共享知识库
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set 0-应用内知识库
1-共享知识库
     * @param KnowledgeType 0-应用内知识库
1-共享知识库
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    /**
     * Get 0-全部知识
1-按文档和问答
2-按标签 
     * @return Filter 0-全部知识
1-按文档和问答
2-按标签
     */
    public Long getFilter() {
        return this.Filter;
    }

    /**
     * Set 0-全部知识
1-按文档和问答
2-按标签
     * @param Filter 0-全部知识
1-按文档和问答
2-按标签
     */
    public void setFilter(Long Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 文档id 
     * @return DocBizIds 文档id
     */
    public String [] getDocBizIds() {
        return this.DocBizIds;
    }

    /**
     * Set 文档id
     * @param DocBizIds 文档id
     */
    public void setDocBizIds(String [] DocBizIds) {
        this.DocBizIds = DocBizIds;
    }

    /**
     * Get true:包含所有问答
false:不包含问答 
     * @return AllQa true:包含所有问答
false:不包含问答
     */
    public Boolean getAllQa() {
        return this.AllQa;
    }

    /**
     * Set true:包含所有问答
false:不包含问答
     * @param AllQa true:包含所有问答
false:不包含问答
     */
    public void setAllQa(Boolean AllQa) {
        this.AllQa = AllQa;
    }

    /**
     * Get 文档标签过滤器 
     * @return Tag 文档标签过滤器
     */
    public AgentKnowledgeFilterTag getTag() {
        return this.Tag;
    }

    /**
     * Set 文档标签过滤器
     * @param Tag 文档标签过滤器
     */
    public void setTag(AgentKnowledgeFilterTag Tag) {
        this.Tag = Tag;
    }

    public AgentKnowledge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentKnowledge(AgentKnowledge source) {
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
        if (source.Filter != null) {
            this.Filter = new Long(source.Filter);
        }
        if (source.DocBizIds != null) {
            this.DocBizIds = new String[source.DocBizIds.length];
            for (int i = 0; i < source.DocBizIds.length; i++) {
                this.DocBizIds[i] = new String(source.DocBizIds[i]);
            }
        }
        if (source.AllQa != null) {
            this.AllQa = new Boolean(source.AllQa);
        }
        if (source.Tag != null) {
            this.Tag = new AgentKnowledgeFilterTag(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamArraySimple(map, prefix + "DocBizIds.", this.DocBizIds);
        this.setParamSimple(map, prefix + "AllQa", this.AllQa);
        this.setParamObj(map, prefix + "Tag.", this.Tag);

    }
}

