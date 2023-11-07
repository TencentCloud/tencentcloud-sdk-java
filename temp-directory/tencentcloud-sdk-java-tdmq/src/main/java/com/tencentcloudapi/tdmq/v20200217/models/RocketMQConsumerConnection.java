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

public class RocketMQConsumerConnection extends AbstractModel {

    /**
    * 消费者实例ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 消费者实例的地址和端口
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * 消费者应用的语言版本
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 消息堆积量
    */
    @SerializedName("Accumulative")
    @Expose
    private Long Accumulative;

    /**
    * 消费端版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 消费者实例ID 
     * @return ClientId 消费者实例ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 消费者实例ID
     * @param ClientId 消费者实例ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 消费者实例的地址和端口 
     * @return ClientAddr 消费者实例的地址和端口
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set 消费者实例的地址和端口
     * @param ClientAddr 消费者实例的地址和端口
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get 消费者应用的语言版本 
     * @return Language 消费者应用的语言版本
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 消费者应用的语言版本
     * @param Language 消费者应用的语言版本
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 消息堆积量 
     * @return Accumulative 消息堆积量
     */
    public Long getAccumulative() {
        return this.Accumulative;
    }

    /**
     * Set 消息堆积量
     * @param Accumulative 消息堆积量
     */
    public void setAccumulative(Long Accumulative) {
        this.Accumulative = Accumulative;
    }

    /**
     * Get 消费端版本 
     * @return Version 消费端版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 消费端版本
     * @param Version 消费端版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public RocketMQConsumerConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQConsumerConnection(RocketMQConsumerConnection source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Accumulative != null) {
            this.Accumulative = new Long(source.Accumulative);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Accumulative", this.Accumulative);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

