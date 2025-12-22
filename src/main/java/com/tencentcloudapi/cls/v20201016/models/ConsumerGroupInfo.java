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

public class ConsumerGroupInfo extends AbstractModel {

    /**
    * 消费组标识
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
    * topic列表
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
     * Get 消费组标识 
     * @return ConsumerGroup 消费组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组标识
     * @param ConsumerGroup 消费组标识
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
     * Get topic列表 
     * @return Topics topic列表
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set topic列表
     * @param Topics topic列表
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    public ConsumerGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerGroupInfo(ConsumerGroupInfo source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);

    }
}

