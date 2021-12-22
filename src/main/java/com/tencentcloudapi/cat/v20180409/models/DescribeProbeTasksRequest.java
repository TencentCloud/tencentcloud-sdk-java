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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProbeTasksRequest extends AbstractModel{

    /**
    * 任务 ID  列表
    */
    @SerializedName("TaskIDs")
    @Expose
    private String [] TaskIDs;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 拨测目标
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * 任务状态列表
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
    */
    @SerializedName("OrderState")
    @Expose
    private Long OrderState;

    /**
    * 拨测类型
    */
    @SerializedName("TaskType")
    @Expose
    private Long [] TaskType;

    /**
    * 节点类型
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long [] TaskCategory;

    /**
    * 排序的列
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 是否正序
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * 资源标签值
    */
    @SerializedName("TagFilters")
    @Expose
    private KeyValuePair [] TagFilters;

    /**
     * Get 任务 ID  列表 
     * @return TaskIDs 任务 ID  列表
     */
    public String [] getTaskIDs() {
        return this.TaskIDs;
    }

    /**
     * Set 任务 ID  列表
     * @param TaskIDs 任务 ID  列表
     */
    public void setTaskIDs(String [] TaskIDs) {
        this.TaskIDs = TaskIDs;
    }

    /**
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 拨测目标 
     * @return TargetAddress 拨测目标
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set 拨测目标
     * @param TargetAddress 拨测目标
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get 任务状态列表 
     * @return TaskStatus 任务状态列表
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态列表
     * @param TaskStatus 任务状态列表
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100 
     * @return Limit 返回数量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100
     * @param Limit 返回数量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li> 
     * @return PayMode 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     * @param PayMode 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li> 
     * @return OrderState 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
     */
    public Long getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
     * @param OrderState 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
     */
    public void setOrderState(Long OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get 拨测类型 
     * @return TaskType 拨测类型
     */
    public Long [] getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 拨测类型
     * @param TaskType 拨测类型
     */
    public void setTaskType(Long [] TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 节点类型 
     * @return TaskCategory 节点类型
     */
    public Long [] getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set 节点类型
     * @param TaskCategory 节点类型
     */
    public void setTaskCategory(Long [] TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get 排序的列 
     * @return OrderBy 排序的列
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序的列
     * @param OrderBy 排序的列
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 是否正序 
     * @return Ascend 是否正序
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set 是否正序
     * @param Ascend 是否正序
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get 资源标签值 
     * @return TagFilters 资源标签值
     */
    public KeyValuePair [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 资源标签值
     * @param TagFilters 资源标签值
     */
    public void setTagFilters(KeyValuePair [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeProbeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProbeTasksRequest(DescribeProbeTasksRequest source) {
        if (source.TaskIDs != null) {
            this.TaskIDs = new String[source.TaskIDs.length];
            for (int i = 0; i < source.TaskIDs.length; i++) {
                this.TaskIDs[i] = new String(source.TaskIDs[i]);
            }
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.OrderState != null) {
            this.OrderState = new Long(source.OrderState);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long[source.TaskType.length];
            for (int i = 0; i < source.TaskType.length; i++) {
                this.TaskType[i] = new Long(source.TaskType[i]);
            }
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long[source.TaskCategory.length];
            for (int i = 0; i < source.TaskCategory.length; i++) {
                this.TaskCategory[i] = new Long(source.TaskCategory[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new KeyValuePair[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new KeyValuePair(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIDs.", this.TaskIDs);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamArraySimple(map, prefix + "TaskType.", this.TaskType);
        this.setParamArraySimple(map, prefix + "TaskCategory.", this.TaskCategory);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

