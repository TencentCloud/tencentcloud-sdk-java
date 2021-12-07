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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskListRequest extends AbstractModel{

    /**
    * 要查询的集群ID，如果不指定，则查询用户所有的风险项
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每次查询的最大记录数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Name - String
Name 可取值：RiskLevel风险等级, RiskTarget检查对象，风险对象,RiskType风险类别,RiskAttribute检测项所属的风险类型,Name
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式 asc,desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 要查询的集群ID，如果不指定，则查询用户所有的风险项 
     * @return ClusterId 要查询的集群ID，如果不指定，则查询用户所有的风险项
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 要查询的集群ID，如果不指定，则查询用户所有的风险项
     * @param ClusterId 要查询的集群ID，如果不指定，则查询用户所有的风险项
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每次查询的最大记录数量 
     * @return Limit 每次查询的最大记录数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次查询的最大记录数量
     * @param Limit 每次查询的最大记录数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Name - String
Name 可取值：RiskLevel风险等级, RiskTarget检查对象，风险对象,RiskType风险类别,RiskAttribute检测项所属的风险类型,Name 
     * @return Filters Name - String
Name 可取值：RiskLevel风险等级, RiskTarget检查对象，风险对象,RiskType风险类别,RiskAttribute检测项所属的风险类型,Name
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Name - String
Name 可取值：RiskLevel风险等级, RiskTarget检查对象，风险对象,RiskType风险类别,RiskAttribute检测项所属的风险类型,Name
     * @param Filters Name - String
Name 可取值：RiskLevel风险等级, RiskTarget检查对象，风险对象,RiskType风险类别,RiskAttribute检测项所属的风险类型,Name
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式 asc,desc 
     * @return Order 排序方式 asc,desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式 asc,desc
     * @param Order 排序方式 asc,desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskListRequest(DescribeRiskListRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

