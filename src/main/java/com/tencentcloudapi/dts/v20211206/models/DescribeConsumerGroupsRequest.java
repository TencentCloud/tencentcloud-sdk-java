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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerGroupsRequest extends AbstractModel {

    /**
    * 订阅实例id
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 返回记录的起始偏移量。默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次返回的记录数量。默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 订阅实例id 
     * @return SubscribeId 订阅实例id
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例id
     * @param SubscribeId 订阅实例id
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 返回记录的起始偏移量。默认0 
     * @return Offset 返回记录的起始偏移量。默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回记录的起始偏移量。默认0
     * @param Offset 返回记录的起始偏移量。默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次返回的记录数量。默认10 
     * @return Limit 单次返回的记录数量。默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次返回的记录数量。默认10
     * @param Limit 单次返回的记录数量。默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeConsumerGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerGroupsRequest(DescribeConsumerGroupsRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

