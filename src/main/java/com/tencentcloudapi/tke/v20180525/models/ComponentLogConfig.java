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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentLogConfig extends AbstractModel {

    /**
    * 组件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 日志级别，对于支持动态调整日志级别的组件，开启日志时可指定该参数
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
    * 日志集ID。如果不指定，则自动创建
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志主题ID。如果不指定，则自动创建
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * topic 所属region。 该参数可实现日志跨地域投递
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
     * Get 组件名称 
     * @return Name 组件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组件名称
     * @param Name 组件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 日志级别，对于支持动态调整日志级别的组件，开启日志时可指定该参数 
     * @return LogLevel 日志级别，对于支持动态调整日志级别的组件，开启日志时可指定该参数
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 日志级别，对于支持动态调整日志级别的组件，开启日志时可指定该参数
     * @param LogLevel 日志级别，对于支持动态调整日志级别的组件，开启日志时可指定该参数
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get 日志集ID。如果不指定，则自动创建 
     * @return LogSetId 日志集ID。如果不指定，则自动创建
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 日志集ID。如果不指定，则自动创建
     * @param LogSetId 日志集ID。如果不指定，则自动创建
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 日志主题ID。如果不指定，则自动创建 
     * @return TopicId 日志主题ID。如果不指定，则自动创建
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID。如果不指定，则自动创建
     * @param TopicId 日志主题ID。如果不指定，则自动创建
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get topic 所属region。 该参数可实现日志跨地域投递 
     * @return TopicRegion topic 所属region。 该参数可实现日志跨地域投递
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set topic 所属region。 该参数可实现日志跨地域投递
     * @param TopicRegion topic 所属region。 该参数可实现日志跨地域投递
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
    }

    public ComponentLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentLogConfig(ComponentLogConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);

    }
}

