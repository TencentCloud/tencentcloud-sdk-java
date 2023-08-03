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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledSqlResouceInfo extends AbstractModel{

    /**
    * 目标主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题的地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 主题类型：0为日志主题，1为指标主题
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get 目标主题id 
     * @return TopicId 目标主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 目标主题id
     * @param TopicId 目标主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 主题的地域信息 
     * @return Region 主题的地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 主题的地域信息
     * @param Region 主题的地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 主题类型：0为日志主题，1为指标主题 
     * @return BizType 主题类型：0为日志主题，1为指标主题
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 主题类型：0为日志主题，1为指标主题
     * @param BizType 主题类型：0为日志主题，1为指标主题
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    public ScheduledSqlResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledSqlResouceInfo(ScheduledSqlResouceInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

