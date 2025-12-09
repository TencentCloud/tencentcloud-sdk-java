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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQConsumeStatsRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 消费组
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
     * Get 实例ID 
     * @return ClusterId 实例ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 实例ID
     * @param ClusterId 实例ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default 
     * @return NamespaceId 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
     * @param NamespaceId 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 消费组 
     * @return ConsumerGroup 消费组
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组
     * @param ConsumerGroup 消费组
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    public DescribeRocketMQConsumeStatsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQConsumeStatsRequest(DescribeRocketMQConsumeStatsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);

    }
}

