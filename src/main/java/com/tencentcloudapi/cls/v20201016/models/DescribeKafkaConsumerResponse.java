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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKafkaConsumerResponse extends AbstractModel {

    /**
    * <p>Kafka协议消费是否打开</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>KafkaConsumer 消费时使用的Topic参数</p>
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * <p>kafka协议消费数据格式</p>
    */
    @SerializedName("ConsumerContent")
    @Expose
    private KafkaConsumerContent ConsumerContent;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>消费范围类型，0:最新，1:历史+最新</p>
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Kafka协议消费是否打开</p> 
     * @return Status <p>Kafka协议消费是否打开</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Kafka协议消费是否打开</p>
     * @param Status <p>Kafka协议消费是否打开</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>KafkaConsumer 消费时使用的Topic参数</p> 
     * @return TopicID <p>KafkaConsumer 消费时使用的Topic参数</p>
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set <p>KafkaConsumer 消费时使用的Topic参数</p>
     * @param TopicID <p>KafkaConsumer 消费时使用的Topic参数</p>
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p> 
     * @return Compression <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
     * @param Compression <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>kafka协议消费数据格式</p> 
     * @return ConsumerContent <p>kafka协议消费数据格式</p>
     */
    public KafkaConsumerContent getConsumerContent() {
        return this.ConsumerContent;
    }

    /**
     * Set <p>kafka协议消费数据格式</p>
     * @param ConsumerContent <p>kafka协议消费数据格式</p>
     */
    public void setConsumerContent(KafkaConsumerContent ConsumerContent) {
        this.ConsumerContent = ConsumerContent;
    }

    /**
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>消费范围类型，0:最新，1:历史+最新</p> 
     * @return ScopeType <p>消费范围类型，0:最新，1:历史+最新</p>
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>消费范围类型，0:最新，1:历史+最新</p>
     * @param ScopeType <p>消费范围类型，0:最新，1:历史+最新</p>
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKafkaConsumerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaConsumerResponse(DescribeKafkaConsumerResponse source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.ConsumerContent != null) {
            this.ConsumerContent = new KafkaConsumerContent(source.ConsumerContent);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new Long(source.ScopeType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamObj(map, prefix + "ConsumerContent.", this.ConsumerContent);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

