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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeReceiver extends AbstractModel{

    /**
    * 接收人Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverUserId")
    @Expose
    private Long ReceiverUserId;

    /**
    * 接收人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverName")
    @Expose
    private String ReceiverName;

    /**
     * Get 接收人Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverUserId 接收人Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReceiverUserId() {
        return this.ReceiverUserId;
    }

    /**
     * Set 接收人Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverUserId 接收人Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverUserId(Long ReceiverUserId) {
        this.ReceiverUserId = ReceiverUserId;
    }

    /**
     * Get 接收人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverName 接收人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceiverName() {
        return this.ReceiverName;
    }

    /**
     * Set 接收人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverName 接收人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    public SubscribeReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeReceiver(SubscribeReceiver source) {
        if (source.ReceiverUserId != null) {
            this.ReceiverUserId = new Long(source.ReceiverUserId);
        }
        if (source.ReceiverName != null) {
            this.ReceiverName = new String(source.ReceiverName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverUserId", this.ReceiverUserId);
        this.setParamSimple(map, prefix + "ReceiverName", this.ReceiverName);

    }
}

