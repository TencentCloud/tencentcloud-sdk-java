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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMessageRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 消息内容
    */
    @SerializedName("MsgBody")
    @Expose
    private String MsgBody;

    /**
    * 消息Key
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * 消息Tag
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。 
     * @return Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     * @param Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 消息内容 
     * @return MsgBody 消息内容
     */
    public String getMsgBody() {
        return this.MsgBody;
    }

    /**
     * Set 消息内容
     * @param MsgBody 消息内容
     */
    public void setMsgBody(String MsgBody) {
        this.MsgBody = MsgBody;
    }

    /**
     * Get 消息Key 
     * @return MsgKey 消息Key
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息Key
     * @param MsgKey 消息Key
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get 消息Tag 
     * @return MsgTag 消息Tag
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set 消息Tag
     * @param MsgTag 消息Tag
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    public SendMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMessageRequest(SendMessageRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MsgBody", this.MsgBody);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "MsgTag", this.MsgTag);

    }
}

