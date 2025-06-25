/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamObj(map, prefix + "DocAndAnswer.", this.DocAndAnswer);
        this.setParamObj(map, prefix + "Tag.", this.Tag);

    }
}

