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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishMessageRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>消息负载 Payload，是消息的实际内容，需要按 encoding 指定的编码方式进行编码</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>消息目的主题，该参数与 TargetClientId 二选一</p>
    */
    @SerializedName("TargetTopic")
    @Expose
    private String TargetTopic;

    /**
    * <p>消息目的客户端 ID，该参数与 TargetTopic 二选一</p>
    */
    @SerializedName("TargetClientId")
    @Expose
    private String TargetClientId;

    /**
    * <p>消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）</p>
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * <p>消息的服务质量等级，默认为 1<br>QoS 0（至多一次）消息发送后，不保证接收方一定收到，也不要求接收方确认。<br>QoS 1（至少一次）消息至少被接收方成功接收一次，但可能重复。<br>QoS 2（恰好一次）消息确保被接收方接收且仅接收一次，无重复。</p>
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * <p>是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true</p>
    */
    @SerializedName("Retain")
    @Expose
    private Boolean Retain;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>消息负载 Payload，是消息的实际内容，需要按 encoding 指定的编码方式进行编码</p> 
     * @return Payload <p>消息负载 Payload，是消息的实际内容，需要按 encoding 指定的编码方式进行编码</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>消息负载 Payload，是消息的实际内容，需要按 encoding 指定的编码方式进行编码</p>
     * @param Payload <p>消息负载 Payload，是消息的实际内容，需要按 encoding 指定的编码方式进行编码</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>消息目的主题，该参数与 TargetClientId 二选一</p> 
     * @return TargetTopic <p>消息目的主题，该参数与 TargetClientId 二选一</p>
     */
    public String getTargetTopic() {
        return this.TargetTopic;
    }

    /**
     * Set <p>消息目的主题，该参数与 TargetClientId 二选一</p>
     * @param TargetTopic <p>消息目的主题，该参数与 TargetClientId 二选一</p>
     */
    public void setTargetTopic(String TargetTopic) {
        this.TargetTopic = TargetTopic;
    }

    /**
     * Get <p>消息目的客户端 ID，该参数与 TargetTopic 二选一</p> 
     * @return TargetClientId <p>消息目的客户端 ID，该参数与 TargetTopic 二选一</p>
     */
    public String getTargetClientId() {
        return this.TargetClientId;
    }

    /**
     * Set <p>消息目的客户端 ID，该参数与 TargetTopic 二选一</p>
     * @param TargetClientId <p>消息目的客户端 ID，该参数与 TargetTopic 二选一</p>
     */
    public void setTargetClientId(String TargetClientId) {
        this.TargetClientId = TargetClientId;
    }

    /**
     * Get <p>消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）</p> 
     * @return Encoding <p>消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）</p>
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set <p>消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）</p>
     * @param Encoding <p>消息 payload 编码，可选 plain 或 base64，默认为 plain（即不编码）</p>
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get <p>消息的服务质量等级，默认为 1<br>QoS 0（至多一次）消息发送后，不保证接收方一定收到，也不要求接收方确认。<br>QoS 1（至少一次）消息至少被接收方成功接收一次，但可能重复。<br>QoS 2（恰好一次）消息确保被接收方接收且仅接收一次，无重复。</p> 
     * @return Qos <p>消息的服务质量等级，默认为 1<br>QoS 0（至多一次）消息发送后，不保证接收方一定收到，也不要求接收方确认。<br>QoS 1（至少一次）消息至少被接收方成功接收一次，但可能重复。<br>QoS 2（恰好一次）消息确保被接收方接收且仅接收一次，无重复。</p>
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set <p>消息的服务质量等级，默认为 1<br>QoS 0（至多一次）消息发送后，不保证接收方一定收到，也不要求接收方确认。<br>QoS 1（至少一次）消息至少被接收方成功接收一次，但可能重复。<br>QoS 2（恰好一次）消息确保被接收方接收且仅接收一次，无重复。</p>
     * @param Qos <p>消息的服务质量等级，默认为 1<br>QoS 0（至多一次）消息发送后，不保证接收方一定收到，也不要求接收方确认。<br>QoS 1（至少一次）消息至少被接收方成功接收一次，但可能重复。<br>QoS 2（恰好一次）消息确保被接收方接收且仅接收一次，无重复。</p>
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true</p> 
     * @return Retain <p>是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true</p>
     */
    public Boolean getRetain() {
        return this.Retain;
    }

    /**
     * Set <p>是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true</p>
     * @param Retain <p>是否为保留消息，默认为 false，且仅支持发布到主题的消息设置为 true</p>
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

