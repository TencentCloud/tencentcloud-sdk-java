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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Notification extends AbstractModel{

    /**
    * CMQ主题名字，要求主题名有效且关联订阅
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 事件配置
    */
    @SerializedName("EventConfigs")
    @Expose
    private EventConfig [] EventConfigs;

    /**
     * Get CMQ主题名字，要求主题名有效且关联订阅 
     * @return TopicName CMQ主题名字，要求主题名有效且关联订阅
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set CMQ主题名字，要求主题名有效且关联订阅
     * @param TopicName CMQ主题名字，要求主题名有效且关联订阅
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 事件配置 
     * @return EventConfigs 事件配置
     */
    public EventConfig [] getEventConfigs() {
        return this.EventConfigs;
    }

    /**
     * Set 事件配置
     * @param EventConfigs 事件配置
     */
    public void setEventConfigs(EventConfig [] EventConfigs) {
        this.EventConfigs = EventConfigs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArrayObj(map, prefix + "EventConfigs.", this.EventConfigs);

    }
}

