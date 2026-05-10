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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouterMessageServiceTarget extends AbstractModel {

    /**
    * <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>mns接入点，需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>mns queue名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>是否用base64编码发送mns消息。<br> ON：发送base64编码的消息体到mns</p><p>OFF：将原始消息体发送到mns</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendWithBase64")
    @Expose
    private String SendWithBase64;

    /**
    * <p>发送mns的并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetProduceConcurrentThreadCount")
    @Expose
    private Long TargetProduceConcurrentThreadCount;

    /**
    * <p>topic名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/topics 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKey <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKey <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>mns接入点，需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint <p>mns接入点，需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>mns接入点，需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint <p>mns接入点，需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>mns queue名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Queue <p>mns queue名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>mns queue名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Queue <p>mns queue名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>是否用base64编码发送mns消息。<br> ON：发送base64编码的消息体到mns</p><p>OFF：将原始消息体发送到mns</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendWithBase64 <p>是否用base64编码发送mns消息。<br> ON：发送base64编码的消息体到mns</p><p>OFF：将原始消息体发送到mns</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendWithBase64() {
        return this.SendWithBase64;
    }

    /**
     * Set <p>是否用base64编码发送mns消息。<br> ON：发送base64编码的消息体到mns</p><p>OFF：将原始消息体发送到mns</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendWithBase64 <p>是否用base64编码发送mns消息。<br> ON：发送base64编码的消息体到mns</p><p>OFF：将原始消息体发送到mns</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendWithBase64(String SendWithBase64) {
        this.SendWithBase64 = SendWithBase64;
    }

    /**
     * Get <p>发送mns的并发数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetProduceConcurrentThreadCount <p>发送mns的并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetProduceConcurrentThreadCount() {
        return this.TargetProduceConcurrentThreadCount;
    }

    /**
     * Set <p>发送mns的并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetProduceConcurrentThreadCount <p>发送mns的并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetProduceConcurrentThreadCount(Long TargetProduceConcurrentThreadCount) {
        this.TargetProduceConcurrentThreadCount = TargetProduceConcurrentThreadCount;
    }

    /**
     * Get <p>topic名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/topics 看到</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic <p>topic名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/topics 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>topic名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/topics 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic <p>topic名字。可以在https://mns.console.aliyun.com/region/cn-shenzhen/topics 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public RouterMessageServiceTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterMessageServiceTarget(RouterMessageServiceTarget source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.SendWithBase64 != null) {
            this.SendWithBase64 = new String(source.SendWithBase64);
        }
        if (source.TargetProduceConcurrentThreadCount != null) {
            this.TargetProduceConcurrentThreadCount = new Long(source.TargetProduceConcurrentThreadCount);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "SendWithBase64", this.SendWithBase64);
        this.setParamSimple(map, prefix + "TargetProduceConcurrentThreadCount", this.TargetProduceConcurrentThreadCount);
        this.setParamSimple(map, prefix + "Topic", this.Topic);

    }
}

