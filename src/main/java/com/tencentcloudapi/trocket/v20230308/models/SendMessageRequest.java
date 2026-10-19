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
    * <p>消息内容</p>
    */
    @SerializedName("MsgBody")
    @Expose
    private String MsgBody;

    /**
    * <p>消息Key</p>
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * <p>消息Tag</p>
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

    /**
    * <p>轻量主题</p>
    */
    @SerializedName("LiteTopic")
    @Expose
    private String LiteTopic;

    /**
    * <p>指定队列优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
     * Get <p>消息内容</p> 
     * @return MsgBody <p>消息内容</p>
     */
    public String getMsgBody() {
        return this.MsgBody;
    }

    /**
     * Set <p>消息内容</p>
     * @param MsgBody <p>消息内容</p>
     */
    public void setMsgBody(String MsgBody) {
        this.MsgBody = MsgBody;
    }

    /**
     * Get <p>消息Key</p> 
     * @return MsgKey <p>消息Key</p>
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set <p>消息Key</p>
     * @param MsgKey <p>消息Key</p>
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get <p>消息Tag</p> 
     * @return MsgTag <p>消息Tag</p>
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set <p>消息Tag</p>
     * @param MsgTag <p>消息Tag</p>
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    /**
     * Get <p>轻量主题</p> 
     * @return LiteTopic <p>轻量主题</p>
     */
    public String getLiteTopic() {
        return this.LiteTopic;
    }

    /**
     * Set <p>轻量主题</p>
     * @param LiteTopic <p>轻量主题</p>
     */
    public void setLiteTopic(String LiteTopic) {
        this.LiteTopic = LiteTopic;
    }

    /**
     * Get <p>指定队列优先级</p> 
     * @return Priority <p>指定队列优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>指定队列优先级</p>
     * @param Priority <p>指定队列优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
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
        if (source.LiteTopic != null) {
            this.LiteTopic = new String(source.LiteTopic);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
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
        this.setParamSimple(map, prefix + "LiteTopic", this.LiteTopic);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

