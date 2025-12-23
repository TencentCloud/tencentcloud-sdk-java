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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageTrackItem extends AbstractModel {

    /**
    * 消费组名称
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 消费状态, CONSUMED: 已消费 CONSUMED_BUT_FILTERED: 已过滤 NOT_CONSUME: 未消费 ENTER_RETRY: 进入重试队列 ENTER_DLQ: 进入死信队列 UNKNOWN: 查询不到消费状态
    */
    @SerializedName("ConsumeStatus")
    @Expose
    private String ConsumeStatus;

    /**
    * track类型
    */
    @SerializedName("TrackType")
    @Expose
    private String TrackType;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionDesc")
    @Expose
    private String ExceptionDesc;

    /**
    * 消费状态来源，枚举值如下：

- DIFF_OFFSET：通过服务端offset计算
- TRACE_REPORT：通过上报的轨迹判断
    */
    @SerializedName("ConsumeStatusSource")
    @Expose
    private String ConsumeStatusSource;

    /**
     * Get 消费组名称 
     * @return ConsumerGroup 消费组名称
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称
     * @param ConsumerGroup 消费组名称
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 消费状态, CONSUMED: 已消费 CONSUMED_BUT_FILTERED: 已过滤 NOT_CONSUME: 未消费 ENTER_RETRY: 进入重试队列 ENTER_DLQ: 进入死信队列 UNKNOWN: 查询不到消费状态 
     * @return ConsumeStatus 消费状态, CONSUMED: 已消费 CONSUMED_BUT_FILTERED: 已过滤 NOT_CONSUME: 未消费 ENTER_RETRY: 进入重试队列 ENTER_DLQ: 进入死信队列 UNKNOWN: 查询不到消费状态
     */
    public String getConsumeStatus() {
        return this.ConsumeStatus;
    }

    /**
     * Set 消费状态, CONSUMED: 已消费 CONSUMED_BUT_FILTERED: 已过滤 NOT_CONSUME: 未消费 ENTER_RETRY: 进入重试队列 ENTER_DLQ: 进入死信队列 UNKNOWN: 查询不到消费状态
     * @param ConsumeStatus 消费状态, CONSUMED: 已消费 CONSUMED_BUT_FILTERED: 已过滤 NOT_CONSUME: 未消费 ENTER_RETRY: 进入重试队列 ENTER_DLQ: 进入死信队列 UNKNOWN: 查询不到消费状态
     */
    public void setConsumeStatus(String ConsumeStatus) {
        this.ConsumeStatus = ConsumeStatus;
    }

    /**
     * Get track类型 
     * @return TrackType track类型
     */
    public String getTrackType() {
        return this.TrackType;
    }

    /**
     * Set track类型
     * @param TrackType track类型
     */
    public void setTrackType(String TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionDesc 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionDesc() {
        return this.ExceptionDesc;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionDesc 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionDesc(String ExceptionDesc) {
        this.ExceptionDesc = ExceptionDesc;
    }

    /**
     * Get 消费状态来源，枚举值如下：

- DIFF_OFFSET：通过服务端offset计算
- TRACE_REPORT：通过上报的轨迹判断 
     * @return ConsumeStatusSource 消费状态来源，枚举值如下：

- DIFF_OFFSET：通过服务端offset计算
- TRACE_REPORT：通过上报的轨迹判断
     */
    public String getConsumeStatusSource() {
        return this.ConsumeStatusSource;
    }

    /**
     * Set 消费状态来源，枚举值如下：

- DIFF_OFFSET：通过服务端offset计算
- TRACE_REPORT：通过上报的轨迹判断
     * @param ConsumeStatusSource 消费状态来源，枚举值如下：

- DIFF_OFFSET：通过服务端offset计算
- TRACE_REPORT：通过上报的轨迹判断
     */
    public void setConsumeStatusSource(String ConsumeStatusSource) {
        this.ConsumeStatusSource = ConsumeStatusSource;
    }

    public MessageTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageTrackItem(MessageTrackItem source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumeStatus != null) {
            this.ConsumeStatus = new String(source.ConsumeStatus);
        }
        if (source.TrackType != null) {
            this.TrackType = new String(source.TrackType);
        }
        if (source.ExceptionDesc != null) {
            this.ExceptionDesc = new String(source.ExceptionDesc);
        }
        if (source.ConsumeStatusSource != null) {
            this.ConsumeStatusSource = new String(source.ConsumeStatusSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumeStatus", this.ConsumeStatus);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "ExceptionDesc", this.ExceptionDesc);
        this.setParamSimple(map, prefix + "ConsumeStatusSource", this.ConsumeStatusSource);

    }
}

