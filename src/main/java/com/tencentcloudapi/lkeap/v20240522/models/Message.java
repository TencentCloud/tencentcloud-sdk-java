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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel {

    /**
    * 角色
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 思维链内容。
ReasoningConent参数仅支持出参，且只有deepseek-r1模型会返回。
    */
    @SerializedName("ReasoningContent")
    @Expose
    private String ReasoningContent;

    /**
    * 搜索结果
    */
    @SerializedName("SearchResults")
    @Expose
    private SearchResult [] SearchResults;

    /**
     * Get 角色 
     * @return Role 角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色
     * @param Role 角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 内容 
     * @return Content 内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
     * @param Content 内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 思维链内容。
ReasoningConent参数仅支持出参，且只有deepseek-r1模型会返回。 
     * @return ReasoningContent 思维链内容。
ReasoningConent参数仅支持出参，且只有deepseek-r1模型会返回。
     */
    public String getReasoningContent() {
        return this.ReasoningContent;
    }

    /**
     * Set 思维链内容。
ReasoningConent参数仅支持出参，且只有deepseek-r1模型会返回。
     * @param ReasoningContent 思维链内容。
ReasoningConent参数仅支持出参，且只有deepseek-r1模型会返回。
     */
    public void setReasoningContent(String ReasoningContent) {
        this.ReasoningContent = ReasoningContent;
    }

    /**
     * Get 搜索结果 
     * @return SearchResults 搜索结果
     */
    public SearchResult [] getSearchResults() {
        return this.SearchResults;
    }

    /**
     * Set 搜索结果
     * @param SearchResults 搜索结果
     */
    public void setSearchResults(SearchResult [] SearchResults) {
        this.SearchResults = SearchResults;
    }

    public Message() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Message(Message source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ReasoningContent != null) {
            this.ReasoningContent = new String(source.ReasoningContent);
        }
        if (source.SearchResults != null) {
            this.SearchResults = new SearchResult[source.SearchResults.length];
            for (int i = 0; i < source.SearchResults.length; i++) {
                this.SearchResults[i] = new SearchResult(source.SearchResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ReasoningContent", this.ReasoningContent);
        this.setParamArrayObj(map, prefix + "SearchResults.", this.SearchResults);

    }
}

