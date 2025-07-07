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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBashEventsRequest extends AbstractModel {

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件。
<li>HostName - String - 是否必填：否 - 主机名</li>
<li>Hostip - String - 是否必填：否 - 主机内网IP</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型,全部或者单选(0:系统 1:用户)</li>
<li>RuleName - String - 是否必填：否 - 策略名称</li>
<li>RuleLevel - Int - 是否必填：否 - 威胁等级,可以多选</li>
<li>Status - Int - 是否必填：否 - 处理状态,可多选(0:待处理 1:已处理 2:已加白  3:已忽略 4:已删除 5:已拦截)</li>
<li>DetectBy - Int - 是否必填：否 - 数据来源,可多选(0:bash日志 1:实时监控)</li>
<li>StartTime - String - 是否必填：否 - 开始时间</li>
<li>EndTime - String - 是否必填：否 - 结束时间</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序方式：根据请求次数排序：asc-升序/desc-降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段：CreateTime-发生时间。ModifyTime-处理时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件。
<li>HostName - String - 是否必填：否 - 主机名</li>
<li>Hostip - String - 是否必填：否 - 主机内网IP</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型,全部或者单选(0:系统 1:用户)</li>
<li>RuleName - String - 是否必填：否 - 策略名称</li>
<li>RuleLevel - Int - 是否必填：否 - 威胁等级,可以多选</li>
<li>Status - Int - 是否必填：否 - 处理状态,可多选(0:待处理 1:已处理 2:已加白  3:已忽略 4:已删除 5:已拦截)</li>
<li>DetectBy - Int - 是否必填：否 - 数据来源,可多选(0:bash日志 1:实时监控)</li>
<li>StartTime - String - 是否必填：否 - 开始时间</li>
<li>EndTime - String - 是否必填：否 - 结束时间</li> 
     * @return Filters 过滤条件。
<li>HostName - String - 是否必填：否 - 主机名</li>
<li>Hostip - String - 是否必填：否 - 主机内网IP</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型,全部或者单选(0:系统 1:用户)</li>
<li>RuleName - String - 是否必填：否 - 策略名称</li>
<li>RuleLevel - Int - 是否必填：否 - 威胁等级,可以多选</li>
<li>Status - Int - 是否必填：否 - 处理状态,可多选(0:待处理 1:已处理 2:已加白  3:已忽略 4:已删除 5:已拦截)</li>
<li>DetectBy - Int - 是否必填：否 - 数据来源,可多选(0:bash日志 1:实时监控)</li>
<li>StartTime - String - 是否必填：否 - 开始时间</li>
<li>EndTime - String - 是否必填：否 - 结束时间</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>HostName - String - 是否必填：否 - 主机名</li>
<li>Hostip - String - 是否必填：否 - 主机内网IP</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型,全部或者单选(0:系统 1:用户)</li>
<li>RuleName - String - 是否必填：否 - 策略名称</li>
<li>RuleLevel - Int - 是否必填：否 - 威胁等级,可以多选</li>
<li>Status - Int - 是否必填：否 - 处理状态,可多选(0:待处理 1:已处理 2:已加白  3:已忽略 4:已删除 5:已拦截)</li>
<li>DetectBy - Int - 是否必填：否 - 数据来源,可多选(0:bash日志 1:实时监控)</li>
<li>StartTime - String - 是否必填：否 - 开始时间</li>
<li>EndTime - String - 是否必填：否 - 结束时间</li>
     * @param Filters 过滤条件。
<li>HostName - String - 是否必填：否 - 主机名</li>
<li>Hostip - String - 是否必填：否 - 主机内网IP</li>
<li>RuleCategory - Int - 是否必填：否 - 策略类型,全部或者单选(0:系统 1:用户)</li>
<li>RuleName - String - 是否必填：否 - 策略名称</li>
<li>RuleLevel - Int - 是否必填：否 - 威胁等级,可以多选</li>
<li>Status - Int - 是否必填：否 - 处理状态,可多选(0:待处理 1:已处理 2:已加白  3:已忽略 4:已删除 5:已拦截)</li>
<li>DetectBy - Int - 是否必填：否 - 数据来源,可多选(0:bash日志 1:实时监控)</li>
<li>StartTime - String - 是否必填：否 - 开始时间</li>
<li>EndTime - String - 是否必填：否 - 结束时间</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get 排序方式：根据请求次数排序：asc-升序/desc-降序 
     * @return Order 排序方式：根据请求次数排序：asc-升序/desc-降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：根据请求次数排序：asc-升序/desc-降序
     * @param Order 排序方式：根据请求次数排序：asc-升序/desc-降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段：CreateTime-发生时间。ModifyTime-处理时间 
     * @return By 排序字段：CreateTime-发生时间。ModifyTime-处理时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段：CreateTime-发生时间。ModifyTime-处理时间
     * @param By 排序字段：CreateTime-发生时间。ModifyTime-处理时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBashEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBashEventsRequest(DescribeBashEventsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

