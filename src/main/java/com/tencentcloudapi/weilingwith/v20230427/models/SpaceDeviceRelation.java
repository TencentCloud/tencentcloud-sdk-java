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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceDeviceRelation extends AbstractModel {

    /**
    * 设备id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 构件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
     * Get 设备id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 构件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElementId 构件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElementId() {
        return this.ElementId;
    }

    /**
     * Set 构件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElementId 构件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElementId(String ElementId) {
        this.ElementId = ElementId;
    }

    public SpaceDeviceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceDeviceRelation(SpaceDeviceRelation source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);

    }
}

