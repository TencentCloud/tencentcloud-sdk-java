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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceQuotaConfigResp extends AbstractModel{

    /**
    * 生产限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaProducerByteRate")
    @Expose
    private Long QuotaProducerByteRate;

    /**
    * 消费限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaConsumerByteRate")
    @Expose
    private Long QuotaConsumerByteRate;

    /**
     * Get 生产限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaProducerByteRate 生产限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuotaProducerByteRate() {
        return this.QuotaProducerByteRate;
    }

    /**
     * Set 生产限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaProducerByteRate 生产限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaProducerByteRate(Long QuotaProducerByteRate) {
        this.QuotaProducerByteRate = QuotaProducerByteRate;
    }

    /**
     * Get 消费限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaConsumerByteRate 消费限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuotaConsumerByteRate() {
        return this.QuotaConsumerByteRate;
    }

    /**
     * Set 消费限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaConsumerByteRate 消费限流大小，单位 MB/s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaConsumerByteRate(Long QuotaConsumerByteRate) {
        this.QuotaConsumerByteRate = QuotaConsumerByteRate;
    }

    public InstanceQuotaConfigResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceQuotaConfigResp(InstanceQuotaConfigResp source) {
        if (source.QuotaProducerByteRate != null) {
            this.QuotaProducerByteRate = new Long(source.QuotaProducerByteRate);
        }
        if (source.QuotaConsumerByteRate != null) {
            this.QuotaConsumerByteRate = new Long(source.QuotaConsumerByteRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaProducerByteRate", this.QuotaProducerByteRate);
        this.setParamSimple(map, prefix + "QuotaConsumerByteRate", this.QuotaConsumerByteRate);

    }
}

