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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventTasksRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 过滤的事件任务id
    */
    @SerializedName("EventTaskId")
    @Expose
    private Long EventTaskId;

    /**
    * 页码，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量（支持10、20、30、50、100、200），默认为100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 事件名称过滤
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * (1-待处理;2-已预约;3-处理中;4-已结束;5-处理中;-1-已忽略;-2-已删除)
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 创建时间范围开始 (格式: YYYY-MM-DD HH:MM:SS)，最大支持查询180天信息
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 创建时间范围结束 (格式: YYYY-MM-DD HH:MM:SS)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序字段（事件类型：event_code；触发时间：create_time；完成时间：end_time）
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序顺序 (asc/desc)
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 过滤的事件任务id 
     * @return EventTaskId 过滤的事件任务id
     */
    public Long getEventTaskId() {
        return this.EventTaskId;
    }

    /**
     * Set 过滤的事件任务id
     * @param EventTaskId 过滤的事件任务id
     */
    public void setEventTaskId(Long EventTaskId) {
        this.EventTaskId = EventTaskId;
    }

    /**
     * Get 页码，默认为1 
     * @return PageNumber 页码，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，默认为1
     * @param PageNumber 页码，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量（支持10、20、30、50、100、200），默认为100 
     * @return PageSize 每页数量（支持10、20、30、50、100、200），默认为100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量（支持10、20、30、50、100、200），默认为100
     * @param PageSize 每页数量（支持10、20、30、50、100、200），默认为100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 事件名称过滤 
     * @return EventCode 事件名称过滤
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件名称过滤
     * @param EventCode 事件名称过滤
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get (1-待处理;2-已预约;3-处理中;4-已结束;5-处理中;-1-已忽略;-2-已删除) 
     * @return Status (1-待处理;2-已预约;3-处理中;4-已结束;5-处理中;-1-已忽略;-2-已删除)
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set (1-待处理;2-已预约;3-处理中;4-已结束;5-处理中;-1-已忽略;-2-已删除)
     * @param Status (1-待处理;2-已预约;3-处理中;4-已结束;5-处理中;-1-已忽略;-2-已删除)
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间范围开始 (格式: YYYY-MM-DD HH:MM:SS)，最大支持查询180天信息 
     * @return StartTime 创建时间范围开始 (格式: YYYY-MM-DD HH:MM:SS)，最大支持查询180天信息
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 创建时间范围开始 (格式: YYYY-MM-DD HH:MM:SS)，最大支持查询180天信息
     * @param StartTime 创建时间范围开始 (格式: YYYY-MM-DD HH:MM:SS)，最大支持查询180天信息
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 创建时间范围结束 (格式: YYYY-MM-DD HH:MM:SS) 
     * @return EndTime 创建时间范围结束 (格式: YYYY-MM-DD HH:MM:SS)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 创建时间范围结束 (格式: YYYY-MM-DD HH:MM:SS)
     * @param EndTime 创建时间范围结束 (格式: YYYY-MM-DD HH:MM:SS)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序字段（事件类型：event_code；触发时间：create_time；完成时间：end_time） 
     * @return SortField 排序字段（事件类型：event_code；触发时间：create_time；完成时间：end_time）
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段（事件类型：event_code；触发时间：create_time；完成时间：end_time）
     * @param SortField 排序字段（事件类型：event_code；触发时间：create_time；完成时间：end_time）
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序顺序 (asc/desc) 
     * @return SortOrder 排序顺序 (asc/desc)
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序顺序 (asc/desc)
     * @param SortOrder 排序顺序 (asc/desc)
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeEventTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventTasksRequest(DescribeEventTasksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventTaskId != null) {
            this.EventTaskId = new Long(source.EventTaskId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventTaskId", this.EventTaskId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

