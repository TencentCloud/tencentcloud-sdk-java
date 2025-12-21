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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LatestBrokerVersion extends AbstractModel {

    /**
    * ckafka集群实例版本
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * broker版本号
    */
    @SerializedName("BrokerVersion")
    @Expose
    private String BrokerVersion;

    /**
     * Get ckafka集群实例版本 
     * @return KafkaVersion ckafka集群实例版本
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set ckafka集群实例版本
     * @param KafkaVersion ckafka集群实例版本
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get broker版本号 
     * @return BrokerVersion broker版本号
     */
    public String getBrokerVersion() {
        return this.BrokerVersion;
    }

    /**
     * Set broker版本号
     * @param BrokerVersion broker版本号
     */
    public void setBrokerVersion(String BrokerVersion) {
        this.BrokerVersion = BrokerVersion;
    }

    public LatestBrokerVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LatestBrokerVersion(LatestBrokerVersion source) {
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.BrokerVersion != null) {
            this.BrokerVersion = new String(source.BrokerVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "BrokerVersion", this.BrokerVersion);

    }
}

