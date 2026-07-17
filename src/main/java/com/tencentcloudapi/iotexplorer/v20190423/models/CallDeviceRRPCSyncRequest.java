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

public class CallDeviceRRPCSyncRequest extends AbstractModel {

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>业务原始 payload，透传给设备</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>下行传输层编码标识；base64 时下发到 broker 的 payload 会做一次 base64 编码</p>
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * <p>自定义下行 topic；为空则用 <code>$iotrrpc/down/{ProductId}/{DeviceName}/{mid}</code></p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>自定义上行 topic 模板（支持通配符）；可留空，留空时仅依赖 clientToken 关联 ack</p>
    */
    @SerializedName("ReplyTopic")
    @Expose
    private String ReplyTopic;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名</p> 
     * @return DeviceName <p>设备名</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名</p>
     * @param DeviceName <p>设备名</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>业务原始 payload，透传给设备</p> 
     * @return Payload <p>业务原始 payload，透传给设备</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>业务原始 payload，透传给设备</p>
     * @param Payload <p>业务原始 payload，透传给设备</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>下行传输层编码标识；base64 时下发到 broker 的 payload 会做一次 base64 编码</p> 
     * @return Encoding <p>下行传输层编码标识；base64 时下发到 broker 的 payload 会做一次 base64 编码</p>
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set <p>下行传输层编码标识；base64 时下发到 broker 的 payload 会做一次 base64 编码</p>
     * @param Encoding <p>下行传输层编码标识；base64 时下发到 broker 的 payload 会做一次 base64 编码</p>
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get <p>自定义下行 topic；为空则用 <code>$iotrrpc/down/{ProductId}/{DeviceName}/{mid}</code></p> 
     * @return Topic <p>自定义下行 topic；为空则用 <code>$iotrrpc/down/{ProductId}/{DeviceName}/{mid}</code></p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>自定义下行 topic；为空则用 <code>$iotrrpc/down/{ProductId}/{DeviceName}/{mid}</code></p>
     * @param Topic <p>自定义下行 topic；为空则用 <code>$iotrrpc/down/{ProductId}/{DeviceName}/{mid}</code></p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>自定义上行 topic 模板（支持通配符）；可留空，留空时仅依赖 clientToken 关联 ack</p> 
     * @return ReplyTopic <p>自定义上行 topic 模板（支持通配符）；可留空，留空时仅依赖 clientToken 关联 ack</p>
     */
    public String getReplyTopic() {
        return this.ReplyTopic;
    }

    /**
     * Set <p>自定义上行 topic 模板（支持通配符）；可留空，留空时仅依赖 clientToken 关联 ack</p>
     * @param ReplyTopic <p>自定义上行 topic 模板（支持通配符）；可留空，留空时仅依赖 clientToken 关联 ack</p>
     */
    public void setReplyTopic(String ReplyTopic) {
        this.ReplyTopic = ReplyTopic;
    }

    public CallDeviceRRPCSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallDeviceRRPCSyncRequest(CallDeviceRRPCSyncRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.ReplyTopic != null) {
            this.ReplyTopic = new String(source.ReplyTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "ReplyTopic", this.ReplyTopic);

    }
}

