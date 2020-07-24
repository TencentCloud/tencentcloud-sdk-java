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
    * 日志主题的名字
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题分区 partition个数，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
     * Get 日志主题的名字 
     * @return TopicName 日志主题的名字
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题的名字
     * @param TopicName 日志主题的名字
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题分区 partition个数，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。 
     * @return PartitionCount 主题分区 partition个数，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 主题分区 partition个数，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
     * @param PartitionCount 主题分区 partition个数，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);

    }
}

