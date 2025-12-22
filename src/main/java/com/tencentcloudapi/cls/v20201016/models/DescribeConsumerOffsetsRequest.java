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

public class DescribeConsumerOffsetsRequest extends AbstractModel {

    /**
    * 日志主题对应的消费组标识
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 时间戳(秒级时间戳)
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 日志集id(日志主题对应的id)
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 分区id
    */
    @SerializedName("PartitionId")
    @Expose
    private String PartitionId;

    /**
     * Get 日志主题对应的消费组标识 
     * @return ConsumerGroup 日志主题对应的消费组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 日志主题对应的消费组标识
     * @param ConsumerGroup 日志主题对应的消费组标识
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 时间戳(秒级时间戳) 
     * @return From 时间戳(秒级时间戳)
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 时间戳(秒级时间戳)
     * @param From 时间戳(秒级时间戳)
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 日志集id(日志主题对应的id) 
     * @return LogsetId 日志集id(日志主题对应的id)
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id(日志主题对应的id)
     * @param LogsetId 日志集id(日志主题对应的id)
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 分区id 
     * @return PartitionId 分区id
     */
    public String getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set 分区id
     * @param PartitionId 分区id
     */
    public void setPartitionId(String PartitionId) {
        this.PartitionId = PartitionId;
    }

    public DescribeConsumerOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerOffsetsRequest(DescribeConsumerOffsetsRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionId != null) {
            this.PartitionId = new String(source.PartitionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);

    }
}

