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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleExecResultsRequest extends AbstractModel {

    /**
    * 规则组执行Id
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 过滤条件	
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
     * Get 规则组执行Id 
     * @return RuleGroupExecId 规则组执行Id
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set 规则组执行Id
     * @param RuleGroupExecId 规则组执行Id
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 过滤条件	 
     * @return Filters 过滤条件	
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件	
     * @param Filters 过滤条件	
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return OrderFields 排序字段
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段
     * @param OrderFields 排序字段
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeRuleExecResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleExecResultsRequest(DescribeRuleExecResultsRequest source) {
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

