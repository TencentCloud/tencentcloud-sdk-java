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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixTaskDetailRequest extends AbstractModel {

    /**
    * <p>修复任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件<br>支持的Filter.Name：<br>InstanceId - 精确匹配，按主机实例ID筛选<br>VulId - 精确匹配，按漏洞ID筛选，过滤出某个漏洞下的主机<br>KBId - 精确匹配，按KB补丁ID筛选，过滤出某个KB补丁下的主机<br>Status - 精确匹配，按执行状态筛选：0-初始状态 1-已下发 11-客户端已确认 2-修复完成 3-客户端离线 4-超时 5-失败 6-不支持 9-等待快照创建完成中 10-快照创建失败<br>FixStatus - 精确匹配，按修复结果筛选：0-初始状态 1-修复成功 2-修复失败<br>SnapshotStatus - 精确匹配，按快照状态筛选：-1-无需创建快照 0-未开始 1-进行中 2-已完成 3-创建失败</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>排序字段<br>枚举值：<br>StartTime：按修复启动时间排序<br>EndTime：按修复结束时间排序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>修复任务ID</p> 
     * @return TaskId <p>修复任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>修复任务ID</p>
     * @param TaskId <p>修复任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p> 
     * @return Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     * @param Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p> 
     * @return Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     * @param Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件<br>支持的Filter.Name：<br>InstanceId - 精确匹配，按主机实例ID筛选<br>VulId - 精确匹配，按漏洞ID筛选，过滤出某个漏洞下的主机<br>KBId - 精确匹配，按KB补丁ID筛选，过滤出某个KB补丁下的主机<br>Status - 精确匹配，按执行状态筛选：0-初始状态 1-已下发 11-客户端已确认 2-修复完成 3-客户端离线 4-超时 5-失败 6-不支持 9-等待快照创建完成中 10-快照创建失败<br>FixStatus - 精确匹配，按修复结果筛选：0-初始状态 1-修复成功 2-修复失败<br>SnapshotStatus - 精确匹配，按快照状态筛选：-1-无需创建快照 0-未开始 1-进行中 2-已完成 3-创建失败</p> 
     * @return Filters <p>过滤条件<br>支持的Filter.Name：<br>InstanceId - 精确匹配，按主机实例ID筛选<br>VulId - 精确匹配，按漏洞ID筛选，过滤出某个漏洞下的主机<br>KBId - 精确匹配，按KB补丁ID筛选，过滤出某个KB补丁下的主机<br>Status - 精确匹配，按执行状态筛选：0-初始状态 1-已下发 11-客户端已确认 2-修复完成 3-客户端离线 4-超时 5-失败 6-不支持 9-等待快照创建完成中 10-快照创建失败<br>FixStatus - 精确匹配，按修复结果筛选：0-初始状态 1-修复成功 2-修复失败<br>SnapshotStatus - 精确匹配，按快照状态筛选：-1-无需创建快照 0-未开始 1-进行中 2-已完成 3-创建失败</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>支持的Filter.Name：<br>InstanceId - 精确匹配，按主机实例ID筛选<br>VulId - 精确匹配，按漏洞ID筛选，过滤出某个漏洞下的主机<br>KBId - 精确匹配，按KB补丁ID筛选，过滤出某个KB补丁下的主机<br>Status - 精确匹配，按执行状态筛选：0-初始状态 1-已下发 11-客户端已确认 2-修复完成 3-客户端离线 4-超时 5-失败 6-不支持 9-等待快照创建完成中 10-快照创建失败<br>FixStatus - 精确匹配，按修复结果筛选：0-初始状态 1-修复成功 2-修复失败<br>SnapshotStatus - 精确匹配，按快照状态筛选：-1-无需创建快照 0-未开始 1-进行中 2-已完成 3-创建失败</p>
     * @param Filters <p>过滤条件<br>支持的Filter.Name：<br>InstanceId - 精确匹配，按主机实例ID筛选<br>VulId - 精确匹配，按漏洞ID筛选，过滤出某个漏洞下的主机<br>KBId - 精确匹配，按KB补丁ID筛选，过滤出某个KB补丁下的主机<br>Status - 精确匹配，按执行状态筛选：0-初始状态 1-已下发 11-客户端已确认 2-修复完成 3-客户端离线 4-超时 5-失败 6-不支持 9-等待快照创建完成中 10-快照创建失败<br>FixStatus - 精确匹配，按修复结果筛选：0-初始状态 1-修复成功 2-修复失败<br>SnapshotStatus - 精确匹配，按快照状态筛选：-1-无需创建快照 0-未开始 1-进行中 2-已完成 3-创建失败</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段<br>枚举值：<br>StartTime：按修复启动时间排序<br>EndTime：按修复结束时间排序</p> 
     * @return Order <p>排序字段<br>枚举值：<br>StartTime：按修复启动时间排序<br>EndTime：按修复结束时间排序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序字段<br>枚举值：<br>StartTime：按修复启动时间排序<br>EndTime：按修复结束时间排序</p>
     * @param Order <p>排序字段<br>枚举值：<br>StartTime：按修复启动时间排序<br>EndTime：按修复结束时间排序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p> 
     * @return By <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     * @param By <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeVulFixTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixTaskDetailRequest(DescribeVulFixTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

