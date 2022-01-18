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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSendTasksRequest extends AbstractModel{

    /**
    * 偏移量，整型，从0开始，0代表跳过0行
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目，整型,不超过100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成。查询所有状态，则不传这个字段
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 收件人列表ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * 任务类型 1即时 2定时 3周期，查询所有类型则不传这个字段
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 偏移量，整型，从0开始，0代表跳过0行 
     * @return Offset 偏移量，整型，从0开始，0代表跳过0行
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，整型，从0开始，0代表跳过0行
     * @param Offset 偏移量，整型，从0开始，0代表跳过0行
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目，整型,不超过100 
     * @return Limit 限制数目，整型,不超过100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目，整型,不超过100
     * @param Limit 限制数目，整型,不超过100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成。查询所有状态，则不传这个字段 
     * @return Status 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成。查询所有状态，则不传这个字段
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成。查询所有状态，则不传这个字段
     * @param Status 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成。查询所有状态，则不传这个字段
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 收件人列表ID 
     * @return ReceiverId 收件人列表ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 收件人列表ID
     * @param ReceiverId 收件人列表ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get 任务类型 1即时 2定时 3周期，查询所有类型则不传这个字段 
     * @return TaskType 任务类型 1即时 2定时 3周期，查询所有类型则不传这个字段
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型 1即时 2定时 3周期，查询所有类型则不传这个字段
     * @param TaskType 任务类型 1即时 2定时 3周期，查询所有类型则不传这个字段
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public ListSendTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSendTasksRequest(ListSendTasksRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

