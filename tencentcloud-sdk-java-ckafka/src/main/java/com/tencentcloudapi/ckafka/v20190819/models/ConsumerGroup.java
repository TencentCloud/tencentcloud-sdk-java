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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerGroup extends AbstractModel{

    /**
    * 用户组名称
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 订阅信息实体
    */
    @SerializedName("SubscribedInfo")
    @Expose
    private SubscribedInfo [] SubscribedInfo;

    /**
     * Get 用户组名称 
     * @return ConsumerGroupName 用户组名称
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 用户组名称
     * @param ConsumerGroupName 用户组名称
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 订阅信息实体 
     * @return SubscribedInfo 订阅信息实体
     */
    public SubscribedInfo [] getSubscribedInfo() {
        return this.SubscribedInfo;
    }

    /**
     * Set 订阅信息实体
     * @param SubscribedInfo 订阅信息实体
     */
    public void setSubscribedInfo(SubscribedInfo [] SubscribedInfo) {
        this.SubscribedInfo = SubscribedInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamArrayObj(map, prefix + "SubscribedInfo.", this.SubscribedInfo);

    }
}

