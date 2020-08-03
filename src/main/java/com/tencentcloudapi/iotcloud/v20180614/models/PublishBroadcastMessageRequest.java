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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishBroadcastMessageRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 消息内容
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 消息质量等级
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 消息内容 
     * @return Payload 消息内容
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 消息内容
     * @param Payload 消息内容
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 消息质量等级 
     * @return Qos 消息质量等级
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set 消息质量等级
     * @param Qos 消息质量等级
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Qos", this.Qos);

    }
}

