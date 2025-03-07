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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishMessageRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 消息 payload，需要按 encoding 指定的编码方式进行编码
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 消息目的主题，该参数与 TargetClientId 二选一
    */
    @SerializedName("TargetTopic")
    @Expose
    private String TargetTopic;

    /**
    * 消息目的客户端 ID，该参数与 TargetTopic 二选一
    */
    @SerializedName("TargetClientId")
    @Expose
    private String TargetClientId;

    /**
    * 消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 消息的服务质量等级，默认为 1
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * 是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true
    */
    @SerializedName("Retain")
    @Expose
    private Boolean Retain;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 消息 payload，需要按 encoding 指定的编码方式进行编码 
     * @return Payload 消息 payload，需要按 encoding 指定的编码方式进行编码
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 消息 payload，需要按 encoding 指定的编码方式进行编码
     * @param Payload 消息 payload，需要按 encoding 指定的编码方式进行编码
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 消息目的主题，该参数与 TargetClientId 二选一 
     * @return TargetTopic 消息目的主题，该参数与 TargetClientId 二选一
     */
    public String getTargetTopic() {
        return this.TargetTopic;
    }

    /**
     * Set 消息目的主题，该参数与 TargetClientId 二选一
     * @param TargetTopic 消息目的主题，该参数与 TargetClientId 二选一
     */
    public void setTargetTopic(String TargetTopic) {
        this.TargetTopic = TargetTopic;
    }

    /**
     * Get 消息目的客户端 ID，该参数与 TargetTopic 二选一 
     * @return TargetClientId 消息目的客户端 ID，该参数与 TargetTopic 二选一
     */
    public String getTargetClientId() {
        return this.TargetClientId;
    }

    /**
     * Set 消息目的客户端 ID，该参数与 TargetTopic 二选一
     * @param TargetClientId 消息目的客户端 ID，该参数与 TargetTopic 二选一
     */
    public void setTargetClientId(String TargetClientId) {
        this.TargetClientId = TargetClientId;
    }

    /**
     * Get 消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码） 
     * @return Encoding 消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）
     * @param Encoding 消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 消息的服务质量等级，默认为 1 
     * @return Qos 消息的服务质量等级，默认为 1
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set 消息的服务质量等级，默认为 1
     * @param Qos 消息的服务质量等级，默认为 1
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true 
     * @return Retain 是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true
     */
    public Boolean getRetain() {
        return this.Retain;
    }

    /**
     * Set 是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true
     * @param Retain 是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true
     */
    public void setRetain(Boolean Retain) {
        this.Retain = Retain;
    }

    public PublishMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishMessageRequest(PublishMessageRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.TargetTopic != null) {
            this.TargetTopic = new String(source.TargetTopic);
        }
        if (source.TargetClientId != null) {
            this.TargetClientId = new String(source.TargetClientId);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
        if (source.Retain != null) {
            this.Retain = new Boolean(source.Retain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "TargetTopic", this.TargetTopic);
        this.setParamSimple(map, prefix + "TargetClientId", this.TargetClientId);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Retain", this.Retain);

    }
}

