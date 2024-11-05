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

public class ConsumerLog extends AbstractModel {

    /**
    * 消息ID。
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消费组。
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 消费者名称。
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * 消费时间。
    */
    @SerializedName("ConsumeTime")
    @Expose
    private String ConsumeTime;

    /**
    * 消费者客户端地址。
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * 消费耗时（毫秒）。
    */
    @SerializedName("ConsumeUseTime")
    @Expose
    private Long ConsumeUseTime;

    /**
    * 消费状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 消息ID。 
     * @return MsgId 消息ID。
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息ID。
     * @param MsgId 消息ID。
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 消费组。 
     * @return ConsumerGroup 消费组。
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组。
     * @param ConsumerGroup 消费组。
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 消费者名称。 
     * @return ConsumerName 消费者名称。
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set 消费者名称。
     * @param ConsumerName 消费者名称。
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get 消费时间。 
     * @return ConsumeTime 消费时间。
     */
    public String getConsumeTime() {
        return this.ConsumeTime;
    }

    /**
     * Set 消费时间。
     * @param ConsumeTime 消费时间。
     */
    public void setConsumeTime(String ConsumeTime) {
        this.ConsumeTime = ConsumeTime;
    }

    /**
     * Get 消费者客户端地址。 
     * @return ConsumerAddr 消费者客户端地址。
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set 消费者客户端地址。
     * @param ConsumerAddr 消费者客户端地址。
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
    }

    /**
     * Get 消费耗时（毫秒）。 
     * @return ConsumeUseTime 消费耗时（毫秒）。
     */
    public Long getConsumeUseTime() {
        return this.ConsumeUseTime;
    }

    /**
     * Set 消费耗时（毫秒）。
     * @param ConsumeUseTime 消费耗时（毫秒）。
     */
    public void setConsumeUseTime(Long ConsumeUseTime) {
        this.ConsumeUseTime = ConsumeUseTime;
    }

    /**
     * Get 消费状态。 
     * @return Status 消费状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 消费状态。
     * @param Status 消费状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConsumerLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLog(ConsumerLog source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.ConsumeTime != null) {
            this.ConsumeTime = new String(source.ConsumeTime);
        }
        if (source.ConsumerAddr != null) {
            this.ConsumerAddr = new String(source.ConsumerAddr);
        }
        if (source.ConsumeUseTime != null) {
            this.ConsumeUseTime = new Long(source.ConsumeUseTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "ConsumeTime", this.ConsumeTime);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumeUseTime", this.ConsumeUseTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

