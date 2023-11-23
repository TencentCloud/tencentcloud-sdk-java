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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditRuleTemplateModifyHistoryRequest extends AbstractModel {

    /**
    * 模板ID
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * 查询范围的开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询范围的结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 返回条数。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序方式。DESC-按修改时间倒排，ASC-正序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 模板ID 
     * @return RuleTemplateIds 模板ID
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 模板ID
     * @param RuleTemplateIds 模板ID
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get 查询范围的开始时间。 
     * @return StartTime 查询范围的开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询范围的开始时间。
     * @param StartTime 查询范围的开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询范围的结束时间。 
     * @return EndTime 查询范围的结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询范围的结束时间。
     * @param EndTime 查询范围的结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 返回条数。 
     * @return Limit 返回条数。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回条数。
     * @param Limit 返回条数。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序方式。DESC-按修改时间倒排，ASC-正序。 
     * @return Order 排序方式。DESC-按修改时间倒排，ASC-正序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式。DESC-按修改时间倒排，ASC-正序。
     * @param Order 排序方式。DESC-按修改时间倒排，ASC-正序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAuditRuleTemplateModifyHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditRuleTemplateModifyHistoryRequest(DescribeAuditRuleTemplateModifyHistoryRequest source) {
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

