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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchPublishMessageRequest extends AbstractModel {

    /**
    * <p>产品名称</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * <p>主题</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>消息体</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>服务质量</p>
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * <p>消息体编码</p>
    */
    @SerializedName("PayloadEncoding")
    @Expose
    private String PayloadEncoding;

    /**
     * Get <p>产品名称</p> 
     * @return ProductId <p>产品名称</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品名称</p>
     * @param ProductId <p>产品名称</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceNames <p>设备名称</p>
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceNames <p>设备名称</p>
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get <p>主题</p> 
     * @return Topic <p>主题</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题</p>
     * @param Topic <p>主题</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>消息体</p> 
     * @return Payload <p>消息体</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>消息体</p>
     * @param Payload <p>消息体</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>服务质量</p> 
     * @return Qos <p>服务质量</p>
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set <p>服务质量</p>
     * @param Qos <p>服务质量</p>
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>消息体编码</p> 
     * @return PayloadEncoding <p>消息体编码</p>
     */
    public String getPayloadEncoding() {
        return this.PayloadEncoding;
    }

    /**
     * Set <p>消息体编码</p>
     * @param PayloadEncoding <p>消息体编码</p>
     */
    public void setPayloadEncoding(String PayloadEncoding) {
        this.PayloadEncoding = PayloadEncoding;
    }

    public BatchPublishMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchPublishMessageRequest(BatchPublishMessageRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
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
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "PayloadEncoding", this.PayloadEncoding);

    }
}

