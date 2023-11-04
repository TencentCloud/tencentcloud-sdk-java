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

public class MsgLog extends AbstractModel {

    /**
    * 消息ID。
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 生产者名称。
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 生产时间。
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 生产客户端地址。
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

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
     * Get 生产者名称。 
     * @return ProducerName 生产者名称。
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 生产者名称。
     * @param ProducerName 生产者名称。
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 生产时间。 
     * @return ProduceTime 生产时间。
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 生产时间。
     * @param ProduceTime 生产时间。
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 生产客户端地址。 
     * @return ProducerAddr 生产客户端地址。
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set 生产客户端地址。
     * @param ProducerAddr 生产客户端地址。
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    public MsgLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgLog(MsgLog source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);

    }
}

