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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBashRulesRequest extends AbstractModel {

    /**
    * 0-系统规则; 1-用户规则
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 返回数量，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>Name - String - 是否必填：否 - 规则名称</li>
<li>Rule - String - 是否必填：否 - 规则内容</li>
<li>Level - Int - 是否必填：否 - 威胁等级</li>
<li>White - Int - 是否必填：否 - 白名单类型</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型</li>
<li>BashAction - Int - 是否必填：否 - 操作动作</li>
<li>Status - Int - 是否必填：否 - 生效状态</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 0-系统规则; 1-用户规则 
     * @return Type 0-系统规则; 1-用户规则
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0-系统规则; 1-用户规则
     * @param Type 0-系统规则; 1-用户规则
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 返回数量，最大值为100。 
     * @return Limit 返回数量，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，最大值为100。
     * @param Limit 返回数量，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>Name - String - 是否必填：否 - 规则名称</li>
<li>Rule - String - 是否必填：否 - 规则内容</li>
<li>Level - Int - 是否必填：否 - 威胁等级</li>
<li>White - Int - 是否必填：否 - 白名单类型</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型</li>
<li>BashAction - Int - 是否必填：否 - 操作动作</li>
<li>Status - Int - 是否必填：否 - 生效状态</li> 
     * @return Filters 过滤条件。
<li>Name - String - 是否必填：否 - 规则名称</li>
<li>Rule - String - 是否必填：否 - 规则内容</li>
<li>Level - Int - 是否必填：否 - 威胁等级</li>
<li>White - Int - 是否必填：否 - 白名单类型</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型</li>
<li>BashAction - Int - 是否必填：否 - 操作动作</li>
<li>Status - Int - 是否必填：否 - 生效状态</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Name - String - 是否必填：否 - 规则名称</li>
<li>Rule - String - 是否必填：否 - 规则内容</li>
<li>Level - Int - 是否必填：否 - 威胁等级</li>
<li>White - Int - 是否必填：否 - 白名单类型</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型</li>
<li>BashAction - Int - 是否必填：否 - 操作动作</li>
<li>Status - Int - 是否必填：否 - 生效状态</li>
     * @param Filters 过滤条件。
<li>Name - String - 是否必填：否 - 规则名称</li>
<li>Rule - String - 是否必填：否 - 规则内容</li>
<li>Level - Int - 是否必填：否 - 威胁等级</li>
<li>White - Int - 是否必填：否 - 白名单类型</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型</li>
<li>BashAction - Int - 是否必填：否 - 操作动作</li>
<li>Status - Int - 是否必填：否 - 生效状态</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBashRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBashRulesRequest(DescribeBashRulesRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

