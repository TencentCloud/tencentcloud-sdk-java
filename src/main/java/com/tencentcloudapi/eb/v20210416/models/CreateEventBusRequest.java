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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEventBusRequest extends AbstractModel {

    /**
    * 事件集名称，只能包含字母、中文、数字、下划线、连字符，以字母/中文开头，以数字、字母或中文结尾，2~60个字符
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * 事件集描述，只能包含数字、中英文及常用标点符号，不超过200个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * EB存储时长
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * EB是否开启存储
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
     * Get 事件集名称，只能包含字母、中文、数字、下划线、连字符，以字母/中文开头，以数字、字母或中文结尾，2~60个字符 
     * @return EventBusName 事件集名称，只能包含字母、中文、数字、下划线、连字符，以字母/中文开头，以数字、字母或中文结尾，2~60个字符
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set 事件集名称，只能包含字母、中文、数字、下划线、连字符，以字母/中文开头，以数字、字母或中文结尾，2~60个字符
     * @param EventBusName 事件集名称，只能包含字母、中文、数字、下划线、连字符，以字母/中文开头，以数字、字母或中文结尾，2~60个字符
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get 事件集描述，只能包含数字、中英文及常用标点符号，不超过200个字符 
     * @return Description 事件集描述，只能包含数字、中英文及常用标点符号，不超过200个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件集描述，只能包含数字、中英文及常用标点符号，不超过200个字符
     * @param Description 事件集描述，只能包含数字、中英文及常用标点符号，不超过200个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get EB存储时长 
     * @return SaveDays EB存储时长
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set EB存储时长
     * @param SaveDays EB存储时长
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get EB是否开启存储 
     * @return EnableStore EB是否开启存储
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set EB是否开启存储
     * @param EnableStore EB是否开启存储
     */
    public void setEnableStore(Boolean EnableStore) {
        this.EnableStore = EnableStore;
    }

    public CreateEventBusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEventBusRequest(CreateEventBusRequest source) {
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.EnableStore != null) {
            this.EnableStore = new Boolean(source.EnableStore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "EnableStore", this.EnableStore);

    }
}

