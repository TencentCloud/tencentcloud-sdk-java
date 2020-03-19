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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscriptionAttributeRequest extends AbstractModel{

    /**
    * TopicName
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * SubscriptionName
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * NotifyStrategy
    */
    @SerializedName("NotifyStrategy")
    @Expose
    private String NotifyStrategy;

    /**
    * NotifyContentFormat
    */
    @SerializedName("NotifyContentFormat")
    @Expose
    private String NotifyContentFormat;

    /**
    * FilterTags
    */
    @SerializedName("FilterTags")
    @Expose
    private String [] FilterTags;

    /**
    * BindingKey
    */
    @SerializedName("BindingKey")
    @Expose
    private String [] BindingKey;

    /**
     * Get TopicName 
     * @return TopicName TopicName
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TopicName
     * @param TopicName TopicName
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get SubscriptionName 
     * @return SubscriptionName SubscriptionName
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set SubscriptionName
     * @param SubscriptionName SubscriptionName
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get NotifyStrategy 
     * @return NotifyStrategy NotifyStrategy
     */
    public String getNotifyStrategy() {
        return this.NotifyStrategy;
    }

    /**
     * Set NotifyStrategy
     * @param NotifyStrategy NotifyStrategy
     */
    public void setNotifyStrategy(String NotifyStrategy) {
        this.NotifyStrategy = NotifyStrategy;
    }

    /**
     * Get NotifyContentFormat 
     * @return NotifyContentFormat NotifyContentFormat
     */
    public String getNotifyContentFormat() {
        return this.NotifyContentFormat;
    }

    /**
     * Set NotifyContentFormat
     * @param NotifyContentFormat NotifyContentFormat
     */
    public void setNotifyContentFormat(String NotifyContentFormat) {
        this.NotifyContentFormat = NotifyContentFormat;
    }

    /**
     * Get FilterTags 
     * @return FilterTags FilterTags
     */
    public String [] getFilterTags() {
        return this.FilterTags;
    }

    /**
     * Set FilterTags
     * @param FilterTags FilterTags
     */
    public void setFilterTags(String [] FilterTags) {
        this.FilterTags = FilterTags;
    }

    /**
     * Get BindingKey 
     * @return BindingKey BindingKey
     */
    public String [] getBindingKey() {
        return this.BindingKey;
    }

    /**
     * Set BindingKey
     * @param BindingKey BindingKey
     */
    public void setBindingKey(String [] BindingKey) {
        this.BindingKey = BindingKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "NotifyStrategy", this.NotifyStrategy);
        this.setParamSimple(map, prefix + "NotifyContentFormat", this.NotifyContentFormat);
        this.setParamArraySimple(map, prefix + "FilterTags.", this.FilterTags);
        this.setParamArraySimple(map, prefix + "BindingKey.", this.BindingKey);

    }
}

