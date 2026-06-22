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

public class DescribeConsumerGroupResponse extends AbstractModel {

    /**
    * <p>在线消费者数量</p>
    */
    @SerializedName("ConsumerNum")
    @Expose
    private Long ConsumerNum;

    /**
    * <p>TPS</p>
    */
    @SerializedName("Tps")
    @Expose
    private Long Tps;

    /**
    * <p>消息堆积数量</p>
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * <p>消费类型，枚举值如下：</p><ul><li>PULL：PULL 消费类型</li><li>PUSH：PUSH 消费类型</li><li>POP：POP 消费类型</li></ul>
    */
    @SerializedName("ConsumeType")
    @Expose
    private String ConsumeType;

    /**
    * <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * <p>顺序投递：true<br>并发投递：false</p>
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * <p>是否开启消费</p>
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * <p>最大重试次数</p>
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>消费模式：<br>BROADCASTING 广播模式<br>CLUSTERING 集群模式</p>
    */
    @SerializedName("MessageModel")
    @Expose
    private String MessageModel;

    /**
    * <p>重试策略</p>
    */
    @SerializedName("RetryPolicy")
    @Expose
    private RetryPolicy RetryPolicy;

    /**
    * <p>消费模式</p><p>枚举值：</p><ul><li>CLUSTERING： 集群/广播消费</li><li>LITE： LiteTopic消费</li></ul><p>默认值：CLUSTERING</p>
    */
    @SerializedName("ConsumeModel")
    @Expose
    private String ConsumeModel;

    /**
    * <p>订阅的轻量主题（仅适用于轻量消费模式）</p>
    */
    @SerializedName("LiteTopic")
    @Expose
    private String LiteTopic;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>在线消费者数量</p> 
     * @return ConsumerNum <p>在线消费者数量</p>
     */
    public Long getConsumerNum() {
        return this.ConsumerNum;
    }

    /**
     * Set <p>在线消费者数量</p>
     * @param ConsumerNum <p>在线消费者数量</p>
     */
    public void setConsumerNum(Long ConsumerNum) {
        this.ConsumerNum = ConsumerNum;
    }

    /**
     * Get <p>TPS</p> 
     * @return Tps <p>TPS</p>
     */
    public Long getTps() {
        return this.Tps;
    }

    /**
     * Set <p>TPS</p>
     * @param Tps <p>TPS</p>
     */
    public void setTps(Long Tps) {
        this.Tps = Tps;
    }

    /**
     * Get <p>消息堆积数量</p> 
     * @return ConsumerLag <p>消息堆积数量</p>
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set <p>消息堆积数量</p>
     * @param ConsumerLag <p>消息堆积数量</p>
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get <p>消费类型，枚举值如下：</p><ul><li>PULL：PULL 消费类型</li><li>PUSH：PUSH 消费类型</li><li>POP：POP 消费类型</li></ul> 
     * @return ConsumeType <p>消费类型，枚举值如下：</p><ul><li>PULL：PULL 消费类型</li><li>PUSH：PUSH 消费类型</li><li>POP：POP 消费类型</li></ul>
     */
    public String getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set <p>消费类型，枚举值如下：</p><ul><li>PULL：PULL 消费类型</li><li>PUSH：PUSH 消费类型</li><li>POP：POP 消费类型</li></ul>
     * @param ConsumeType <p>消费类型，枚举值如下：</p><ul><li>PULL：PULL 消费类型</li><li>PUSH：PUSH 消费类型</li><li>POP：POP 消费类型</li></ul>
     */
    public void setConsumeType(String ConsumeType) {
        this.ConsumeType = ConsumeType;
    }

    /**
     * Get <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p> 
     * @return CreatedTime <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
     * @param CreatedTime <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>顺序投递：true<br>并发投递：false</p> 
     * @return ConsumeMessageOrderly <p>顺序投递：true<br>并发投递：false</p>
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set <p>顺序投递：true<br>并发投递：false</p>
     * @param ConsumeMessageOrderly <p>顺序投递：true<br>并发投递：false</p>
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get <p>是否开启消费</p> 
     * @return ConsumeEnable <p>是否开启消费</p>
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set <p>是否开启消费</p>
     * @param ConsumeEnable <p>是否开启消费</p>
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get <p>最大重试次数</p> 
     * @return MaxRetryTimes <p>最大重试次数</p>
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set <p>最大重试次数</p>
     * @param MaxRetryTimes <p>最大重试次数</p>
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>消费模式：<br>BROADCASTING 广播模式<br>CLUSTERING 集群模式</p> 
     * @return MessageModel <p>消费模式：<br>BROADCASTING 广播模式<br>CLUSTERING 集群模式</p>
     */
    public String getMessageModel() {
        return this.MessageModel;
    }

    /**
     * Set <p>消费模式：<br>BROADCASTING 广播模式<br>CLUSTERING 集群模式</p>
     * @param MessageModel <p>消费模式：<br>BROADCASTING 广播模式<br>CLUSTERING 集群模式</p>
     */
    public void setMessageModel(String MessageModel) {
        this.MessageModel = MessageModel;
    }

    /**
     * Get <p>重试策略</p> 
     * @return RetryPolicy <p>重试策略</p>
     */
    public RetryPolicy getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set <p>重试策略</p>
     * @param RetryPolicy <p>重试策略</p>
     */
    public void setRetryPolicy(RetryPolicy RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get <p>消费模式</p><p>枚举值：</p><ul><li>CLUSTERING： 集群/广播消费</li><li>LITE： LiteTopic消费</li></ul><p>默认值：CLUSTERING</p> 
     * @return ConsumeModel <p>消费模式</p><p>枚举值：</p><ul><li>CLUSTERING： 集群/广播消费</li><li>LITE： LiteTopic消费</li></ul><p>默认值：CLUSTERING</p>
     */
    public String getConsumeModel() {
        return this.ConsumeModel;
    }

    /**
     * Set <p>消费模式</p><p>枚举值：</p><ul><li>CLUSTERING： 集群/广播消费</li><li>LITE： LiteTopic消费</li></ul><p>默认值：CLUSTERING</p>
     * @param ConsumeModel <p>消费模式</p><p>枚举值：</p><ul><li>CLUSTERING： 集群/广播消费</li><li>LITE： LiteTopic消费</li></ul><p>默认值：CLUSTERING</p>
     */
    public void setConsumeModel(String ConsumeModel) {
        this.ConsumeModel = ConsumeModel;
    }

    /**
     * Get <p>订阅的轻量主题（仅适用于轻量消费模式）</p> 
     * @return LiteTopic <p>订阅的轻量主题（仅适用于轻量消费模式）</p>
     */
    public String getLiteTopic() {
        return this.LiteTopic;
    }

    /**
     * Set <p>订阅的轻量主题（仅适用于轻量消费模式）</p>
     * @param LiteTopic <p>订阅的轻量主题（仅适用于轻量消费模式）</p>
     */
    public void setLiteTopic(String LiteTopic) {
        this.LiteTopic = LiteTopic;
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

    public DescribeConsumerGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerGroupResponse(DescribeConsumerGroupResponse source) {
        if (source.ConsumerNum != null) {
            this.ConsumerNum = new Long(source.ConsumerNum);
        }
        if (source.Tps != null) {
            this.Tps = new Long(source.Tps);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.ConsumeType != null) {
            this.ConsumeType = new String(source.ConsumeType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageModel != null) {
            this.MessageModel = new String(source.MessageModel);
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new RetryPolicy(source.RetryPolicy);
        }
        if (source.ConsumeModel != null) {
            this.ConsumeModel = new String(source.ConsumeModel);
        }
        if (source.LiteTopic != null) {
            this.LiteTopic = new String(source.LiteTopic);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerNum", this.ConsumerNum);
        this.setParamSimple(map, prefix + "Tps", this.Tps);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "ConsumeType", this.ConsumeType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageModel", this.MessageModel);
        this.setParamObj(map, prefix + "RetryPolicy.", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ConsumeModel", this.ConsumeModel);
        this.setParamSimple(map, prefix + "LiteTopic", this.LiteTopic);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

