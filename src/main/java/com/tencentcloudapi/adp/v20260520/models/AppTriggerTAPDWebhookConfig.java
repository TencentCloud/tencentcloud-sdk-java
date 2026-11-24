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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerTAPDWebhookConfig extends AbstractModel {

    /**
    * 监听的 TAPD 事件标识，原值传递，1 至 20 个，如 story::create、bug::update。
    */
    @SerializedName("EventList")
    @Expose
    private String [] EventList;

    /**
    * TAPD 项目 ID，不能为空。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 监听的 TAPD 事件标识，原值传递，1 至 20 个，如 story::create、bug::update。 
     * @return EventList 监听的 TAPD 事件标识，原值传递，1 至 20 个，如 story::create、bug::update。
     */
    public String [] getEventList() {
        return this.EventList;
    }

    /**
     * Set 监听的 TAPD 事件标识，原值传递，1 至 20 个，如 story::create、bug::update。
     * @param EventList 监听的 TAPD 事件标识，原值传递，1 至 20 个，如 story::create、bug::update。
     */
    public void setEventList(String [] EventList) {
        this.EventList = EventList;
    }

    /**
     * Get TAPD 项目 ID，不能为空。 
     * @return ProjectId TAPD 项目 ID，不能为空。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set TAPD 项目 ID，不能为空。
     * @param ProjectId TAPD 项目 ID，不能为空。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public AppTriggerTAPDWebhookConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerTAPDWebhookConfig(AppTriggerTAPDWebhookConfig source) {
        if (source.EventList != null) {
            this.EventList = new String[source.EventList.length];
            for (int i = 0; i < source.EventList.length; i++) {
                this.EventList[i] = new String(source.EventList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventList.", this.EventList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

