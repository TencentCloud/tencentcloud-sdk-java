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

public class DescribeTaskInfoRequest extends AbstractModel{

    /**
    * 开始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 时间过滤下限
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 时间过滤上限
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 任务状态ID过滤
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * 排序字段，目前支持：CreateTime，AuthTime，EndTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式 0:递增(默认) 1:递减
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 任务ID过滤
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 实例ID过滤
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例别名过滤
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * 故障类型ID过滤
    */
    @SerializedName("TaskTypeIds")
    @Expose
    private Long [] TaskTypeIds;

    /**
     * Get 开始位置 
     * @return Offset 开始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 开始位置
     * @param Offset 开始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据条数 
     * @return Limit 数据条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数据条数
     * @param Limit 数据条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 时间过滤下限 
     * @return StartDate 时间过滤下限
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 时间过滤下限
     * @param StartDate 时间过滤下限
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 时间过滤上限 
     * @return EndDate 时间过滤上限
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 时间过滤上限
     * @param EndDate 时间过滤上限
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 任务状态ID过滤 
     * @return TaskStatus 任务状态ID过滤
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态ID过滤
     * @param TaskStatus 任务状态ID过滤
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 排序字段，目前支持：CreateTime，AuthTime，EndTime 
     * @return OrderField 排序字段，目前支持：CreateTime，AuthTime，EndTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，目前支持：CreateTime，AuthTime，EndTime
     * @param OrderField 排序字段，目前支持：CreateTime，AuthTime，EndTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式 0:递增(默认) 1:递减 
     * @return Order 排序方式 0:递增(默认) 1:递减
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式 0:递增(默认) 1:递减
     * @param Order 排序方式 0:递增(默认) 1:递减
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 任务ID过滤 
     * @return TaskIds 任务ID过滤
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务ID过滤
     * @param TaskIds 任务ID过滤
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 实例ID过滤 
     * @return InstanceIds 实例ID过滤
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID过滤
     * @param InstanceIds 实例ID过滤
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例别名过滤 
     * @return Aliases 实例别名过滤
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set 实例别名过滤
     * @param Aliases 实例别名过滤
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get 故障类型ID过滤 
     * @return TaskTypeIds 故障类型ID过滤
     */
    public Long [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * Set 故障类型ID过滤
     * @param TaskTypeIds 故障类型ID过滤
     */
    public void setTaskTypeIds(Long [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamArraySimple(map, prefix + "TaskTypeIds.", this.TaskTypeIds);

    }
}

