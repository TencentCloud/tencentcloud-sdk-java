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

public class SendCmqMsgRequest extends AbstractModel{

    /**
    * 队列名
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 消息内容
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * 延迟时间
    */
    @SerializedName("DelaySeconds")
    @Expose
    private Long DelaySeconds;

    /**
     * Get 队列名 
     * @return QueueName 队列名
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名
     * @param QueueName 队列名
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 消息内容 
     * @return MsgContent 消息内容
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set 消息内容
     * @param MsgContent 消息内容
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get 延迟时间 
     * @return DelaySeconds 延迟时间
     */
    public Long getDelaySeconds() {
        return this.DelaySeconds;
    }

    /**
     * Set 延迟时间
     * @param DelaySeconds 延迟时间
     */
    public void setDelaySeconds(Long DelaySeconds) {
        this.DelaySeconds = DelaySeconds;
    }

    public SendCmqMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendCmqMsgRequest(SendCmqMsgRequest source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.DelaySeconds != null) {
            this.DelaySeconds = new Long(source.DelaySeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamSimple(map, prefix + "DelaySeconds", this.DelaySeconds);

    }
}

