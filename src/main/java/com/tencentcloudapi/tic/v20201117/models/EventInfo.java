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
package com.tencentcloudapi.tic.v20201117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel{

    /**
    * 事件ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 版本ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 资源栈ID
    */
    @SerializedName("StackId")
    @Expose
    private String StackId;

    /**
    * 事件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 版本状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 事件ID 
     * @return EventId 事件ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID
     * @param EventId 事件ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 版本ID 
     * @return VersionId 版本ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本ID
     * @param VersionId 版本ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 资源栈ID 
     * @return StackId 资源栈ID
     */
    public String getStackId() {
        return this.StackId;
    }

    /**
     * Set 资源栈ID
     * @param StackId 资源栈ID
     */
    public void setStackId(String StackId) {
        this.StackId = StackId;
    }

    /**
     * Get 事件类型 
     * @return Type 事件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型
     * @param Type 事件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 版本状态 
     * @return Status 版本状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态
     * @param Status 版本状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态信息 
     * @return Message 状态信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态信息
     * @param Message 状态信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public EventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventInfo(EventInfo source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.StackId != null) {
            this.StackId = new String(source.StackId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "StackId", this.StackId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

