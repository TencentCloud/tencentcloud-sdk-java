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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverSummary extends AbstractModel {

    /**
    * 投递类型，store（存储类），mq（消息通道）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * 投递子类型：cls，ckafka。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverSubType")
    @Expose
    private String DeliverSubType;

    /**
     * Get 投递类型，store（存储类），mq（消息通道）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverType 投递类型，store（存储类），mq（消息通道）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set 投递类型，store（存储类），mq（消息通道）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverType 投递类型，store（存储类），mq（消息通道）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get 投递子类型：cls，ckafka。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverSubType 投递子类型：cls，ckafka。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverSubType() {
        return this.DeliverSubType;
    }

    /**
     * Set 投递子类型：cls，ckafka。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverSubType 投递子类型：cls，ckafka。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverSubType(String DeliverSubType) {
        this.DeliverSubType = DeliverSubType;
    }

    public DeliverSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverSummary(DeliverSummary source) {
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverSubType != null) {
            this.DeliverSubType = new String(source.DeliverSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverSubType", this.DeliverSubType);

    }
}

