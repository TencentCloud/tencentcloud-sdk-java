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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel{

    /**
    * 事件代码，支持以下的事件代码

- FLEET_CREATED 
- FLEET_STATE_DOWNLOADING 
- FLEET_BINARY_DOWNLOAD_FAILED 
- FLEET_CREATION_EXTRACTING_BUILD
- FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
- FLEET_STATE_VALIDATING
- FLEET_STATE_BUILDING 
- FLEET_STATE_ACTIVATING
- FLEET_STATE_ACTIVE
- FLEET_SCALING_EVENT
- FLEET_STATE_ERROR
- FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
- FLEET_ACTIVATION_FAILED_NO_INSTANCES
- FLEET_VPC_PEERING_SUCCEEDED
- FLEET_VPC_PEERING_FAILED
- FLEET_VPC_PEERING_DELETE
- FLEET_INITIALIZATION_FAILED
- FLEET_DELETED
- FLEET_STATE_DELETING
- FLEET_ACTIVATION_FAILED
- GAME_SESSION_ACTIVATION_TIMEOUT
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * 事件的唯一标识 ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 事件的发生时间，UTC 时间格式
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 事件的消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 事件相关的日志存储路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreSignedLogUrl")
    @Expose
    private String PreSignedLogUrl;

    /**
    * 事件对应的资源对象唯一标识 ID，例如服务器舰队 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 事件代码，支持以下的事件代码

- FLEET_CREATED 
- FLEET_STATE_DOWNLOADING 
- FLEET_BINARY_DOWNLOAD_FAILED 
- FLEET_CREATION_EXTRACTING_BUILD
- FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
- FLEET_STATE_VALIDATING
- FLEET_STATE_BUILDING 
- FLEET_STATE_ACTIVATING
- FLEET_STATE_ACTIVE
- FLEET_SCALING_EVENT
- FLEET_STATE_ERROR
- FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
- FLEET_ACTIVATION_FAILED_NO_INSTANCES
- FLEET_VPC_PEERING_SUCCEEDED
- FLEET_VPC_PEERING_FAILED
- FLEET_VPC_PEERING_DELETE
- FLEET_INITIALIZATION_FAILED
- FLEET_DELETED
- FLEET_STATE_DELETING
- FLEET_ACTIVATION_FAILED
- GAME_SESSION_ACTIVATION_TIMEOUT 
     * @return EventCode 事件代码，支持以下的事件代码

- FLEET_CREATED 
- FLEET_STATE_DOWNLOADING 
- FLEET_BINARY_DOWNLOAD_FAILED 
- FLEET_CREATION_EXTRACTING_BUILD
- FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
- FLEET_STATE_VALIDATING
- FLEET_STATE_BUILDING 
- FLEET_STATE_ACTIVATING
- FLEET_STATE_ACTIVE
- FLEET_SCALING_EVENT
- FLEET_STATE_ERROR
- FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
- FLEET_ACTIVATION_FAILED_NO_INSTANCES
- FLEET_VPC_PEERING_SUCCEEDED
- FLEET_VPC_PEERING_FAILED
- FLEET_VPC_PEERING_DELETE
- FLEET_INITIALIZATION_FAILED
- FLEET_DELETED
- FLEET_STATE_DELETING
- FLEET_ACTIVATION_FAILED
- GAME_SESSION_ACTIVATION_TIMEOUT
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件代码，支持以下的事件代码

- FLEET_CREATED 
- FLEET_STATE_DOWNLOADING 
- FLEET_BINARY_DOWNLOAD_FAILED 
- FLEET_CREATION_EXTRACTING_BUILD
- FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
- FLEET_STATE_VALIDATING
- FLEET_STATE_BUILDING 
- FLEET_STATE_ACTIVATING
- FLEET_STATE_ACTIVE
- FLEET_SCALING_EVENT
- FLEET_STATE_ERROR
- FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
- FLEET_ACTIVATION_FAILED_NO_INSTANCES
- FLEET_VPC_PEERING_SUCCEEDED
- FLEET_VPC_PEERING_FAILED
- FLEET_VPC_PEERING_DELETE
- FLEET_INITIALIZATION_FAILED
- FLEET_DELETED
- FLEET_STATE_DELETING
- FLEET_ACTIVATION_FAILED
- GAME_SESSION_ACTIVATION_TIMEOUT
     * @param EventCode 事件代码，支持以下的事件代码

- FLEET_CREATED 
- FLEET_STATE_DOWNLOADING 
- FLEET_BINARY_DOWNLOAD_FAILED 
- FLEET_CREATION_EXTRACTING_BUILD
- FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
- FLEET_STATE_VALIDATING
- FLEET_STATE_BUILDING 
- FLEET_STATE_ACTIVATING
- FLEET_STATE_ACTIVE
- FLEET_SCALING_EVENT
- FLEET_STATE_ERROR
- FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
- FLEET_ACTIVATION_FAILED_NO_INSTANCES
- FLEET_VPC_PEERING_SUCCEEDED
- FLEET_VPC_PEERING_FAILED
- FLEET_VPC_PEERING_DELETE
- FLEET_INITIALIZATION_FAILED
- FLEET_DELETED
- FLEET_STATE_DELETING
- FLEET_ACTIVATION_FAILED
- GAME_SESSION_ACTIVATION_TIMEOUT
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get 事件的唯一标识 ID 
     * @return EventId 事件的唯一标识 ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件的唯一标识 ID
     * @param EventId 事件的唯一标识 ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件的发生时间，UTC 时间格式 
     * @return EventTime 事件的发生时间，UTC 时间格式
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件的发生时间，UTC 时间格式
     * @param EventTime 事件的发生时间，UTC 时间格式
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 事件的消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 事件的消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件的消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 事件的消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 事件相关的日志存储路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreSignedLogUrl 事件相关的日志存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreSignedLogUrl() {
        return this.PreSignedLogUrl;
    }

    /**
     * Set 事件相关的日志存储路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreSignedLogUrl 事件相关的日志存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreSignedLogUrl(String PreSignedLogUrl) {
        this.PreSignedLogUrl = PreSignedLogUrl;
    }

    /**
     * Get 事件对应的资源对象唯一标识 ID，例如服务器舰队 ID 
     * @return ResourceId 事件对应的资源对象唯一标识 ID，例如服务器舰队 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 事件对应的资源对象唯一标识 ID，例如服务器舰队 ID
     * @param ResourceId 事件对应的资源对象唯一标识 ID，例如服务器舰队 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public Event() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Event(Event source) {
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.PreSignedLogUrl != null) {
            this.PreSignedLogUrl = new String(source.PreSignedLogUrl);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "PreSignedLogUrl", this.PreSignedLogUrl);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

