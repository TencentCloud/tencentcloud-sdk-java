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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishMsgRequest extends AbstractModel{

    /**
    * Topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 消息内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Qos(目前QoS支持0与1)
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
     * Get Topic 
     * @return Topic Topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic
     * @param Topic Topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 消息内容 
     * @return Message 消息内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 消息内容
     * @param Message 消息内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Qos(目前QoS支持0与1) 
     * @return Qos Qos(目前QoS支持0与1)
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set Qos(目前QoS支持0与1)
     * @param Qos Qos(目前QoS支持0与1)
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Qos", this.Qos);

    }
}

