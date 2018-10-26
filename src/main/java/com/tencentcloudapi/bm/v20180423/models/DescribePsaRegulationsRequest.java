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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePsaRegulationsRequest  extends AbstractModel{

    /**
    * 数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 规则ID过滤，支持模糊查询
    */
    @SerializedName("PsaIds")
    @Expose
    private String [] PsaIds;

    /**
    * 规则别名过滤，支持模糊查询
    */
    @SerializedName("PsaNames")
    @Expose
    private String [] PsaNames;

    /**
    * 标签过滤
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 排序字段，取值支持：CreateTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式 0:递增(默认) 1:递减
    */
    @SerializedName("Order")
    @Expose
    private Integer Order;

    /**
     * 获取数量限制
     * @return Limit 数量限制
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置数量限制
     * @param Limit 数量限制
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取规则ID过滤，支持模糊查询
     * @return PsaIds 规则ID过滤，支持模糊查询
     */
    public String [] getPsaIds() {
        return this.PsaIds;
    }

    /**
     * 设置规则ID过滤，支持模糊查询
     * @param PsaIds 规则ID过滤，支持模糊查询
     */
    public void setPsaIds(String [] PsaIds) {
        this.PsaIds = PsaIds;
    }

    /**
     * 获取规则别名过滤，支持模糊查询
     * @return PsaNames 规则别名过滤，支持模糊查询
     */
    public String [] getPsaNames() {
        return this.PsaNames;
    }

    /**
     * 设置规则别名过滤，支持模糊查询
     * @param PsaNames 规则别名过滤，支持模糊查询
     */
    public void setPsaNames(String [] PsaNames) {
        this.PsaNames = PsaNames;
    }

    /**
     * 获取标签过滤
     * @return Tags 标签过滤
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签过滤
     * @param Tags 标签过滤
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取排序字段，取值支持：CreateTime
     * @return OrderField 排序字段，取值支持：CreateTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序字段，取值支持：CreateTime
     * @param OrderField 排序字段，取值支持：CreateTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取排序方式 0:递增(默认) 1:递减
     * @return Order 排序方式 0:递增(默认) 1:递减
     */
    public Integer getOrder() {
        return this.Order;
    }

    /**
     * 设置排序方式 0:递增(默认) 1:递减
     * @param Order 排序方式 0:递增(默认) 1:递减
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "PsaIds.", this.PsaIds);
        this.setParamArraySimple(map, prefix + "PsaNames.", this.PsaNames);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

