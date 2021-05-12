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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetMsgSubOffsetByTimestampRequest extends AbstractModel{

    /**
    * 命名空间名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 订阅者名称。
    */
    @SerializedName("Subscription")
    @Expose
    private String Subscription;

    /**
    * 时间戳，精确到毫秒。
    */
    @SerializedName("ToTimestamp")
    @Expose
    private Long ToTimestamp;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 命名空间名称。 
     * @return EnvironmentId 命名空间名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间名称。
     * @param EnvironmentId 命名空间名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 订阅者名称。 
     * @return Subscription 订阅者名称。
     */
    public String getSubscription() {
        return this.Subscription;
    }

    /**
     * Set 订阅者名称。
     * @param Subscription 订阅者名称。
     */
    public void setSubscription(String Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get 时间戳，精确到毫秒。 
     * @return ToTimestamp 时间戳，精确到毫秒。
     */
    public Long getToTimestamp() {
        return this.ToTimestamp;
    }

    /**
     * Set 时间戳，精确到毫秒。
     * @param ToTimestamp 时间戳，精确到毫秒。
     */
    public void setToTimestamp(Long ToTimestamp) {
        this.ToTimestamp = ToTimestamp;
    }

    /**
     * Get Pulsar 集群的ID 
     * @return ClusterId Pulsar 集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID
     * @param ClusterId Pulsar 集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public ResetMsgSubOffsetByTimestampRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetMsgSubOffsetByTimestampRequest(ResetMsgSubOffsetByTimestampRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Subscription != null) {
            this.Subscription = new String(source.Subscription);
        }
        if (source.ToTimestamp != null) {
            this.ToTimestamp = new Long(source.ToTimestamp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Subscription", this.Subscription);
        this.setParamSimple(map, prefix + "ToTimestamp", this.ToTimestamp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

