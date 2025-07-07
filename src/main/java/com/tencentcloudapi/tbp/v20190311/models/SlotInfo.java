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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlotInfo extends AbstractModel {

    /**
    * 槽位名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotName")
    @Expose
    private String SlotName;

    /**
    * 槽位值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotValue")
    @Expose
    private String SlotValue;

    /**
     * Get 槽位名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotName 槽位名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlotName() {
        return this.SlotName;
    }

    /**
     * Set 槽位名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotName 槽位名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotName(String SlotName) {
        this.SlotName = SlotName;
    }

    /**
     * Get 槽位值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotValue 槽位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlotValue() {
        return this.SlotValue;
    }

    /**
     * Set 槽位值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotValue 槽位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotValue(String SlotValue) {
        this.SlotValue = SlotValue;
    }

    public SlotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlotInfo(SlotInfo source) {
        if (source.SlotName != null) {
            this.SlotName = new String(source.SlotName);
        }
        if (source.SlotValue != null) {
            this.SlotValue = new String(source.SlotValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SlotName", this.SlotName);
        this.setParamSimple(map, prefix + "SlotValue", this.SlotValue);

    }
}

