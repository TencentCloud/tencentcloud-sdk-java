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

public class SendRocketMQMessageRequest extends AbstractModel{

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
    * topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 信息内容
    */
    @SerializedName("MsgBody")
    @Expose
    private String MsgBody;

    /**
    * 消息key信息
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * 消息tag信息
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

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

    /**
     * Get 信息内容 
     * @return MsgBody 信息内容
     */
    public String getMsgBody() {
        return this.MsgBody;
    }

    /**
     * Set 信息内容
     * @param MsgBody 信息内容
     */
    public void setMsgBody(String MsgBody) {
        this.MsgBody = MsgBody;
    }

    /**
     * Get 消息key信息 
     * @return MsgKey 消息key信息
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息key信息
     * @param MsgKey 消息key信息
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get 消息tag信息 
     * @return MsgTag 消息tag信息
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set 消息tag信息
     * @param MsgTag 消息tag信息
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    public SendRocketMQMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendRocketMQMessageRequest(SendRocketMQMessageRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgBody != null) {
            this.MsgBody = new String(source.MsgBody);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String(source.MsgTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgBody", this.MsgBody);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "MsgTag", this.MsgTag);

    }
}

