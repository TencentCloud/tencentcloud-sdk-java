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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatAclRulesRequest extends AbstractModel {

    /**
    * 规则组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则方向：0-出向，1-入向
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序顺序，asc:升序 desc:降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 规则组ID 
     * @return GroupId 规则组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组ID
     * @param GroupId 规则组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 规则方向：0-出向，1-入向 
     * @return Direction 规则方向：0-出向，1-入向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：0-出向，1-入向
     * @param Direction 规则方向：0-出向，1-入向
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
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
     * Get 数量 
     * @return Limit 数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量
     * @param Limit 数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序顺序，asc:升序 desc:降序 
     * @return Order 排序顺序，asc:升序 desc:降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序顺序，asc:升序 desc:降序
     * @param Order 排序顺序，asc:升序 desc:降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
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

    public DescribeNatAclRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatAclRulesRequest(DescribeNatAclRulesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

