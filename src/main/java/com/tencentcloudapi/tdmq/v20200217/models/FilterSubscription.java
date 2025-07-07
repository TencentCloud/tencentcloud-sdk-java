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

public class FilterSubscription extends AbstractModel {

    /**
    * 是否仅展示包含真实消费者的订阅。
    */
    @SerializedName("ConsumerHasCount")
    @Expose
    private Boolean ConsumerHasCount;

    /**
    * 是否仅展示消息堆积的订阅。
    */
    @SerializedName("ConsumerHasBacklog")
    @Expose
    private Boolean ConsumerHasBacklog;

    /**
    * 是否仅展示存在消息超期丢弃的订阅。
    */
    @SerializedName("ConsumerHasExpired")
    @Expose
    private Boolean ConsumerHasExpired;

    /**
    * 按照订阅名过滤，精确查询。
    */
    @SerializedName("SubscriptionNames")
    @Expose
    private String [] SubscriptionNames;

    /**
     * Get 是否仅展示包含真实消费者的订阅。 
     * @return ConsumerHasCount 是否仅展示包含真实消费者的订阅。
     */
    public Boolean getConsumerHasCount() {
        return this.ConsumerHasCount;
    }

    /**
     * Set 是否仅展示包含真实消费者的订阅。
     * @param ConsumerHasCount 是否仅展示包含真实消费者的订阅。
     */
    public void setConsumerHasCount(Boolean ConsumerHasCount) {
        this.ConsumerHasCount = ConsumerHasCount;
    }

    /**
     * Get 是否仅展示消息堆积的订阅。 
     * @return ConsumerHasBacklog 是否仅展示消息堆积的订阅。
     */
    public Boolean getConsumerHasBacklog() {
        return this.ConsumerHasBacklog;
    }

    /**
     * Set 是否仅展示消息堆积的订阅。
     * @param ConsumerHasBacklog 是否仅展示消息堆积的订阅。
     */
    public void setConsumerHasBacklog(Boolean ConsumerHasBacklog) {
        this.ConsumerHasBacklog = ConsumerHasBacklog;
    }

    /**
     * Get 是否仅展示存在消息超期丢弃的订阅。 
     * @return ConsumerHasExpired 是否仅展示存在消息超期丢弃的订阅。
     */
    public Boolean getConsumerHasExpired() {
        return this.ConsumerHasExpired;
    }

    /**
     * Set 是否仅展示存在消息超期丢弃的订阅。
     * @param ConsumerHasExpired 是否仅展示存在消息超期丢弃的订阅。
     */
    public void setConsumerHasExpired(Boolean ConsumerHasExpired) {
        this.ConsumerHasExpired = ConsumerHasExpired;
    }

    /**
     * Get 按照订阅名过滤，精确查询。 
     * @return SubscriptionNames 按照订阅名过滤，精确查询。
     */
    public String [] getSubscriptionNames() {
        return this.SubscriptionNames;
    }

    /**
     * Set 按照订阅名过滤，精确查询。
     * @param SubscriptionNames 按照订阅名过滤，精确查询。
     */
    public void setSubscriptionNames(String [] SubscriptionNames) {
        this.SubscriptionNames = SubscriptionNames;
    }

    public FilterSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterSubscription(FilterSubscription source) {
        if (source.ConsumerHasCount != null) {
            this.ConsumerHasCount = new Boolean(source.ConsumerHasCount);
        }
        if (source.ConsumerHasBacklog != null) {
            this.ConsumerHasBacklog = new Boolean(source.ConsumerHasBacklog);
        }
        if (source.ConsumerHasExpired != null) {
            this.ConsumerHasExpired = new Boolean(source.ConsumerHasExpired);
        }
        if (source.SubscriptionNames != null) {
            this.SubscriptionNames = new String[source.SubscriptionNames.length];
            for (int i = 0; i < source.SubscriptionNames.length; i++) {
                this.SubscriptionNames[i] = new String(source.SubscriptionNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerHasCount", this.ConsumerHasCount);
        this.setParamSimple(map, prefix + "ConsumerHasBacklog", this.ConsumerHasBacklog);
        this.setParamSimple(map, prefix + "ConsumerHasExpired", this.ConsumerHasExpired);
        this.setParamArraySimple(map, prefix + "SubscriptionNames.", this.SubscriptionNames);

    }
}

