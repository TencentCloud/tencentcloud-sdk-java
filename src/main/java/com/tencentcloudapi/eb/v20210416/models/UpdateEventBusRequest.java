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
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>事件集描述，不限字符类型，200字符描述以内</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符</p>
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * <p>事件存储时长</p><p>单位：day</p>
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * <p>事件存储主题ID</p>
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * <p>是否开启存储</p>
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>事件集描述，不限字符类型，200字符描述以内</p> 
     * @return Description <p>事件集描述，不限字符类型，200字符描述以内</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>事件集描述，不限字符类型，200字符描述以内</p>
     * @param Description <p>事件集描述，不限字符类型，200字符描述以内</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符</p> 
     * @return EventBusName <p>事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符</p>
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set <p>事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符</p>
     * @param EventBusName <p>事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符</p>
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get <p>事件存储时长</p><p>单位：day</p> 
     * @return SaveDays <p>事件存储时长</p><p>单位：day</p>
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set <p>事件存储时长</p><p>单位：day</p>
     * @param SaveDays <p>事件存储时长</p><p>单位：day</p>
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get <p>事件存储主题ID</p> 
     * @return LogTopicId <p>事件存储主题ID</p>
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set <p>事件存储主题ID</p>
     * @param LogTopicId <p>事件存储主题ID</p>
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get <p>是否开启存储</p> 
     * @return EnableStore <p>是否开启存储</p>
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set <p>是否开启存储</p>
     * @param EnableStore <p>是否开启存储</p>
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

