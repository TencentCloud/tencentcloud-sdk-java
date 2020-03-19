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

public class DescribeSubscriptionDetailRequest extends AbstractModel{

    /**
    * TopicName
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 目前只支持SubscriptionName，且仅支持一个关键字
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 目前只支持SubscriptionName，且仅支持一个关键字 
     * @return Filters 目前只支持SubscriptionName，且仅支持一个关键字
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 目前只支持SubscriptionName，且仅支持一个关键字
     * @param Filters 目前只支持SubscriptionName，且仅支持一个关键字
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

