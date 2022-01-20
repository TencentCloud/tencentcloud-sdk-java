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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel{

    /**
    * 日志主题的名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * 日志集的保存周期，单位：天，默认30天。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 日志主题的名称。 
     * @return TopicName 日志主题的名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题的名称。
     * @param TopicName 日志主题的名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。 
     * @return PartitionCount 主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
     * @param PartitionCount 主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。 
     * @return TopicType 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     * @param TopicType 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 日志集的保存周期，单位：天，默认30天。 
     * @return Period 日志集的保存周期，单位：天，默认30天。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志集的保存周期，单位：天，默认30天。
     * @param Period 日志集的保存周期，单位：天，默认30天。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

