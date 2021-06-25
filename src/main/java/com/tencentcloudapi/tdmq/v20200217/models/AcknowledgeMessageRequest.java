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

public class AcknowledgeMessageRequest extends AbstractModel{

    /**
    * 用作标识消息的唯一的ID（可从 receiveMessage 的返回值中获得）
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Topic 名字（可从 receiveMessage 的返回值中获得）这里尽量需要使用topic的全路径，即：tenant/namespace/topic。如果不指定，默认使用的是：public/default
    */
    @SerializedName("AckTopic")
    @Expose
    private String AckTopic;

    /**
    * 订阅者的名字，可以从receiveMessage的返回值中获取到。这里尽量与receiveMessage中的订阅者保持一致，否则没办法正确ack 接收回来的消息。
    */
    @SerializedName("SubName")
    @Expose
    private String SubName;

    /**
     * Get 用作标识消息的唯一的ID（可从 receiveMessage 的返回值中获得） 
     * @return MessageId 用作标识消息的唯一的ID（可从 receiveMessage 的返回值中获得）
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 用作标识消息的唯一的ID（可从 receiveMessage 的返回值中获得）
     * @param MessageId 用作标识消息的唯一的ID（可从 receiveMessage 的返回值中获得）
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Topic 名字（可从 receiveMessage 的返回值中获得）这里尽量需要使用topic的全路径，即：tenant/namespace/topic。如果不指定，默认使用的是：public/default 
     * @return AckTopic Topic 名字（可从 receiveMessage 的返回值中获得）这里尽量需要使用topic的全路径，即：tenant/namespace/topic。如果不指定，默认使用的是：public/default
     */
    public String getAckTopic() {
        return this.AckTopic;
    }

    /**
     * Set Topic 名字（可从 receiveMessage 的返回值中获得）这里尽量需要使用topic的全路径，即：tenant/namespace/topic。如果不指定，默认使用的是：public/default
     * @param AckTopic Topic 名字（可从 receiveMessage 的返回值中获得）这里尽量需要使用topic的全路径，即：tenant/namespace/topic。如果不指定，默认使用的是：public/default
     */
    public void setAckTopic(String AckTopic) {
        this.AckTopic = AckTopic;
    }

    /**
     * Get 订阅者的名字，可以从receiveMessage的返回值中获取到。这里尽量与receiveMessage中的订阅者保持一致，否则没办法正确ack 接收回来的消息。 
     * @return SubName 订阅者的名字，可以从receiveMessage的返回值中获取到。这里尽量与receiveMessage中的订阅者保持一致，否则没办法正确ack 接收回来的消息。
     */
    public String getSubName() {
        return this.SubName;
    }

    /**
     * Set 订阅者的名字，可以从receiveMessage的返回值中获取到。这里尽量与receiveMessage中的订阅者保持一致，否则没办法正确ack 接收回来的消息。
     * @param SubName 订阅者的名字，可以从receiveMessage的返回值中获取到。这里尽量与receiveMessage中的订阅者保持一致，否则没办法正确ack 接收回来的消息。
     */
    public void setSubName(String SubName) {
        this.SubName = SubName;
    }

    public AcknowledgeMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcknowledgeMessageRequest(AcknowledgeMessageRequest source) {
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.AckTopic != null) {
            this.AckTopic = new String(source.AckTopic);
        }
        if (source.SubName != null) {
            this.SubName = new String(source.SubName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "AckTopic", this.AckTopic);
        this.setParamSimple(map, prefix + "SubName", this.SubName);

    }
}

