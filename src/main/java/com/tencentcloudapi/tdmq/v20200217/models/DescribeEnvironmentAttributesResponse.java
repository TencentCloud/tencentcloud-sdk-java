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

public class DescribeEnvironmentAttributesResponse extends AbstractModel{

    /**
    * 未消费消息过期时间，单位：秒，最大1296000（15天）。
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 消费速率限制，单位：byte/秒，0：不限速。
    */
    @SerializedName("RateInByte")
    @Expose
    private Long RateInByte;

    /**
    * 消费速率限制，单位：个数/秒，0：不限速。
    */
    @SerializedName("RateInSize")
    @Expose
    private Long RateInSize;

    /**
    * 已消费消息保存策略，单位：小时，0：消费完马上删除。
    */
    @SerializedName("RetentionHours")
    @Expose
    private Long RetentionHours;

    /**
    * 已消费消息保存策略，单位：G，0：消费完马上删除。
    */
    @SerializedName("RetentionSize")
    @Expose
    private Long RetentionSize;

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 副本数。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 备注。
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
     * Get 未消费消息过期时间，单位：秒，最大1296000（15天）。 
     * @return MsgTTL 未消费消息过期时间，单位：秒，最大1296000（15天）。
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒，最大1296000（15天）。
     * @param MsgTTL 未消费消息过期时间，单位：秒，最大1296000（15天）。
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 消费速率限制，单位：byte/秒，0：不限速。 
     * @return RateInByte 消费速率限制，单位：byte/秒，0：不限速。
     */
    public Long getRateInByte() {
        return this.RateInByte;
    }

    /**
     * Set 消费速率限制，单位：byte/秒，0：不限速。
     * @param RateInByte 消费速率限制，单位：byte/秒，0：不限速。
     */
    public void setRateInByte(Long RateInByte) {
        this.RateInByte = RateInByte;
    }

    /**
     * Get 消费速率限制，单位：个数/秒，0：不限速。 
     * @return RateInSize 消费速率限制，单位：个数/秒，0：不限速。
     */
    public Long getRateInSize() {
        return this.RateInSize;
    }

    /**
     * Set 消费速率限制，单位：个数/秒，0：不限速。
     * @param RateInSize 消费速率限制，单位：个数/秒，0：不限速。
     */
    public void setRateInSize(Long RateInSize) {
        this.RateInSize = RateInSize;
    }

    /**
     * Get 已消费消息保存策略，单位：小时，0：消费完马上删除。 
     * @return RetentionHours 已消费消息保存策略，单位：小时，0：消费完马上删除。
     */
    public Long getRetentionHours() {
        return this.RetentionHours;
    }

    /**
     * Set 已消费消息保存策略，单位：小时，0：消费完马上删除。
     * @param RetentionHours 已消费消息保存策略，单位：小时，0：消费完马上删除。
     */
    public void setRetentionHours(Long RetentionHours) {
        this.RetentionHours = RetentionHours;
    }

    /**
     * Get 已消费消息保存策略，单位：G，0：消费完马上删除。 
     * @return RetentionSize 已消费消息保存策略，单位：G，0：消费完马上删除。
     */
    public Long getRetentionSize() {
        return this.RetentionSize;
    }

    /**
     * Set 已消费消息保存策略，单位：G，0：消费完马上删除。
     * @param RetentionSize 已消费消息保存策略，单位：G，0：消费完马上删除。
     */
    public void setRetentionSize(Long RetentionSize) {
        this.RetentionSize = RetentionSize;
    }

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 副本数。 
     * @return Replicas 副本数。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 副本数。
     * @param Replicas 副本数。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "RateInByte", this.RateInByte);
        this.setParamSimple(map, prefix + "RateInSize", this.RateInSize);
        this.setParamSimple(map, prefix + "RetentionHours", this.RetentionHours);
        this.setParamSimple(map, prefix + "RetentionSize", this.RetentionSize);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

