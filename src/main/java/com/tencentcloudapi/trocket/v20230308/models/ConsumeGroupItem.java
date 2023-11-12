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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumeGroupItem extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 消费组名称
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 是否开启消费
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * 顺序投递：true
并发投递：false
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * 最大重试次数
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get 是否开启消费 
     * @return ConsumeEnable 是否开启消费
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set 是否开启消费
     * @param ConsumeEnable 是否开启消费
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get 顺序投递：true
并发投递：false 
     * @return ConsumeMessageOrderly 顺序投递：true
并发投递：false
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set 顺序投递：true
并发投递：false
     * @param ConsumeMessageOrderly 顺序投递：true
并发投递：false
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get 最大重试次数 
     * @return MaxRetryTimes 最大重试次数
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set 最大重试次数
     * @param MaxRetryTimes 最大重试次数
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ConsumeGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumeGroupItem(ConsumeGroupItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

