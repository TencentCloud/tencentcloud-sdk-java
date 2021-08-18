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

public class DeleteSubscriptionsRequest extends AbstractModel{

    /**
    * 订阅关系集合，每次最多删除20个。
    */
    @SerializedName("SubscriptionTopicSets")
    @Expose
    private SubscriptionTopic [] SubscriptionTopicSets;

    /**
    * pulsar集群Id。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 是否强制删除，默认为false
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 订阅关系集合，每次最多删除20个。 
     * @return SubscriptionTopicSets 订阅关系集合，每次最多删除20个。
     */
    public SubscriptionTopic [] getSubscriptionTopicSets() {
        return this.SubscriptionTopicSets;
    }

    /**
     * Set 订阅关系集合，每次最多删除20个。
     * @param SubscriptionTopicSets 订阅关系集合，每次最多删除20个。
     */
    public void setSubscriptionTopicSets(SubscriptionTopic [] SubscriptionTopicSets) {
        this.SubscriptionTopicSets = SubscriptionTopicSets;
    }

    /**
     * Get pulsar集群Id。 
     * @return ClusterId pulsar集群Id。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set pulsar集群Id。
     * @param ClusterId pulsar集群Id。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get 是否强制删除，默认为false 
     * @return Force 是否强制删除，默认为false
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制删除，默认为false
     * @param Force 是否强制删除，默认为false
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteSubscriptionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSubscriptionsRequest(DeleteSubscriptionsRequest source) {
        if (source.SubscriptionTopicSets != null) {
            this.SubscriptionTopicSets = new SubscriptionTopic[source.SubscriptionTopicSets.length];
            for (int i = 0; i < source.SubscriptionTopicSets.length; i++) {
                this.SubscriptionTopicSets[i] = new SubscriptionTopic(source.SubscriptionTopicSets[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubscriptionTopicSets.", this.SubscriptionTopicSets);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

