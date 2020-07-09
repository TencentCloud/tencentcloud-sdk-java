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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubscriptionTopicSets.", this.SubscriptionTopicSets);

    }
}

