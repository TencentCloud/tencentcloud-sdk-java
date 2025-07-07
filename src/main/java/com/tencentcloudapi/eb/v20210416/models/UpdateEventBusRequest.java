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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEventBusRequest extends AbstractModel {

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 事件集描述，不限字符类型，200字符描述以内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * EB日志存储时长
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * EB日志主题ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * 是否开启存储
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 事件集描述，不限字符类型，200字符描述以内 
     * @return Description 事件集描述，不限字符类型，200字符描述以内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件集描述，不限字符类型，200字符描述以内
     * @param Description 事件集描述，不限字符类型，200字符描述以内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符 
     * @return EventBusName 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     * @param EventBusName 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get EB日志存储时长 
     * @return SaveDays EB日志存储时长
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set EB日志存储时长
     * @param SaveDays EB日志存储时长
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get EB日志主题ID 
     * @return LogTopicId EB日志主题ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set EB日志主题ID
     * @param LogTopicId EB日志主题ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get 是否开启存储 
     * @return EnableStore 是否开启存储
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set 是否开启存储
     * @param EnableStore 是否开启存储
     */
    public void setEnableStore(Boolean EnableStore) {
        this.EnableStore = EnableStore;
    }

    public UpdateEventBusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEventBusRequest(UpdateEventBusRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.EnableStore != null) {
            this.EnableStore = new Boolean(source.EnableStore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "EnableStore", this.EnableStore);

    }
}

