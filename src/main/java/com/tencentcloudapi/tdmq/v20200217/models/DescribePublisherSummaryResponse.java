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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublisherSummaryResponse extends AbstractModel{

    /**
    * 生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateIn")
    @Expose
    private Float MsgRateIn;

    /**
    * 生产速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private Float MsgThroughputIn;

    /**
    * 生产者数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublisherCount")
    @Expose
    private Long PublisherCount;

    /**
    * 消息存储大小，以字节为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateIn 生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set 生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateIn 生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateIn(Float MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get 生产速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputIn 生产速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set 生产速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputIn 生产速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputIn(Float MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get 生产者数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublisherCount 生产者数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublisherCount() {
        return this.PublisherCount;
    }

    /**
     * Set 生产者数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublisherCount 生产者数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublisherCount(Long PublisherCount) {
        this.PublisherCount = PublisherCount;
    }

    /**
     * Get 消息存储大小，以字节为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize 消息存储大小，以字节为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 消息存储大小，以字节为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize 消息存储大小，以字节为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
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

    public DescribePublisherSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublisherSummaryResponse(DescribePublisherSummaryResponse source) {
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new Float(source.MsgRateIn);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new Float(source.MsgThroughputIn);
        }
        if (source.PublisherCount != null) {
            this.PublisherCount = new Long(source.PublisherCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "PublisherCount", this.PublisherCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

