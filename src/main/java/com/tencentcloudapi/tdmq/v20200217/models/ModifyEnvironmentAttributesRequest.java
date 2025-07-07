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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnvironmentAttributesRequest extends AbstractModel {

    /**
    * 命名空间名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 未消费消息过期时间，单位：秒，范围60秒~15天。
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备注，字符串最长不超过128。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 消息保留策略
    */
    @SerializedName("RetentionPolicy")
    @Expose
    private RetentionPolicy RetentionPolicy;

    /**
    * 是否开启自动创建订阅
    */
    @SerializedName("AutoSubscriptionCreation")
    @Expose
    private Boolean AutoSubscriptionCreation;

    /**
     * Get 命名空间名称。 
     * @return EnvironmentId 命名空间名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间名称。
     * @param EnvironmentId 命名空间名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 未消费消息过期时间，单位：秒，范围60秒~15天。 
     * @return MsgTTL 未消费消息过期时间，单位：秒，范围60秒~15天。
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒，范围60秒~15天。
     * @param MsgTTL 未消费消息过期时间，单位：秒，范围60秒~15天。
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 备注，字符串最长不超过128。 
     * @return Remark 备注，字符串最长不超过128。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，字符串最长不超过128。
     * @param Remark 备注，字符串最长不超过128。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 消息保留策略 
     * @return RetentionPolicy 消息保留策略
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.RetentionPolicy;
    }

    /**
     * Set 消息保留策略
     * @param RetentionPolicy 消息保留策略
     */
    public void setRetentionPolicy(RetentionPolicy RetentionPolicy) {
        this.RetentionPolicy = RetentionPolicy;
    }

    /**
     * Get 是否开启自动创建订阅 
     * @return AutoSubscriptionCreation 是否开启自动创建订阅
     */
    public Boolean getAutoSubscriptionCreation() {
        return this.AutoSubscriptionCreation;
    }

    /**
     * Set 是否开启自动创建订阅
     * @param AutoSubscriptionCreation 是否开启自动创建订阅
     */
    public void setAutoSubscriptionCreation(Boolean AutoSubscriptionCreation) {
        this.AutoSubscriptionCreation = AutoSubscriptionCreation;
    }

    public ModifyEnvironmentAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvironmentAttributesRequest(ModifyEnvironmentAttributesRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RetentionPolicy != null) {
            this.RetentionPolicy = new RetentionPolicy(source.RetentionPolicy);
        }
        if (source.AutoSubscriptionCreation != null) {
            this.AutoSubscriptionCreation = new Boolean(source.AutoSubscriptionCreation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "RetentionPolicy.", this.RetentionPolicy);
        this.setParamSimple(map, prefix + "AutoSubscriptionCreation", this.AutoSubscriptionCreation);

    }
}

