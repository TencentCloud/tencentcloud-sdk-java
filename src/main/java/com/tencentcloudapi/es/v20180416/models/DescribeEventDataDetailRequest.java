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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventDataDetailRequest extends AbstractModel {

    /**
    * ES集群Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事件类型,1：硬件异常；2：用户变更；3：智能运维
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 异常事件任务id
    */
    @SerializedName("EventTaskId")
    @Expose
    private Long EventTaskId;

    /**
     * Get ES集群Id 
     * @return InstanceId ES集群Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES集群Id
     * @param InstanceId ES集群Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 事件类型,1：硬件异常；2：用户变更；3：智能运维 
     * @return EventType 事件类型,1：硬件异常；2：用户变更；3：智能运维
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型,1：硬件异常；2：用户变更；3：智能运维
     * @param EventType 事件类型,1：硬件异常；2：用户变更；3：智能运维
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 异常事件任务id 
     * @return EventTaskId 异常事件任务id
     */
    public Long getEventTaskId() {
        return this.EventTaskId;
    }

    /**
     * Set 异常事件任务id
     * @param EventTaskId 异常事件任务id
     */
    public void setEventTaskId(Long EventTaskId) {
        this.EventTaskId = EventTaskId;
    }

    public DescribeEventDataDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventDataDetailRequest(DescribeEventDataDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventTaskId != null) {
            this.EventTaskId = new Long(source.EventTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventTaskId", this.EventTaskId);

    }
}

