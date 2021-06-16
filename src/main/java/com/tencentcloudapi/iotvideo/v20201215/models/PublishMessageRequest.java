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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishMessageRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 消息发往的主题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 云端下发到设备的控制报文
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 消息服务质量等级，取值为0或1
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * Payload的内容编码格式，取值为base64或空。base64表示云端将接收到的base64编码后的报文再转换成二进制报文下发至设备，为空表示不作转换，透传下发至设备
    */
    @SerializedName("PayloadEncoding")
    @Expose
    private String PayloadEncoding;

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
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 消息发往的主题 
     * @return Topic 消息发往的主题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 消息发往的主题
     * @param Topic 消息发往的主题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 云端下发到设备的控制报文 
     * @return Payload 云端下发到设备的控制报文
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 云端下发到设备的控制报文
     * @param Payload 云端下发到设备的控制报文
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 消息服务质量等级，取值为0或1 
     * @return Qos 消息服务质量等级，取值为0或1
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set 消息服务质量等级，取值为0或1
     * @param Qos 消息服务质量等级，取值为0或1
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get Payload的内容编码格式，取值为base64或空。base64表示云端将接收到的base64编码后的报文再转换成二进制报文下发至设备，为空表示不作转换，透传下发至设备 
     * @return PayloadEncoding Payload的内容编码格式，取值为base64或空。base64表示云端将接收到的base64编码后的报文再转换成二进制报文下发至设备，为空表示不作转换，透传下发至设备
     */
    public String getPayloadEncoding() {
        return this.PayloadEncoding;
    }

    /**
     * Set Payload的内容编码格式，取值为base64或空。base64表示云端将接收到的base64编码后的报文再转换成二进制报文下发至设备，为空表示不作转换，透传下发至设备
     * @param PayloadEncoding Payload的内容编码格式，取值为base64或空。base64表示云端将接收到的base64编码后的报文再转换成二进制报文下发至设备，为空表示不作转换，透传下发至设备
     */
    public void setPayloadEncoding(String PayloadEncoding) {
        this.PayloadEncoding = PayloadEncoding;
    }

    public PublishMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishMessageRequest(PublishMessageRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
        if (source.PayloadEncoding != null) {
            this.PayloadEncoding = new String(source.PayloadEncoding);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "PayloadEncoding", this.PayloadEncoding);

    }
}

