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

public class ResetConsumerGroupOffsetRequest extends AbstractModel {

    /**
    * 订阅实例id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 订阅的kafka topic，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/api/571/102947)接口获取。
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 需要修改offset的分区编号，可通过[DescribeOffsetByTime](https://cloud.tencent.com/document/api/571/102946)接口获取。
    */
    @SerializedName("PartitionNos")
    @Expose
    private Long [] PartitionNos;

    /**
    * 重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费
    */
    @SerializedName("ResetMode")
    @Expose
    private String ResetMode;

    /**
    * 当 ResetMode 为 datetime 时，该项需要填，格式为：Y-m-d h:m:s。如果不填，默认用0时间，效果与earliest相同。
    */
    @SerializedName("ResetDatetime")
    @Expose
    private String ResetDatetime;

    /**
     * Get 订阅实例id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。 
     * @return SubscribeId 订阅实例id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
     * @param SubscribeId 订阅实例id，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 订阅的kafka topic，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。 
     * @return TopicName 订阅的kafka topic，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 订阅的kafka topic，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
     * @param TopicName 订阅的kafka topic，可通过[DescribeSyncJobs](https://cloud.tencent.com/document/product/571/82103)接口获取。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/api/571/102947)接口获取。 
     * @return ConsumerGroupName 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/api/571/102947)接口获取。
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/api/571/102947)接口获取。
     * @param ConsumerGroupName 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/api/571/102947)接口获取。
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 需要修改offset的分区编号，可通过[DescribeOffsetByTime](https://cloud.tencent.com/document/api/571/102946)接口获取。 
     * @return PartitionNos 需要修改offset的分区编号，可通过[DescribeOffsetByTime](https://cloud.tencent.com/document/api/571/102946)接口获取。
     */
    public Long [] getPartitionNos() {
        return this.PartitionNos;
    }

    /**
     * Set 需要修改offset的分区编号，可通过[DescribeOffsetByTime](https://cloud.tencent.com/document/api/571/102946)接口获取。
     * @param PartitionNos 需要修改offset的分区编号，可通过[DescribeOffsetByTime](https://cloud.tencent.com/document/api/571/102946)接口获取。
     */
    public void setPartitionNos(Long [] PartitionNos) {
        this.PartitionNos = PartitionNos;
    }

    /**
     * Get 重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费 
     * @return ResetMode 重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费
     */
    public String getResetMode() {
        return this.ResetMode;
    }

    /**
     * Set 重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费
     * @param ResetMode 重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费
     */
    public void setResetMode(String ResetMode) {
        this.ResetMode = ResetMode;
    }

    /**
     * Get 当 ResetMode 为 datetime 时，该项需要填，格式为：Y-m-d h:m:s。如果不填，默认用0时间，效果与earliest相同。 
     * @return ResetDatetime 当 ResetMode 为 datetime 时，该项需要填，格式为：Y-m-d h:m:s。如果不填，默认用0时间，效果与earliest相同。
     */
    public String getResetDatetime() {
        return this.ResetDatetime;
    }

    /**
     * Set 当 ResetMode 为 datetime 时，该项需要填，格式为：Y-m-d h:m:s。如果不填，默认用0时间，效果与earliest相同。
     * @param ResetDatetime 当 ResetMode 为 datetime 时，该项需要填，格式为：Y-m-d h:m:s。如果不填，默认用0时间，效果与earliest相同。
     */
    public void setResetDatetime(String ResetDatetime) {
        this.ResetDatetime = ResetDatetime;
    }

    public ResetConsumerGroupOffsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetConsumerGroupOffsetRequest(ResetConsumerGroupOffsetRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.PartitionNos != null) {
            this.PartitionNos = new Long[source.PartitionNos.length];
            for (int i = 0; i < source.PartitionNos.length; i++) {
                this.PartitionNos[i] = new Long(source.PartitionNos[i]);
            }
        }
        if (source.ResetMode != null) {
            this.ResetMode = new String(source.ResetMode);
        }
        if (source.ResetDatetime != null) {
            this.ResetDatetime = new String(source.ResetDatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamArraySimple(map, prefix + "PartitionNos.", this.PartitionNos);
        this.setParamSimple(map, prefix + "ResetMode", this.ResetMode);
        this.setParamSimple(map, prefix + "ResetDatetime", this.ResetDatetime);

    }
}

