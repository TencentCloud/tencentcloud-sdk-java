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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "IsIdempotent", this.IsIdempotent);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

