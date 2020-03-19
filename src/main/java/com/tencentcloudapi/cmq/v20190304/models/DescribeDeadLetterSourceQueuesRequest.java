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

public class DescribeDeadLetterSourceQueuesRequest extends AbstractModel{

    /**
    * 死信队列名称
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 死信队列名称 
     * @return DeadLetterQueueName 死信队列名称
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set 死信队列名称
     * @param DeadLetterQueueName 死信队列名称
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get limit 
     * @return Limit limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit
     * @param Limit limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get offset 
     * @return Offset offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset
     * @param Offset offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤 
     * @return Filters 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
     * @param Filters 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

