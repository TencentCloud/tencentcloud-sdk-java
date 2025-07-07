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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiveMessageRequest extends AbstractModel {

    /**
    * 接收消息的topic的名字, 这里尽量需要使用topic的全路径，如果不指定，即：tenant/namespace/topic。默认使用的是：public/default
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 订阅者的名字
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * 默认值为1000，consumer接收的消息会首先存储到receiverQueueSize这个队列中，用作调优接收消息的速率
    */
    @SerializedName("ReceiverQueueSize")
    @Expose
    private Long ReceiverQueueSize;

    /**
    * 默认值为：Earliest。用作判定consumer初始接收消息的位置，可选参数为：Earliest, Latest
    */
    @SerializedName("SubInitialPosition")
    @Expose
    private String SubInitialPosition;

    /**
    * 用于设置BatchReceivePolicy，指在一次batch中最多接收多少条消息，默认是 0。即不开启BatchReceivePolicy
    */
    @SerializedName("MaxNumMessages")
    @Expose
    private Long MaxNumMessages;

    /**
    * 用于设置BatchReceivePolicy，指在一次batch中最多接收的消息体有多大，单位是 bytes。默认是 0，即不开启BatchReceivePolicy
    */
    @SerializedName("MaxNumBytes")
    @Expose
    private Long MaxNumBytes;

    /**
    * 用于设置BatchReceivePolicy，指在一次batch消息的接收z中最多等待的超时时间，单位是毫秒。默认是 0，即不开启BatchReceivePolicy
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 接收消息的topic的名字, 这里尽量需要使用topic的全路径，如果不指定，即：tenant/namespace/topic。默认使用的是：public/default 
     * @return Topic 接收消息的topic的名字, 这里尽量需要使用topic的全路径，如果不指定，即：tenant/namespace/topic。默认使用的是：public/default
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 接收消息的topic的名字, 这里尽量需要使用topic的全路径，如果不指定，即：tenant/namespace/topic。默认使用的是：public/default
     * @param Topic 接收消息的topic的名字, 这里尽量需要使用topic的全路径，如果不指定，即：tenant/namespace/topic。默认使用的是：public/default
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 订阅者的名字 
     * @return SubscriptionName 订阅者的名字
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 订阅者的名字
     * @param SubscriptionName 订阅者的名字
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get 默认值为1000，consumer接收的消息会首先存储到receiverQueueSize这个队列中，用作调优接收消息的速率 
     * @return ReceiverQueueSize 默认值为1000，consumer接收的消息会首先存储到receiverQueueSize这个队列中，用作调优接收消息的速率
     */
    public Long getReceiverQueueSize() {
        return this.ReceiverQueueSize;
    }

    /**
     * Set 默认值为1000，consumer接收的消息会首先存储到receiverQueueSize这个队列中，用作调优接收消息的速率
     * @param ReceiverQueueSize 默认值为1000，consumer接收的消息会首先存储到receiverQueueSize这个队列中，用作调优接收消息的速率
     */
    public void setReceiverQueueSize(Long ReceiverQueueSize) {
        this.ReceiverQueueSize = ReceiverQueueSize;
    }

    /**
     * Get 默认值为：Earliest。用作判定consumer初始接收消息的位置，可选参数为：Earliest, Latest 
     * @return SubInitialPosition 默认值为：Earliest。用作判定consumer初始接收消息的位置，可选参数为：Earliest, Latest
     */
    public String getSubInitialPosition() {
        return this.SubInitialPosition;
    }

    /**
     * Set 默认值为：Earliest。用作判定consumer初始接收消息的位置，可选参数为：Earliest, Latest
     * @param SubInitialPosition 默认值为：Earliest。用作判定consumer初始接收消息的位置，可选参数为：Earliest, Latest
     */
    public void setSubInitialPosition(String SubInitialPosition) {
        this.SubInitialPosition = SubInitialPosition;
    }

    /**
     * Get 用于设置BatchReceivePolicy，指在一次batch中最多接收多少条消息，默认是 0。即不开启BatchReceivePolicy 
     * @return MaxNumMessages 用于设置BatchReceivePolicy，指在一次batch中最多接收多少条消息，默认是 0。即不开启BatchReceivePolicy
     */
    public Long getMaxNumMessages() {
        return this.MaxNumMessages;
    }

    /**
     * Set 用于设置BatchReceivePolicy，指在一次batch中最多接收多少条消息，默认是 0。即不开启BatchReceivePolicy
     * @param MaxNumMessages 用于设置BatchReceivePolicy，指在一次batch中最多接收多少条消息，默认是 0。即不开启BatchReceivePolicy
     */
    public void setMaxNumMessages(Long MaxNumMessages) {
        this.MaxNumMessages = MaxNumMessages;
    }

    /**
     * Get 用于设置BatchReceivePolicy，指在一次batch中最多接收的消息体有多大，单位是 bytes。默认是 0，即不开启BatchReceivePolicy 
     * @return MaxNumBytes 用于设置BatchReceivePolicy，指在一次batch中最多接收的消息体有多大，单位是 bytes。默认是 0，即不开启BatchReceivePolicy
     */
    public Long getMaxNumBytes() {
        return this.MaxNumBytes;
    }

    /**
     * Set 用于设置BatchReceivePolicy，指在一次batch中最多接收的消息体有多大，单位是 bytes。默认是 0，即不开启BatchReceivePolicy
     * @param MaxNumBytes 用于设置BatchReceivePolicy，指在一次batch中最多接收的消息体有多大，单位是 bytes。默认是 0，即不开启BatchReceivePolicy
     */
    public void setMaxNumBytes(Long MaxNumBytes) {
        this.MaxNumBytes = MaxNumBytes;
    }

    /**
     * Get 用于设置BatchReceivePolicy，指在一次batch消息的接收z中最多等待的超时时间，单位是毫秒。默认是 0，即不开启BatchReceivePolicy 
     * @return Timeout 用于设置BatchReceivePolicy，指在一次batch消息的接收z中最多等待的超时时间，单位是毫秒。默认是 0，即不开启BatchReceivePolicy
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 用于设置BatchReceivePolicy，指在一次batch消息的接收z中最多等待的超时时间，单位是毫秒。默认是 0，即不开启BatchReceivePolicy
     * @param Timeout 用于设置BatchReceivePolicy，指在一次batch消息的接收z中最多等待的超时时间，单位是毫秒。默认是 0，即不开启BatchReceivePolicy
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public ReceiveMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiveMessageRequest(ReceiveMessageRequest source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.ReceiverQueueSize != null) {
            this.ReceiverQueueSize = new Long(source.ReceiverQueueSize);
        }
        if (source.SubInitialPosition != null) {
            this.SubInitialPosition = new String(source.SubInitialPosition);
        }
        if (source.MaxNumMessages != null) {
            this.MaxNumMessages = new Long(source.MaxNumMessages);
        }
        if (source.MaxNumBytes != null) {
            this.MaxNumBytes = new Long(source.MaxNumBytes);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "ReceiverQueueSize", this.ReceiverQueueSize);
        this.setParamSimple(map, prefix + "SubInitialPosition", this.SubInitialPosition);
        this.setParamSimple(map, prefix + "MaxNumMessages", this.MaxNumMessages);
        this.setParamSimple(map, prefix + "MaxNumBytes", this.MaxNumBytes);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

