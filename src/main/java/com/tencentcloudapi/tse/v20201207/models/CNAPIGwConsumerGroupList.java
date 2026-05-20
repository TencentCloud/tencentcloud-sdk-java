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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwConsumerGroupList extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 消费者分组信息
    */
    @SerializedName("ConsumerGroups")
    @Expose
    private CNAPIGwConsumerGroup [] ConsumerGroups;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 消费者分组信息 
     * @return ConsumerGroups 消费者分组信息
     */
    public CNAPIGwConsumerGroup [] getConsumerGroups() {
        return this.ConsumerGroups;
    }

    /**
     * Set 消费者分组信息
     * @param ConsumerGroups 消费者分组信息
     */
    public void setConsumerGroups(CNAPIGwConsumerGroup [] ConsumerGroups) {
        this.ConsumerGroups = ConsumerGroups;
    }

    public CNAPIGwConsumerGroupList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwConsumerGroupList(CNAPIGwConsumerGroupList source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ConsumerGroups != null) {
            this.ConsumerGroups = new CNAPIGwConsumerGroup[source.ConsumerGroups.length];
            for (int i = 0; i < source.ConsumerGroups.length; i++) {
                this.ConsumerGroups[i] = new CNAPIGwConsumerGroup(source.ConsumerGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ConsumerGroups.", this.ConsumerGroups);

    }
}

