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

public class RouterMessageServiceSource extends AbstractModel {

    /**
    * <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>mns接入点。<br>需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>mns queue名字。<br>可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>是否自动解码mns body。<br>ON：自动解码，复制后的消息内容为解码后的明文。<br>OFF：不用解码，保持Mns消息体原始状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDecodeBody")
    @Expose
    private String EnableDecodeBody;

    /**
    * <p>mns消费并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceConsumeConcurrentThreadCount")
    @Expose
    private Long SourceConsumeConcurrentThreadCount;

    /**
    * <p>过滤时间戳，毫秒级时间戳</p>
    */
    @SerializedName("FilterFromTimestampMs")
    @Expose
    private Long FilterFromTimestampMs;

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
     * Get <p>mns接入点。<br>需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint <p>mns接入点。<br>需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>mns接入点。<br>需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint <p>mns接入点。<br>需要和router内网联通，一般是公网接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>mns queue名字。<br>可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Queue <p>mns queue名字。<br>可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>mns queue名字。<br>可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Queue <p>mns queue名字。<br>可以在https://mns.console.aliyun.com/region/cn-shenzhen/queues 看到</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
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
     * Get <p>是否自动解码mns body。<br>ON：自动解码，复制后的消息内容为解码后的明文。<br>OFF：不用解码，保持Mns消息体原始状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDecodeBody <p>是否自动解码mns body。<br>ON：自动解码，复制后的消息内容为解码后的明文。<br>OFF：不用解码，保持Mns消息体原始状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableDecodeBody() {
        return this.EnableDecodeBody;
    }

    /**
     * Set <p>是否自动解码mns body。<br>ON：自动解码，复制后的消息内容为解码后的明文。<br>OFF：不用解码，保持Mns消息体原始状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDecodeBody <p>是否自动解码mns body。<br>ON：自动解码，复制后的消息内容为解码后的明文。<br>OFF：不用解码，保持Mns消息体原始状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDecodeBody(String EnableDecodeBody) {
        this.EnableDecodeBody = EnableDecodeBody;
    }

    /**
     * Get <p>mns消费并发数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceConsumeConcurrentThreadCount <p>mns消费并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceConsumeConcurrentThreadCount() {
        return this.SourceConsumeConcurrentThreadCount;
    }

    /**
     * Set <p>mns消费并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceConsumeConcurrentThreadCount <p>mns消费并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceConsumeConcurrentThreadCount(Long SourceConsumeConcurrentThreadCount) {
        this.SourceConsumeConcurrentThreadCount = SourceConsumeConcurrentThreadCount;
    }

    /**
     * Get <p>过滤时间戳，毫秒级时间戳</p> 
     * @return FilterFromTimestampMs <p>过滤时间戳，毫秒级时间戳</p>
     */
    public Long getFilterFromTimestampMs() {
        return this.FilterFromTimestampMs;
    }

    /**
     * Set <p>过滤时间戳，毫秒级时间戳</p>
     * @param FilterFromTimestampMs <p>过滤时间戳，毫秒级时间戳</p>
     */
    public void setFilterFromTimestampMs(Long FilterFromTimestampMs) {
        this.FilterFromTimestampMs = FilterFromTimestampMs;
    }

    public RouterMessageServiceSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterMessageServiceSource(RouterMessageServiceSource source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.EnableDecodeBody != null) {
            this.EnableDecodeBody = new String(source.EnableDecodeBody);
        }
        if (source.SourceConsumeConcurrentThreadCount != null) {
            this.SourceConsumeConcurrentThreadCount = new Long(source.SourceConsumeConcurrentThreadCount);
        }
        if (source.FilterFromTimestampMs != null) {
            this.FilterFromTimestampMs = new Long(source.FilterFromTimestampMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "EnableDecodeBody", this.EnableDecodeBody);
        this.setParamSimple(map, prefix + "SourceConsumeConcurrentThreadCount", this.SourceConsumeConcurrentThreadCount);
        this.setParamSimple(map, prefix + "FilterFromTimestampMs", this.FilterFromTimestampMs);

    }
}

