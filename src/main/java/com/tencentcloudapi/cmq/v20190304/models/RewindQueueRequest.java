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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewindQueueRequest extends AbstractModel{

    /**
    * QueueName
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 设定该时间，则（Batch）receiveMessage接口，会按照生产消息的先后顺序消费该时间戳以后的消息。
    */
    @SerializedName("StartConsumeTime")
    @Expose
    private Long StartConsumeTime;

    /**
     * Get QueueName 
     * @return QueueName QueueName
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set QueueName
     * @param QueueName QueueName
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 设定该时间，则（Batch）receiveMessage接口，会按照生产消息的先后顺序消费该时间戳以后的消息。 
     * @return StartConsumeTime 设定该时间，则（Batch）receiveMessage接口，会按照生产消息的先后顺序消费该时间戳以后的消息。
     */
    public Long getStartConsumeTime() {
        return this.StartConsumeTime;
    }

    /**
     * Set 设定该时间，则（Batch）receiveMessage接口，会按照生产消息的先后顺序消费该时间戳以后的消息。
     * @param StartConsumeTime 设定该时间，则（Batch）receiveMessage接口，会按照生产消息的先后顺序消费该时间戳以后的消息。
     */
    public void setStartConsumeTime(Long StartConsumeTime) {
        this.StartConsumeTime = StartConsumeTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "StartConsumeTime", this.StartConsumeTime);

    }
}

