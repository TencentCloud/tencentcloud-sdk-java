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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQConsumersListInfo extends AbstractModel {

    /**
    * 客户端Ip
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 消费者Tag
    */
    @SerializedName("ConsumerTag")
    @Expose
    private String ConsumerTag;

    /**
     * Get 客户端Ip 
     * @return ClientIp 客户端Ip
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端Ip
     * @param ClientIp 客户端Ip
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 消费者Tag 
     * @return ConsumerTag 消费者Tag
     */
    public String getConsumerTag() {
        return this.ConsumerTag;
    }

    /**
     * Set 消费者Tag
     * @param ConsumerTag 消费者Tag
     */
    public void setConsumerTag(String ConsumerTag) {
        this.ConsumerTag = ConsumerTag;
    }

    public RabbitMQConsumersListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQConsumersListInfo(RabbitMQConsumersListInfo source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ConsumerTag != null) {
            this.ConsumerTag = new String(source.ConsumerTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ConsumerTag", this.ConsumerTag);

    }
}

