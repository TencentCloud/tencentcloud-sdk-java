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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTriggerLog extends AbstractModel{

    /**
    * 日志 Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 触发器 Id
    */
    @SerializedName("TriggerId")
    @Expose
    private Long TriggerId;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 通知类型
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 详情
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 日志 Id 
     * @return Id 日志 Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 日志 Id
     * @param Id 日志 Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 触发器 Id 
     * @return TriggerId 触发器 Id
     */
    public Long getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set 触发器 Id
     * @param TriggerId 触发器 Id
     */
    public void setTriggerId(Long TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 通知类型 
     * @return NotifyType 通知类型
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知类型
     * @param NotifyType 通知类型
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 详情 
     * @return Detail 详情
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 详情
     * @param Detail 详情
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

