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

public class CreateSubscriptionRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 订阅者名称，不支持中字以及除了短线和下划线外的特殊字符且不超过150个字符。
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * 是否幂等创建，若否不允许创建同名的订阅关系。
    */
    @SerializedName("IsIdempotent")
    @Expose
    private Boolean IsIdempotent;

    /**
    * 备注，128个字符以内。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否自动创建死信和重试主题，True 表示创建，False表示不创建，默认自动创建死信和重试主题。
    */
    @SerializedName("AutoCreatePolicyTopic")
    @Expose
    private Boolean AutoCreatePolicyTopic;

    /**
    * 指定死信和重试主题名称规范，LEGACY表示历史命名规则，COMMUNITY表示Pulsar社区命名规范
    */
    @SerializedName("PostFixPattern")
    @Expose
    private String PostFixPattern;

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
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 订阅者名称，不支持中字以及除了短线和下划线外的特殊字符且不超过150个字符。 
     * @return SubscriptionName 订阅者名称，不支持中字以及除了短线和下划线外的特殊字符且不超过150个字符。
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 订阅者名称，不支持中字以及除了短线和下划线外的特殊字符且不超过150个字符。
     * @param SubscriptionName 订阅者名称，不支持中字以及除了短线和下划线外的特殊字符且不超过150个字符。
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get 是否幂等创建，若否不允许创建同名的订阅关系。 
     * @return IsIdempotent 是否幂等创建，若否不允许创建同名的订阅关系。
     */
    public Boolean getIsIdempotent() {
        return this.IsIdempotent;
    }

    /**
     * Set 是否幂等创建，若否不允许创建同名的订阅关系。
     * @param IsIdempotent 是否幂等创建，若否不允许创建同名的订阅关系。
     */
    public void setIsIdempotent(Boolean IsIdempotent) {
        this.IsIdempotent = IsIdempotent;
    }

    /**
     * Get 备注，128个字符以内。 
     * @return Remark 备注，128个字符以内。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，128个字符以内。
     * @param Remark 备注，128个字符以内。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    /**
     * Get 是否自动创建死信和重试主题，True 表示创建，False表示不创建，默认自动创建死信和重试主题。 
     * @return AutoCreatePolicyTopic 是否自动创建死信和重试主题，True 表示创建，False表示不创建，默认自动创建死信和重试主题。
     */
    public Boolean getAutoCreatePolicyTopic() {
        return this.AutoCreatePolicyTopic;
    }

    /**
     * Set 是否自动创建死信和重试主题，True 表示创建，False表示不创建，默认自动创建死信和重试主题。
     * @param AutoCreatePolicyTopic 是否自动创建死信和重试主题，True 表示创建，False表示不创建，默认自动创建死信和重试主题。
     */
    public void setAutoCreatePolicyTopic(Boolean AutoCreatePolicyTopic) {
        this.AutoCreatePolicyTopic = AutoCreatePolicyTopic;
    }

    /**
     * Get 指定死信和重试主题名称规范，LEGACY表示历史命名规则，COMMUNITY表示Pulsar社区命名规范 
     * @return PostFixPattern 指定死信和重试主题名称规范，LEGACY表示历史命名规则，COMMUNITY表示Pulsar社区命名规范
     */
    public String getPostFixPattern() {
        return this.PostFixPattern;
    }

    /**
     * Set 指定死信和重试主题名称规范，LEGACY表示历史命名规则，COMMUNITY表示Pulsar社区命名规范
     * @param PostFixPattern 指定死信和重试主题名称规范，LEGACY表示历史命名规则，COMMUNITY表示Pulsar社区命名规范
     */
    public void setPostFixPattern(String PostFixPattern) {
        this.PostFixPattern = PostFixPattern;
    }

    public CreateSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubscriptionRequest(CreateSubscriptionRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.IsIdempotent != null) {
            this.IsIdempotent = new Boolean(source.IsIdempotent);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoCreatePolicyTopic != null) {
            this.AutoCreatePolicyTopic = new Boolean(source.AutoCreatePolicyTopic);
        }
        if (source.PostFixPattern != null) {
            this.PostFixPattern = new String(source.PostFixPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "IsIdempotent", this.IsIdempotent);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoCreatePolicyTopic", this.AutoCreatePolicyTopic);
        this.setParamSimple(map, prefix + "PostFixPattern", this.PostFixPattern);

    }
}

