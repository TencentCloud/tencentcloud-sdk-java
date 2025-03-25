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
package com.tencentcloudapi.mqtt.v20240516.models;

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
0: 至多一次
1: 至少一次
2: 恰好一次
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * 堆积数量
    */
    @SerializedName("Lag")
    @Expose
    private Long Lag;

    /**
    * 投递未确认数量
    */
    @SerializedName("Inflight")
    @Expose
    private Long Inflight;

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
0: 至多一次
1: 至少一次
2: 恰好一次 
     * @return Qos 服务质量等级
0: 至多一次
1: 至少一次
2: 恰好一次
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set 服务质量等级
0: 至多一次
1: 至少一次
2: 恰好一次
     * @param Qos 服务质量等级
0: 至多一次
1: 至少一次
2: 恰好一次
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 堆积数量 
     * @return Lag 堆积数量
     */
    public Long getLag() {
        return this.Lag;
    }

    /**
     * Set 堆积数量
     * @param Lag 堆积数量
     */
    public void setLag(Long Lag) {
        this.Lag = Lag;
    }

    /**
     * Get 投递未确认数量 
     * @return Inflight 投递未确认数量
     */
    public Long getInflight() {
        return this.Inflight;
    }

    /**
     * Set 投递未确认数量
     * @param Inflight 投递未确认数量
     */
    public void setInflight(Long Inflight) {
        this.Inflight = Inflight;
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
        if (source.Lag != null) {
            this.Lag = new Long(source.Lag);
        }
        if (source.Inflight != null) {
            this.Inflight = new Long(source.Inflight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Lag", this.Lag);
        this.setParamSimple(map, prefix + "Inflight", this.Inflight);

    }
}

