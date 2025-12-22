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

public class ModifyConsumerGroupRequest extends AbstractModel {

    /**
    * 更新的目标消费者组标识
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 消费者心跳超时时间（秒）
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 更新的消费者组包含的日志主题列表
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * 日志集Id（日志主题所属的日志集）
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get 更新的目标消费者组标识 
     * @return ConsumerGroup 更新的目标消费者组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 更新的目标消费者组标识
     * @param ConsumerGroup 更新的目标消费者组标识
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 消费者心跳超时时间（秒） 
     * @return Timeout 消费者心跳超时时间（秒）
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 消费者心跳超时时间（秒）
     * @param Timeout 消费者心跳超时时间（秒）
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 更新的消费者组包含的日志主题列表 
     * @return Topics 更新的消费者组包含的日志主题列表
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set 更新的消费者组包含的日志主题列表
     * @param Topics 更新的消费者组包含的日志主题列表
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get 日志集Id（日志主题所属的日志集） 
     * @return LogsetId 日志集Id（日志主题所属的日志集）
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集Id（日志主题所属的日志集）
     * @param LogsetId 日志集Id（日志主题所属的日志集）
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public ModifyConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerGroupRequest(ModifyConsumerGroupRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Topics != null) {
            this.Topics = new String[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new String(source.Topics[i]);
            }
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

