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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationTarget extends AbstractModel{

    /**
    * 目标类型，取值范围包括`CMQ_QUEUE`、`CMQ_TOPIC`。
<li> CMQ_QUEUE，指腾讯云消息队列-队列模型。</li>
<li> CMQ_TOPIC，指腾讯云消息队列-主题模型。</li>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 队列名称，如果`TargetType`取值为`CMQ_QUEUE`，则本字段必填。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 主题名称，如果`TargetType`取值为`CMQ_TOPIC`，则本字段必填。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 目标类型，取值范围包括`CMQ_QUEUE`、`CMQ_TOPIC`。
<li> CMQ_QUEUE，指腾讯云消息队列-队列模型。</li>
<li> CMQ_TOPIC，指腾讯云消息队列-主题模型。</li> 
     * @return TargetType 目标类型，取值范围包括`CMQ_QUEUE`、`CMQ_TOPIC`。
<li> CMQ_QUEUE，指腾讯云消息队列-队列模型。</li>
<li> CMQ_TOPIC，指腾讯云消息队列-主题模型。</li>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目标类型，取值范围包括`CMQ_QUEUE`、`CMQ_TOPIC`。
<li> CMQ_QUEUE，指腾讯云消息队列-队列模型。</li>
<li> CMQ_TOPIC，指腾讯云消息队列-主题模型。</li>
     * @param TargetType 目标类型，取值范围包括`CMQ_QUEUE`、`CMQ_TOPIC`。
<li> CMQ_QUEUE，指腾讯云消息队列-队列模型。</li>
<li> CMQ_TOPIC，指腾讯云消息队列-主题模型。</li>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 队列名称，如果`TargetType`取值为`CMQ_QUEUE`，则本字段必填。 
     * @return QueueName 队列名称，如果`TargetType`取值为`CMQ_QUEUE`，则本字段必填。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称，如果`TargetType`取值为`CMQ_QUEUE`，则本字段必填。
     * @param QueueName 队列名称，如果`TargetType`取值为`CMQ_QUEUE`，则本字段必填。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 主题名称，如果`TargetType`取值为`CMQ_TOPIC`，则本字段必填。 
     * @return TopicName 主题名称，如果`TargetType`取值为`CMQ_TOPIC`，则本字段必填。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称，如果`TargetType`取值为`CMQ_TOPIC`，则本字段必填。
     * @param TopicName 主题名称，如果`TargetType`取值为`CMQ_TOPIC`，则本字段必填。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

