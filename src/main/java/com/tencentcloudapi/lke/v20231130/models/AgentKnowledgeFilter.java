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

public class AgentKnowledgeFilter extends AbstractModel {

    /**
    * 知识检索筛选方式; 0: 全部知识; 1:按文档和问答; 2: 按标签
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * 文档和问答过滤器
    */
    @SerializedName("DocAndAnswer")
    @Expose
    private AgentKnowledgeFilterDocAndAnswer DocAndAnswer;

    /**
    * 标签过滤器
    */
    @SerializedName("Tag")
    @Expose
    private AgentKnowledgeFilterTag Tag;

    /**
    * 知识库列表
    */
    @SerializedName("KnowledgeList")
    @Expose
    private AgentKnowledge [] KnowledgeList;

    /**
    * 是否检索全部知识
    */
    @SerializedName("AllKnowledge")
    @Expose
    private Boolean AllKnowledge;

    /**
     * Get 知识检索筛选方式; 0: 全部知识; 1:按文档和问答; 2: 按标签 
     * @return FilterType 知识检索筛选方式; 0: 全部知识; 1:按文档和问答; 2: 按标签
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 知识检索筛选方式; 0: 全部知识; 1:按文档和问答; 2: 按标签
     * @param FilterType 知识检索筛选方式; 0: 全部知识; 1:按文档和问答; 2: 按标签
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get 文档和问答过滤器 
     * @return DocAndAnswer 文档和问答过滤器
     */
    public AgentKnowledgeFilterDocAndAnswer getDocAndAnswer() {
        return this.DocAndAnswer;
    }

    /**
     * Set 文档和问答过滤器
     * @param DocAndAnswer 文档和问答过滤器
     */
    public void setDocAndAnswer(AgentKnowledgeFilterDocAndAnswer DocAndAnswer) {
        this.DocAndAnswer = DocAndAnswer;
    }

    /**
     * Get 标签过滤器 
     * @return Tag 标签过滤器
     */
    public AgentKnowledgeFilterTag getTag() {
        return this.Tag;
    }

    /**
     * Set 标签过滤器
     * @param Tag 标签过滤器
     */
    public void setTag(AgentKnowledgeFilterTag Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 知识库列表 
     * @return KnowledgeList 知识库列表
     */
    public AgentKnowledge [] getKnowledgeList() {
        return this.KnowledgeList;
    }

    /**
     * Set 知识库列表
     * @param KnowledgeList 知识库列表
     */
    public void setKnowledgeList(AgentKnowledge [] KnowledgeList) {
        this.KnowledgeList = KnowledgeList;
    }

    /**
     * Get 是否检索全部知识 
     * @return AllKnowledge 是否检索全部知识
     */
    public Boolean getAllKnowledge() {
        return this.AllKnowledge;
    }

    /**
     * Set 是否检索全部知识
     * @param AllKnowledge 是否检索全部知识
     */
    public void setAllKnowledge(Boolean AllKnowledge) {
        this.AllKnowledge = AllKnowledge;
    }

    public AgentKnowledgeFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentKnowledgeFilter(AgentKnowledgeFilter source) {
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.DocAndAnswer != null) {
            this.DocAndAnswer = new AgentKnowledgeFilterDocAndAnswer(source.DocAndAnswer);
        }
        if (source.Tag != null) {
            this.Tag = new AgentKnowledgeFilterTag(source.Tag);
        }
        if (source.KnowledgeList != null) {
            this.KnowledgeList = new AgentKnowledge[source.KnowledgeList.length];
            for (int i = 0; i < source.KnowledgeList.length; i++) {
                this.KnowledgeList[i] = new AgentKnowledge(source.KnowledgeList[i]);
            }
        }
        if (source.AllKnowledge != null) {
            this.AllKnowledge = new Boolean(source.AllKnowledge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamObj(map, prefix + "DocAndAnswer.", this.DocAndAnswer);
        this.setParamObj(map, prefix + "Tag.", this.Tag);
        this.setParamArrayObj(map, prefix + "KnowledgeList.", this.KnowledgeList);
        this.setParamSimple(map, prefix + "AllKnowledge", this.AllKnowledge);

    }
}

