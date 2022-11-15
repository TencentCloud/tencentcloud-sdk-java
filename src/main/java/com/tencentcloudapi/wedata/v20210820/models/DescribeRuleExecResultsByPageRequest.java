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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleExecResultsByPageRequest extends AbstractModel{

    /**
    * 执行规则组ID
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 执行规则组ID 
     * @return RuleGroupExecId 执行规则组ID
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set 执行规则组ID
     * @param RuleGroupExecId 执行规则组ID
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get page number 
     * @return PageNumber page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set page number
     * @param PageNumber page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get page size 
     * @return PageSize page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set page size
     * @param PageSize page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeRuleExecResultsByPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleExecResultsByPageRequest(DescribeRuleExecResultsByPageRequest source) {
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

