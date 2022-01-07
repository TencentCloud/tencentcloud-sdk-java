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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterConfig extends AbstractModel{

    /**
    * 支持dlq、丢弃、忽略错误继续传递三种模式, 分别对应: DLQ,DROP,IGNORE_ERROR
    */
    @SerializedName("DisposeMethod")
    @Expose
    private String DisposeMethod;

    /**
    * 设置了DLQ方式后,此选项必填. 错误消息会被投递到对应的kafka topic中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CkafkaDeliveryParams")
    @Expose
    private CkafkaDeliveryParams CkafkaDeliveryParams;

    /**
     * Get 支持dlq、丢弃、忽略错误继续传递三种模式, 分别对应: DLQ,DROP,IGNORE_ERROR 
     * @return DisposeMethod 支持dlq、丢弃、忽略错误继续传递三种模式, 分别对应: DLQ,DROP,IGNORE_ERROR
     */
    public String getDisposeMethod() {
        return this.DisposeMethod;
    }

    /**
     * Set 支持dlq、丢弃、忽略错误继续传递三种模式, 分别对应: DLQ,DROP,IGNORE_ERROR
     * @param DisposeMethod 支持dlq、丢弃、忽略错误继续传递三种模式, 分别对应: DLQ,DROP,IGNORE_ERROR
     */
    public void setDisposeMethod(String DisposeMethod) {
        this.DisposeMethod = DisposeMethod;
    }

    /**
     * Get 设置了DLQ方式后,此选项必填. 错误消息会被投递到对应的kafka topic中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CkafkaDeliveryParams 设置了DLQ方式后,此选项必填. 错误消息会被投递到对应的kafka topic中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CkafkaDeliveryParams getCkafkaDeliveryParams() {
        return this.CkafkaDeliveryParams;
    }

    /**
     * Set 设置了DLQ方式后,此选项必填. 错误消息会被投递到对应的kafka topic中
注意：此字段可能返回 null，表示取不到有效值。
     * @param CkafkaDeliveryParams 设置了DLQ方式后,此选项必填. 错误消息会被投递到对应的kafka topic中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCkafkaDeliveryParams(CkafkaDeliveryParams CkafkaDeliveryParams) {
        this.CkafkaDeliveryParams = CkafkaDeliveryParams;
    }

    public DeadLetterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadLetterConfig(DeadLetterConfig source) {
        if (source.DisposeMethod != null) {
            this.DisposeMethod = new String(source.DisposeMethod);
        }
        if (source.CkafkaDeliveryParams != null) {
            this.CkafkaDeliveryParams = new CkafkaDeliveryParams(source.CkafkaDeliveryParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisposeMethod", this.DisposeMethod);
        this.setParamObj(map, prefix + "CkafkaDeliveryParams.", this.CkafkaDeliveryParams);

    }
}

