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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionRuleItem extends AbstractModel {

    /**
    * <p>版本保留规则</p>
    */
    @SerializedName("RetentionPolicy")
    @Expose
    private RetentionRule RetentionPolicy;

    /**
    * <p>标签过滤器</p>
    */
    @SerializedName("TagFilter")
    @Expose
    private FilterSelector TagFilter;

    /**
    * <p>仓库过滤器</p>
    */
    @SerializedName("RepositoryFilter")
    @Expose
    private FilterSelector RepositoryFilter;

    /**
     * Get <p>版本保留规则</p> 
     * @return RetentionPolicy <p>版本保留规则</p>
     */
    public RetentionRule getRetentionPolicy() {
        return this.RetentionPolicy;
    }

    /**
     * Set <p>版本保留规则</p>
     * @param RetentionPolicy <p>版本保留规则</p>
     */
    public void setRetentionPolicy(RetentionRule RetentionPolicy) {
        this.RetentionPolicy = RetentionPolicy;
    }

    /**
     * Get <p>标签过滤器</p> 
     * @return TagFilter <p>标签过滤器</p>
     */
    public FilterSelector getTagFilter() {
        return this.TagFilter;
    }

    /**
     * Set <p>标签过滤器</p>
     * @param TagFilter <p>标签过滤器</p>
     */
    public void setTagFilter(FilterSelector TagFilter) {
        this.TagFilter = TagFilter;
    }

    /**
     * Get <p>仓库过滤器</p> 
     * @return RepositoryFilter <p>仓库过滤器</p>
     */
    public FilterSelector getRepositoryFilter() {
        return this.RepositoryFilter;
    }

    /**
     * Set <p>仓库过滤器</p>
     * @param RepositoryFilter <p>仓库过滤器</p>
     */
    public void setRepositoryFilter(FilterSelector RepositoryFilter) {
        this.RepositoryFilter = RepositoryFilter;
    }

    public RetentionRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionRuleItem(RetentionRuleItem source) {
        if (source.RetentionPolicy != null) {
            this.RetentionPolicy = new RetentionRule(source.RetentionPolicy);
        }
        if (source.TagFilter != null) {
            this.TagFilter = new FilterSelector(source.TagFilter);
        }
        if (source.RepositoryFilter != null) {
            this.RepositoryFilter = new FilterSelector(source.RepositoryFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RetentionPolicy.", this.RetentionPolicy);
        this.setParamObj(map, prefix + "TagFilter.", this.TagFilter);
        this.setParamObj(map, prefix + "RepositoryFilter.", this.RepositoryFilter);

    }
}

