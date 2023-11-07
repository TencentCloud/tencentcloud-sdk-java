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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyRocketMQConsumeRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 消费组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间 
     * @return NamespaceId 命名空间
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间
     * @param NamespaceId 命名空间
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 消费组ID 
     * @return GroupId 消费组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 消费组ID
     * @param GroupId 消费组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 消息id 
     * @return MsgId 消息id
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息id
     * @param MsgId 消息id
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get topic名称 
     * @return TopicName topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic名称
     * @param TopicName topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public VerifyRocketMQConsumeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyRocketMQConsumeRequest(VerifyRocketMQConsumeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

