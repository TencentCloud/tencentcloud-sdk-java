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

public class DescribeConsumerGroupResponse extends AbstractModel {

    /**
    * 在线消费者数量
    */
    @SerializedName("ConsumerNum")
    @Expose
    private Long ConsumerNum;

    /**
    * TPS
    */
    @SerializedName("Tps")
    @Expose
    private Long Tps;

    /**
    * 消息堆积数量
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * 消费者类型
    */
    @SerializedName("ConsumeType")
    @Expose
    private String ConsumeType;

    /**
    * 创建时间，秒为单位
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 顺序投递：true
并发投递：false
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * 是否开启消费
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 在线消费者数量 
     * @return ConsumerNum 在线消费者数量
     */
    public Long getConsumerNum() {
        return this.ConsumerNum;
    }

    /**
     * Set 在线消费者数量
     * @param ConsumerNum 在线消费者数量
     */
    public void setConsumerNum(Long ConsumerNum) {
        this.ConsumerNum = ConsumerNum;
    }

    /**
     * Get TPS 
     * @return Tps TPS
     */
    public Long getTps() {
        return this.Tps;
    }

    /**
     * Set TPS
     * @param Tps TPS
     */
    public void setTps(Long Tps) {
        this.Tps = Tps;
    }

    /**
     * Get 消息堆积数量 
     * @return ConsumerLag 消息堆积数量
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set 消息堆积数量
     * @param ConsumerLag 消息堆积数量
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get 消费者类型 
     * @return ConsumeType 消费者类型
     */
    public String getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set 消费者类型
     * @param ConsumeType 消费者类型
     */
    public void setConsumeType(String ConsumeType) {
        this.ConsumeType = ConsumeType;
    }

    /**
     * Get 创建时间，秒为单位 
     * @return CreatedTime 创建时间，秒为单位
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，秒为单位
     * @param CreatedTime 创建时间，秒为单位
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

