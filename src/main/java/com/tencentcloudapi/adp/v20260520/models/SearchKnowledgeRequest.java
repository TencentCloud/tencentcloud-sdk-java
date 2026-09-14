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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchKnowledgeRequest extends AbstractModel {

    /**
    * <p>检索高级配置</p>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private SearchAdvancedConfig AdvancedConfig;

    /**
    * <p>检索输入</p>
    */
    @SerializedName("Input")
    @Expose
    private SearchInput Input;

    /**
    * <p>检索上下文</p>
    */
    @SerializedName("Context")
    @Expose
    private SearchContext Context;

    /**
    * <p>计费信息</p>
    */
    @SerializedName("SearchBilling")
    @Expose
    private SearchBilling SearchBilling;

    /**
     * Get <p>检索高级配置</p> 
     * @return AdvancedConfig <p>检索高级配置</p>
     */
    public SearchAdvancedConfig getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>检索高级配置</p>
     * @param AdvancedConfig <p>检索高级配置</p>
     */
    public void setAdvancedConfig(SearchAdvancedConfig AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>检索输入</p> 
     * @return Input <p>检索输入</p>
     */
    public SearchInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>检索输入</p>
     * @param Input <p>检索输入</p>
     */
    public void setInput(SearchInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>检索上下文</p> 
     * @return Context <p>检索上下文</p>
     */
    public SearchContext getContext() {
        return this.Context;
    }

    /**
     * Set <p>检索上下文</p>
     * @param Context <p>检索上下文</p>
     */
    public void setContext(SearchContext Context) {
        this.Context = Context;
    }

    /**
     * Get <p>计费信息</p> 
     * @return SearchBilling <p>计费信息</p>
     */
    public SearchBilling getSearchBilling() {
        return this.SearchBilling;
    }

    /**
     * Set <p>计费信息</p>
     * @param SearchBilling <p>计费信息</p>
     */
    public void setSearchBilling(SearchBilling SearchBilling) {
        this.SearchBilling = SearchBilling;
    }

    public SearchKnowledgeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchKnowledgeRequest(SearchKnowledgeRequest source) {
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new SearchAdvancedConfig(source.AdvancedConfig);
        }
        if (source.Input != null) {
            this.Input = new SearchInput(source.Input);
        }
        if (source.Context != null) {
            this.Context = new SearchContext(source.Context);
        }
        if (source.SearchBilling != null) {
            this.SearchBilling = new SearchBilling(source.SearchBilling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Context.", this.Context);
        this.setParamObj(map, prefix + "SearchBilling.", this.SearchBilling);

    }
}

