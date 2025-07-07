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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterDsEventListenerRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务Id
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 事件类型，默认 REST_API
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 配置信息，比如最长等待时间3天配置：[{"ParamKey":"maxWaitEventTime","ParamValue":"3"},{"ParamKey":"maxWaitEventTimeUnit","ParamValue":"DAYS"}]
    */
    @SerializedName("Properties")
    @Expose
    private ParamInfoDs [] Properties;

    /**
    * 事件所属项目id
    */
    @SerializedName("EventProjectId")
    @Expose
    private String EventProjectId;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务Id 
     * @return Key 任务Id
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 任务Id
     * @param Key 任务Id
     */
    public void setKey(String Key) {
        this.Key = Key;
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
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 配置信息，比如最长等待时间3天配置：[{"ParamKey":"maxWaitEventTime","ParamValue":"3"},{"ParamKey":"maxWaitEventTimeUnit","ParamValue":"DAYS"}] 
     * @return Properties 配置信息，比如最长等待时间3天配置：[{"ParamKey":"maxWaitEventTime","ParamValue":"3"},{"ParamKey":"maxWaitEventTimeUnit","ParamValue":"DAYS"}]
     */
    public ParamInfoDs [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 配置信息，比如最长等待时间3天配置：[{"ParamKey":"maxWaitEventTime","ParamValue":"3"},{"ParamKey":"maxWaitEventTimeUnit","ParamValue":"DAYS"}]
     * @param Properties 配置信息，比如最长等待时间3天配置：[{"ParamKey":"maxWaitEventTime","ParamValue":"3"},{"ParamKey":"maxWaitEventTimeUnit","ParamValue":"DAYS"}]
     */
    public void setProperties(ParamInfoDs [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 事件所属项目id 
     * @return EventProjectId 事件所属项目id
     */
    public String getEventProjectId() {
        return this.EventProjectId;
    }

    /**
     * Set 事件所属项目id
     * @param EventProjectId 事件所属项目id
     */
    public void setEventProjectId(String EventProjectId) {
        this.EventProjectId = EventProjectId;
    }

    public RegisterDsEventListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterDsEventListenerRequest(RegisterDsEventListenerRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.Properties != null) {
            this.Properties = new ParamInfoDs[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new ParamInfoDs(source.Properties[i]);
            }
        }
        if (source.EventProjectId != null) {
            this.EventProjectId = new String(source.EventProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "EventProjectId", this.EventProjectId);

    }
}

