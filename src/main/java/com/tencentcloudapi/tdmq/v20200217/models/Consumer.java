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

public class Consumer extends AbstractModel {

    /**
    * 消费者开始连接的时间。
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * 消费者地址。
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * 消费者名称。
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * 消费者版本。
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * 消费者连接的主题分区号
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get 消费者开始连接的时间。 
     * @return ConnectedSince 消费者开始连接的时间。
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set 消费者开始连接的时间。
     * @param ConnectedSince 消费者开始连接的时间。
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get 消费者地址。 
     * @return ConsumerAddr 消费者地址。
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set 消费者地址。
     * @param ConsumerAddr 消费者地址。
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
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
     * Get 消费者版本。 
     * @return ClientVersion 消费者版本。
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set 消费者版本。
     * @param ClientVersion 消费者版本。
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get 消费者连接的主题分区号 
     * @return Partition 消费者连接的主题分区号
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 消费者连接的主题分区号
     * @param Partition 消费者连接的主题分区号
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public Consumer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Consumer(Consumer source) {
        if (source.ConnectedSince != null) {
            this.ConnectedSince = new String(source.ConnectedSince);
        }
        if (source.ConsumerAddr != null) {
            this.ConsumerAddr = new String(source.ConsumerAddr);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

