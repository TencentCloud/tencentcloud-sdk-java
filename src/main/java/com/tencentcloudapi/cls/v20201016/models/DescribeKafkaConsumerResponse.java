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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKafkaConsumerResponse extends AbstractModel{

    /**
    * Kafka协议消费是否打开
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * KafkaConsumer 消费时使用的Topic参数
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * kafka协议消费数据格式
    */
    @SerializedName("ConsumerContent")
    @Expose
    private KafkaConsumerContent ConsumerContent;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Kafka协议消费是否打开 
     * @return Status Kafka协议消费是否打开
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Kafka协议消费是否打开
     * @param Status Kafka协议消费是否打开
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get KafkaConsumer 消费时使用的Topic参数 
     * @return TopicID KafkaConsumer 消费时使用的Topic参数
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set KafkaConsumer 消费时使用的Topic参数
     * @param TopicID KafkaConsumer 消费时使用的Topic参数
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get 压缩方式[0:NONE；2:SNAPPY；3:LZ4] 
     * @return Compression 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
     * @param Compression 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get kafka协议消费数据格式 
     * @return ConsumerContent kafka协议消费数据格式
     */
    public KafkaConsumerContent getConsumerContent() {
        return this.ConsumerContent;
    }

    /**
     * Set kafka协议消费数据格式
     * @param ConsumerContent kafka协议消费数据格式
     */
    public void setConsumerContent(KafkaConsumerContent ConsumerContent) {
        this.ConsumerContent = ConsumerContent;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

