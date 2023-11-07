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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMsgTraceRequest extends AbstractModel {

    /**
    * 环境（命名空间）。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 消息ID。
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息生产时间。
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 起始下标，不填默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，不填则默认为10，最大值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 消费组名称模糊匹配。
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 环境（命名空间）。 
     * @return EnvironmentId 环境（命名空间）。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）。
     * @param EnvironmentId 环境（命名空间）。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 消息ID。 
     * @return MsgId 消息ID。
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息ID。
     * @param MsgId 消息ID。
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 消息生产时间。 
     * @return ProduceTime 消息生产时间。
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 消息生产时间。
     * @param ProduceTime 消息生产时间。
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 起始下标，不填默认为0。 
     * @return Offset 起始下标，不填默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始下标，不填默认为0。
     * @param Offset 起始下标，不填默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，不填则默认为10，最大值为20。 
     * @return Limit 返回数量，不填则默认为10，最大值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认为10，最大值为20。
     * @param Limit 返回数量，不填则默认为10，最大值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 消费组名称模糊匹配。 
     * @return SubscriptionName 消费组名称模糊匹配。
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 消费组名称模糊匹配。
     * @param SubscriptionName 消费组名称模糊匹配。
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Pulsar 集群的ID 
     * @return ClusterId Pulsar 集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID
     * @param ClusterId Pulsar 集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DescribeMsgTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgTraceRequest(DescribeMsgTraceRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

