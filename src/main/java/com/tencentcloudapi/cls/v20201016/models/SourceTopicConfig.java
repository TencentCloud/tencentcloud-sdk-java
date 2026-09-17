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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceTopicConfig extends AbstractModel {

    /**
    * <p>日志主题筛选方式。</p><p>枚举值：</p><ul><li>1： 静态选择</li></ul>
    */
    @SerializedName("TopicFilterType")
    @Expose
    private Long TopicFilterType;

    /**
    * <p>源日志集id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>源日志主题列表</p><p>TopicFilterType=1时必填</p>
    */
    @SerializedName("Topics")
    @Expose
    private SourceTopicInfo [] Topics;

    /**
     * Get <p>日志主题筛选方式。</p><p>枚举值：</p><ul><li>1： 静态选择</li></ul> 
     * @return TopicFilterType <p>日志主题筛选方式。</p><p>枚举值：</p><ul><li>1： 静态选择</li></ul>
     */
    public Long getTopicFilterType() {
        return this.TopicFilterType;
    }

    /**
     * Set <p>日志主题筛选方式。</p><p>枚举值：</p><ul><li>1： 静态选择</li></ul>
     * @param TopicFilterType <p>日志主题筛选方式。</p><p>枚举值：</p><ul><li>1： 静态选择</li></ul>
     */
    public void setTopicFilterType(Long TopicFilterType) {
        this.TopicFilterType = TopicFilterType;
    }

    /**
     * Get <p>源日志集id</p> 
     * @return LogsetId <p>源日志集id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>源日志集id</p>
     * @param LogsetId <p>源日志集id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>源日志主题列表</p><p>TopicFilterType=1时必填</p> 
     * @return Topics <p>源日志主题列表</p><p>TopicFilterType=1时必填</p>
     */
    public SourceTopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>源日志主题列表</p><p>TopicFilterType=1时必填</p>
     * @param Topics <p>源日志主题列表</p><p>TopicFilterType=1时必填</p>
     */
    public void setTopics(SourceTopicInfo [] Topics) {
        this.Topics = Topics;
    }

    public SourceTopicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceTopicConfig(SourceTopicConfig source) {
        if (source.TopicFilterType != null) {
            this.TopicFilterType = new Long(source.TopicFilterType);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Topics != null) {
            this.Topics = new SourceTopicInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new SourceTopicInfo(source.Topics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicFilterType", this.TopicFilterType);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);

    }
}

