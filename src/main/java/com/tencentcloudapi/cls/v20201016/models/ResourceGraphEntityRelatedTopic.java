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

public class ResourceGraphEntityRelatedTopic extends AbstractModel {

    /**
    * <p>日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志主题所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>日志类型</p><p>枚举值：</p><ul><li>bussinesslog： 业务日志</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>日志类型</p><p>枚举值：</p><ul><li>0： 日志主题</li><li>1： 指标主题</li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
     * Get <p>日志主题id</p> 
     * @return TopicId <p>日志主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p>
     * @param TopicId <p>日志主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志主题所在地域</p> 
     * @return Region <p>日志主题所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>日志主题所在地域</p>
     * @param Region <p>日志主题所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>日志类型</p><p>枚举值：</p><ul><li>bussinesslog： 业务日志</li></ul> 
     * @return LogType <p>日志类型</p><p>枚举值：</p><ul><li>bussinesslog： 业务日志</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型</p><p>枚举值：</p><ul><li>bussinesslog： 业务日志</li></ul>
     * @param LogType <p>日志类型</p><p>枚举值：</p><ul><li>bussinesslog： 业务日志</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>日志类型</p><p>枚举值：</p><ul><li>0： 日志主题</li><li>1： 指标主题</li></ul> 
     * @return BizType <p>日志类型</p><p>枚举值：</p><ul><li>0： 日志主题</li><li>1： 指标主题</li></ul>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>日志类型</p><p>枚举值：</p><ul><li>0： 日志主题</li><li>1： 指标主题</li></ul>
     * @param BizType <p>日志类型</p><p>枚举值：</p><ul><li>0： 日志主题</li><li>1： 指标主题</li></ul>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    public ResourceGraphEntityRelatedTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGraphEntityRelatedTopic(ResourceGraphEntityRelatedTopic source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

