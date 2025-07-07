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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelAccelerateVersionsRequest extends AbstractModel {

    /**
    * 过滤条件
    Filter.Name: 枚举值: ModelJobName (任务名称)|TrainingModelVersionId (模型版本id)
    Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为10，Filter.Values的上限为100
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段; 枚举值: CreateTime (创建时间) ；默认CreateTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方向; 枚举值: ASC | DESC；默认DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 分页查询起始位置，如：Limit为100，第一页Offset为0，第二页Offset为100....即每页左边为闭区间; 默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询每页大小，最大20000; 默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 模型ID
    */
    @SerializedName("TrainingModelId")
    @Expose
    private String TrainingModelId;

    /**
     * Get 过滤条件
    Filter.Name: 枚举值: ModelJobName (任务名称)|TrainingModelVersionId (模型版本id)
    Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为10，Filter.Values的上限为100 
     * @return Filters 过滤条件
    Filter.Name: 枚举值: ModelJobName (任务名称)|TrainingModelVersionId (模型版本id)
    Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为10，Filter.Values的上限为100
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
    Filter.Name: 枚举值: ModelJobName (任务名称)|TrainingModelVersionId (模型版本id)
    Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为10，Filter.Values的上限为100
     * @param Filters 过滤条件
    Filter.Name: 枚举值: ModelJobName (任务名称)|TrainingModelVersionId (模型版本id)
    Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为10，Filter.Values的上限为100
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段; 枚举值: CreateTime (创建时间) ；默认CreateTime 
     * @return OrderField 排序字段; 枚举值: CreateTime (创建时间) ；默认CreateTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段; 枚举值: CreateTime (创建时间) ；默认CreateTime
     * @param OrderField 排序字段; 枚举值: CreateTime (创建时间) ；默认CreateTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方向; 枚举值: ASC | DESC；默认DESC 
     * @return Order 排序方向; 枚举值: ASC | DESC；默认DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方向; 枚举值: ASC | DESC；默认DESC
     * @param Order 排序方向; 枚举值: ASC | DESC；默认DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 分页查询起始位置，如：Limit为100，第一页Offset为0，第二页Offset为100....即每页左边为闭区间; 默认0 
     * @return Offset 分页查询起始位置，如：Limit为100，第一页Offset为0，第二页Offset为100....即每页左边为闭区间; 默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询起始位置，如：Limit为100，第一页Offset为0，第二页Offset为100....即每页左边为闭区间; 默认0
     * @param Offset 分页查询起始位置，如：Limit为100，第一页Offset为0，第二页Offset为100....即每页左边为闭区间; 默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询每页大小，最大20000; 默认10 
     * @return Limit 分页查询每页大小，最大20000; 默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询每页大小，最大20000; 默认10
     * @param Limit 分页查询每页大小，最大20000; 默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 模型ID 
     * @return TrainingModelId 模型ID
     */
    public String getTrainingModelId() {
        return this.TrainingModelId;
    }

    /**
     * Set 模型ID
     * @param TrainingModelId 模型ID
     */
    public void setTrainingModelId(String TrainingModelId) {
        this.TrainingModelId = TrainingModelId;
    }

    public DescribeModelAccelerateVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelAccelerateVersionsRequest(DescribeModelAccelerateVersionsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TrainingModelId != null) {
            this.TrainingModelId = new String(source.TrainingModelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TrainingModelId", this.TrainingModelId);

    }
}

