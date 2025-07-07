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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorInfo extends AbstractModel {

    /**
    * 当前分区的编号，从0开始
    */
    @SerializedName("PartitionNo")
    @Expose
    private Long PartitionNo;

    /**
    * 当前分区的偏移量
    */
    @SerializedName("ConsumerGroupOffset")
    @Expose
    private Long ConsumerGroupOffset;

    /**
    * 当前分区未消费的数据量
    */
    @SerializedName("ConsumerGroupLag")
    @Expose
    private Long ConsumerGroupLag;

    /**
    * 当前分区的消费延迟(单位为秒)
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
     * Get 当前分区的编号，从0开始 
     * @return PartitionNo 当前分区的编号，从0开始
     */
    public Long getPartitionNo() {
        return this.PartitionNo;
    }

    /**
     * Set 当前分区的编号，从0开始
     * @param PartitionNo 当前分区的编号，从0开始
     */
    public void setPartitionNo(Long PartitionNo) {
        this.PartitionNo = PartitionNo;
    }

    /**
     * Get 当前分区的偏移量 
     * @return ConsumerGroupOffset 当前分区的偏移量
     */
    public Long getConsumerGroupOffset() {
        return this.ConsumerGroupOffset;
    }

    /**
     * Set 当前分区的偏移量
     * @param ConsumerGroupOffset 当前分区的偏移量
     */
    public void setConsumerGroupOffset(Long ConsumerGroupOffset) {
        this.ConsumerGroupOffset = ConsumerGroupOffset;
    }

    /**
     * Get 当前分区未消费的数据量 
     * @return ConsumerGroupLag 当前分区未消费的数据量
     */
    public Long getConsumerGroupLag() {
        return this.ConsumerGroupLag;
    }

    /**
     * Set 当前分区未消费的数据量
     * @param ConsumerGroupLag 当前分区未消费的数据量
     */
    public void setConsumerGroupLag(Long ConsumerGroupLag) {
        this.ConsumerGroupLag = ConsumerGroupLag;
    }

    /**
     * Get 当前分区的消费延迟(单位为秒) 
     * @return Latency 当前分区的消费延迟(单位为秒)
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set 当前分区的消费延迟(单位为秒)
     * @param Latency 当前分区的消费延迟(单位为秒)
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    public MonitorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorInfo(MonitorInfo source) {
        if (source.PartitionNo != null) {
            this.PartitionNo = new Long(source.PartitionNo);
        }
        if (source.ConsumerGroupOffset != null) {
            this.ConsumerGroupOffset = new Long(source.ConsumerGroupOffset);
        }
        if (source.ConsumerGroupLag != null) {
            this.ConsumerGroupLag = new Long(source.ConsumerGroupLag);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionNo", this.PartitionNo);
        this.setParamSimple(map, prefix + "ConsumerGroupOffset", this.ConsumerGroupOffset);
        this.setParamSimple(map, prefix + "ConsumerGroupLag", this.ConsumerGroupLag);
        this.setParamSimple(map, prefix + "Latency", this.Latency);

    }
}

