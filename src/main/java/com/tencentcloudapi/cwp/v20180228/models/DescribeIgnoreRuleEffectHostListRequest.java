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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIgnoreRuleEffectHostListRequest extends AbstractModel{

    /**
    * 分页参数 最大100条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 检测项id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 过滤条件。
<li>AliasName- String- 主机别名</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 主机标签名
    */
    @SerializedName("TagNames")
    @Expose
    private String [] TagNames;

    /**
     * Get 分页参数 最大100条 
     * @return Limit 分页参数 最大100条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数 最大100条
     * @param Limit 分页参数 最大100条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 检测项id 
     * @return RuleId 检测项id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 检测项id
     * @param RuleId 检测项id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 过滤条件。
<li>AliasName- String- 主机别名</li> 
     * @return Filters 过滤条件。
<li>AliasName- String- 主机别名</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>AliasName- String- 主机别名</li>
     * @param Filters 过滤条件。
<li>AliasName- String- 主机别名</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 主机标签名 
     * @return TagNames 主机标签名
     */
    public String [] getTagNames() {
        return this.TagNames;
    }

    /**
     * Set 主机标签名
     * @param TagNames 主机标签名
     */
    public void setTagNames(String [] TagNames) {
        this.TagNames = TagNames;
    }

    public DescribeIgnoreRuleEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIgnoreRuleEffectHostListRequest(DescribeIgnoreRuleEffectHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.TagNames != null) {
            this.TagNames = new String[source.TagNames.length];
            for (int i = 0; i < source.TagNames.length; i++) {
                this.TagNames[i] = new String(source.TagNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "TagNames.", this.TagNames);

    }
}

