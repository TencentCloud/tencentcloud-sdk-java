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

public class RocketMQTopicDistribution extends AbstractModel{

    /**
    * topic类型
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * topic数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get topic类型 
     * @return TopicType topic类型
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set topic类型
     * @param TopicType topic类型
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get topic数量 
     * @return Count topic数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set topic数量
     * @param Count topic数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public RocketMQTopicDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQTopicDistribution(RocketMQTopicDistribution source) {
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

