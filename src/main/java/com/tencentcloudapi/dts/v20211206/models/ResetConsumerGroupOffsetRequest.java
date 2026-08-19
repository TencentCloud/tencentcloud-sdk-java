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
    * <p>订阅实例id，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * <p>订阅的kafka topic，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过<a href="https://cloud.tencent.com/document/api/571/102947">DescribeConsumerGroups</a>接口获取。</p>
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * <p>需要修改offset的分区编号，可通过<a href="https://cloud.tencent.com/document/api/571/102946">DescribeOffsetByTime</a>接口获取。</p>
    */
    @SerializedName("PartitionNos")
    @Expose
    private Long [] PartitionNos;

    /**
    * <p>重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费</p>
    */
    @SerializedName("ResetMode")
    @Expose
    private String ResetMode;

    /**
    * <p>当 <code>ResetMode</code> 为 <code>datetime</code> 时该项需要填。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果不填，默认用 0 时间，效果与 <code>earliest</code> 相同。 </p><p>参数格式：2026-04-23T20:21:35+08:00</p>
    */
    @SerializedName("ResetDatetime")
    @Expose
    private String ResetDatetime;

    /**
     * Get <p>订阅实例id，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p> 
     * @return SubscribeId <p>订阅实例id，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>订阅实例id，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     * @param SubscribeId <p>订阅实例id，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get <p>订阅的kafka topic，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p> 
     * @return TopicName <p>订阅的kafka topic，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>订阅的kafka topic，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     * @param TopicName <p>订阅的kafka topic，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过<a href="https://cloud.tencent.com/document/api/571/102947">DescribeConsumerGroups</a>接口获取。</p> 
     * @return ConsumerGroupName <p>消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过<a href="https://cloud.tencent.com/document/api/571/102947">DescribeConsumerGroups</a>接口获取。</p>
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set <p>消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过<a href="https://cloud.tencent.com/document/api/571/102947">DescribeConsumerGroups</a>接口获取。</p>
     * @param ConsumerGroupName <p>消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。可通过<a href="https://cloud.tencent.com/document/api/571/102947">DescribeConsumerGroups</a>接口获取。</p>
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get <p>需要修改offset的分区编号，可通过<a href="https://cloud.tencent.com/document/api/571/102946">DescribeOffsetByTime</a>接口获取。</p> 
     * @return PartitionNos <p>需要修改offset的分区编号，可通过<a href="https://cloud.tencent.com/document/api/571/102946">DescribeOffsetByTime</a>接口获取。</p>
     */
    public Long [] getPartitionNos() {
        return this.PartitionNos;
    }

    /**
     * Set <p>需要修改offset的分区编号，可通过<a href="https://cloud.tencent.com/document/api/571/102946">DescribeOffsetByTime</a>接口获取。</p>
     * @param PartitionNos <p>需要修改offset的分区编号，可通过<a href="https://cloud.tencent.com/document/api/571/102946">DescribeOffsetByTime</a>接口获取。</p>
     */
    public void setPartitionNos(Long [] PartitionNos) {
        this.PartitionNos = PartitionNos;
    }

    /**
     * Get <p>重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费</p> 
     * @return ResetMode <p>重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费</p>
     */
    public String getResetMode() {
        return this.ResetMode;
    }

    /**
     * Set <p>重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费</p>
     * @param ResetMode <p>重置方式。枚举值为 earliest-从最开始位置开始消费；latest-从最新位置开始消费；datetime-从指定时间前最近的checkpoint开始消费</p>
     */
    public void setResetMode(String ResetMode) {
        this.ResetMode = ResetMode;
    }

    /**
     * Get <p>当 <code>ResetMode</code> 为 <code>datetime</code> 时该项需要填。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果不填，默认用 0 时间，效果与 <code>earliest</code> 相同。 </p><p>参数格式：2026-04-23T20:21:35+08:00</p> 
     * @return ResetDatetime <p>当 <code>ResetMode</code> 为 <code>datetime</code> 时该项需要填。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果不填，默认用 0 时间，效果与 <code>earliest</code> 相同。 </p><p>参数格式：2026-04-23T20:21:35+08:00</p>
     */
    public String getResetDatetime() {
        return this.ResetDatetime;
    }

    /**
     * Set <p>当 <code>ResetMode</code> 为 <code>datetime</code> 时该项需要填。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果不填，默认用 0 时间，效果与 <code>earliest</code> 相同。 </p><p>参数格式：2026-04-23T20:21:35+08:00</p>
     * @param ResetDatetime <p>当 <code>ResetMode</code> 为 <code>datetime</code> 时该项需要填。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果不填，默认用 0 时间，效果与 <code>earliest</code> 相同。 </p><p>参数格式：2026-04-23T20:21:35+08:00</p>
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

