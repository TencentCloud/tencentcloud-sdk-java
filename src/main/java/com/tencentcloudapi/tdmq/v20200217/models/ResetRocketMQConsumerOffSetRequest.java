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

public class ResetRocketMQConsumerOffSetRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 消费组名称
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 重置方式，0表示从最新位点开始，1表示从指定时间点开始
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 重置指定的时间戳，仅在 Type 为1是生效，以毫秒为单位
    */
    @SerializedName("ResetTimestamp")
    @Expose
    private Long ResetTimestamp;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceId 命名空间名称
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceId 命名空间名称
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 消费组名称 
     * @return GroupId 消费组名称
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 消费组名称
     * @param GroupId 消费组名称
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 重置方式，0表示从最新位点开始，1表示从指定时间点开始 
     * @return Type 重置方式，0表示从最新位点开始，1表示从指定时间点开始
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 重置方式，0表示从最新位点开始，1表示从指定时间点开始
     * @param Type 重置方式，0表示从最新位点开始，1表示从指定时间点开始
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 重置指定的时间戳，仅在 Type 为1是生效，以毫秒为单位 
     * @return ResetTimestamp 重置指定的时间戳，仅在 Type 为1是生效，以毫秒为单位
     */
    public Long getResetTimestamp() {
        return this.ResetTimestamp;
    }

    /**
     * Set 重置指定的时间戳，仅在 Type 为1是生效，以毫秒为单位
     * @param ResetTimestamp 重置指定的时间戳，仅在 Type 为1是生效，以毫秒为单位
     */
    public void setResetTimestamp(Long ResetTimestamp) {
        this.ResetTimestamp = ResetTimestamp;
    }

    public ResetRocketMQConsumerOffSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetRocketMQConsumerOffSetRequest(ResetRocketMQConsumerOffSetRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ResetTimestamp != null) {
            this.ResetTimestamp = new Long(source.ResetTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResetTimestamp", this.ResetTimestamp);

    }
}

