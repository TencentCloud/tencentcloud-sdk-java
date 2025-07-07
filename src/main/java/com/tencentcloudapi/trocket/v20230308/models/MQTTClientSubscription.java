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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTClientSubscription extends AbstractModel {

    /**
    * topic 订阅
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * 服务质量等级
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
     * Get topic 订阅 
     * @return TopicFilter topic 订阅
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set topic 订阅
     * @param TopicFilter topic 订阅
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get 服务质量等级 
     * @return Qos 服务质量等级
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set 服务质量等级
     * @param Qos 服务质量等级
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    public MQTTClientSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTClientSubscription(MQTTClientSubscription source) {
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Qos", this.Qos);

    }
}

