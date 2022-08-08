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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterEventListenerRequest extends AbstractModel{

    /**
    * 关键字，如果是任务，则传任务Id
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件类型，默认 REST_API
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 配置信息，比如最长等待时间1天配置json：{"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
     * Get 关键字，如果是任务，则传任务Id 
     * @return Key 关键字，如果是任务，则传任务Id
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 关键字，如果是任务，则传任务Id
     * @param Key 关键字，如果是任务，则传任务Id
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 事件名称 
     * @return EventName 事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
     * @param EventName 事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 事件类型，默认 REST_API 
     * @return Type 事件类型，默认 REST_API
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型，默认 REST_API
     * @param Type 事件类型，默认 REST_API
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 配置信息，比如最长等待时间1天配置json：{"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"} 
     * @return Properties 配置信息，比如最长等待时间1天配置json：{"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 配置信息，比如最长等待时间1天配置json：{"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
     * @param Properties 配置信息，比如最长等待时间1天配置json：{"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    public RegisterEventListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterEventListenerRequest(RegisterEventListenerRequest source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Properties", this.Properties);

    }
}

