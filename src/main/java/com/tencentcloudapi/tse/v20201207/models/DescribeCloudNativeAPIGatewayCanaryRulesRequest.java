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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayCanaryRulesRequest extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>服务 ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>灰度规则类别 Standard｜Lane</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>列表数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>列表offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序参数</p><p>枚举值：</p><ul><li>Priority： 优先级</li></ul>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>过滤条件，多个过滤条件之间是与的关系，支持 Header,Query,Body,Cookie,System,Method,Path,ServiceID,ServiceName</p>
    */
    @SerializedName("Filters")
    @Expose
    private ListFilter [] Filters;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>服务 ID</p> 
     * @return ServiceId <p>服务 ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务 ID</p>
     * @param ServiceId <p>服务 ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>灰度规则类别 Standard｜Lane</p> 
     * @return RuleType <p>灰度规则类别 Standard｜Lane</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>灰度规则类别 Standard｜Lane</p>
     * @param RuleType <p>灰度规则类别 Standard｜Lane</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>列表数量</p> 
     * @return Limit <p>列表数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>列表数量</p>
     * @param Limit <p>列表数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>列表offset</p> 
     * @return Offset <p>列表offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>列表offset</p>
     * @param Offset <p>列表offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序参数</p><p>枚举值：</p><ul><li>Priority： 优先级</li></ul> 
     * @return OrderField <p>排序参数</p><p>枚举值：</p><ul><li>Priority： 优先级</li></ul>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序参数</p><p>枚举值：</p><ul><li>Priority： 优先级</li></ul>
     * @param OrderField <p>排序参数</p><p>枚举值：</p><ul><li>Priority： 优先级</li></ul>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul> 
     * @return OrderType <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
     * @param OrderType <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>过滤条件，多个过滤条件之间是与的关系，支持 Header,Query,Body,Cookie,System,Method,Path,ServiceID,ServiceName</p> 
     * @return Filters <p>过滤条件，多个过滤条件之间是与的关系，支持 Header,Query,Body,Cookie,System,Method,Path,ServiceID,ServiceName</p>
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，多个过滤条件之间是与的关系，支持 Header,Query,Body,Cookie,System,Method,Path,ServiceID,ServiceName</p>
     * @param Filters <p>过滤条件，多个过滤条件之间是与的关系，支持 Header,Query,Body,Cookie,System,Method,Path,ServiceID,ServiceName</p>
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCloudNativeAPIGatewayCanaryRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayCanaryRulesRequest(DescribeCloudNativeAPIGatewayCanaryRulesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Filters != null) {
            this.Filters = new ListFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ListFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

